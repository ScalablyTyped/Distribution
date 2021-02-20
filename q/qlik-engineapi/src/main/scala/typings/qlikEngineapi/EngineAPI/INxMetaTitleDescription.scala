package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxMetaTitleDescription width extend NxMeta
  */
@js.native
trait INxMetaTitleDescription extends INxMeta {
  
  /**
    * Set a description.
    */
  var description: String = js.native
  
  /**
    * Set a title.
    */
  var title: String = js.native
}
object INxMetaTitleDescription {
  
  @scala.inline
  def apply(description: String, title: String): INxMetaTitleDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMetaTitleDescription]
  }
  
  @scala.inline
  implicit class INxMetaTitleDescriptionMutableBuilder[Self <: INxMetaTitleDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
