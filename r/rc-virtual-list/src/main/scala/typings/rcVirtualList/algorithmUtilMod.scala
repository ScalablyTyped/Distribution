package typings.rcVirtualList

import typings.rcVirtualList.anon.Index
import typings.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-virtual-list/es/utils/algorithmUtil", JSImport.Namespace)
@js.native
object algorithmUtilMod extends js.Object {
  
  def findListDiffIndex[T](originList: js.Array[T], targetList: js.Array[T], getKey: js.Function1[/* item */ T, Key]): Index | Null = js.native
  
  def getIndexByStartLoc(min: Double, max: Double, start: Double, index: Double): Double = js.native
}
