package typings.reactFps

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpsViewStoriesMod {
  
  @JSImport("react-fps/build/FpsView.stories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("react-fps/build/FpsView.stories", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-fps/build/FpsView.stories", "default.decorators")
    @js.native
    def decorators: js.Array[js.Function1[/* args */ Any, Any]] = js.native
    inline def decorators_=(x: js.Array[js.Function1[/* args */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
    
    @JSImport("react-fps/build/FpsView.stories", "default.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  inline def asDynamicVariables(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("asDynamicVariables")().asInstanceOf[Element]
}
