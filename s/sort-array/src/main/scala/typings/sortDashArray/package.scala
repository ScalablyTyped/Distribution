package typings

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sortDashArray {
  type CustomOrder[T] = Record[String, CustomOrderTypes[T]]
  type CustomOrderTypes[T] = js.Array[/* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any]
}
