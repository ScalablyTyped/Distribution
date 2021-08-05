package typings.setValue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param object The object to set `value` on
    * @param prop The property to set. Dot-notation may be used.
    * @param value The value to set on `object[prop]`
    */
  inline def apply(`object`: js.Object, prop: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // Technically, everything will fall to the last overload,
  // but the first one can be useful for signature help.
  /**
    * @param object The object to set `value` on
    * @param prop The property to set.
    * @param value The value to set on `object[prop]`
    */
  inline def apply[T, K /* <: /* keyof T */ String */](
    `object`: T,
    prop: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("set-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
