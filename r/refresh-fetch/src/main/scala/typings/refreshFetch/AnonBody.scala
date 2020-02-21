package typings.refreshFetch

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody[ResponseBody] extends js.Object {
  /* tslint:disable-next-line no-unnecessary-generics */
  var body: ResponseBody
  var response: Response
}

object AnonBody {
  @scala.inline
  def apply[ResponseBody](body: ResponseBody, response: Response): AnonBody[ResponseBody] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody[ResponseBody]]
  }
}

