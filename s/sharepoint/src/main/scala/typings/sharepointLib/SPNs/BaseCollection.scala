package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BaseCollection")
@js.native
class BaseCollection[T] ()
  extends sharepointLib.IEnumerable[T] {
  /* CompleteClass */
  override def getEnumerator(): sharepointLib.IEnumerator[T] = js.native
  def get_count(): scala.Double = js.native
  def itemAtIndex(index: scala.Double): T = js.native
}

