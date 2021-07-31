package typings.recompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#setstatic
object setStaticMod {
  
  @JSImport("recompose/setStatic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(key: String, value: js.Any): js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* component */ ComponentType[js.Any], ComponentType[js.Any]]]
}
