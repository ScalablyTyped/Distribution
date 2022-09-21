package typings.rcSelect

import typings.rcSelect.baseSelectMod.RawValueType
import typings.rcSelect.selectMod.DefaultOptionType
import typings.rcSelect.selectMod.LabelInValueType
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCacheMod {
  
  @JSImport("rc-select/lib/hooks/useCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Cache `value` related LabeledValue & options.
    */
  inline def default(labeledValues: js.Array[LabelInValueType], valueOptions: Map[RawValueType, DefaultOptionType]): js.Tuple2[
    js.Array[LabelInValueType], 
    js.Function1[/* val */ RawValueType, DefaultOptionType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(labeledValues.asInstanceOf[js.Any], valueOptions.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[LabelInValueType], 
    js.Function1[/* val */ RawValueType, DefaultOptionType]
  ]]
}
