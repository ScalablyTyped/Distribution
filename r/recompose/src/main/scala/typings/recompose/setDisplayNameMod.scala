package typings.recompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#setdisplayname
object setDisplayNameMod {
  
  @JSImport("recompose/setDisplayName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(displayName: String): js.Function1[/* component */ ComponentType[Any], ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(displayName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentType[Any], ComponentType[Any]]]
}
