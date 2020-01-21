package typings.reactSimpleCodeEditor

import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-simple-code-editor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends Component[
          (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with AnonAutoFocus, 
          js.Object, 
          js.Any
        ] {
    var session: AnonHistory = js.native
  }
  
}

