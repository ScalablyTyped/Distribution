package typings
package sourceDashListDashMapLib.sourceDashListDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-list-map", "MappingsContext")
@js.native
class MappingsContext () extends js.Object {
  var currentOriginalLine: scala.Double = js.native
  var currentSource: scala.Double = js.native
  var hasSourceContent: scala.Boolean = js.native
  var sources: js.Array[java.lang.String] = js.native
  var sourcesContent: js.Array[java.lang.String] = js.native
  def ensureSource(source: java.lang.String, originalSource: java.lang.String): scala.Double = js.native
}

