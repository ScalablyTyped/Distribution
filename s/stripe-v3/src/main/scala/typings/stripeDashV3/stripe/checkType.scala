package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeDashV3.stripeDashV3Strings.pass
  - typings.stripeDashV3.stripeDashV3Strings.fail
  - typings.stripeDashV3.stripeDashV3Strings.unavailable
  - typings.stripeDashV3.stripeDashV3Strings.unchecked
*/
trait checkType extends js.Object

object checkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typings.stripeDashV3.stripeDashV3Strings.fail = this.cast("fail")
  @scala.inline
  def pass: typings.stripeDashV3.stripeDashV3Strings.pass = this.cast("pass")
  @scala.inline
  def unavailable: typings.stripeDashV3.stripeDashV3Strings.unavailable = this.cast("unavailable")
  @scala.inline
  def unchecked: typings.stripeDashV3.stripeDashV3Strings.unchecked = this.cast("unchecked")
}

