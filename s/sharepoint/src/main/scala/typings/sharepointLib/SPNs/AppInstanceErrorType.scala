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
  
  val app: app with java.lang.String = js.native
  val configuration: configuration with java.lang.String = js.native
  val transient: transient with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.AppInstanceErrorType with java.lang.String] = js.native
}

