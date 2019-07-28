package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppInstanceErrorType extends js.Object

@JSGlobal("SP.AppInstanceErrorType")
@js.native
object AppInstanceErrorType extends js.Object {
  @js.native
  sealed trait app extends AppInstanceErrorType
  
  @js.native
  sealed trait configuration extends AppInstanceErrorType
  
  @js.native
  sealed trait transient extends AppInstanceErrorType
  
  /* 2 */ val app: typings.sharepoint.SPNs.AppInstanceErrorType.app with Double = js.native
  /* 1 */ val configuration: typings.sharepoint.SPNs.AppInstanceErrorType.configuration with Double = js.native
  /* 0 */ val transient: typings.sharepoint.SPNs.AppInstanceErrorType.transient with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstanceErrorType with Double] = js.native
}

