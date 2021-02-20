package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryOptions extends StObject {
  
  var country: js.UndefOr[String] = js.native
}
object CountryOptions {
  
  @scala.inline
  def apply(): CountryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryOptions]
  }
  
  @scala.inline
  implicit class CountryOptionsMutableBuilder[Self <: CountryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
  }
}
