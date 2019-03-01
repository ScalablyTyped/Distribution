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

object ListItemContentProps {
  @scala.inline
  def apply(
    caption: reactLib.reactMod.ReactNs.ReactNode = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    legend: java.lang.String = null,
    theme: ListItemContentTheme = null,
    `type`: reactDashToolboxLib.reactDashToolboxLibStrings.auto | reactDashToolboxLib.reactDashToolboxLibStrings.normal | reactDashToolboxLib.reactDashToolboxLibStrings.large = null
  ): ListItemContentProps = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemContentProps]
  }
}

