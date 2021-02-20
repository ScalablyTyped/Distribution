package typings.std.global

import typings.std.BodyInit
import typings.std.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Response")
@js.native
class Response ()
  extends typings.std.Response {
  def this(body: BodyInit) = this()
  def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  def this(body: Null, init: ResponseInit) = this()
}
object Response {
  
  @JSGlobal("Response.error")
  @js.native
  def error(): typings.std.Response = js.native
  
  @JSGlobal("Response.redirect")
  @js.native
  def redirect(url: java.lang.String): typings.std.Response = js.native
  @JSGlobal("Response.redirect")
  @js.native
  def redirect(url: java.lang.String, status: Double): typings.std.Response = js.native
}
