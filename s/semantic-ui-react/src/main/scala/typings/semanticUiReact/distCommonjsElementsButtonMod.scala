package typings.semanticUiReact

import typings.react.mod.FC
import typings.semanticUiReact.distCommonjsElementsButtonButtonContentMod.ButtonContentProps
import typings.semanticUiReact.distCommonjsElementsButtonButtonGroupMod.ButtonGroupProps
import typings.semanticUiReact.distCommonjsElementsButtonButtonOrMod.ButtonOrProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsButtonMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Button", JSImport.Default)
  @js.native
  open class default ()
    extends typings.semanticUiReact.distCommonjsElementsButtonButtonMod.default
  object default {
    
    /* was `typeof ButtonContent` */
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button", "default.Content")
    @js.native
    val Content: FC[ButtonContentProps] = js.native
    
    /* was `typeof ButtonGroup` */
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button", "default.Group")
    @js.native
    val Group: FC[ButtonGroupProps] = js.native
    
    /* was `typeof ButtonOr` */
    @JSImport("semantic-ui-react/dist/commonjs/elements/Button", "default.Or")
    @js.native
    val Or: FC[ButtonOrProps] = js.native
  }
}
