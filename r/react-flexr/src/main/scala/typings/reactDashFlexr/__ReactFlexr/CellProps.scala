package typings.reactDashFlexr.__ReactFlexr

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import typings.reactDashFlexr.reactDashFlexrStrings.bottom
import typings.reactDashFlexr.reactDashFlexrStrings.center
import typings.reactDashFlexr.reactDashFlexrStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps extends Props[Cell] {
  /**
    * Vertical Align This Cell: top, center, bottom
    */
  var align: js.UndefOr[top | center | bottom] = js.undefined
  /**
    * Like size, but only for desk devices.
    * Accepts 'hidden' as well.
    */
  var desk: js.UndefOr[String | Double] = js.undefined
  /**
    * Cell will be full height.
    */
  var flex: js.UndefOr[Boolean] = js.undefined
  /**
    * Override default gutter: '1em', '5%', '10px', etc.
    */
  var gutter: js.UndefOr[String] = js.undefined
  /**
    * Like size, but only for lap devices.
    * Accepts 'hidden' as well.
    */
  var lap: js.UndefOr[String | Double] = js.undefined
  /**
    * Like size, but only for palm devices.
    * Accepts 'hidden' as well.
    */
  var palm: js.UndefOr[String | Double] = js.undefined
  /**
    * Like size, but only for ( palm + lap ) devices.
    * Accepts 'hidden' as well.
    */
  var portable: js.UndefOr[String | Double] = js.undefined
  /**
    * Takes a fraction. e.g. 1/6
    */
  var size: js.UndefOr[String | Double] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    align: top | center | bottom = null,
    children: ReactNode = null,
    desk: String | Double = null,
    flex: js.UndefOr[Boolean] = js.undefined,
    gutter: String = null,
    key: Key = null,
    lap: String | Double = null,
    palm: String | Double = null,
    portable: String | Double = null,
    ref: LegacyRef[Cell] = null,
    size: String | Double = null
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

