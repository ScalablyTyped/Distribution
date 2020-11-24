package typings.requestPromise.errorsMod

import org.scalablytyped.runtime.TopLevel
import typings.node.httpMod.IncomingMessage
import typings.requestPromise.mod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusCodeError extends Error {
  
  var error: js.Any = js.native
  
  var options: Options = js.native
  
  var response: IncomingMessage = js.native
  
  var statusCode: Double = js.native
}
@JSImport("request-promise/errors", "StatusCodeError")
@js.native
object StatusCodeError extends TopLevel[StatusCodeErrorConstructor]
