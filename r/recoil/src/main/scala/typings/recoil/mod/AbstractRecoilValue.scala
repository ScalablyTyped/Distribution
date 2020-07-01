package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "AbstractRecoilValue")
@js.native
class AbstractRecoilValue[T] protected () extends js.Object {
  def this(newKey: NodeKey) = this()
  var __tag: js.Array[T] = js.native
   // for contravariance
  var key: NodeKey = js.native
  def __cTag(t: T): Unit = js.native
}

