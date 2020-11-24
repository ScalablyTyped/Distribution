package typings.reactTagsinput.mod

import typings.react.mod.Props
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactTagsInputProps[Tag] extends Props[TagsInput[Tag]] {
  
  var addKeys: js.UndefOr[js.Array[Double | String]] = js.native
  
  var addOnBlur: js.UndefOr[Boolean] = js.native
  
  var addOnPaste: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var currentValue: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var focusedClassName: js.UndefOr[String] = js.native
  
  var inputProps: js.UndefOr[InputProps] = js.native
  
  var inputValue: js.UndefOr[String] = js.native
  
  var maxTags: js.UndefOr[Double] = js.native
  
  def onChange(tags: js.Array[Tag], changed: js.Array[Tag], changedIndexes: js.Array[Double]): Unit = js.native
  
  var onChangeInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  
  var onValidationReject: js.UndefOr[js.Function1[/* tags */ js.Array[String], Unit]] = js.native
  
  var onlyUnique: js.UndefOr[Boolean] = js.native
  
  var pasteSplit: js.UndefOr[js.Function1[/* data */ String, js.Array[String]]] = js.native
  
  var preventSubmit: js.UndefOr[Boolean] = js.native
  
  var removeKeys: js.UndefOr[js.Array[Double]] = js.native
  
  var renderInput: js.UndefOr[js.Function1[/* props */ RenderInputProps[Tag], ReactNode]] = js.native
  
  var renderLayout: js.UndefOr[RenderLayout] = js.native
  
  var renderTag: js.UndefOr[js.Function1[/* props */ RenderTagProps[Tag], ReactNode]] = js.native
  
  var tagDisplayProp: js.UndefOr[(/* keyof Tag */ String) | Null] = js.native
  
  var tagProps: js.UndefOr[TagProps] = js.native
  
  var validationRegex: js.UndefOr[RegExp] = js.native
  
  var value: js.Array[Tag] = js.native
}
object ReactTagsInputProps {
  
  @scala.inline
  def apply[Tag](onChange: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Unit, value: js.Array[Tag]): ReactTagsInputProps[Tag] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction3(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTagsInputProps[Tag]]
  }
  
  @scala.inline
  implicit class ReactTagsInputPropsOps[Self <: ReactTagsInputProps[_], Tag] (val x: Self with ReactTagsInputProps[Tag]) extends AnyVal {
    
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
    def setOnChange(value: (js.Array[Tag], js.Array[Tag], js.Array[Double]) => Unit): Self = this.set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setValueVarargs(value: Tag*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[Tag]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddKeysVarargs(value: (Double | String)*): Self = this.set("addKeys", js.Array(value :_*))
    
    @scala.inline
    def setAddKeys(value: js.Array[Double | String]): Self = this.set("addKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddKeys: Self = this.set("addKeys", js.undefined)
    
    @scala.inline
    def setAddOnBlur(value: Boolean): Self = this.set("addOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOnBlur: Self = this.set("addOnBlur", js.undefined)
    
    @scala.inline
    def setAddOnPaste(value: Boolean): Self = this.set("addOnPaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddOnPaste: Self = this.set("addOnPaste", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCurrentValue(value: String): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentValue: Self = this.set("currentValue", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFocusedClassName(value: String): Self = this.set("focusedClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusedClassName: Self = this.set("focusedClassName", js.undefined)
    
    @scala.inline
    def setInputProps(value: InputProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setInputValue(value: String): Self = this.set("inputValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputValue: Self = this.set("inputValue", js.undefined)
    
    @scala.inline
    def setMaxTags(value: Double): Self = this.set("maxTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTags: Self = this.set("maxTags", js.undefined)
    
    @scala.inline
    def setOnChangeInput(value: /* value */ String => Unit): Self = this.set("onChangeInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChangeInput: Self = this.set("onChangeInput", js.undefined)
    
    @scala.inline
    def setOnValidationReject(value: /* tags */ js.Array[String] => Unit): Self = this.set("onValidationReject", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValidationReject: Self = this.set("onValidationReject", js.undefined)
    
    @scala.inline
    def setOnlyUnique(value: Boolean): Self = this.set("onlyUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyUnique: Self = this.set("onlyUnique", js.undefined)
    
    @scala.inline
    def setPasteSplit(value: /* data */ String => js.Array[String]): Self = this.set("pasteSplit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePasteSplit: Self = this.set("pasteSplit", js.undefined)
    
    @scala.inline
    def setPreventSubmit(value: Boolean): Self = this.set("preventSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventSubmit: Self = this.set("preventSubmit", js.undefined)
    
    @scala.inline
    def setRemoveKeysVarargs(value: Double*): Self = this.set("removeKeys", js.Array(value :_*))
    
    @scala.inline
    def setRemoveKeys(value: js.Array[Double]): Self = this.set("removeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveKeys: Self = this.set("removeKeys", js.undefined)
    
    @scala.inline
    def setRenderInput(value: /* props */ RenderInputProps[Tag] => ReactNode): Self = this.set("renderInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderInput: Self = this.set("renderInput", js.undefined)
    
    @scala.inline
    def setRenderLayout(value: (/* tagElements */ js.Array[ReactElement], /* inputElement */ ReactElement) => ReactChild): Self = this.set("renderLayout", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderLayout: Self = this.set("renderLayout", js.undefined)
    
    @scala.inline
    def setRenderTag(value: /* props */ RenderTagProps[Tag] => ReactNode): Self = this.set("renderTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderTag: Self = this.set("renderTag", js.undefined)
    
    @scala.inline
    def setTagDisplayProp(value: /* keyof Tag */ String): Self = this.set("tagDisplayProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagDisplayProp: Self = this.set("tagDisplayProp", js.undefined)
    
    @scala.inline
    def setTagDisplayPropNull: Self = this.set("tagDisplayProp", null)
    
    @scala.inline
    def setTagProps(value: TagProps): Self = this.set("tagProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagProps: Self = this.set("tagProps", js.undefined)
    
    @scala.inline
    def setValidationRegex(value: RegExp): Self = this.set("validationRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationRegex: Self = this.set("validationRegex", js.undefined)
  }
}
