package typings.reactClickOutside

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[C /* <: ComponentClass[Any, ComponentState] */](wrappedComponent: C): C = ^.asInstanceOf[js.Dynamic].apply(wrappedComponent.asInstanceOf[js.Any]).asInstanceOf[C]
  
  @JSImport("react-click-outside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
