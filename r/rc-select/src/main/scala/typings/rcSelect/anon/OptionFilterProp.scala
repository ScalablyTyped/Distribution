package typings.rcSelect.anon

import typings.rcSelect.generatorMod.FilterFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionFilterProp extends js.Object {
  var filterOption: Boolean | (FilterFunc[
    /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
  ]) = js.native
  var optionFilterProp: String = js.native
}

object OptionFilterProp {
  @scala.inline
  def apply(
    filterOption: Boolean | (FilterFunc[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
    ]),
    optionFilterProp: String
  ): OptionFilterProp = {
    val __obj = js.Dynamic.literal(filterOption = filterOption.asInstanceOf[js.Any], optionFilterProp = optionFilterProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionFilterProp]
  }
  @scala.inline
  implicit class OptionFilterPropOps[Self <: OptionFilterProp] (val x: Self) extends AnyVal {
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
    def setFilterOptionFunction2(
      value: (/* inputValue */ String, /* option */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
        ]) => Boolean
    ): Self = this.set("filterOption", js.Any.fromFunction2(value))
    @scala.inline
    def setFilterOption(
      value: Boolean | (FilterFunc[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
        ])
    ): Self = this.set("filterOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionFilterProp(value: String): Self = this.set("optionFilterProp", value.asInstanceOf[js.Any])
  }
  
}

