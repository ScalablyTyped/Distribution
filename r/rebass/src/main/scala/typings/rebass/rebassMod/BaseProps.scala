package typings.rebass.rebassMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.styledDashComponents.styledDashComponentsMod.CSSObject
import typings.styledDashComponents.styledDashComponentsMod.FlattenSimpleInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps
  extends Props[js.Any] {
  var as: js.UndefOr[ReactType[_]] = js.undefined
  var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    as: ReactType[_] = null,
    children: ReactNode = null,
    css: CSSObject | FlattenSimpleInterpolation | String = null,
    key: Key = null,
    ref: LegacyRef[js.Any] = null
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

