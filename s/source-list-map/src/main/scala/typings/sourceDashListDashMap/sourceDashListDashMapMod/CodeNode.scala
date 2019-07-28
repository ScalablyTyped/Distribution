package typings.sourceDashListDashMap.sourceDashListDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-list-map", "CodeNode")
@js.native
class CodeNode protected () extends js.Object {
  def this(generatedCode: String) = this()
  var generatedCode: String = js.native
  def addGeneratedCode(generatedCode: String): Unit = js.native
  def getGeneratedCode(): String = js.native
  def getMappings(): String = js.native
  def getMappings(mappingsContext: MappingsContext): String = js.native
  def mapGeneratedCode(fn: js.Function1[/* code */ String, String]): Unit = js.native
}

