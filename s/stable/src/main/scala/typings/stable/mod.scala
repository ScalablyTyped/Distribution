package typings.stable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def apply[T](array: js.Array[T], comparator: Comparator[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("stable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def inplace[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inplace")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def inplace[T](array: js.Array[T], comparator: Comparator[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("inplace")(array.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Boolean | Double]
}
