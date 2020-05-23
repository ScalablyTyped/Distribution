package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(hideSpacer)) __obj.updateDynamic("hideSpacer")(hideSpacer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTop)) __obj.updateDynamic("hideTop")(hideTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seamed)) __obj.updateDynamic("seamed")(seamed.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waterfall)) __obj.updateDynamic("waterfall")(waterfall.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}

