package typings.shakacodeRecompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#setstatic
object setStaticMod {
  
  @JSImport("@shakacode/recompose/setStatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(key: String, value: Any): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
}
