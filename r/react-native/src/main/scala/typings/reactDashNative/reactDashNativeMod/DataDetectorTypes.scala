package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.reactDashNativeStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeStrings.phoneNumber
  - typings.reactDashNative.reactDashNativeStrings.link
  - typings.reactDashNative.reactDashNativeStrings.address
  - typings.reactDashNative.reactDashNativeStrings.calendarEvent
  - typings.reactDashNative.reactDashNativeStrings.none
  - typings.reactDashNative.reactDashNativeStrings.all_
*/
trait DataDetectorTypes extends js.Object

object DataDetectorTypes {
  @scala.inline
  def address: typings.reactDashNative.reactDashNativeStrings.address = this.cast("address")
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  def calendarEvent: typings.reactDashNative.reactDashNativeStrings.calendarEvent = this.cast("calendarEvent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def link: typings.reactDashNative.reactDashNativeStrings.link = this.cast("link")
  @scala.inline
  def none: typings.reactDashNative.reactDashNativeStrings.none = this.cast("none")
  @scala.inline
  def phoneNumber: typings.reactDashNative.reactDashNativeStrings.phoneNumber = this.cast("phoneNumber")
}

