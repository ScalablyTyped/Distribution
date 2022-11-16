package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaListMod {
  
  @JSImport("react-bootstrap/lib/MediaList", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaListProps, js.Object, Any]
  
  type MediaList = Component[MediaListProps, js.Object, Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type MediaListProps = react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/MediaList.MediaList>
  }}}
  to avoid circular code involving: 
  - react-bootstrap.react-bootstrap/lib/MediaList.MediaList
  - react-bootstrap.react-bootstrap/lib/MediaList.MediaListProps
  */
  trait MediaListProps
    extends StObject
       with HTMLProps[MediaList]
  object MediaListProps {
    
    inline def apply(): MediaListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaListProps]
    }
  }
}
