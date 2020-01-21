package typings.storybookAddonStoryshots.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgStory extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var moduleMetadata: js.UndefOr[NgModuleMetadata] = js.undefined
  var props: ICollection
  var propsMeta: js.UndefOr[ICollection] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object NgStory {
  @scala.inline
  def apply(
    props: ICollection,
    component: js.Any = null,
    moduleMetadata: NgModuleMetadata = null,
    propsMeta: ICollection = null,
    template: String = null
  ): NgStory = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (moduleMetadata != null) __obj.updateDynamic("moduleMetadata")(moduleMetadata.asInstanceOf[js.Any])
    if (propsMeta != null) __obj.updateDynamic("propsMeta")(propsMeta.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgStory]
  }
}

