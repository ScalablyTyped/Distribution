package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'color'> */
trait PickImplcolor extends StObject {
  
  var color: String
}
object PickImplcolor {
  
  @scala.inline
  def apply(color: String): PickImplcolor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcolor]
  }
  
  @scala.inline
  implicit class PickImplcolorMutableBuilder[Self <: PickImplcolor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
