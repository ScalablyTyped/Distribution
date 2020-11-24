package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.typesMod.KnobType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableDebounce[T /* <: KnobType */] extends js.Object {
  
  var disableDebounce: js.UndefOr[Boolean] = js.native
  
  var disableForceUpdate: js.UndefOr[Boolean] = js.native
  
  var groupId: js.UndefOr[String] = js.native
  
  var `type`: T = js.native
}
object DisableDebounce {
  
  @scala.inline
  def apply[T /* <: KnobType */](`type`: T): DisableDebounce[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableDebounce[T]]
  }
  
  @scala.inline
  implicit class DisableDebounceOps[Self <: DisableDebounce[_], T /* <: KnobType */] (val x: Self with DisableDebounce[T]) extends AnyVal {
    
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
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDebounce(value: Boolean): Self = this.set("disableDebounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDebounce: Self = this.set("disableDebounce", js.undefined)
    
    @scala.inline
    def setDisableForceUpdate(value: Boolean): Self = this.set("disableForceUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableForceUpdate: Self = this.set("disableForceUpdate", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
  }
}
