package typings.atStorybookAddonDashCentered

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStory extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var moduleMetadata: js.UndefOr[NgModuleMetadata] = js.undefined
  var props: js.UndefOr[ICollection] = js.undefined
  var propsMeta: js.UndefOr[ICollection] = js.undefined
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object IStory {
  @scala.inline
  def apply(
    component: js.Any = null,
    moduleMetadata: NgModuleMetadata = null,
    props: ICollection = null,
    propsMeta: ICollection = null,
    styles: js.Array[String] = null,
    template: String = null
  ): IStory = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (moduleMetadata != null) __obj.updateDynamic("moduleMetadata")(moduleMetadata)
    if (props != null) __obj.updateDynamic("props")(props)
    if (propsMeta != null) __obj.updateDynamic("propsMeta")(propsMeta)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[IStory]
  }
}

