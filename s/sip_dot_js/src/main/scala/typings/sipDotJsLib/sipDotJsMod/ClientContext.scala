package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "ClientContext")
@js.native
class ClientContext protected ()
  extends sipDotJsLib.typesClientDashContextMod.ClientContext {
  def this(ua: sipDotJsLib.typesUaMod.UA, method: java.lang.String, target: java.lang.String) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, method: java.lang.String, target: sipDotJsLib.typesUriMod.URI) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, method: java.lang.String, target: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, method: java.lang.String, target: sipDotJsLib.typesUriMod.URI, options: js.Any) = this()
}

@JSImport("sip.js", "ClientContext")
@js.native
object ClientContext extends js.Object {
  def initializer(
    objToConstruct: sipDotJsLib.typesClientDashContextMod.ClientContext,
    ua: sipDotJsLib.typesUaMod.UA,
    method: java.lang.String,
    originalTarget: java.lang.String
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.typesClientDashContextMod.ClientContext,
    ua: sipDotJsLib.typesUaMod.UA,
    method: java.lang.String,
    originalTarget: java.lang.String,
    options: js.Any
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.typesClientDashContextMod.ClientContext,
    ua: sipDotJsLib.typesUaMod.UA,
    method: java.lang.String,
    originalTarget: sipDotJsLib.typesUriMod.URI
  ): scala.Unit = js.native
  def initializer(
    objToConstruct: sipDotJsLib.typesClientDashContextMod.ClientContext,
    ua: sipDotJsLib.typesUaMod.UA,
    method: java.lang.String,
    originalTarget: sipDotJsLib.typesUriMod.URI,
    options: js.Any
  ): scala.Unit = js.native
}

