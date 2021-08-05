package typings.recompose

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#nest
object nestMod {
  
  @JSImport("recompose/nest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(Components: (String | ComponentType[js.Any])*): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Components.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
}
