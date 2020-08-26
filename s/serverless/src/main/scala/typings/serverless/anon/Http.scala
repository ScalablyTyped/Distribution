package typings.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Http[T /* <: js.Object */] extends js.Object {
  var http: T | String = js.native
}

object Http {
  @scala.inline
  def apply[/* <: js.Object */ T](http: T | String): Http[T] = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http[T]]
  }
  @scala.inline
  implicit class HttpOps[Self <: Http[_], /* <: js.Object */ T] (val x: Self with Http[T]) extends AnyVal {
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
    def setHttp(value: T | String): Self = this.set("http", value.asInstanceOf[js.Any])
  }
  
}

