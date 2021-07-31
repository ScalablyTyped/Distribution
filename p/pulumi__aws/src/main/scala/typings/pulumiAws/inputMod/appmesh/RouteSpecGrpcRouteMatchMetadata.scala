package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecGrpcRouteMatchMetadata extends StObject {
  
  /**
    * If `true`, the match is on the opposite of the `match` criteria. Default is `false`.
    */
  var invert: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * The data to match from the request.
    */
  var `match`: js.UndefOr[Input[RouteSpecGrpcRouteMatchMetadataMatch]] = js.undefined
  
  /**
    * The name of the route. Must be between 1 and 50 characters in length.
    */
  var name: Input[String]
}
object RouteSpecGrpcRouteMatchMetadata {
  
  @scala.inline
  def apply(name: Input[String]): RouteSpecGrpcRouteMatchMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecGrpcRouteMatchMetadata]
  }
  
  @scala.inline
  implicit class RouteSpecGrpcRouteMatchMetadataMutableBuilder[Self <: RouteSpecGrpcRouteMatchMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvert(value: Input[Boolean]): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setMatch(value: Input[RouteSpecGrpcRouteMatchMetadataMatch]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
