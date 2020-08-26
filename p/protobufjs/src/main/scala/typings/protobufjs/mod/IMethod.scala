package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMethod extends js.Object {
  /** Method options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** Whether requests are streamed */
  var requestStream: js.UndefOr[Boolean] = js.native
  /** Request type */
  var requestType: String = js.native
  /** Whether responses are streamed */
  var responseStream: js.UndefOr[Boolean] = js.native
  /** Response type */
  var responseType: String = js.native
  /** Method type */
  var `type`: js.UndefOr[String] = js.native
}

object IMethod {
  @scala.inline
  def apply(requestType: String, responseType: String): IMethod = {
    val __obj = js.Dynamic.literal(requestType = requestType.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMethod]
  }
  @scala.inline
  implicit class IMethodOps[Self <: IMethod] (val x: Self) extends AnyVal {
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
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setRequestStream(value: Boolean): Self = this.set("requestStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestStream: Self = this.set("requestStream", js.undefined)
    @scala.inline
    def setResponseStream(value: Boolean): Self = this.set("responseStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseStream: Self = this.set("responseStream", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

