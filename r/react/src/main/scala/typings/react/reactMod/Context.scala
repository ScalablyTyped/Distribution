package typings.react.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends js.Object {
  var Consumer: typings.react.reactMod.Consumer[T]
  var Provider: typings.react.reactMod.Provider[T]
  var displayName: js.UndefOr[String] = js.undefined
}

object Context {
  @scala.inline
  def apply[T](Consumer: Consumer[T], Provider: Provider[T], displayName: String = null): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer, Provider = Provider)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[Context[T]]
  }
}

