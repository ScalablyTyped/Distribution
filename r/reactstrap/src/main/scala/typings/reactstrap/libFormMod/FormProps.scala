package typings.reactstrap.libFormMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import typings.react.reactMod.Ref
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps
  extends HTMLProps[HTMLFormElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLFormElement]] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLFormElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[HTMLFormElement] = null,
    tag: ReactType[_] = null
  ): FormProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormProps]
  }
}

