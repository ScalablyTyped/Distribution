package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecGrpcRouteMatchMetadata extends js.Object {
  
  /**
    * If `true`, the match is on the opposite of the `match` criteria. Default is `false`.
    */
  var invert: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The data to match from the request.
    */
  var `match`: js.UndefOr[Input[RouteSpecGrpcRouteMatchMetadataMatch]] = js.native
  
  /**
    * The name of the route. Must be between 1 and 50 characters in length.
    */
  var name: Input[String] = js.native
}
object RouteSpecGrpcRouteMatchMetadata {
  
  @scala.inline
  def apply(name: Input[String]): RouteSpecGrpcRouteMatchMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRouteMatchMetadata]
  }
  
  @scala.inline
  implicit class RouteSpecGrpcRouteMatchMetadataOps[Self <: RouteSpecGrpcRouteMatchMetadata] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvert(value: Input[Boolean]): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    
    @scala.inline
    def setMatch(value: Input[RouteSpecGrpcRouteMatchMetadataMatch]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
  }
}
