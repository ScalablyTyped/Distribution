package typings.rbx.fieldMod

import typings.rbx.rbxStrings.addons
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.group
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[addons | group] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var narrow: js.UndefOr[Boolean] = js.undefined
}

object FieldModifierProps {
  @scala.inline
  def apply(
    align: centered | right = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    kind: addons | group = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    narrow: js.UndefOr[Boolean] = js.undefined
  ): FieldModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (!js.isUndefined(narrow)) __obj.updateDynamic("narrow")(narrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldModifierProps]
  }
}

