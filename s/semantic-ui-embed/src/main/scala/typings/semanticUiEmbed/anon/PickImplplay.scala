package typings.semanticUiEmbed.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.Embed.SelectorSettings._Impl, 'play'> */
trait PickImplplay extends StObject {
  
  var play: String
}
object PickImplplay {
  
  inline def apply(play: String): PickImplplay = {
    val __obj = js.Dynamic.literal(play = play.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplay]
  }
  
  extension [Self <: PickImplplay](x: Self) {
    
    inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
  }
}
