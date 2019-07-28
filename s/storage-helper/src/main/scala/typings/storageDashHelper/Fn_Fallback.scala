package typings.storageDashHelper

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Fallback extends js.Object {
  def apply[U](key: String): String | NonNullable[U] | Null = js.native
  def apply[U](key: String, parse: js.UndefOr[scala.Nothing], fallback: U): String | NonNullable[U] | Null = js.native
  def apply[U](key: String, parse: Boolean): String | NonNullable[U] | Null = js.native
  def apply[U](key: String, parse: Boolean, fallback: U): String | NonNullable[U] | Null = js.native
}

