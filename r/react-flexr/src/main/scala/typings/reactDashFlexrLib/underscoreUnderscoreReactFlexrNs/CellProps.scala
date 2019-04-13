package typings
package reactDashFlexrLib.underscoreUnderscoreReactFlexrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps
  extends reactLib.reactMod.Props[Cell] {
  /**
    * Vertical Align This Cell: top, center, bottom
    */
  var align: js.UndefOr[
    reactDashFlexrLib.reactDashFlexrLibStrings.top | reactDashFlexrLib.reactDashFlexrLibStrings.center | reactDashFlexrLib.reactDashFlexrLibStrings.bottom
  ] = js.undefined
  /**
    * Like size, but only for desk devices.
    * Accepts 'hidden' as well.
    */
  var desk: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Cell will be full height.
    */
  var flex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Override default gutter: '1em', '5%', '10px', etc.
    */
  var gutter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Like size, but only for lap devices.
    * Accepts 'hidden' as well.
    */
  var lap: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Like size, but only for palm devices.
    * Accepts 'hidden' as well.
    */
  var palm: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Like size, but only for ( palm + lap ) devices.
    * Accepts 'hidden' as well.
    */
  var portable: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Takes a fraction. e.g. 1/6
    */
  var size: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    align: reactDashFlexrLib.reactDashFlexrLibStrings.top | reactDashFlexrLib.reactDashFlexrLibStrings.center | reactDashFlexrLib.reactDashFlexrLibStrings.bottom = null,
    children: reactLib.reactMod.ReactNode = null,
    desk: java.lang.String | scala.Double = null,
    flex: js.UndefOr[scala.Boolean] = js.undefined,
    gutter: java.lang.String = null,
    key: reactLib.reactMod.Key = null,
    lap: java.lang.String | scala.Double = null,
    palm: java.lang.String | scala.Double = null,
    portable: java.lang.String | scala.Double = null,
    ref: reactLib.reactMod.LegacyRef[Cell] = null,
    size: java.lang.String | scala.Double = null
  ): CellProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (desk != null) __obj.updateDynamic("desk")(desk.asInstanceOf[js.Any])
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lap != null) __obj.updateDynamic("lap")(lap.asInstanceOf[js.Any])
    if (palm != null) __obj.updateDynamic("palm")(palm.asInstanceOf[js.Any])
    if (portable != null) __obj.updateDynamic("portable")(portable.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

