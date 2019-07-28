package typings.q

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qMod {
  type IPromise[T] = js.Thenable[T]
  type IWhenable[T] = js.Thenable[T] | T
}
