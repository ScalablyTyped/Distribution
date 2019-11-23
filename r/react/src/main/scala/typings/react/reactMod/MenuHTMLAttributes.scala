package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuHTMLAttributes[T] extends HTMLAttributes[T] {
  var `type`: js.UndefOr[String] = js.undefined
}

object MenuHTMLAttributes {
  @scala.inline
  def apply[T](HTMLAttributes: HTMLAttributes[T] = null, `type`: String = null): MenuHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MenuHTMLAttributes[T]]
  }
}

