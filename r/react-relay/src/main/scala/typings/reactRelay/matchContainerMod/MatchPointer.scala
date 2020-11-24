package typings.reactRelay.matchContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  __fragmentPropName :string | null | undefined,   __module_component :unknown | undefined,    $fragmentRefs :unknown}> */
@js.native
trait MatchPointer extends js.Object {
  
  @JSName(" $fragmentRefs")
  val Space$fragmentRefs: js.Any = js.native
  
  val __fragmentPropName: js.UndefOr[String | Null] = js.native
  
  val __module_component: js.UndefOr[js.Any] = js.native
}
object MatchPointer {
  
  @scala.inline
  def apply(Space$fragmentRefs: js.Any): MatchPointer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $fragmentRefs")(Space$fragmentRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchPointer]
  }
  
  @scala.inline
  implicit class MatchPointerOps[Self <: MatchPointer] (val x: Self) extends AnyVal {
    
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
    def setSpace$fragmentRefs(value: js.Any): Self = this.set(" $fragmentRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__fragmentPropName(value: String): Self = this.set("__fragmentPropName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__fragmentPropName: Self = this.set("__fragmentPropName", js.undefined)
    
    @scala.inline
    def set__fragmentPropNameNull: Self = this.set("__fragmentPropName", null)
    
    @scala.inline
    def set__module_component(value: js.Any): Self = this.set("__module_component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__module_component: Self = this.set("__module_component", js.undefined)
  }
}
