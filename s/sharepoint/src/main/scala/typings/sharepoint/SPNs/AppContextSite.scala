package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AppContextSite")
@js.native
class AppContextSite protected () extends ClientObject {
  def this(context: ClientRuntimeContext, siteUrl: String) = this()
  def get_site(): Site = js.native
  def get_web(): Web = js.native
}

/* static members */
@JSGlobal("SP.AppContextSite")
@js.native
object AppContextSite extends js.Object {
  def newObject(context: ClientRuntimeContext, siteUrl: String): AppContextSite = js.native
}

