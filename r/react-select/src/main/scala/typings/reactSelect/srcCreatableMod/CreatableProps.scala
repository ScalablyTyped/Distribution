package typings.reactSelect.srcCreatableMod

import typings.react.mod.ReactNode
import typings.reactSelect.reactSelectStrings.first
import typings.reactSelect.reactSelectStrings.last
import typings.reactSelect.typesMod.GroupedOptionsType
import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatableProps[OptionType /* <: OptionTypeBase */] extends js.Object {
  
  /* Allow options to be created while the `isLoading` prop is true. Useful to
    prevent the "create new ..." option being displayed while async results are
    still being loaded. */
  var allowCreateWhileLoading: js.UndefOr[Boolean] = js.native
  
  /* Sets the position of the createOption element in your options list. Defaults to 'last' */
  var createOptionPosition: js.UndefOr[first | last] = js.native
  
  /* Gets the label for the "create new ..." option in the menu. Is given the
    current input value. */
  var formatCreateLabel: js.UndefOr[js.Function1[/* inputValue */ String, ReactNode]] = js.native
  
  /* Returns the data for the new option when it is created. Used to display the
    value, and is passed to `onChange`. */
  var getNewOptionData: js.UndefOr[js.Function2[/* inputValue */ String, /* optionLabel */ ReactNode, OptionType]] = js.native
  
  /* Determines whether the "create new ..." option should be displayed based on
    the current input value, select value and options array. */
  var isValidNewOption: js.UndefOr[
    js.Function3[
      /* inputValue */ String, 
      /* value */ ValueType[OptionType], 
      /* options */ OptionsType[OptionType] | GroupedOptionsType[OptionType], 
      Boolean
    ]
  ] = js.native
  
  /* If provided, this will be called with the input value when a new option is
    created, and `onChange` will **not** be called. Use this when you need more
    control over what happens when new options are created. */
  var onCreateOption: js.UndefOr[js.Function1[/* inputValue */ String, Unit]] = js.native
}
object CreatableProps {
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */](): CreatableProps[OptionType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatableProps[OptionType]]
  }
  
  @scala.inline
  implicit class CreatablePropsOps[Self <: CreatableProps[_], OptionType /* <: OptionTypeBase */] (val x: Self with CreatableProps[OptionType]) extends AnyVal {
    
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
    def setAllowCreateWhileLoading(value: Boolean): Self = this.set("allowCreateWhileLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCreateWhileLoading: Self = this.set("allowCreateWhileLoading", js.undefined)
    
    @scala.inline
    def setCreateOptionPosition(value: first | last): Self = this.set("createOptionPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateOptionPosition: Self = this.set("createOptionPosition", js.undefined)
    
    @scala.inline
    def setFormatCreateLabel(value: /* inputValue */ String => ReactNode): Self = this.set("formatCreateLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormatCreateLabel: Self = this.set("formatCreateLabel", js.undefined)
    
    @scala.inline
    def setGetNewOptionData(value: (/* inputValue */ String, /* optionLabel */ ReactNode) => OptionType): Self = this.set("getNewOptionData", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetNewOptionData: Self = this.set("getNewOptionData", js.undefined)
    
    @scala.inline
    def setIsValidNewOption(
      value: (/* inputValue */ String, /* value */ ValueType[OptionType], /* options */ OptionsType[OptionType] | GroupedOptionsType[OptionType]) => Boolean
    ): Self = this.set("isValidNewOption", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIsValidNewOption: Self = this.set("isValidNewOption", js.undefined)
    
    @scala.inline
    def setOnCreateOption(value: /* inputValue */ String => Unit): Self = this.set("onCreateOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCreateOption: Self = this.set("onCreateOption", js.undefined)
  }
}
