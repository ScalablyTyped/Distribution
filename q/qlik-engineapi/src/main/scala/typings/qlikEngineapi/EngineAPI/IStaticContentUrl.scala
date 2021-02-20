package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StaticContentUrl...
  *
  * Note: In addition, this structure can return dynamic properties.
  */
@js.native
trait IStaticContentUrl extends StObject {
  
  /**
    * Relative path of the thumbnail.
    */
  var qUrl: String = js.native
}
object IStaticContentUrl {
  
  @scala.inline
  def apply(qUrl: String): IStaticContentUrl = {
    val __obj = js.Dynamic.literal(qUrl = qUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticContentUrl]
  }
  
  @scala.inline
  implicit class IStaticContentUrlMutableBuilder[Self <: IStaticContentUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQUrl(value: String): Self = StObject.set(x, "qUrl", value.asInstanceOf[js.Any])
  }
}
