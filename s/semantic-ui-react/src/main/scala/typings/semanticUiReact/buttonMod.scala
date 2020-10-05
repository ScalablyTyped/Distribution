package typings.semanticUiReact

import typings.react.mod.StatelessComponent
import typings.semanticUiReact.buttonContentMod.ButtonContentProps
import typings.semanticUiReact.buttonGroupMod.ButtonGroupProps
import typings.semanticUiReact.buttonOrMod.ButtonOrProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-ui-react/dist/commonjs/elements/Button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  class default ()
    extends typings.semanticUiReact.buttonButtonMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Content: StatelessComponent[ButtonContentProps] = js.native
    var Group: StatelessComponent[ButtonGroupProps] = js.native
    var Or: StatelessComponent[ButtonOrProps] = js.native
  }
  
}

