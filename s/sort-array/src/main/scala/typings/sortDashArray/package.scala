package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sortDashArray {
  import typings.std.Record

  type CustomOrder[T] = Record[String, CustomOrderTypes[T]]
  type CustomOrderTypes[T] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ]
}
