package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.ClassNameSettings._Impl, 'embed'> */
@js.native
trait PickImplembed extends StObject {
  
  var embed: String = js.native
}
object PickImplembed {
  
  @scala.inline
  def apply(embed: String): PickImplembed = {
    val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplembed]
  }
  
  @scala.inline
  implicit class PickImplembedMutableBuilder[Self <: PickImplembed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
  }
}
