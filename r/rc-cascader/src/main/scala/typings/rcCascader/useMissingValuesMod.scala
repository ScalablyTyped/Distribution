package typings.rcCascader

import typings.rcCascader.cascaderMod.DefaultOptionType
import typings.rcCascader.cascaderMod.InternalFieldNames
import typings.rcCascader.cascaderMod.SingleValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMissingValuesMod {
  
  @JSImport("rc-cascader/es/hooks/useMissingValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: js.Array[DefaultOptionType], fieldNames: InternalFieldNames): js.Function1[
    /* rawValues */ js.Array[SingleValueType], 
    js.Tuple2[js.Array[SingleValueType], js.Array[SingleValueType]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* rawValues */ js.Array[SingleValueType], 
    js.Tuple2[js.Array[SingleValueType], js.Array[SingleValueType]]
  ]]
}
