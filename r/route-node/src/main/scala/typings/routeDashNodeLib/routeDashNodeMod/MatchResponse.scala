package typings
package routeDashNodeLib.routeDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchResponse extends js.Object {
  var params: js.Object
  var segments: js.Array[RouteNode]
}

object MatchResponse {
  @scala.inline
  def apply(params: js.Object, segments: js.Array[RouteNode]): MatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("segments")(segments)
    __obj.asInstanceOf[MatchResponse]
  }
}

