package typings.soap.libServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExpressApp extends js.Object {
  var route: js.Any
  var use: js.Any
}

object IExpressApp {
  @scala.inline
  def apply(route: js.Any, use: js.Any): IExpressApp = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IExpressApp]
  }
}

