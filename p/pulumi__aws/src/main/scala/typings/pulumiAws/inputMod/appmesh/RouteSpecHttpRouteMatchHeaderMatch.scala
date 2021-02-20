package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteSpecHttpRouteMatchHeaderMatch extends StObject {
  
  /**
    * The value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
    */
  var exact: js.UndefOr[Input[String]] = js.native
  
  /**
    * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
    * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The object that specifies the range of numbers that the value sent by the client must be included in.
    */
  var range: js.UndefOr[Input[RouteSpecHttpRouteMatchHeaderMatchRange]] = js.native
  
  /**
    * The value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
    */
  var regex: js.UndefOr[Input[String]] = js.native
  
  /**
    * The value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
    */
  var suffix: js.UndefOr[Input[String]] = js.native
}
object RouteSpecHttpRouteMatchHeaderMatch {
  
  @scala.inline
  def apply(): RouteSpecHttpRouteMatchHeaderMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSpecHttpRouteMatchHeaderMatch]
  }
  
  @scala.inline
  implicit class RouteSpecHttpRouteMatchHeaderMatchMutableBuilder[Self <: RouteSpecHttpRouteMatchHeaderMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExact(value: Input[String]): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setRange(value: Input[RouteSpecHttpRouteMatchHeaderMatchRange]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRegex(value: Input[String]): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    @scala.inline
    def setSuffix(value: Input[String]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
