package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, 'icon'> */
@js.native
trait PickImpliconIcon extends StObject {
  
  var icon: String = js.native
}
object PickImpliconIcon {
  
  @scala.inline
  def apply(icon: String): PickImpliconIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpliconIcon]
  }
  
  @scala.inline
  implicit class PickImpliconIconMutableBuilder[Self <: PickImpliconIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
