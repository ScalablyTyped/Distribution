package typings.roads.roadMod

import org.scalablytyped.runtime.StringDictionary
import typings.roads.responseMod.ResponseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context
  extends /* x */ StringDictionary[js.Any] {
  var Response: ResponseConstructor = js.native
  var request: js.Function = js.native
}

object Context {
  @scala.inline
  def apply(Response: ResponseConstructor, request: js.Function): Context = {
    val __obj = js.Dynamic.literal(Response = Response.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setResponse(value: ResponseConstructor): Self = this.set("Response", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: js.Function): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

