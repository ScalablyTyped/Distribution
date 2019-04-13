package typings
package reactDashScrollspyLib.reactDashScrollspyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollspyProps extends js.Object {
  // HTML tag for Scrollspy component if you want to use other than ul
  var componentTag: js.UndefOr[java.lang.String] = js.undefined
  // Class name that apply to the navigation element paired with the content element in viewport
  var currentClassName: java.lang.String
  // Array of target element IDs
  var items: js.Array[java.lang.String]
  // Offset value that adjusts to determine the elements are in the viewport
  var offset: js.UndefOr[scala.Double] = js.undefined
  // Function to be executed when the active item has been updated
  var onUpdate: js.UndefOr[js.Function1[/* item */ java.lang.String, scala.Unit]] = js.undefined
  // Selector for the element of scrollable container that can be used with querySelector
  var rootEl: js.UndefOr[java.lang.String] = js.undefined
  // Class name that apply to the navigation elements that have been scrolled past
  var scrolledPastClassName: js.UndefOr[java.lang.String] = js.undefined
  // Style attribute to be passed to the generated <ul /> element
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ScrollspyProps {
  @scala.inline
  def apply(
    currentClassName: java.lang.String,
    items: js.Array[java.lang.String],
    componentTag: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    onUpdate: /* item */ java.lang.String => scala.Unit = null,
    rootEl: java.lang.String = null,
    scrolledPastClassName: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ScrollspyProps = {
    val __obj = js.Dynamic.literal(currentClassName = currentClassName, items = items)
    if (componentTag != null) __obj.updateDynamic("componentTag")(componentTag)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (rootEl != null) __obj.updateDynamic("rootEl")(rootEl)
    if (scrolledPastClassName != null) __obj.updateDynamic("scrolledPastClassName")(scrolledPastClassName)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ScrollspyProps]
  }
}

