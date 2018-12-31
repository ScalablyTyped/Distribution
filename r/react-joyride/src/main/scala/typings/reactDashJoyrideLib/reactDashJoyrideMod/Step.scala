package typings
package reactDashJoyrideLib.reactDashJoyrideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends OverridableProps {
  /**
    * The tooltip's body.
    */
  var content: reactLib.reactMod.ReactNs.ReactNode | java.lang.String
  /**
    * Don't show the Beacon before the tooltip. Defaults to false.
    */
  var disableBeacon: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The event to trigger the beacon. It can be click or hover. Defaults to click.
    */
  var event: js.UndefOr[
    reactDashJoyrideLib.reactDashJoyrideLibStrings.click | reactDashJoyrideLib.reactDashJoyrideLibStrings.hover
  ] = js.undefined
  /**
    * Force the step to be fixed. Defaults to false.
    */
  var isFixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The distance from the target to the tooltip. Defaults to 10.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The placement of the beacon and tooltip. It will re-position itself if there's no space available.
    * Defaults to bottom.
    */
  var placement: js.UndefOr[
    reactDashJoyrideLib.reactDashJoyrideLibStrings.top | reactDashJoyrideLib.reactDashJoyrideLibStrings.`top-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`top-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.bottom | reactDashJoyrideLib.reactDashJoyrideLibStrings.`bottom-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`bottom-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.left | reactDashJoyrideLib.reactDashJoyrideLibStrings.`left-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`left-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.right | reactDashJoyrideLib.reactDashJoyrideLibStrings.`right-start` | reactDashJoyrideLib.reactDashJoyrideLibStrings.`right-end` | reactDashJoyrideLib.reactDashJoyrideLibStrings.auto | reactDashJoyrideLib.reactDashJoyrideLibStrings.center
  ] = js.undefined
  /**
    * The placement of the beacon. It will use the placement if nothing is passed and it can be: top, bottom, left, right.
    */
  var placementBeacon: js.UndefOr[
    reactDashJoyrideLib.reactDashJoyrideLibStrings.top | reactDashJoyrideLib.reactDashJoyrideLibStrings.bottom | reactDashJoyrideLib.reactDashJoyrideLibStrings.left | reactDashJoyrideLib.reactDashJoyrideLibStrings.right
  ] = js.undefined
  /**
    * The target for the step. It can be a CSS selector or an HtmlElement directly (but using refs created in the same render would required an additional render afterwards).
    */
  var target: reactLib.HTMLElement | java.lang.String
  /**
    * The tooltip's title.
    */
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
}

