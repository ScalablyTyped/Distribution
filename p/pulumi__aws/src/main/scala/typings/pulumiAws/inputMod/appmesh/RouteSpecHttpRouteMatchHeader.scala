package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRouteMatchHeader extends StObject {
  
  /**
    * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
    */
  var invert: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The method and value to match the header value sent with a request. Specify one match method.
    */
  var `match`: js.UndefOr[Input[RouteSpecHttpRouteMatchHeaderMatch]] = js.native
  
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  var name: Input[String] = js.native
}
object RouteSpecHttpRouteMatchHeader {
  
  @scala.inline
  def apply(name: Input[String]): RouteSpecHttpRouteMatchHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeader]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteMatchHeaderMutableBuilder[Self <: RouteSpecHttpRouteMatchHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvert(value: Input[Boolean]): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setMatch(value: Input[RouteSpecHttpRouteMatchHeaderMatch]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
