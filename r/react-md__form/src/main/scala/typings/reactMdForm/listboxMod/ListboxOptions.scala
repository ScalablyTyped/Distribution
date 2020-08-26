package typings.reactMdForm.listboxMod

import typings.react.mod.ReactNode
import typings.reactMdForm.utilsMod.ListboxOption
import typings.reactMdPortal.conditionalPortalMod.RenderConditionalPortalProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListboxOptions extends RenderConditionalPortalProps {
  /**
    * Boolean if using the keyboard should not immediately trigger the `onChange`
    * callback. When this is enabled, the `onChange` callback will only be called
    * if the user clicks an item or presses the enter or space key.
    */
  var disableMovementChange: js.UndefOr[Boolean] = js.native
  /**
    * A function to call for each option that should return a unique id for the
    * specific option in the list. These ids are required for handling
    * `aria-activedescendant` movement within the listbox.
    */
  var getOptionId: js.UndefOr[js.Function2[/* baseId */ String, /* index */ Double, String]] = js.native
  /**
    * A function that will get a display label for an option. The default
    * behavior is to render any number or string options as the label, otherwise
    * attempt to do `option[labelKey] || option.children`.
    */
  var getOptionLabel: js.UndefOr[js.Function2[/* option */ ListboxOption, /* labelKey */ String, ReactNode]] = js.native
  /**
    * A function that will get the value for an option. The default behavior is
    * to render any number or string options as the value, otherwise attempt to
    * do `option[valueKey]`.
    */
  var getOptionValue: js.UndefOr[js.Function2[/* item */ js.Any, /* valueKey */ js.UndefOr[String], String]] = js.native
  /**
    * A function to call for each option to check if it is currently disabled.
    * This is really just a convenience prop so that you don't need to modify the
    * `options` yourself.
    */
  var isOptionDisabled: js.UndefOr[js.Function1[/* option */ ListboxOption, Boolean]] = js.native
  /**
    * A key to use that extracts the display label for an option from the options
    * list. This will only be used if the option is an object and is passed to
    * the `getOptionLabel` prop.
    */
  var labelKey: js.UndefOr[String] = js.native
  /**
    * An optional name to provide for the listbox that will be provided with the
    * `onChange` callback.
    */
  var name: js.UndefOr[String] = js.native
  /**
    @see ListboxChangeEventHandler
    */
  var onChange: ListboxChangeEventHandler = js.native
  /**
    * The list of options to display within the listbox.
    */
  var options: js.Array[ListboxOption] = js.native
  /**
    * The listbox is a controlled component, so you will need to provide the
    * current value and an `onChange` handler. The `value` must be a string and
    * _should_ be one of the option's values when something has been selected. If
    * you want to have an "empty" select box to require the user to manually
    * select something to be considered valid, you can set this to the empty
    * string and it'll be considered "unvalued".
    */
  var value: String = js.native
  /**
    * A key to use that extracts the value for the option from the options list.
    * This will only be used if the option is an object and will be passed to the
    * `getOptionValue` prop.
    */
  var valueKey: js.UndefOr[String] = js.native
}

object ListboxOptions {
  @scala.inline
  def apply(
    onChange: (/* nextValue */ String, /* option */ ListboxOption, /* listbox */ ListboxChangeEventData) => Unit,
    options: js.Array[ListboxOption],
    value: String
  ): ListboxOptions = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction3(onChange), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListboxOptions]
  }
  @scala.inline
  implicit class ListboxOptionsOps[Self <: ListboxOptions] (val x: Self) extends AnyVal {
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
    def setOnChange(
      value: (/* nextValue */ String, /* option */ ListboxOption, /* listbox */ ListboxChangeEventData) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    @scala.inline
    def setOptionsVarargs(value: ListboxOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[ListboxOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableMovementChange(value: Boolean): Self = this.set("disableMovementChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableMovementChange: Self = this.set("disableMovementChange", js.undefined)
    @scala.inline
    def setGetOptionId(value: (/* baseId */ String, /* index */ Double) => String): Self = this.set("getOptionId", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetOptionId: Self = this.set("getOptionId", js.undefined)
    @scala.inline
    def setGetOptionLabel(value: (/* option */ ListboxOption, /* labelKey */ String) => ReactNode): Self = this.set("getOptionLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetOptionLabel: Self = this.set("getOptionLabel", js.undefined)
    @scala.inline
    def setGetOptionValue(value: (/* item */ js.Any, /* valueKey */ js.UndefOr[String]) => String): Self = this.set("getOptionValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetOptionValue: Self = this.set("getOptionValue", js.undefined)
    @scala.inline
    def setIsOptionDisabled(value: /* option */ ListboxOption => Boolean): Self = this.set("isOptionDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsOptionDisabled: Self = this.set("isOptionDisabled", js.undefined)
    @scala.inline
    def setLabelKey(value: String): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
  }
  
}

