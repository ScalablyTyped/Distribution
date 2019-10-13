package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var hideSpacer: js.UndefOr[Boolean] = js.undefined
  var hideTop: js.UndefOr[Boolean] = js.undefined
   // string | JSX.Element
  var scroll: js.UndefOr[Boolean] = js.undefined
  var seamed: js.UndefOr[Boolean] = js.undefined
  @JSName("title")
  var title_HeaderProps: js.UndefOr[js.Any] = js.undefined
  var transparent: js.UndefOr[Boolean] = js.undefined
  var waterfall: js.UndefOr[Boolean] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    hideSpacer: js.UndefOr[Boolean] = js.undefined,
    hideTop: js.UndefOr[Boolean] = js.undefined,
    scroll: js.UndefOr[Boolean] = js.undefined,
    seamed: js.UndefOr[Boolean] = js.undefined,
    title: js.Any = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    waterfall: js.UndefOr[Boolean] = js.undefined
  ): HeaderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(hideSpacer)) __obj.updateDynamic("hideSpacer")(hideSpacer)
    if (!js.isUndefined(hideTop)) __obj.updateDynamic("hideTop")(hideTop)
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(seamed)) __obj.updateDynamic("seamed")(seamed)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (!js.isUndefined(waterfall)) __obj.updateDynamic("waterfall")(waterfall)
    __obj.asInstanceOf[HeaderProps]
  }
}

