package typings.rcTable.anon

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnScroll extends StObject {
  
  def onScroll(info: CurrentTargetScrollLeft): Unit
  
  var ref: Ref[ScrollLeft]
  
  var scrollbarSize: Double
}
object OnScroll {
  
  @scala.inline
  def apply(onScroll: CurrentTargetScrollLeft => Unit, scrollbarSize: Double): OnScroll = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll), scrollbarSize = scrollbarSize.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[OnScroll]
  }
  
  @scala.inline
  implicit class OnScrollMutableBuilder[Self <: OnScroll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnScroll(value: CurrentTargetScrollLeft => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[ScrollLeft]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ ScrollLeft | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setScrollbarSize(value: Double): Self = StObject.set(x, "scrollbarSize", value.asInstanceOf[js.Any])
  }
}
