package typings.rcVirtualList

import typings.rcVirtualList.interfaceMod.GetKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDiffItemMod {
  
  @JSImport("rc-virtual-list/es/hooks/useDiffItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](data: js.Array[T], getKey: GetKey[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def default[T](data: js.Array[T], getKey: GetKey[T], onDiff: js.Function1[/* diffIndex */ Double, Unit]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], onDiff.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
