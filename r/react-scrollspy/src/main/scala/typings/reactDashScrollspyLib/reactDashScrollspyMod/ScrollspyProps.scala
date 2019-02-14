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
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

