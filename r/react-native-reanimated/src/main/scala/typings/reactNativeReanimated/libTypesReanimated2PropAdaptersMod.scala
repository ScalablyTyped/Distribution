package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AdapterWorkletFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2PropAdaptersMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/PropAdapters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/PropAdapters", "SVGAdapter")
  @js.native
  val SVGAdapter: AdapterWorkletFunction = js.native
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/PropAdapters", "TextInputAdapter")
  @js.native
  val TextInputAdapter: AdapterWorkletFunction = js.native
  
  inline def createAnimatedPropAdapter(adapter: AdapterWorkletFunction): AdapterWorkletFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedPropAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[AdapterWorkletFunction]
  inline def createAnimatedPropAdapter(adapter: AdapterWorkletFunction, nativeProps: js.Array[String]): AdapterWorkletFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedPropAdapter")(adapter.asInstanceOf[js.Any], nativeProps.asInstanceOf[js.Any])).asInstanceOf[AdapterWorkletFunction]
}
