package typings.reactDashRouterDashDom.reactDashRouterDashDomMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationDescriptor
import typings.react.reactMod.AnchorHTMLAttributes
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Ref
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.`true`
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.date
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.location
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.page
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.step
import typings.reactDashRouterDashDom.reactDashRouterDashDomStrings.time
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps[S] extends AnchorHTMLAttributes[HTMLAnchorElement] {
  var ariaCurrent: js.UndefOr[page | step | location | date | time | `true`] = js.undefined
  var component: js.UndefOr[ComponentType[_]] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])
}

object LinkProps {
  @scala.inline
  def apply[S](
    to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]]),
    AnchorHTMLAttributes: AnchorHTMLAttributes[HTMLAnchorElement] = null,
    ariaCurrent: page | step | location | date | time | `true` = null,
    component: ComponentType[_] = null,
    innerRef: Ref[HTMLAnchorElement] = null,
    replace: js.UndefOr[Boolean] = js.undefined
  ): LinkProps[S] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, AnchorHTMLAttributes)
    if (ariaCurrent != null) __obj.updateDynamic("ariaCurrent")(ariaCurrent.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[LinkProps[S]]
  }
}

