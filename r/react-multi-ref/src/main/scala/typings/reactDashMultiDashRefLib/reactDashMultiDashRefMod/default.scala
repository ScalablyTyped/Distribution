package typings
package reactDashMultiDashRefLib.reactDashMultiDashRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-multi-ref", JSImport.Default)
@js.native
class default[K, V] () extends MultiRef[K, V] {
  /* CompleteClass */
  override val map: stdLib.Map[K, V] = js.native
  /* CompleteClass */
  override def ref(key: K): js.Function1[/* value */ V | scala.Null, _] = js.native
}

