package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttp2RouteMatchHeader extends StObject {
  
  /**
    * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
    */
  var invert: js.UndefOr[Boolean] = js.native
  
  /**
    * The method and value to match the header value sent with a request. Specify one match method.
    */
  var `match`: js.UndefOr[RouteSpecHttp2RouteMatchHeaderMatch] = js.native
  
  /**
    * A name for the HTTP header in the client request that will be matched on.
    */
  var name: String = js.native
}
object RouteSpecHttp2RouteMatchHeader {
  
  @scala.inline
  def apply(name: String): RouteSpecHttp2RouteMatchHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteSpecHttp2RouteMatchHeader]
  }
  
  @scala.inline
  implicit class RouteSpecHttp2RouteMatchHeaderMutableBuilder[Self <: RouteSpecHttp2RouteMatchHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    @scala.inline
    def setMatch(value: RouteSpecHttp2RouteMatchHeaderMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
