package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeHTMLAttributes[T] extends HTMLAttributes[T] {
  var dateTime: js.UndefOr[java.lang.String] = js.undefined
}

object TimeHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, dateTime: java.lang.String = null): TimeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime)
    __obj.asInstanceOf[TimeHTMLAttributes[T]]
  }
}

