package typings.requestPromise.errorsMod

import org.scalablytyped.runtime.TopLevel
import typings.node.httpMod.IncomingMessage
import typings.requestPromise.mod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformError extends Error {
  
  var cause: js.Any = js.native
  
  var error: js.Any = js.native
  
  var options: Options = js.native
  
  var response: IncomingMessage = js.native
}
@JSImport("request-promise/errors", "TransformError")
@js.native
object TransformError extends TopLevel[TransformErrorConstructor]
