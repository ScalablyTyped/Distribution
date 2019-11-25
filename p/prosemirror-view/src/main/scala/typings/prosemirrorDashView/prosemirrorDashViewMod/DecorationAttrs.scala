package typings.prosemirrorDashView.prosemirrorDashViewMod

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
    StringDictionary: /**
    * Specify additional attrs that will be mapped directly to the
    * target node's DOM attributes.
    */
  /* key */ StringDictionary[js.UndefOr[String | Null]] = null,
    `class`: String = null,
    nodeName: String = null,
    style: String = null
  ): DecorationAttrs = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationAttrs]
  }
}

