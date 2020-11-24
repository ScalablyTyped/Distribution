package typings.reactToastify.useToastContainerMod

import typings.reactToastify.typesMod.Id
import typings.reactToastify.typesMod.Toast
import typings.reactToastify.typesMod.ToastContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerInstance extends js.Object {
  
  var containerId: js.UndefOr[Id | Null] = js.native
  
  var displayedToast: Double = js.native
  
  def getToast(id: Id): Toast | Null = js.native
  
  def isToastActive(toastId: Id): Boolean = js.native
  
  var props: ToastContainerProps = js.native
  
  var toastKey: Double = js.native
}
object ContainerInstance {
  
  @scala.inline
  def apply(
    displayedToast: Double,
    getToast: Id => Toast | Null,
    isToastActive: Id => Boolean,
    props: ToastContainerProps,
    toastKey: Double
  ): ContainerInstance = {
    val __obj = js.Dynamic.literal(displayedToast = displayedToast.asInstanceOf[js.Any], getToast = js.Any.fromFunction1(getToast), isToastActive = js.Any.fromFunction1(isToastActive), props = props.asInstanceOf[js.Any], toastKey = toastKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerInstance]
  }
  
  @scala.inline
  implicit class ContainerInstanceOps[Self <: ContainerInstance] (val x: Self) extends AnyVal {
    
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
    def setDisplayedToast(value: Double): Self = this.set("displayedToast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetToast(value: Id => Toast | Null): Self = this.set("getToast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsToastActive(value: Id => Boolean): Self = this.set("isToastActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProps(value: ToastContainerProps): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToastKey(value: Double): Self = this.set("toastKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerId(value: Id): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setContainerIdNull: Self = this.set("containerId", null)
  }
}
