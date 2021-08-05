package typings.rcSelect

import typings.rcSelect.anon.Disabled
import typings.rcSelect.generatorMod.FlattenOptionsType
import typings.rcSelect.generatorMod.RawValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCacheOptionsMod {
  
  @JSImport("rc-select/lib/hooks/useCacheOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OptionsType /* <: js.Array[Disabled] */](values: js.Array[RawValueType], options: FlattenOptionsType[OptionsType]): js.Function1[/* vals */ js.Array[RawValueType], FlattenOptionsType[OptionsType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* vals */ js.Array[RawValueType], FlattenOptionsType[OptionsType]]]
}
