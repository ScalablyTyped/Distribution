package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.AppInstanceErrorType.app
import typings.sharepoint.SP.AppInstanceErrorType.configuration
import typings.sharepoint.SP.AppInstanceErrorType.transient
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppInstanceErrorType with Double] = js.native
  /* 2 */ @js.native
  object app extends TopLevel[app with Double]
  
  /* 1 */ @js.native
  object configuration extends TopLevel[configuration with Double]
  
  /* 0 */ @js.native
  object transient extends TopLevel[transient with Double]
  
}

