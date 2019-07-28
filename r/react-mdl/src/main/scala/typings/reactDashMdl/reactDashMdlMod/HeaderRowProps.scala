package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderRowProps
  extends HTMLProps[js.Any] {
   // string | JSX.Element
  var hideSpacer: js.UndefOr[Boolean] = js.undefined
  @JSName("title")
  var title_HeaderRowProps: js.UndefOr[js.Any] = js.undefined
}

object HeaderRowProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[js.Any] = null,
    hideSpacer: js.UndefOr[Boolean] = js.undefined,
    title: js.Any = null
  ): HeaderRowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (!js.isUndefined(hideSpacer)) __obj.updateDynamic("hideSpacer")(hideSpacer)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[HeaderRowProps]
  }
}

