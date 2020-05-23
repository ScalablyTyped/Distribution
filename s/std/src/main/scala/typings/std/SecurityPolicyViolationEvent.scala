package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Inherits from Event, and represents the event object of an event sent on a document or worker when its content security policy is violated. */
@js.native
trait SecurityPolicyViolationEvent extends Event {
  val blockedURI: java.lang.String = js.native
  val columnNumber: Double = js.native
  val documentURI: java.lang.String = js.native
  val effectiveDirective: java.lang.String = js.native
  val lineNumber: Double = js.native
  val originalPolicy: java.lang.String = js.native
  val referrer: java.lang.String = js.native
  val sourceFile: java.lang.String = js.native
  val statusCode: Double = js.native
  val violatedDirective: java.lang.String = js.native
}

