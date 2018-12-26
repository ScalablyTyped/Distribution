package typings
package reactDashMultiDashRefLib.reactDashMultiDashRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MultiRef[K, V] extends js.Object {
  val map: stdLib.Map[K, V]
  def ref(key: K): js.Function1[/* value */ V | scala.Null, _]
}

