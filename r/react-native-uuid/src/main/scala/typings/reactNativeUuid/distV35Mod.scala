package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distV35Mod {
  
  @JSImport("react-native-uuid/dist/v35", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def v35(name: String, version: Double, hashfunc: js.Function1[/* s */ String, String]): GenerateUUID = (^.asInstanceOf[js.Dynamic].applyDynamic("v35")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], hashfunc.asInstanceOf[js.Any])).asInstanceOf[GenerateUUID]
  
  type GenerateUUID = js.Function4[
    /* value */ String | js.typedarray.Uint8Array, 
    /* namespace */ String | js.Array[Double], 
    /* buf */ js.UndefOr[js.Array[Double]], 
    /* offset */ js.UndefOr[Double], 
    String | js.Array[Double]
  ]
}
