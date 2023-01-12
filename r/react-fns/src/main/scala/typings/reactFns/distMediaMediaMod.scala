package typings.reactFns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediaMediaMod {
  
  @JSImport("react-fns/dist/Media/Media", "Media")
  @js.native
  val Media: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<SharedRenderProps<MediaProps>> */ Any = js.native
  
  trait MediaProps extends StObject {
    
    var matches: Boolean
  }
  object MediaProps {
    
    inline def apply(matches: Boolean): MediaProps = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaProps] (val x: Self) extends AnyVal {
      
      inline def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    }
  }
}
