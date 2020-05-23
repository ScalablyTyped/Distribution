package typings.slickgrid.global.Slick

import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.SelectionModel")
@js.native
class SelectionModel[T /* <: SlickData */, E] ()
  extends typings.slickgrid.Slick.SelectionModel[T, E] {
  /* CompleteClass */
  override var onSelectedRangesChanged: typings.slickgrid.Slick.Event[E] = js.native
  /**
    * A destructor function that will be called whenever a selection model is unregistered from the grid by a call to setSelectionModel with another selection model or whenever a grid with this selection model is destroyed. The selection model can use this destructor to unsubscribe from grid events and release all resources (remove DOM nodes, event listeners, etc.).
    **/
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * An initializer function that will be called with an instance of the grid whenever a selection model is registered with setSelectionModel. The selection model can use this to initialize its state and subscribe to grid events.
    **/
  /* CompleteClass */
  override def init(grid: typings.slickgrid.Slick.Grid[T]): Unit = js.native
}

