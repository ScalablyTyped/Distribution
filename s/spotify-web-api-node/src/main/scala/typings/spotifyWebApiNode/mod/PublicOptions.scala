package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicOptions extends StObject {
  
  var public: js.UndefOr[Boolean] = js.undefined
}
object PublicOptions {
  
  inline def apply(): PublicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicOptions] (val x: Self) extends AnyVal {
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
  }
}
