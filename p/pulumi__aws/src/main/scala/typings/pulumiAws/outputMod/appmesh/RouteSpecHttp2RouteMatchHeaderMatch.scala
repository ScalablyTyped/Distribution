package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSpecHttp2RouteMatchHeaderMatch extends StObject {
  
  /**
    * The value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
    */
  var exact: js.UndefOr[String] = js.undefined
  
  /**
    * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * The object that specifies the range of numbers that the value sent by the client must be included in.
    */
  var range: js.UndefOr[RouteSpecHttp2RouteMatchHeaderMatchRange] = js.undefined
  
  /**
    * The value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
    */
  var regex: js.UndefOr[String] = js.undefined
  
  /**
    * The value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
    */
  var suffix: js.UndefOr[String] = js.undefined
}
object RouteSpecHttp2RouteMatchHeaderMatch {
  
  @scala.inline
  def apply(): RouteSpecHttp2RouteMatchHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecHttp2RouteMatchHeaderMatch]
  }
  
  @scala.inline
  implicit class RouteSpecHttp2RouteMatchHeaderMatchMutableBuilder[Self <: RouteSpecHttp2RouteMatchHeaderMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: String): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setRange(value: RouteSpecHttp2RouteMatchHeaderMatchRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
