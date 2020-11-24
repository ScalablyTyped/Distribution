package typings.realmNetworkTransport.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseHandler extends js.Object {
  
  def onError(err: Error): Unit = js.native
  @JSName("onError")
  var onError_Original: ErrorCallback = js.native
  
  def onSuccess(response: Response): Unit = js.native
  @JSName("onSuccess")
  var onSuccess_Original: SuccessCallback = js.native
}
