package typings.reduxSentryMiddleware.anon

import typings.sentryTypes.statusMod.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStatus extends js.Object {
  
  /**
    * Converts a HTTP status code into a {@link Status}.
    *
    * @param code The HTTP response status code.
    * @returns The send status or {@link Status.Unknown}.
    */
  def fromHttpCode(code: Double): Status = js.native
}
object TypeofStatus {
  
  @scala.inline
  def apply(fromHttpCode: Double => Status): TypeofStatus = {
    val __obj = js.Dynamic.literal(fromHttpCode = js.Any.fromFunction1(fromHttpCode))
    __obj.asInstanceOf[TypeofStatus]
  }
  
  @scala.inline
  implicit class TypeofStatusOps[Self <: TypeofStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromHttpCode(value: Double => Status): Self = this.set("fromHttpCode", js.Any.fromFunction1(value))
  }
}
