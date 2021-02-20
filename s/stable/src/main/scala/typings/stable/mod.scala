package typings.stable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stable", JSImport.Namespace)
  @js.native
  def apply[T](array: js.Array[T]): js.Array[T] = js.native
  @JSImport("stable", JSImport.Namespace)
  @js.native
  def apply[T](array: js.Array[T], comparator: Comparator[T]): js.Array[T] = js.native
  
  @JSImport("stable", "inplace")
  @js.native
  def inplace[T](array: js.Array[T]): js.Array[T] = js.native
  @JSImport("stable", "inplace")
  @js.native
  def inplace[T](array: js.Array[T], comparator: Comparator[T]): js.Array[T] = js.native
  
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Boolean | Double]
}
