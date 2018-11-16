package typings
package sourceDashListDashMapLib.sourceDashListDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-list-map", "CodeNode")
@js.native
class CodeNode protected () extends js.Object {
  def this(generatedCode: java.lang.String) = this()
  var generatedCode: java.lang.String = js.native
  def addGeneratedCode(generatedCode: java.lang.String): scala.Unit = js.native
  def getGeneratedCode(): java.lang.String = js.native
  def getMappings(): java.lang.String = js.native
  def getMappings(mappingsContext: MappingsContext): java.lang.String = js.native
  def mapGeneratedCode(fn: js.Function1[/* code */ java.lang.String, java.lang.String]): scala.Unit = js.native
}

