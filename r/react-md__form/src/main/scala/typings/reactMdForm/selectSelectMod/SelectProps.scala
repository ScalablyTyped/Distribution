package typings.reactMdForm.selectSelectMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactMdForm.listboxMod.ListboxChangeEventData
import typings.reactMdForm.listboxMod.ListboxOptions
import typings.reactMdForm.textFieldContainerMod.TextFieldContainerOptions
import typings.reactMdForm.utilsMod.ListboxOption
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.reactMdUtils.typesMod.PositionWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectProps
  extends TextFieldContainerOptions
     with FakeSelectAttributes
     with ListboxOptions {
  
  /**
    * The positioning configuration for how the listbox should be anchored to the
    * select button.
    */
  var anchor: js.UndefOr[PositionAnchor] = js.native
  
  /**
    * Boolean if the select's listbox should not hide if the user resizes the
    * browser while it is visible.
    */
  var closeOnResize: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the select's listbox should not hide if the user scrolls the
    * page while it is visible.
    */
  var closeOnScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the `Select`'s button display value should not attempt to
    * extract a `leftAddon` from the current selected option to display.
    */
  var disableLeftAddon: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the select is currently disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional className to apply to the current display value within the
    * `Select`'s button component.
    */
  var displayLabelClassName: js.UndefOr[String] = js.native
  
  /**
    * An optional style to apply to the current display value within the
    * `Select`'s button component.
    */
  var displayLabelStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * A function that gets called whenever the Select's value changes so that the
    * selected option can be converted into a renderable element to show in the
    * Select's button. The default behavior is to use the `getOptionLabel`
    * default behavior. If the option is an object and the `disableLeftAddon`
    * prop has not been disabled, it will then attempt to also extract a
    * `leftAddon` from the option and use the `TextIconSpacing` component with
    * the label + icon/avatar.
    */
  var getDisplayLabel: js.UndefOr[
    js.Function3[
      /* option */ ListboxOption, 
      /* labelKey */ String, 
      /* includeLeft */ Boolean, 
      ReactNode
    ]
  ] = js.native
  
  /**
    * The id for the select component. This is required for a11y and will be used
    * to generate ids for the listbox and each option within the listbox.
    */
  @JSName("id")
  var id_SelectProps: String = js.native
  
  /**
    * An optional floating label to use with the select.
    */
  var label: js.UndefOr[ReactNode] = js.native
  
  /**
    * An optional className to apply to the label element.
    */
  var labelClassName: js.UndefOr[String] = js.native
  
  /**
    * An optional style to apply to the label element.
    */
  var labelStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * An optional className to apply to the listbox.
    */
  var listboxClassName: js.UndefOr[String] = js.native
  
  /**
    * An optional style to apply to the listbox.
    */
  var listboxStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * The sizing behavior for the listbox. It will default to have the same width
    * as the select button, but it is also possible to either have the
    * `min-width` be the width of the select button or just automatically
    * determine the width.
    *
    * The sizing behavior will always ensure that the left and right bounds of
    * the listbox appear within the viewport.
    */
  var listboxWidth: js.UndefOr[PositionWidth] = js.native
  
  /**
    * An optional placeholder text to show while the select is unvalued and is
    * either currently focused or the `label` prop was not provided.
    */
  var placeholder: js.UndefOr[ReactNode] = js.native
  
  /**
    * Boolean if the select should act as a read only select field which just
    * allows for all the options to be visible when toggled open.
    */
  var readOnly: js.UndefOr[Boolean] = js.native
}
object SelectProps {
  
  @scala.inline
  def apply(
    id: String,
    onChange: (/* nextValue */ String, /* option */ ListboxOption, /* listbox */ ListboxChangeEventData) => Unit,
    options: js.Array[ListboxOption],
    value: String
  ): SelectProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction3(onChange), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
  
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchor(value: PositionAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    
    @scala.inline
    def setCloseOnResize(value: Boolean): Self = this.set("closeOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnResize: Self = this.set("closeOnResize", js.undefined)
    
    @scala.inline
    def setCloseOnScroll(value: Boolean): Self = this.set("closeOnScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnScroll: Self = this.set("closeOnScroll", js.undefined)
    
    @scala.inline
    def setDisableLeftAddon(value: Boolean): Self = this.set("disableLeftAddon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLeftAddon: Self = this.set("disableLeftAddon", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisplayLabelClassName(value: String): Self = this.set("displayLabelClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLabelClassName: Self = this.set("displayLabelClassName", js.undefined)
    
    @scala.inline
    def setDisplayLabelStyle(value: CSSProperties): Self = this.set("displayLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLabelStyle: Self = this.set("displayLabelStyle", js.undefined)
    
    @scala.inline
    def setGetDisplayLabel(value: (/* option */ ListboxOption, /* labelKey */ String, /* includeLeft */ Boolean) => ReactNode): Self = this.set("getDisplayLabel", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetDisplayLabel: Self = this.set("getDisplayLabel", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelClassName(value: String): Self = this.set("labelClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelClassName: Self = this.set("labelClassName", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: CSSProperties): Self = this.set("labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelStyle: Self = this.set("labelStyle", js.undefined)
    
    @scala.inline
    def setListboxClassName(value: String): Self = this.set("listboxClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListboxClassName: Self = this.set("listboxClassName", js.undefined)
    
    @scala.inline
    def setListboxStyle(value: CSSProperties): Self = this.set("listboxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListboxStyle: Self = this.set("listboxStyle", js.undefined)
    
    @scala.inline
    def setListboxWidth(value: PositionWidth): Self = this.set("listboxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListboxWidth: Self = this.set("listboxWidth", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: ReactNode): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
}
