package typings.slateReact.anon

import typings.slateReact.distHooksUseSlateSelectorMod.EditorChangeHandler
import typings.slateReact.distPluginReactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSlate extends StObject {
  
  def addEventListener(callback: EditorChangeHandler): js.Function0[Unit]
  
  def getSlate(): ReactEditor
}
object GetSlate {
  
  inline def apply(addEventListener: EditorChangeHandler => js.Function0[Unit], getSlate: () => ReactEditor): GetSlate = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction1(addEventListener), getSlate = js.Any.fromFunction0(getSlate))
    __obj.asInstanceOf[GetSlate]
  }
  
  extension [Self <: GetSlate](x: Self) {
    
    inline def setAddEventListener(value: EditorChangeHandler => js.Function0[Unit]): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1(value))
    
    inline def setGetSlate(value: () => ReactEditor): Self = StObject.set(x, "getSlate", js.Any.fromFunction0(value))
  }
}
