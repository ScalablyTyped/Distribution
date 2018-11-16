package typings
package rxjsLib.internalObservableFromEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HasEventTargetAddRemove[E] extends js.Object {
  def addEventListener(`type`: java.lang.String): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* evt */ E, scala.Unit]): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* evt */ E, scala.Unit],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* evt */ E, scala.Unit], options: scala.Boolean): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: scala.Null, options: AddEventListenerOptions): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: scala.Null, options: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* evt */ E, scala.Unit]): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* evt */ E, scala.Unit],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* evt */ E, scala.Unit], options: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: scala.Null, options: EventListenerOptions): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: scala.Null, options: scala.Boolean): scala.Unit = js.native
}

