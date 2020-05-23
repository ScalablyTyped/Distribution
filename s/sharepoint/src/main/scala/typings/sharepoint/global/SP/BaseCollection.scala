package typings.sharepoint.global.SP

import typings.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BaseCollection")
@js.native
class BaseCollection[T] ()
  extends typings.sharepoint.SP.BaseCollection[T] {
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
  /* CompleteClass */
  override def get_count(): Double = js.native
  /* CompleteClass */
  override def itemAtIndex(index: Double): T = js.native
}

