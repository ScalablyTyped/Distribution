package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionModel[T /* <: SlickData */, E] extends js.Object {
  
  /**
    * A destructor function that will be called whenever a selection model is unregistered from the grid by a call to setSelectionModel with another selection model or whenever a grid with this selection model is destroyed. The selection model can use this destructor to unsubscribe from grid events and release all resources (remove DOM nodes, event listeners, etc.).
    **/
  def destroy(): Unit = js.native
  
  /**
    * An initializer function that will be called with an instance of the grid whenever a selection model is registered with setSelectionModel. The selection model can use this to initialize its state and subscribe to grid events.
    **/
  def init(grid: Grid[T]): Unit = js.native
  
  var onSelectedRangesChanged: Event[E] = js.native
}
object SelectionModel {
  
  @scala.inline
  def apply[T /* <: SlickData */, E](destroy: () => Unit, init: Grid[T] => Unit, onSelectedRangesChanged: Event[E]): SelectionModel[T, E] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init), onSelectedRangesChanged = onSelectedRangesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionModel[T, E]]
  }
  
  @scala.inline
  implicit class SelectionModelOps[Self <: SelectionModel[_, _], T /* <: SlickData */, E] (val x: Self with (SelectionModel[T, E])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: Grid[T] => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectedRangesChanged(value: Event[E]): Self = this.set("onSelectedRangesChanged", value.asInstanceOf[js.Any])
  }
}
