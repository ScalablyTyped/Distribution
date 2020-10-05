package typings.semanticUiReact.formButtonMod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.buttonButtonMod.StrictButtonProps
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.labelLabelMod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, content, disabled, id, label, `type`. Inlined control, error, `inline`, required, width */ @js.native
trait StrictFormButtonProps extends StrictButtonProps {
  /** A FormField control prop. */
  var control: js.UndefOr[js.Any] = js.native
  /** Individual fields may display an error state along with a message. */
  var error: js.UndefOr[Boolean | SemanticShorthandItem[LabelProps]] = js.native
  /** A field can have its label next to instead of above it. */
  var `inline`: js.UndefOr[Boolean] = js.native
  /** A field can show that input is mandatory.  Requires a label. */
  var required: js.UndefOr[js.Any] = js.native
  /** A field can specify its width in grid columns */
  var width: js.UndefOr[SemanticWIDTHS] = js.native
}

object StrictFormButtonProps {
  @scala.inline
  def apply(): StrictFormButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFormButtonProps]
  }
  @scala.inline
  implicit class StrictFormButtonPropsOps[Self <: StrictFormButtonProps] (val x: Self) extends AnyVal {
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
    def setControl(value: js.Any): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControl: Self = this.set("control", js.undefined)
    @scala.inline
    def setErrorFunction3(
      value: (/* component */ ReactType[LabelProps], LabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("error", js.Any.fromFunction3(value))
    @scala.inline
    def setError(value: Boolean | SemanticShorthandItem[LabelProps]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setRequired(value: js.Any): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setWidth(value: SemanticWIDTHS): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

