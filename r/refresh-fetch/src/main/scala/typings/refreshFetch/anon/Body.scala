package typings.refreshFetch.anon

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body[ResponseBody] extends js.Object {
  /* tslint:disable-next-line no-unnecessary-generics */
  var body: ResponseBody
  var response: Response
}

object Body {
  @scala.inline
  def apply[ResponseBody](body: ResponseBody, response: Response): Body[ResponseBody] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body[ResponseBody]]
  }
}

