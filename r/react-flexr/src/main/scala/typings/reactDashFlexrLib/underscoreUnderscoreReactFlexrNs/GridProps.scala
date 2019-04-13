package typings
package reactDashFlexrLib.underscoreUnderscoreReactFlexrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends reactLib.reactMod.Props[Grid] {
  /**
    * Vertical Align Sub Cells: top, center, bottom
    */
  var align: js.UndefOr[
    reactDashFlexrLib.reactDashFlexrLibStrings.top | reactDashFlexrLib.reactDashFlexrLibStrings.center | reactDashFlexrLib.reactDashFlexrLibStrings.bottom
  ] = js.undefined
  /**
    * All sub cells will be full height.
    */
  var flexCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Override default gutter: '1em', '5%', '10px', etc.
    * Propagates downwards. Cells inside this Grid component
    * will use the same gutter.
    */
  var gutter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Horizontal Align Sub Cells: left, center, right
    */
  var hAlign: js.UndefOr[
    reactDashFlexrLib.reactDashFlexrLibStrings.left | reactDashFlexrLib.reactDashFlexrLibStrings.center | reactDashFlexrLib.reactDashFlexrLibStrings.right
  ] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    align: reactDashFlexrLib.reactDashFlexrLibStrings.top | reactDashFlexrLib.reactDashFlexrLibStrings.center | reactDashFlexrLib.reactDashFlexrLibStrings.bottom = null,
    children: reactLib.reactMod.ReactNode = null,
    flexCells: js.UndefOr[scala.Boolean] = js.undefined,
    gutter: java.lang.String = null,
    hAlign: reactDashFlexrLib.reactDashFlexrLibStrings.left | reactDashFlexrLib.reactDashFlexrLibStrings.center | reactDashFlexrLib.reactDashFlexrLibStrings.right = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[Grid] = null
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(flexCells)) __obj.updateDynamic("flexCells")(flexCells)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter)
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridProps]
  }
}

