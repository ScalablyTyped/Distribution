package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlEncodedBodyParserOptions extends StObject {
  
  var bodyReader: js.UndefOr[Boolean] = js.undefined
  
  var mapParams: js.UndefOr[Boolean] = js.undefined
  
  var overrideParams: js.UndefOr[Boolean] = js.undefined
}
object UrlEncodedBodyParserOptions {
  
  @scala.inline
  def apply(): UrlEncodedBodyParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlEncodedBodyParserOptions]
  }
  
  @scala.inline
  implicit class UrlEncodedBodyParserOptionsMutableBuilder[Self <: UrlEncodedBodyParserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyReader(value: Boolean): Self = StObject.set(x, "bodyReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyReaderUndefined: Self = StObject.set(x, "bodyReader", js.undefined)
    
    @scala.inline
    def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
    
    @scala.inline
    def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
  }
}
