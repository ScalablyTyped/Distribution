package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.MetadataSettings._Impl, 'source'> */
@js.native
trait PickImplsourceSource extends StObject {
  
  var source: String = js.native
}
object PickImplsourceSource {
  
  @scala.inline
  def apply(source: String): PickImplsourceSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsourceSource]
  }
  
  @scala.inline
  implicit class PickImplsourceSourceMutableBuilder[Self <: PickImplsourceSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
