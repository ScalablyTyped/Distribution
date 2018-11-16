package typings
package spaceDashPenLib.spaceDashPenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("space-pen", "Builder")
@js.native
class Builder () extends js.Object {
  var document: js.Array[_] = js.native
  var postProcessingSteps: js.Array[_] = js.native
  def buildHtml(): js.Array[_] = js.native
  def closeTag(name: java.lang.String): scala.Unit = js.native
  def extractOptions(args: js.Any): js.Any = js.native
  def openTag(name: java.lang.String, attributes: js.Any): scala.Unit = js.native
  def raw(str: java.lang.String): scala.Unit = js.native
  def subview(outletName: js.Any, subview: View): scala.Unit = js.native
  def tag(name: java.lang.String, args: js.Any*): scala.Unit = js.native
  def text(str: java.lang.String): scala.Unit = js.native
}

