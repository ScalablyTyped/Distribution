package typings.reactFns

import typings.react.mod.SFC
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaMediaMod {
  
  @JSImport("react-fns/dist/Media/Media", "Media")
  @js.native
  val Media: SFC[SharedRenderProps[MediaProps]] = js.native
  
  trait MediaProps extends StObject {
    
    var matches: Boolean
  }
  object MediaProps {
    
    inline def apply(matches: Boolean): MediaProps = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaProps]
    }
    
    extension [Self <: MediaProps](x: Self) {
      
      inline def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    }
  }
}
