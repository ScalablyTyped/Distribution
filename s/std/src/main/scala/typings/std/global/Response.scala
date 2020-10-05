package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.BodyInit
import typings.std.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Response")
@js.native
class Response ()
  extends typings.std.Response {
  def this(body: BodyInit) = this()
  def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  def this(body: Null, init: ResponseInit) = this()
}

@JSGlobal("Response")
@js.native
object Response
  extends Instantiable0[typings.std.Response]
     with Instantiable1[/* body */ BodyInit, typings.std.Response]
     with Instantiable2[
      js.UndefOr[(/* body */ BodyInit) | (/* body */ Null)], 
      /* init */ ResponseInit, 
      typings.std.Response
    ] {
  def error(): typings.std.Response = js.native
  def redirect(url: java.lang.String): typings.std.Response = js.native
  def redirect(url: java.lang.String, status: Double): typings.std.Response = js.native
}

