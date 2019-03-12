package typings
package sourceDashMapDashSupportLib.sourceDashMapDashSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-map-support", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getErrorSource(error: stdLib.Error): java.lang.String | scala.Null = js.native
  def install(): scala.Unit = js.native
  def install(options: Options): scala.Unit = js.native
  def mapSourcePosition(position: Position): Position = js.native
  def resetRetrieveHandlers(): scala.Unit = js.native
  def retrieveSourceMap(source: java.lang.String): UrlAndMap | scala.Null = js.native
  def wrapCallSite(frame: js.Any): js.Any = js.native
}

