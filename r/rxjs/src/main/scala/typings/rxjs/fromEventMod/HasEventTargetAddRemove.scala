package typings.rxjs.fromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasEventTargetAddRemove[E] extends EventTargetLike[E] {
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit]): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, listener: js.UndefOr[scala.Nothing], options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: js.UndefOr[scala.Nothing], options: EventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit]): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: EventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: Null, options: EventListenerOptions): Unit = js.native
}

