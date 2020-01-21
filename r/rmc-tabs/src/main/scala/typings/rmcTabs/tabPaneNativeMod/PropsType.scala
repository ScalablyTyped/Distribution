package typings.rmcTabs.tabPaneNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var active: Boolean
  var key: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any
  ] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    active: Boolean,
    key: String = null,
    style: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RN.ViewStyle */ js.Any = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

