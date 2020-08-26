package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleImportPointer extends js.Object {
  @JSName("$fragmentRefs")
  val $fragmentRefs: js.Any = js.native
  val __fragmentPropName: js.UndefOr[String | Null] = js.native
  val __module_component: js.Any = js.native
}

object ModuleImportPointer {
  @scala.inline
  def apply($fragmentRefs: js.Any, __module_component: js.Any): ModuleImportPointer = {
    val __obj = js.Dynamic.literal($fragmentRefs = $fragmentRefs.asInstanceOf[js.Any], __module_component = __module_component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportPointer]
  }
  @scala.inline
  implicit class ModuleImportPointerOps[Self <: ModuleImportPointer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$fragmentRefs(value: js.Any): Self = this.set("$fragmentRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def set__module_component(value: js.Any): Self = this.set("__module_component", value.asInstanceOf[js.Any])
    @scala.inline
    def set__fragmentPropName(value: String): Self = this.set("__fragmentPropName", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__fragmentPropName: Self = this.set("__fragmentPropName", js.undefined)
    @scala.inline
    def set__fragmentPropNameNull: Self = this.set("__fragmentPropName", null)
  }
  
}

