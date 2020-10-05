package typings.semanticUiReact.formSelectMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.genericMod.HtmlLabelProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.selectSelectMod.StrictSelectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, disabled, error, `inline`. Inlined content, control, id, label, required, `type`, width */ @js.native
trait StrictFormSelectProps extends StrictSelectProps {
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A FormField control prop. */
  var control: js.UndefOr[js.Any] = js.native
  /** Individual fields may display an error state along with a message. */
  @JSName("error")
  var error_StrictFormSelectProps: js.UndefOr[js.Any] = js.native
  /** The id of the control */
  var id: js.UndefOr[Double | String] = js.native
  /** Mutually exclusive with children. */
  var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.native
  /** A field can show that input is mandatory.  Requires a label. */
  var required: js.UndefOr[js.Any] = js.native
  /** Passed to the control component (i.e. <input type='password' />) */
  var `type`: js.UndefOr[String] = js.native
  /** A field can specify its width in grid columns */
  var width: js.UndefOr[SemanticWIDTHS] = js.native
}

object StrictFormSelectProps {
  @scala.inline
  def apply(options: js.Array[DropdownItemProps]): StrictFormSelectProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictFormSelectProps]
  }
  @scala.inline
  implicit class StrictFormSelectPropsOps[Self <: StrictFormSelectProps] (val x: Self) extends AnyVal {
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
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setControl(value: js.Any): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabelFunction3(
      value: (/* component */ ReactType[HtmlLabelProps], HtmlLabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("label", js.Any.fromFunction3(value))
    @scala.inline
    def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setRequired(value: js.Any): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: SemanticWIDTHS): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

