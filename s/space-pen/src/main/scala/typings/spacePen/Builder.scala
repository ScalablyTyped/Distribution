package typings.spacePen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Builder")
@js.native
class Builder () extends js.Object {
  var document: js.Array[_] = js.native
  var postProcessingSteps: js.Array[_] = js.native
  def buildHtml(): js.Array[_] = js.native
  def closeTag(name: String): Unit = js.native
  def extractOptions(args: js.Any): js.Any = js.native
  def openTag(name: String, attributes: js.Any): Unit = js.native
  def raw(str: String): Unit = js.native
  def subview(outletName: js.Any, subview: View): Unit = js.native
  def tag(name: String, args: js.Any*): Unit = js.native
  def text(str: String): Unit = js.native
}

