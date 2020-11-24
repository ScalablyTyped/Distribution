package typings.reactLifecyclesCompat

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-lifecycles-compat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def polyfill[T /* <: ComponentType[_] */](Comp: T): T with typings.reactLifecyclesCompat.reactLifecyclesCompatStrings.polyfill with TopLevel[T] = js.native
}
