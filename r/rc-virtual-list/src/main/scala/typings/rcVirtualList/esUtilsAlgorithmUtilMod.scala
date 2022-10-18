package typings.rcVirtualList

import typings.rcVirtualList.anon.Index
import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsAlgorithmUtilMod {
  
  @JSImport("rc-virtual-list/es/utils/algorithmUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findListDiffIndex[T](originList: js.Array[T], targetList: js.Array[T], getKey: js.Function1[/* item */ T, Key]): Index | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findListDiffIndex")(originList.asInstanceOf[js.Any], targetList.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[Index | Null]
  
  inline def getIndexByStartLoc(min: Double, max: Double, start: Double, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndexByStartLoc")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], start.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
}
