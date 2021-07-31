package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, 'id'> */
trait PickImplidId extends StObject {
  
  var id: String
}
object PickImplidId {
  
  @scala.inline
  def apply(id: String): PickImplidId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplidId]
  }
  
  @scala.inline
  implicit class PickImplidIdMutableBuilder[Self <: PickImplidId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
