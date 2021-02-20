package typings.stremioAddonSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestExtra extends StObject {
  
  /**
    * Set to true if this property must always be passed.
    */
  var isRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the property
    *
    * This name will be used in the extraProps argument itself.
    */
  var name: Extra = js.native
  
  /**
    * Possible values for this property.
    * This is useful for things like genres, where you need the user to select from a pre-set list of options.
    *
    * e.g. { name: "genre", options: ["Action", "Comedy", "Drama"] }
    *
    *
    * It's also useful if we want to specify a limited number of pages (for the skip parameter).
    *
    * e.g. { name: "skip", options: ["0", "100", "200"] }
    */
  var options: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The limit of values a user may select from the pre-set options list
    *
    * By default this is set to 1.
    */
  var optionsLimit: js.UndefOr[Double] = js.native
}
object ManifestExtra {
  
  @scala.inline
  def apply(name: Extra): ManifestExtra = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestExtra]
  }
  
  @scala.inline
  implicit class ManifestExtraMutableBuilder[Self <: ManifestExtra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequiredUndefined: Self = StObject.set(x, "isRequired", js.undefined)
    
    @scala.inline
    def setName(value: Extra): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsLimit(value: Double): Self = StObject.set(x, "optionsLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsLimitUndefined: Self = StObject.set(x, "optionsLimit", js.undefined)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
  }
}
