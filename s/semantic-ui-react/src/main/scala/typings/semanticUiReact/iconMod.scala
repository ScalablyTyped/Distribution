package typings.semanticUiReact

import typings.react.mod.FC
import typings.semanticUiReact.iconGroupMod.IconGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Icon", JSImport.Default)
  @js.native
  open class default ()
    extends typings.semanticUiReact.iconIconMod.default
  object default {
    
    /* was `typeof IconGroup` */
    @JSImport("semantic-ui-react/dist/commonjs/elements/Icon", "default.Group")
    @js.native
    val Group: FC[IconGroupProps] = js.native
  }
}
