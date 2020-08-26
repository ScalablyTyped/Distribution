package typings.rawBody.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawBodyError extends Error {
  /**
    * The encoding.
    */
  var encoding: js.UndefOr[String] = js.native
  var expected: js.UndefOr[Double] = js.native
  /**
    * The expected length of the stream.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The limit in bytes.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The received bytes.
    */
  var received: js.UndefOr[Double] = js.native
  /**
    * The corresponding status code for the error.
    */
  var status: Double = js.native
  var statusCode: Double = js.native
  /**
    * The error type.
    */
  var `type`: String = js.native
}

object RawBodyError {
  @scala.inline
  def apply(message: String, name: String, status: Double, statusCode: Double, `type`: String): RawBodyError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawBodyError]
  }
  @scala.inline
  implicit class RawBodyErrorOps[Self <: RawBodyError] (val x: Self) extends AnyVal {
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
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setExpected(value: Double): Self = this.set("expected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpected: Self = this.set("expected", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setReceived(value: Double): Self = this.set("received", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceived: Self = this.set("received", js.undefined)
  }
  
}

