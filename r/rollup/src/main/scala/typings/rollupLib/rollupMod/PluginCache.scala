package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCache extends js.Object {
  def delete(id: java.lang.String): scala.Boolean
  def get[T](id: java.lang.String): T
  def has(id: java.lang.String): scala.Boolean
  def set[T](id: java.lang.String, value: T): scala.Unit
}

object PluginCache {
  @scala.inline
  def apply(
    delete: js.Function1[java.lang.String, scala.Boolean],
    get: js.Function1[java.lang.String, js.Any],
    has: js.Function1[java.lang.String, scala.Boolean],
    set: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): PluginCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[PluginCache]
  }
}

