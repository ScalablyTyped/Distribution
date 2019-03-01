package typings
package reactDashBootstrapLib.libNavMod.NavNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libNavMod.Nav] {
  // Optional
  var activeHref: js.UndefOr[java.lang.String] = js.undefined
  var activeKey: js.UndefOr[js.Any] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var justified: js.UndefOr[scala.Boolean] = js.undefined
  var navbar: js.UndefOr[scala.Boolean] = js.undefined
  var pullRight: js.UndefOr[scala.Boolean] = js.undefined
  var right: js.UndefOr[scala.Boolean] = js.undefined
  var stacked: js.UndefOr[scala.Boolean] = js.undefined
  var ulClassName: js.UndefOr[java.lang.String] = js.undefined
  var ulId: js.UndefOr[java.lang.String] = js.undefined
}

object NavProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libNavMod.Nav] = null,
    activeHref: java.lang.String = null,
    activeKey: js.Any = null,
    bsClass: java.lang.String = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    eventKey: js.Any = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    justified: js.UndefOr[scala.Boolean] = js.undefined,
    navbar: js.UndefOr[scala.Boolean] = js.undefined,
    pullRight: js.UndefOr[scala.Boolean] = js.undefined,
    right: js.UndefOr[scala.Boolean] = js.undefined,
    stacked: js.UndefOr[scala.Boolean] = js.undefined,
    ulClassName: java.lang.String = null,
    ulId: java.lang.String = null
  ): NavProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (activeHref != null) __obj.updateDynamic("activeHref")(activeHref)
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (!js.isUndefined(justified)) __obj.updateDynamic("justified")(justified)
    if (!js.isUndefined(navbar)) __obj.updateDynamic("navbar")(navbar)
    if (!js.isUndefined(pullRight)) __obj.updateDynamic("pullRight")(pullRight)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked)
    if (ulClassName != null) __obj.updateDynamic("ulClassName")(ulClassName)
    if (ulId != null) __obj.updateDynamic("ulId")(ulId)
    __obj.asInstanceOf[NavProps]
  }
}

