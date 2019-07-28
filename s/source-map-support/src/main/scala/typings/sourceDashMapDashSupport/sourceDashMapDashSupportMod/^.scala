package typings.sourceDashMapDashSupport.sourceDashMapDashSupportMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-map-support", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getErrorSource(error: Error): String | Null = js.native
  def install(): Unit = js.native
  def install(options: Options): Unit = js.native
  def mapSourcePosition(position: Position): Position = js.native
  def resetRetrieveHandlers(): Unit = js.native
  def retrieveSourceMap(source: String): UrlAndMap | Null = js.native
  def wrapCallSite(frame: js.Any): js.Any = js.native
}

