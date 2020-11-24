package typings.rcVirtualList

import typings.rcVirtualList.interfaceMod.GetKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-virtual-list/es/hooks/useDiffItem", JSImport.Namespace)
@js.native
object useDiffItemMod extends js.Object {
  
  def default[T](data: js.Array[T], getKey: GetKey[T]): js.Array[T] = js.native
  def default[T](data: js.Array[T], getKey: GetKey[T], onDiff: js.Function1[/* diffIndex */ Double, Unit]): js.Array[T] = js.native
}
