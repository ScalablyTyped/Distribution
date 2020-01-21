package typings.radix64.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.radix64.radix64Strings.base64
  - typings.radix64.radix64Strings.base64URL
  - typings.radix64.radix64Strings.base64URLNaturalSort
  - typings.radix64.radix64Strings.base64URLASCIISort
*/
trait MethodsString extends js.Object

object MethodsString {
  @scala.inline
  def base64: typings.radix64.radix64Strings.base64 = this.cast("base64")
  @scala.inline
  def base64URL: typings.radix64.radix64Strings.base64URL = this.cast("base64URL")
  @scala.inline
  def base64URLASCIISort: typings.radix64.radix64Strings.base64URLASCIISort = this.cast("base64URLASCIISort")
  @scala.inline
  def base64URLNaturalSort: typings.radix64.radix64Strings.base64URLNaturalSort = this.cast("base64URLNaturalSort")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

