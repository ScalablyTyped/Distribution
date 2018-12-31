package typings
package reactDashFlexrLib.underscoreUnderscoreReactFlexrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends reactLib.reactMod.ReactNs.Props[Grid] {
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

