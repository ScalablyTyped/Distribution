package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "AbstractRecoilValueReadonly")
@js.native
class AbstractRecoilValueReadonly[T] protected () extends js.Object {
  def this(newKey: NodeKey) = this()
  
  var __tag: js.Array[T] = js.native
  
  var key: NodeKey = js.native
}
