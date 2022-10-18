package typings.rcSelect

import typings.rcSelect.libBaseSelectMod.RawValueType
import typings.rcSelect.libSelectMod.DefaultOptionType
import typings.rcSelect.libSelectMod.LabelInValueType
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseCacheMod {
  
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
