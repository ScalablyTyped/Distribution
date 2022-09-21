package typings.slateReact.anon

import typings.slateReact.useSlateSelectorMod.EditorChangeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEventListener extends StObject {
  
  def addEventListener(callback: EditorChangeHandler): js.Function0[Unit]
  
  def getSlate(): typings.slate.editorMod.Editor
}
object AddEventListener {
  
  inline def apply(
    addEventListener: EditorChangeHandler => js.Function0[Unit],
    getSlate: () => typings.slate.editorMod.Editor
  ): AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction1(addEventListener), getSlate = js.Any.fromFunction0(getSlate))
    __obj.asInstanceOf[AddEventListener]
  }
  
  extension [Self <: AddEventListener](x: Self) {
    
    inline def setAddEventListener(value: EditorChangeHandler => js.Function0[Unit]): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1(value))
    
    inline def setGetSlate(value: () => typings.slate.editorMod.Editor): Self = StObject.set(x, "getSlate", js.Any.fromFunction0(value))
  }
}
