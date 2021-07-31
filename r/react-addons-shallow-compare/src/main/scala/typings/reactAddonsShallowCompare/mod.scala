package typings.reactAddonsShallowCompare

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[P, S](component: Component[P, S, js.Any], nextProps: P, nextState: S): Boolean = (^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("react-addons-shallow-compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
