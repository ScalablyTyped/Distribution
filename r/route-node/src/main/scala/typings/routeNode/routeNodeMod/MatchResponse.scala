package typings.routeNode.routeNodeMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchResponse extends js.Object {
  var params: Record[String, _]
  var segments: js.Array[RouteNode]
}

object MatchResponse {
  @scala.inline
  def apply(params: Record[String, _], segments: js.Array[RouteNode]): MatchResponse = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MatchResponse]
  }
}

