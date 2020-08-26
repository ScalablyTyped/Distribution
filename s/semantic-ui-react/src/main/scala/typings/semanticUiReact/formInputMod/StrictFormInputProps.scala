package typings.semanticUiReact.formInputMod

import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.inputInputMod.StrictInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, disabled, error, id, label, required, `type`, width. Inlined content, control, `inline` */ @js.native
trait StrictFormInputProps extends StrictInputProps {
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A FormField control prop. */
  var control: js.UndefOr[js.Any] = js.native
  /** Individual fields may display an error state along with a message. */
  @JSName("error")
  var error_StrictFormInputProps: js.UndefOr[js.Any] = js.native
  /** A field can have its label next to instead of above it. */
  var `inline`: js.UndefOr[Boolean] = js.native
}

object StrictFormInputProps {
  @scala.inline
  def apply(): StrictFormInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictFormInputProps]
  }
  @scala.inline
  implicit class StrictFormInputPropsOps[Self <: StrictFormInputProps] (val x: Self) extends AnyVal {
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
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
  }
  
}

