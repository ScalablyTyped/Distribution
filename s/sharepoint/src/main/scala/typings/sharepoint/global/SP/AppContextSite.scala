package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AppContextSite")
@js.native
class AppContextSite protected ()
  extends typings.sharepoint.SP.AppContextSite {
  def this(context: typings.sharepoint.SP.ClientRuntimeContext, siteUrl: String) = this()
}
/* static members */
@JSGlobal("SP.AppContextSite")
@js.native
object AppContextSite extends js.Object {
  
  def newObject(context: typings.sharepoint.SP.ClientRuntimeContext, siteUrl: String): typings.sharepoint.SP.AppContextSite = js.native
}
