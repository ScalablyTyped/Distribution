package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppContextSite")
@js.native
class AppContextSite protected () extends ClientObject {
  def this(context: ClientRuntimeContext, siteUrl: java.lang.String) = this()
  def get_site(): Site = js.native
  def get_web(): Web = js.native
}

/* static members */
@JSGlobal("SP.AppContextSite")
@js.native
object AppContextSite extends js.Object {
  def newObject(context: sharepointLib.SPNs.ClientRuntimeContext, siteUrl: java.lang.String): sharepointLib.SPNs.AppContextSite = js.native
}

