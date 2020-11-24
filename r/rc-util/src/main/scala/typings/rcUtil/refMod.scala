package typings.rcUtil

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-util/lib/ref", JSImport.Namespace)
@js.native
object refMod extends js.Object {
  
  def composeRef[T](refs: Ref[T]*): Ref[T] = js.native
  
  def fillRef[T](ref: Ref[T], node: T): Unit = js.native
  
  def supportRef(nodeOrComponent: js.Any): Boolean = js.native
}
