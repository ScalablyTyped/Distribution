package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocaleOptions
  extends StObject
     with CountryOptions {
  
  var locale: js.UndefOr[String] = js.undefined
}
object LocaleOptions {
  
  @scala.inline
  def apply(): LocaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleOptions]
  }
  
  @scala.inline
  implicit class LocaleOptionsMutableBuilder[Self <: LocaleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
