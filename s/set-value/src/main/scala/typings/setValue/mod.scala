package typings.setValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("set-value", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * @param object The object to set `value` on
    * @param prop The property to set. Dot-notation may be used.
    * @param value The value to set on `object[prop]`
    */
  def apply(`object`: js.Object, prop: String, value: js.Any): Unit = js.native
  // Technically, everything will fall to the last overload,
  // but the first one can be useful for signature help.
  /**
    * @param object The object to set `value` on
    * @param prop The property to set.
    * @param value The value to set on `object[prop]`
    */
  def apply[T, K /* <: /* keyof T */ String */](
    `object`: T,
    prop: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): Unit = js.native
}

