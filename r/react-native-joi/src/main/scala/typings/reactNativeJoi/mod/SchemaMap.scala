package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type SchemaMap = {[key: string] : react-native-joi.react-native-joi.SchemaLike | std.Array<react-native-joi.react-native-joi.SchemaLike>}
}}}
to avoid circular code involving: 
- react-native-joi.react-native-joi.SchemaLike
- react-native-joi.react-native-joi.SchemaMap
*/
trait SchemaMap
  extends StObject
     with /* key */ StringDictionary[SchemaLike | js.Array[SchemaLike]]
     with _SchemaLike
object SchemaMap {
  
  inline def apply(): SchemaMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMap]
  }
}
