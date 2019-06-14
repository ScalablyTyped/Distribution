package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppInstanceErrorType extends js.Object

@JSGlobal("SP.AppInstanceErrorType")
@js.native
object AppInstanceErrorType extends js.Object {
  @js.native
  sealed trait app
    extends sharepointLib.SPNs.AppInstanceErrorType
  
  @js.native
  sealed trait configuration
    extends sharepointLib.SPNs.AppInstanceErrorType
  
  @js.native
  sealed trait transient
    extends sharepointLib.SPNs.AppInstanceErrorType
  
  /* 2 */ val app: app with scala.Double = js.native
  /* 1 */ val configuration: configuration with scala.Double = js.native
  /* 0 */ val transient: transient with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.AppInstanceErrorType with scala.Double] = js.native
}

