package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'align' | 'dropup' | 'flip' | 'onMenuHide' | 'onMenuShow' | 'onMenuToggle' ]: react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<any>[P]} */ trait OverlayProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var container: stdLib.HTMLElement
  var referenceElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    referenceElement: stdLib.HTMLElement = null,
    show: js.UndefOr[scala.Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(container = container)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[OverlayProps]
  }
}

