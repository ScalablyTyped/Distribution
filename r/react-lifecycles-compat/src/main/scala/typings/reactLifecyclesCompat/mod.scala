package typings.reactLifecyclesCompat

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-lifecycles-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def polyfill[T /* <: ComponentType[js.Any] */](Comp: T): T & typings.reactLifecyclesCompat.reactLifecyclesCompatStrings.polyfill & TopLevel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")(Comp.asInstanceOf[js.Any]).asInstanceOf[T & typings.reactLifecyclesCompat.reactLifecyclesCompatStrings.polyfill & TopLevel[T]]
}
