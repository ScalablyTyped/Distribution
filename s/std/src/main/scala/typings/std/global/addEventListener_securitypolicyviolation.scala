package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.securitypolicyviolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_securitypolicyviolation extends js.Object {
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.SecurityPolicyViolationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

