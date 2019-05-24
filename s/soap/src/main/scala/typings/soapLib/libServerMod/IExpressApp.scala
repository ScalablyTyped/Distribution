package typings
package soapLib.libServerMod

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
    val __obj = js.Dynamic.literal(route = route, use = use)
  
    __obj.asInstanceOf[IExpressApp]
  }
}

