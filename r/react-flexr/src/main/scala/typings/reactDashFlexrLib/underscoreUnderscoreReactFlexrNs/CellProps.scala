package typings
package reactDashFlexrLib.underscoreUnderscoreReactFlexrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CellProps
  extends reactLib.reactMod.ReactNs.Props[Cell] {
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

