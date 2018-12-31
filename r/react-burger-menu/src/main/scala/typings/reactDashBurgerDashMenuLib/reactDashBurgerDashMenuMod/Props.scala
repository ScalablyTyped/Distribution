package typings
package reactDashBurgerDashMenuLib.reactDashBurgerDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var bodyClassName: js.UndefOr[java.lang.String] = js.undefined
  var burgerBarClassName: js.UndefOr[java.lang.String] = js.undefined
  var burgerButtonClassName: js.UndefOr[java.lang.String] = js.undefined
  var crossButtonClassName: js.UndefOr[java.lang.String] = js.undefined
  var crossClassName: js.UndefOr[java.lang.String] = js.undefined
  var customBurgerIcon: js.UndefOr[
    reactLib.reactMod.Global.JSXNs.Element | reactDashBurgerDashMenuLib.reactDashBurgerDashMenuLibNumbers.`false`
  ] = js.undefined
  var customCrossIcon: js.UndefOr[
    reactLib.reactMod.Global.JSXNs.Element | reactDashBurgerDashMenuLib.reactDashBurgerDashMenuLibNumbers.`false`
  ] = js.undefined
  var disableOverlayClick: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var itemListClassName: js.UndefOr[java.lang.String] = js.undefined
  var menuClassName: js.UndefOr[java.lang.String] = js.undefined
  var morphShapeClassName: js.UndefOr[java.lang.String] = js.undefined
  var noOverlay: js.UndefOr[scala.Boolean] = js.undefined
  var onStateChange: js.UndefOr[js.Function1[/* state */ State, scala.Unit]] = js.undefined
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.outerContainer ? PropTypes.string.isRequired : PropTypes.string
  var outerContainerId: js.UndefOr[java.lang.String] = js.undefined
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  // TODO (Rajab) This can be improved, though I do not know how. From PropTypes:
  // styles && styles.pageWrap ? PropTypes.string.isRequired : PropTypes.string,
  var pageWrapId: js.UndefOr[java.lang.String] = js.undefined
  var right: js.UndefOr[scala.Boolean] = js.undefined
  var styles: js.UndefOr[Styles] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

