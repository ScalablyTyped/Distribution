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

