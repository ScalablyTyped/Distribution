package typings.primereact

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsUtilMod {
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
