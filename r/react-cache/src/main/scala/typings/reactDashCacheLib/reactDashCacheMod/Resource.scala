package typings
package reactDashCacheLib.reactDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Resource[Input, Value] extends js.Object {
  def preload(key: Input): scala.Unit
  def read(key: Input): Value
}

