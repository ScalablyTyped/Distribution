package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleImportPointer extends js.Object {
  @JSName("$fragmentRefs")
  val $fragmentRefs: js.Any
  val __fragmentPropName: js.UndefOr[String | Null] = js.undefined
  val __module_component: js.Any
}

object ModuleImportPointer {
  @scala.inline
  def apply(
    $fragmentRefs: js.Any,
    __module_component: js.Any,
    __fragmentPropName: js.UndefOr[Null | String] = js.undefined
  ): ModuleImportPointer = {
    val __obj = js.Dynamic.literal($fragmentRefs = $fragmentRefs.asInstanceOf[js.Any], __module_component = __module_component.asInstanceOf[js.Any])
    if (!js.isUndefined(__fragmentPropName)) __obj.updateDynamic("__fragmentPropName")(__fragmentPropName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportPointer]
  }
}

