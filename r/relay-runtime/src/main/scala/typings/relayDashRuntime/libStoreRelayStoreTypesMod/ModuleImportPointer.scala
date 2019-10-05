package typings.relayDashRuntime.libStoreRelayStoreTypesMod

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
  def apply($fragmentRefs: js.Any, __module_component: js.Any, __fragmentPropName: String = null): ModuleImportPointer = {
    val __obj = js.Dynamic.literal($fragmentRefs = $fragmentRefs, __module_component = __module_component)
    if (__fragmentPropName != null) __obj.updateDynamic("__fragmentPropName")(__fragmentPropName)
    __obj.asInstanceOf[ModuleImportPointer]
  }
}

