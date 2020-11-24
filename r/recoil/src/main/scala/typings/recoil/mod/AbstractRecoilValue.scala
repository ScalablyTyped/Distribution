package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "AbstractRecoilValue")
@js.native
class AbstractRecoilValue[T] protected () extends js.Object {
  def this(newKey: NodeKey) = this()
  
  def __cTag(t: T): Unit = js.native
  
  var __tag: js.Array[T] = js.native
  
   // for contravariance
  var key: NodeKey = js.native
}
