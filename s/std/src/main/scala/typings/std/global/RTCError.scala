package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.RTCErrorInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("RTCError")
@js.native
class RTCError protected ()
  extends typings.std.RTCError {
  def this(init: RTCErrorInit) = this()
  def this(init: RTCErrorInit, message: java.lang.String) = this()
}
@JSGlobal("RTCError")
@js.native
object RTCError
  extends Instantiable1[/* init */ RTCErrorInit, typings.std.RTCError]
     with Instantiable2[/* init */ RTCErrorInit, /* message */ java.lang.String, typings.std.RTCError]
