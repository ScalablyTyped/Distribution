package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.phoneNumber
  - typings.reactNative.reactNativeStrings.link
  - typings.reactNative.reactNativeStrings.address
  - typings.reactNative.reactNativeStrings.calendarEvent
  - typings.reactNative.reactNativeStrings.none
  - typings.reactNative.reactNativeStrings.all_
*/
trait DataDetectorTypes extends js.Object

object DataDetectorTypes {
  @scala.inline
  def address: typings.reactNative.reactNativeStrings.address = this.cast("address")
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  def calendarEvent: typings.reactNative.reactNativeStrings.calendarEvent = this.cast("calendarEvent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def link: typings.reactNative.reactNativeStrings.link = this.cast("link")
  @scala.inline
  def none: typings.reactNative.reactNativeStrings.none = this.cast("none")
  @scala.inline
  def phoneNumber: typings.reactNative.reactNativeStrings.phoneNumber = this.cast("phoneNumber")
}

