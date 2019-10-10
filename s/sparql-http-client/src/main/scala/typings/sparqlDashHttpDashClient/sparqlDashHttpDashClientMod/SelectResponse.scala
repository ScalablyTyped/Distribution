package typings.sparqlDashHttpDashClient.sparqlDashHttpDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectResponse extends js.Object {
  def json(): js.Promise[SelectBindings with AskResult]
}

object SelectResponse {
  @scala.inline
  def apply(json: () => js.Promise[SelectBindings with AskResult]): SelectResponse = {
    val __obj = js.Dynamic.literal(json = js.Any.fromFunction0(json))
  
    __obj.asInstanceOf[SelectResponse]
  }
}

