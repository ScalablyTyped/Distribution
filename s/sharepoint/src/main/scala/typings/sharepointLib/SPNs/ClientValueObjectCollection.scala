package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientValueObjectCollection")
@js.native
class ClientValueObjectCollection[T] ()
  extends ClientValueObject
     with sharepointLib.IEnumerable[T] {
  /* CompleteClass */
  override def getEnumerator(): sharepointLib.IEnumerator[T] = js.native
  def get_count(): scala.Double = js.native
}

