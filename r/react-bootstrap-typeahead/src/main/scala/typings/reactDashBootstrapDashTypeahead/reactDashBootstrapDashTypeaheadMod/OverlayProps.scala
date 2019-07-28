package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'align' | 'dropup' | 'flip' | 'onMenuHide' | 'onMenuShow' | 'onMenuToggle' ]: react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<any>[P]} */ trait OverlayProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var container: HTMLElement
  var referenceElement: js.UndefOr[HTMLElement] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
}

object OverlayProps {
  @scala.inline
  def apply(
    container: HTMLElement,
    children: ReactNode = null,
    className: String = null,
    referenceElement: HTMLElement = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(container = container)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (referenceElement != null) __obj.updateDynamic("referenceElement")(referenceElement)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[OverlayProps]
  }
}

