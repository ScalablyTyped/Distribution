package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sortDashArrayLib {
  type CustomOrder[T] = stdLib.Record[java.lang.String, CustomOrderTypes[T]]
  type CustomOrderTypes[T] = js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
}
