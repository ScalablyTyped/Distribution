package typings.rcFieldForm.nameMapMod

import typings.rcFieldForm.interfaceMod.InternalNamePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KV[T] extends js.Object {
  var key: InternalNamePath
  var value: T
}

object KV {
  @scala.inline
  def apply[T](key: InternalNamePath, value: T): KV[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[KV[T]]
  }
}

