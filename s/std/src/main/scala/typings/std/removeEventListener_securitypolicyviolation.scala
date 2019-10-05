package typings.std

import typings.std.stdStrings.securitypolicyviolation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_securitypolicyviolation extends js.Object {
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: securitypolicyviolation,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ SecurityPolicyViolationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

