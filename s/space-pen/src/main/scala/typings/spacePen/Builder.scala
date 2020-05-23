package typings.spacePen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builder extends js.Object {
  var document: js.Array[_]
  var postProcessingSteps: js.Array[_]
  def buildHtml(): js.Array[_]
  def closeTag(name: String): Unit
  def extractOptions(args: js.Any): js.Any
  def openTag(name: String, attributes: js.Any): Unit
  def raw(str: String): Unit
  def subview(outletName: js.Any, subview: View): Unit
  def tag(name: String, args: js.Any*): Unit
  def text(str: String): Unit
}

object Builder {
  @scala.inline
  def apply(
    buildHtml: () => js.Array[_],
    closeTag: String => Unit,
    document: js.Array[_],
    extractOptions: js.Any => js.Any,
    openTag: (String, js.Any) => Unit,
    postProcessingSteps: js.Array[_],
    raw: String => Unit,
    subview: (js.Any, View) => Unit,
    tag: (String, /* repeated */ js.Any) => Unit,
    text: String => Unit
  ): Builder = {
    val __obj = js.Dynamic.literal(buildHtml = js.Any.fromFunction0(buildHtml), closeTag = js.Any.fromFunction1(closeTag), document = document.asInstanceOf[js.Any], extractOptions = js.Any.fromFunction1(extractOptions), openTag = js.Any.fromFunction2(openTag), postProcessingSteps = postProcessingSteps.asInstanceOf[js.Any], raw = js.Any.fromFunction1(raw), subview = js.Any.fromFunction2(subview), tag = js.Any.fromFunction2(tag), text = js.Any.fromFunction1(text))
    __obj.asInstanceOf[Builder]
  }
}

