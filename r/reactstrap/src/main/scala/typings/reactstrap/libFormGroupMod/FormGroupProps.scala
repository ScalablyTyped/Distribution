package typings.reactstrap.libFormGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormGroupProps
  extends HTMLProps[HTMLDivElement]
     with /* key */ StringDictionary[js.Any] {
  var check: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var row: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object FormGroupProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLDivElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    check: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cssModule: CSSModule = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null
  ): FormGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormGroupProps]
  }
}

