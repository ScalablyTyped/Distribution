package typings.rcSelect

import typings.rcSelect.anon.LabelOptions
import typings.rcSelect.selectMod.FieldNames
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOptionsMod {
  
  @JSImport("rc-select/lib/hooks/useOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OptionType](
    options: js.Array[OptionType],
    children: ReactNode,
    fieldNames: FieldNames,
    optionFilterProp: String,
    optionLabelProp: String
  ): LabelOptions[OptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], children.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], optionFilterProp.asInstanceOf[js.Any], optionLabelProp.asInstanceOf[js.Any])).asInstanceOf[LabelOptions[OptionType]]
}
