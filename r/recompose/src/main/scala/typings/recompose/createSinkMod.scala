package typings.recompose

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#createsink
object createSinkMod {
  
  @JSImport("recompose/createSink", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: js.Function1[/* props */ js.Object, Unit]): ComponentClass[js.Any, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[js.Any, ComponentState]]
}
