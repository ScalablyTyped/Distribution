package typings.restIo.subResourceMod

import typings.restIo.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISubResource extends js.Object {
  
  var name: String = js.native
  
  var parentResource: Resource = js.native
  
  var plural: js.UndefOr[String] = js.native
  
  var populate: js.UndefOr[String] = js.native
}
object ISubResource {
  
  @scala.inline
  def apply(name: String, parentResource: Resource): ISubResource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentResource = parentResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubResource]
  }
  
  @scala.inline
  implicit class ISubResourceOps[Self <: ISubResource] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentResource(value: Resource): Self = this.set("parentResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlural: Self = this.set("plural", js.undefined)
    
    @scala.inline
    def setPopulate(value: String): Self = this.set("populate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopulate: Self = this.set("populate", js.undefined)
  }
}
