package typings.routeNode.routeNodeMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatchResponse extends js.Object {
  
  var params: Record[String, _] = js.native
  
  var segments: js.Array[RouteNode] = js.native
}
object MatchResponse {
  
  @scala.inline
  def apply(params: Record[String, _], segments: js.Array[RouteNode]): MatchResponse = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchResponse]
  }
  
  @scala.inline
  implicit class MatchResponseOps[Self <: MatchResponse] (val x: Self) extends AnyVal {
    
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
    def setParams(value: Record[String, _]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsVarargs(value: RouteNode*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[RouteNode]): Self = this.set("segments", value.asInstanceOf[js.Any])
  }
}
