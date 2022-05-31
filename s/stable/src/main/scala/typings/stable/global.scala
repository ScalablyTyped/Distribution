package typings.stable

import typings.stable.mod.Comparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object stable {
    
    inline def apply[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    inline def apply[T](array: js.Array[T], comparator: Comparator[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    @JSGlobal("stable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def inplace[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("inplace")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    inline def inplace[T](array: js.Array[T], comparator: Comparator[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("inplace")(array.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  }
}
