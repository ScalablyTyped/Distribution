package typings.reactEasyCrop.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerClassName extends js.Object {
  
  var containerClassName: js.UndefOr[String] = js.native
  
  var cropAreaClassName: js.UndefOr[String] = js.native
  
  var mediaClassName: js.UndefOr[String] = js.native
}
object ContainerClassName {
  
  @scala.inline
  def apply(): ContainerClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerClassName]
  }
  
  @scala.inline
  implicit class ContainerClassNameOps[Self <: ContainerClassName] (val x: Self) extends AnyVal {
    
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
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    
    @scala.inline
    def setCropAreaClassName(value: String): Self = this.set("cropAreaClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropAreaClassName: Self = this.set("cropAreaClassName", js.undefined)
    
    @scala.inline
    def setMediaClassName(value: String): Self = this.set("mediaClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaClassName: Self = this.set("mediaClassName", js.undefined)
  }
}
