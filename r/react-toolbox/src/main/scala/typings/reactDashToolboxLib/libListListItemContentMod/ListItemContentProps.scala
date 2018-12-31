package typings
package reactDashToolboxLib.libListListItemContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemContentProps extends js.Object {
  /**
    * Main text of the item.
    */
  var caption: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Secondary text to display under the caption.
    */
  var legend: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemContentTheme] = js.undefined
  /**
    * List item content type.
    */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.auto | reactDashToolboxLib.reactDashToolboxLibStrings.normal | reactDashToolboxLib.reactDashToolboxLibStrings.large
  ] = js.undefined
}

