package typings
package sourceDashMapDashSupportLib.sourceDashMapDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-map-support", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getErrorSource(error: nodeLib.Error): java.lang.String | scala.Null = js.native
  def install(): scala.Unit = js.native
  def install(options: sourceDashMapDashSupportLib.sourceDashMapDashSupportMod.Options): scala.Unit = js.native
  def mapSourcePosition(position: sourceDashMapDashSupportLib.sourceDashMapDashSupportMod.Position): sourceDashMapDashSupportLib.sourceDashMapDashSupportMod.Position = js.native
  def resetRetrieveHandlers(): scala.Unit = js.native
  def retrieveSourceMap(source: java.lang.String): sourceDashMapDashSupportLib.sourceDashMapDashSupportMod.UrlAndMap | scala.Null = js.native
  def wrapCallSite(frame: js.Any): js.Any = js.native
}

