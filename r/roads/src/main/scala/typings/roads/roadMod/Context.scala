package typings.roads.roadMod

import org.scalablytyped.runtime.StringDictionary
import typings.roads.responseMod.ResponseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context
  extends /* x */ StringDictionary[js.Any] {
  var Response: ResponseConstructor
  var request: js.Function
}

object Context {
  @scala.inline
  def apply(
    Response: ResponseConstructor,
    request: js.Function,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): Context = {
    val __obj = js.Dynamic.literal(Response = Response.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Context]
  }
}

