package typings.reactAriaLive

import typings.react.mod.Component
import typings.react.mod.StatelessComponent
import typings.reactAriaLive.anon.Arialive
import typings.reactAriaLive.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-aria-live", "LiveAnnouncer")
  @js.native
  class LiveAnnouncer protected ()
    extends Component[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
    
    def announceAssertive(message: String): Unit = js.native
    def announceAssertive(message: String, id: String): Unit = js.native
    
    def announcePolite(message: String): Unit = js.native
    def announcePolite(message: String, id: String): Unit = js.native
  }
  
  @JSImport("react-aria-live", "LiveMessage")
  @js.native
  val LiveMessage: StatelessComponent[Arialive] = js.native
  
  @JSImport("react-aria-live", "LiveMessenger")
  @js.native
  val LiveMessenger: StatelessComponent[Children] = js.native
}
