package typings.sortObjectKeys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sort-object-keys", JSImport.Namespace)
  @js.native
  def apply[T](`object`: T): T = js.native
  @JSImport("sort-object-keys", JSImport.Namespace)
  @js.native
  def apply[T](`object`: T, sortWith: js.Array[/* keyof T */ String]): T = js.native
  @JSImport("sort-object-keys", JSImport.Namespace)
  @js.native
  def apply[T](
    `object`: T,
    sortWith: js.Function2[/* keyof T */ /* a */ String, /* keyof T */ /* b */ String, Double]
  ): T = js.native
}
