package typings.rcSelect.anon

import typings.rcSelect.generatorMod.FilterFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionFilterProp extends StObject {
  
  var filterOption: Boolean | (FilterFunc[
    /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
  ])
  
  var optionFilterProp: String
}
object OptionFilterProp {
  
  inline def apply(
    filterOption: Boolean | (FilterFunc[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
    ]),
    optionFilterProp: String
  ): OptionFilterProp = {
    val __obj = js.Dynamic.literal(filterOption = filterOption.asInstanceOf[js.Any], optionFilterProp = optionFilterProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionFilterProp]
  }
  
  extension [Self <: OptionFilterProp](x: Self) {
    
    inline def setFilterOption(
      value: Boolean | (FilterFunc[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
        ])
    ): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
    
    inline def setFilterOptionFunction2(
      value: (/* inputValue */ String, /* option */ js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: rc-select.rc-select/lib/interface.OptionsType[number] */ js.Any
        ]) => Boolean
    ): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
    
    inline def setOptionFilterProp(value: String): Self = StObject.set(x, "optionFilterProp", value.asInstanceOf[js.Any])
  }
}
