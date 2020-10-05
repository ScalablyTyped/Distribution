package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.RequestInfo
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Request")
@js.native
class Request protected ()
  extends typings.std.Request {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
}

@JSGlobal("Request")
@js.native
object Request
  extends Instantiable1[/* input */ RequestInfo, typings.std.Request]
     with Instantiable2[/* input */ RequestInfo, /* init */ RequestInit, typings.std.Request]

