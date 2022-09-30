package typings.storybookPreviewWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowError extends StObject {
  
  def showError(err: Description): Unit
  
  def showException(err: js.Error): Unit
  
  def showMain(): Unit
}
object ShowError {
  
  inline def apply(showError: Description => Unit, showException: js.Error => Unit, showMain: () => Unit): ShowError = {
    val __obj = js.Dynamic.literal(showError = js.Any.fromFunction1(showError), showException = js.Any.fromFunction1(showException), showMain = js.Any.fromFunction0(showMain))
    __obj.asInstanceOf[ShowError]
  }
  
  extension [Self <: ShowError](x: Self) {
    
    inline def setShowError(value: Description => Unit): Self = StObject.set(x, "showError", js.Any.fromFunction1(value))
    
    inline def setShowException(value: js.Error => Unit): Self = StObject.set(x, "showException", js.Any.fromFunction1(value))
    
    inline def setShowMain(value: () => Unit): Self = StObject.set(x, "showMain", js.Any.fromFunction0(value))
  }
}
