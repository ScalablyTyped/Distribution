package typings.reactNativeJoi.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriOptions extends StObject {
  
  /**
    * Allow relative URIs. Defaults to `false`.
    */
  var allowRelative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Restrict only relative URIs. Defaults to `false`.
    */
  var relativeOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies one or more acceptable Schemes, should only include the scheme name.
    * Can be an Array or String (strings are automatically escaped for use in a Regular Expression).
    */
  var scheme: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
}
object UriOptions {
  
  inline def apply(): UriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UriOptions]
  }
  
  extension [Self <: UriOptions](x: Self) {
    
    inline def setAllowRelative(value: Boolean): Self = StObject.set(x, "allowRelative", value.asInstanceOf[js.Any])
    
    inline def setAllowRelativeUndefined: Self = StObject.set(x, "allowRelative", js.undefined)
    
    inline def setRelativeOnly(value: Boolean): Self = StObject.set(x, "relativeOnly", value.asInstanceOf[js.Any])
    
    inline def setRelativeOnlyUndefined: Self = StObject.set(x, "relativeOnly", js.undefined)
    
    inline def setScheme(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setSchemeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "scheme", js.Array(value :_*))
  }
}
