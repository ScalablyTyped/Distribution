package typings.storageHelper

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T /* <: js.UndefOr[Boolean] */, U](key: String): String | NonNullable[U] | Null = js.native
  def apply[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T): String | NonNullable[U] | Null = js.native
  def apply[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T, fallback: U): String | NonNullable[U] | Null = js.native
}

