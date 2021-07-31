package typings.puppeteerCore

import org.scalablytyped.runtime.StringDictionary
import typings.puppeteerCore.jshandleMod.ElementHandle
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evalTypesMod {
  
  type EvaluateFn[T] = String | (js.Function2[/* arg1 */ T, /* repeated */ js.Any, js.Any])
  
  type EvaluateFnReturnType[T /* <: EvaluateFn[js.Any] */] = js.Any
  
  type EvaluateHandleFn = String | (js.Function1[/* repeated */ js.Any, js.Any])
  
  @js.native
  trait JSONArray
    extends StObject
       with Array[Serializable]
       with _Serializable
  
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[Serializable]
       with _Serializable
  object JSONObject {
    
    @scala.inline
    def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - js.BigInt
    - typings.puppeteerCore.evalTypesMod.JSONArray
    - typings.puppeteerCore.evalTypesMod.JSONObject
  */
  type Serializable = _Serializable | Double | String | Boolean | Null | js.BigInt
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.evalTypesMod.Serializable
    - typings.puppeteerCore.jshandleMod.JSHandle
  */
  type SerializableOrJSHandle = _SerializableOrJSHandle | Double | String | Boolean | Null | js.BigInt
  
  type UnwrapElementHandle[X] = X
  
  type UnwrapPromiseLike[T] = T
  
  type WrapElementHandle[X] = X | ElementHandle[X]
  
  trait _Serializable
    extends StObject
       with _SerializableOrJSHandle
  
  trait _SerializableOrJSHandle extends StObject
}
