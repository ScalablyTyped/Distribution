package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type NestedObject = {[key: string] : react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NestedObjectValues<T>}
}}}
to avoid circular code involving: 
- react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NestedObject
- react-native-reanimated.react-native-reanimated/lib/types/reanimated2/commonTypes.NestedObjectValues
*/
trait NestedObject[T]
  extends StObject
     with /* key */ StringDictionary[NestedObjectValues[T]]
object NestedObject {
  
  inline def apply[T](): NestedObject[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedObject[T]]
  }
}
