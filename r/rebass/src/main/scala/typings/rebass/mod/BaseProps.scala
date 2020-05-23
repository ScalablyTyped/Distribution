package typings.rebass.mod

import typings.react.mod.ElementType
import typings.react.mod.Key
import typings.react.mod.Ref
import typings.react.mod.RefAttributes
import typings.styledComponents.styledComponentsMod.CSSObject
import typings.styledComponents.styledComponentsMod.FlattenSimpleInterpolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps
  extends RefAttributes[js.Any] {
  var as: js.UndefOr[ElementType[_]] = js.undefined
  var css: js.UndefOr[CSSObject | FlattenSimpleInterpolation | String] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    as: ElementType[_] = null,
    css: CSSObject | FlattenSimpleInterpolation | String = null,
    key: Key = null,
    ref: js.UndefOr[Null | Ref[js.Any]] = js.undefined
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

