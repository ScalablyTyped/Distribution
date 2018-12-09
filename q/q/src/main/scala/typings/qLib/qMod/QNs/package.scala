package typings
package qLib.qMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QNs {
  type IPromise[T] = js.Thenable[T]
  type IWhenable[T] = js.Thenable[T] | T
}
