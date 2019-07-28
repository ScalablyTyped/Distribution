package typings.sourceDashListDashMap.sourceDashListDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-list-map", "MappingsContext")
@js.native
class MappingsContext () extends js.Object {
  var currentOriginalLine: Double = js.native
  var currentSource: Double = js.native
  var hasSourceContent: Boolean = js.native
  var sources: js.Array[String] = js.native
  var sourcesContent: js.Array[String] = js.native
  def ensureSource(source: String, originalSource: String): Double = js.native
}

