package typings.storybookAddonStoryshots.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgStory extends js.Object {
  var component: js.UndefOr[js.Any] = js.native
  var moduleMetadata: js.UndefOr[NgModuleMetadata] = js.native
  var props: ICollection = js.native
  var propsMeta: js.UndefOr[ICollection] = js.native
  var template: js.UndefOr[String] = js.native
}

object NgStory {
  @scala.inline
  def apply(props: ICollection): NgStory = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgStory]
  }
  @scala.inline
  implicit class NgStoryOps[Self <: NgStory] (val x: Self) extends AnyVal {
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
    def setProps(value: ICollection): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: js.Any): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setModuleMetadata(value: NgModuleMetadata): Self = this.set("moduleMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleMetadata: Self = this.set("moduleMetadata", js.undefined)
    @scala.inline
    def setPropsMeta(value: ICollection): Self = this.set("propsMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropsMeta: Self = this.set("propsMeta", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

