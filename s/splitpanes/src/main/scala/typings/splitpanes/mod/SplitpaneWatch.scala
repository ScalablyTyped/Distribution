package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitpaneWatch extends StObject {
  
  def dblClickSplitter(enable: Boolean): Unit
  
  def firstSplitter(): Unit
  
  def horizontal(): Unit
  
  var panes: SplitpaneWatchPaneType
}
object SplitpaneWatch {
  
  inline def apply(
    dblClickSplitter: Boolean => Unit,
    firstSplitter: () => Unit,
    horizontal: () => Unit,
    panes: SplitpaneWatchPaneType
  ): SplitpaneWatch = {
    val __obj = js.Dynamic.literal(dblClickSplitter = js.Any.fromFunction1(dblClickSplitter), firstSplitter = js.Any.fromFunction0(firstSplitter), horizontal = js.Any.fromFunction0(horizontal), panes = panes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneWatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplitpaneWatch] (val x: Self) extends AnyVal {
    
    inline def setDblClickSplitter(value: Boolean => Unit): Self = StObject.set(x, "dblClickSplitter", js.Any.fromFunction1(value))
    
    inline def setFirstSplitter(value: () => Unit): Self = StObject.set(x, "firstSplitter", js.Any.fromFunction0(value))
    
    inline def setHorizontal(value: () => Unit): Self = StObject.set(x, "horizontal", js.Any.fromFunction0(value))
    
    inline def setPanes(value: SplitpaneWatchPaneType): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
  }
}
