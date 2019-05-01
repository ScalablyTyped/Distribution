package typings
package reactLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends js.Object {
  var Consumer: reactLib.reactMod.Consumer[T]
  var Provider: reactLib.reactMod.Provider[T]
  var displayName: js.UndefOr[java.lang.String] = js.undefined
}

object Context {
  @scala.inline
  def apply[T](Consumer: Consumer[T], Provider: Provider[T], displayName: java.lang.String = null): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer, Provider = Provider)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[Context[T]]
  }
}

