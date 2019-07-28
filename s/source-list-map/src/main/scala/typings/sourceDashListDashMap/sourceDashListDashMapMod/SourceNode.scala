package typings.sourceDashListDashMap.sourceDashListDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-list-map", "SourceNode")
@js.native
class SourceNode protected () extends js.Object {
  def this(generatedCode: String, source: String, originalSource: String) = this()
  def this(generatedCode: String, source: String, originalSource: String, startingLine: Double) = this()
  var generatedCode: String = js.native
  var originalSource: String = js.native
  var source: String = js.native
  var startingLine: Double = js.native
  def getGeneratedCode(): String = js.native
  def getMappings(mappingsContext: MappingsContext): String = js.native
  def mapGeneratedCode(fn: js.Function1[/* code */ String, String]): Unit = js.native
}

