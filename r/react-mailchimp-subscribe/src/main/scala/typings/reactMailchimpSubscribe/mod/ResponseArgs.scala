package typings.reactMailchimpSubscribe.mod

import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.error
import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.success
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactMailchimpSubscribe.mod.ErrorResponseArgs
  - typings.reactMailchimpSubscribe.mod.SuccessResponseArgs
*/
trait ResponseArgs extends js.Object
object ResponseArgs {
  
  @scala.inline
  def ErrorResponseArgs(message: String | Error, status: error): ResponseArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseArgs]
  }
  
  @scala.inline
  def SuccessResponseArgs(message: String, status: success): ResponseArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseArgs]
  }
}
