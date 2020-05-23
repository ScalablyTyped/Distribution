package typings.slickgrid.global.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.EventHandler")
@js.native
class EventHandler[T] ()
  extends typings.slickgrid.Slick.EventHandler[T] {
  /* CompleteClass */
  override def subscribe(
    event: typings.slickgrid.Slick.Event[T],
    handler: js.Function2[/* e */ typings.slickgrid.Slick.EventData, T, Unit]
  ): typings.slickgrid.Slick.EventHandler[_] = js.native
  /* CompleteClass */
  override def unsubscribe(
    event: typings.slickgrid.Slick.Event[T],
    handler: js.Function2[/* e */ typings.slickgrid.Slick.EventData, T, Unit]
  ): typings.slickgrid.Slick.EventHandler[_] = js.native
  /* CompleteClass */
  override def unsubscribeAll(): typings.slickgrid.Slick.EventHandler[_] = js.native
}

