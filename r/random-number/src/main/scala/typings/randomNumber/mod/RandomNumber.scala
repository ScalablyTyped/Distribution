package typings.randomNumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomNumber extends js.Object {
  def apply(): Double = js.native
  def apply(options: UnparsedOptions): Double = js.native
  def defaults(): Options = js.native
  def defaults(options: UnparsedOptions): Options = js.native
  def generator(): Generator = js.native
  def generator(options: UnparsedOptions): Generator = js.native
}

