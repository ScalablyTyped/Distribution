package typings.semanticUiReact.mod

import typings.react.mod.FC
import typings.semanticUiReact.buttonButtonMod.default
import typings.semanticUiReact.buttonContentMod.ButtonContentProps
import typings.semanticUiReact.buttonGroupMod.ButtonGroupProps
import typings.semanticUiReact.buttonOrMod.ButtonOrProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-ui-react", "Button")
@js.native
open class Button () extends default
object Button {
  
  /* was `typeof ButtonContent` */
  @JSImport("semantic-ui-react", "Button.Content")
  @js.native
  val Content: FC[ButtonContentProps] = js.native
  
  /* was `typeof ButtonGroup` */
  @JSImport("semantic-ui-react", "Button.Group")
  @js.native
  val Group: FC[ButtonGroupProps] = js.native
  
  /* was `typeof ButtonOr` */
  @JSImport("semantic-ui-react", "Button.Or")
  @js.native
  val Or: FC[ButtonOrProps] = js.native
}
