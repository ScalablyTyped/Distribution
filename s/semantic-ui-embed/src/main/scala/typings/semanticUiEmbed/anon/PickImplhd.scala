package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'hd'> */
@js.native
trait PickImplhd extends StObject {
  
  var hd: Boolean = js.native
}
object PickImplhd {
  
  @scala.inline
  def apply(hd: Boolean): PickImplhd = {
    val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhd]
  }
  
  @scala.inline
  implicit class PickImplhdMutableBuilder[Self <: PickImplhd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHd(value: Boolean): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
  }
}
