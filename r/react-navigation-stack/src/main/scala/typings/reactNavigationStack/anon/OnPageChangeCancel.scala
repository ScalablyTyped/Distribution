package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPageChangeCancel extends StObject {
  
  def onPageChangeCancel(): Unit
  
  def onPageChangeConfirm(force: Boolean): Unit
  
  def onPageChangeStart(): Unit
}
object OnPageChangeCancel {
  
  inline def apply(
    onPageChangeCancel: () => Unit,
    onPageChangeConfirm: Boolean => Unit,
    onPageChangeStart: () => Unit
  ): OnPageChangeCancel = {
    val __obj = js.Dynamic.literal(onPageChangeCancel = js.Any.fromFunction0(onPageChangeCancel), onPageChangeConfirm = js.Any.fromFunction1(onPageChangeConfirm), onPageChangeStart = js.Any.fromFunction0(onPageChangeStart))
    __obj.asInstanceOf[OnPageChangeCancel]
  }
  
  extension [Self <: OnPageChangeCancel](x: Self) {
    
    inline def setOnPageChangeCancel(value: () => Unit): Self = StObject.set(x, "onPageChangeCancel", js.Any.fromFunction0(value))
    
    inline def setOnPageChangeConfirm(value: Boolean => Unit): Self = StObject.set(x, "onPageChangeConfirm", js.Any.fromFunction1(value))
    
    inline def setOnPageChangeStart(value: () => Unit): Self = StObject.set(x, "onPageChangeStart", js.Any.fromFunction0(value))
  }
}
