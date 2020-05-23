package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.SecurityPolicyViolationEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SecurityPolicyViolationEvent")
@js.native
class SecurityPolicyViolationEvent protected ()
  extends typings.std.SecurityPolicyViolationEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: SecurityPolicyViolationEventInit) = this()
}

@JSGlobal("SecurityPolicyViolationEvent")
@js.native
object SecurityPolicyViolationEvent
  extends Instantiable1[/* type */ java.lang.String, typings.std.SecurityPolicyViolationEvent]
     with Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ SecurityPolicyViolationEventInit, 
      typings.std.SecurityPolicyViolationEvent
    ]

