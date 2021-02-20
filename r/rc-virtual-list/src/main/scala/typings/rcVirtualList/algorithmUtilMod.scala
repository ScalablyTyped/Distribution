package typings.rcVirtualList

import typings.rcVirtualList.anon.Index
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithmUtilMod {
  
  @JSImport("rc-virtual-list/es/utils/algorithmUtil", "findListDiffIndex")
  @js.native
  def findListDiffIndex[T](originList: js.Array[T], targetList: js.Array[T], getKey: js.Function1[/* item */ T, Key]): Index | Null = js.native
  
  @JSImport("rc-virtual-list/es/utils/algorithmUtil", "getIndexByStartLoc")
  @js.native
  def getIndexByStartLoc(min: Double, max: Double, start: Double, index: Double): Double = js.native
}
