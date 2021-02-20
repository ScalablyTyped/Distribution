package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, 'play'> */
@js.native
trait PickImplplay extends StObject {
  
  var play: String = js.native
}
object PickImplplay {
  
  @scala.inline
  def apply(play: String): PickImplplay = {
    val __obj = js.Dynamic.literal(play = play.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplay]
  }
  
  @scala.inline
  implicit class PickImplplayMutableBuilder[Self <: PickImplplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
  }
}
