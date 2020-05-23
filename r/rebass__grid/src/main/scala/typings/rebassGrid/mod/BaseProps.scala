package typings.rebassGrid.mod

import typings.react.mod.ElementType
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps
  extends Props[js.Any] {
  var as: js.UndefOr[ElementType[_]] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    as: ElementType[_] = null,
    children: ReactNode = null,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[js.Any]] = js.undefined
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

