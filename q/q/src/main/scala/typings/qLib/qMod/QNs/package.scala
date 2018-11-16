package typings
package qLib.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QNs {
  type IPromise[T] = stdLib.PromiseLike[T]
  type IWhenable[T] = stdLib.PromiseLike[T] | T
}
