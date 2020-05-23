package typings.prosemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationAttrs
  extends /**
  * Specify additional attrs that will be mapped directly to the
  * target node's DOM attributes.
  */
/* key */ StringDictionary[js.UndefOr[String | Null]] {
  /**
    * A CSS class name or a space-separated set of class names to be
    * _added_ to the classes that the node already had.
    */
  var `class`: js.UndefOr[String | Null] = js.undefined
  /**
    * When non-null, the target node is wrapped in a DOM element of
    * this type (and the other attributes are applied to this element).
    */
  var nodeName: js.UndefOr[String | Null] = js.undefined
  /**
    * A string of CSS to be _added_ to the node's existing `style` property.
    */
  var style: js.UndefOr[String | Null] = js.undefined
}

object DecorationAttrs {
  @scala.inline
  def apply(
    StringDictionary: /* event */ StringDictionary[js.UndefOr[String | Null]] = null,
    `class`: js.UndefOr[Null | String] = js.undefined,
    nodeName: js.UndefOr[Null | String] = js.undefined,
    style: js.UndefOr[Null | String] = js.undefined
  ): DecorationAttrs = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(`class`)) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeName)) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationAttrs]
  }
}

