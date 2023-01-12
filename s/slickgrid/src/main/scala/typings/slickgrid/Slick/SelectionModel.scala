package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionModel[T /* <: SlickData */, E] extends StObject {
  
  /**
    * A destructor function that will be called whenever a selection model is unregistered from the grid by a call to setSelectionModel with another selection model or whenever a grid with this selection model is destroyed. The selection model can use this destructor to unsubscribe from grid events and release all resources (remove DOM nodes, event listeners, etc.).
    **/
  def destroy(): Unit
  
  /**
    * An initializer function that will be called with an instance of the grid whenever a selection model is registered with setSelectionModel. The selection model can use this to initialize its state and subscribe to grid events.
    **/
  def init(grid: Grid[T]): Unit
  
  var onSelectedRangesChanged: Event[E]
}
object SelectionModel {
  
  inline def apply[T /* <: SlickData */, E](destroy: () => Unit, init: Grid[T] => Unit, onSelectedRangesChanged: Event[E]): SelectionModel[T, E] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init), onSelectedRangesChanged = onSelectedRangesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionModel[T, E]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionModel[?, ?], T /* <: SlickData */, E] (val x: Self & (SelectionModel[T, E])) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setInit(value: Grid[T] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setOnSelectedRangesChanged(value: Event[E]): Self = StObject.set(x, "onSelectedRangesChanged", value.asInstanceOf[js.Any])
  }
}
