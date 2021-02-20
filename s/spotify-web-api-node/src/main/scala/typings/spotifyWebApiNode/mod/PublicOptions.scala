package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicOptions extends StObject {
  
  var public: js.UndefOr[Boolean] = js.native
}
object PublicOptions {
  
  @scala.inline
  def apply(): PublicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicOptions]
  }
  
  @scala.inline
  implicit class PublicOptionsMutableBuilder[Self <: PublicOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
  }
}
