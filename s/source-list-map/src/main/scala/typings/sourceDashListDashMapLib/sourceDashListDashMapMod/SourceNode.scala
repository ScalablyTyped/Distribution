package typings
package sourceDashListDashMapLib.sourceDashListDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-list-map", "SourceNode")
@js.native
class SourceNode protected () extends js.Object {
  def this(generatedCode: java.lang.String, source: java.lang.String, originalSource: java.lang.String) = this()
  def this(generatedCode: java.lang.String, source: java.lang.String, originalSource: java.lang.String, startingLine: scala.Double) = this()
  var generatedCode: java.lang.String = js.native
  var originalSource: java.lang.String = js.native
  var source: java.lang.String = js.native
  var startingLine: scala.Double = js.native
  def getGeneratedCode(): java.lang.String = js.native
  def getMappings(mappingsContext: MappingsContext): java.lang.String = js.native
  def mapGeneratedCode(fn: js.Function1[/* code */ java.lang.String, java.lang.String]): scala.Unit = js.native
}

