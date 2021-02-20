package typings.reactTestRenderer

import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shallowMod {
  
  @JSImport("react-test-renderer/shallow", "createRenderer")
  @js.native
  def createRenderer(): ShallowRenderer = js.native
  
  @js.native
  trait ShallowRenderer extends StObject {
    
    /**
      * After `shallowRenderer.render()` has been called, returns mounted instance.
      */
    def getMountedInstance(): ReactInstance = js.native
    
    /**
      * After `shallowRenderer.render()` has been called, returns shallowly rendered output.
      */
    def getRenderOutput[E /* <: ReactElement */](): E = js.native
    
    /**
      * Similar to `ReactDOM.render` but it doesn't require DOM and only renders a single level deep.
      */
    def render(element: ReactElement): Unit = js.native
    def render(element: ReactElement, context: js.Any): Unit = js.native
    
    def unmount(): Unit = js.native
  }
}
