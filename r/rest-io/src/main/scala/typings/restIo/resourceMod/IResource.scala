package typings.restIo.resourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IResource extends js.Object {
  var model: js.Any = js.native
  var name: String = js.native
  var parentRef: js.UndefOr[String] = js.native
  var parentResource: js.UndefOr[Resource] = js.native
  var plural: js.UndefOr[String] = js.native
  var populate: js.UndefOr[String] = js.native
}

object IResource {
  @scala.inline
  def apply(model: js.Any, name: String): IResource = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResource]
  }
  @scala.inline
  implicit class IResourceOps[Self <: IResource] (val x: Self) extends AnyVal {
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
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentRef(value: String): Self = this.set("parentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentRef: Self = this.set("parentRef", js.undefined)
    @scala.inline
    def setParentResource(value: Resource): Self = this.set("parentResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentResource: Self = this.set("parentResource", js.undefined)
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

