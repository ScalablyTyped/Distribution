package typings.reactNativeReanimated.reanimated2CommonTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.Animation<react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.AnimationObject>} */ trait AnimatedStyle
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var transform: js.UndefOr[js.Array[Record[String, Animation[AnimationObject]]]] = js.undefined
}
object AnimatedStyle {
  
  inline def apply(): AnimatedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedStyle]
  }
  
  extension [Self <: AnimatedStyle](x: Self) {
    
    inline def setTransform(value: js.Array[Record[String, Animation[AnimationObject]]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setTransformVarargs(value: (Record[String, Animation[AnimationObject]])*): Self = StObject.set(x, "transform", js.Array(value*))
  }
}
