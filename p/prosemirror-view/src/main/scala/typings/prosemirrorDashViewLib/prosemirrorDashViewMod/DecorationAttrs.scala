package typings
package prosemirrorDashViewLib.prosemirrorDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationAttrs extends js.Object {
  /**
    * A CSS class name or a space-separated set of class names to be
    * _added_ to the classes that the node already had.
    */
  var `class`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * When non-null, the target node is wrapped in a DOM element of
    * this type (and the other attributes are applied to this element).
    */
  var nodeName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * A string of CSS to be _added_ to the node's existing `style` property.
    */
  var style: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object DecorationAttrs {
  @scala.inline
  def apply(
    `class`: java.lang.String = null,
    nodeName: java.lang.String = null,
    style: java.lang.String = null
  ): DecorationAttrs = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DecorationAttrs]
  }
}

