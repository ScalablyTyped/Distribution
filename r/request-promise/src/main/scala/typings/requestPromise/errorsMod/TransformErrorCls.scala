package typings.requestPromise.errorsMod

import typings.node.httpMod.IncomingMessage
import typings.requestPromise.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("request-promise/errors", "TransformError")
@js.native
class TransformErrorCls protected () extends TransformError {
  def this(cause: js.Any, options: Options, response: IncomingMessage) = this()
}
