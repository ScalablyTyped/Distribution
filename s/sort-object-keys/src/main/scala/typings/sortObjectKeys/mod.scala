package typings.sortObjectKeys

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](`object`: T): T = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def apply[T](`object`: T, sortWith: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], sortWith.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def apply[T](
    `object`: T,
    sortWith: js.Function2[/* keyof T */ /* a */ String, /* keyof T */ /* b */ String, Double]
  ): T = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], sortWith.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("sort-object-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
