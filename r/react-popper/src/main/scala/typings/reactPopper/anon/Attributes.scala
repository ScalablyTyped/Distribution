package typings.reactPopper.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var attributes: StringDictionary[StringDictionary[String]] = js.native
  var forceUpdate: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Instance * / any['forceUpdate'] */ js.Any) | Null = js.native
  var state: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ js.Any) | Null = js.native
  var styles: StringDictionary[CSSProperties] = js.native
  var update: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Instance * / any['update'] */ js.Any) | Null = js.native
}

object Attributes {
  @scala.inline
  def apply(attributes: StringDictionary[StringDictionary[String]], styles: StringDictionary[CSSProperties]): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[StringDictionary[String]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: StringDictionary[CSSProperties]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceUpdate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Instance * / any['forceUpdate'] */ js.Any
    ): Self = this.set("forceUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceUpdateNull: Self = this.set("forceUpdate", null)
    @scala.inline
    def setState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.State */ js.Any
    ): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStateNull: Self = this.set("state", null)
    @scala.inline
    def setUpdate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Instance * / any['update'] */ js.Any
    ): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateNull: Self = this.set("update", null)
  }
  
}

