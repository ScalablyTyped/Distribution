package typings.reactFrontload

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactFrontload.mod.FrontloadConnectOptions
import typings.reactFrontload.mod.FrontloadProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactFrontload {
    
    @JSGlobal("ReactFrontload")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ReactFrontload.Frontload")
    @js.native
    class Frontload protected ()
      extends Component[FrontloadProps, ComponentState, js.Any] {
      def this(props: FrontloadProps) = this()
      def this(props: FrontloadProps, context: js.Any) = this()
    }
    @JSGlobal("ReactFrontload.Frontload")
    @js.native
    val Frontload: ComponentClass[FrontloadProps, ComponentState] = js.native
    
    inline def frontloadConnect(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]]): js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("frontloadConnect")(frontload.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]]]
    inline def frontloadConnect(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]], options: FrontloadConnectOptions): js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("frontloadConnect")(frontload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]]]
    
    inline def frontloadServerRender(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("frontloadServerRender")(renderMarkup.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def frontloadServerRender(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String], withLogging: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("frontloadServerRender")(renderMarkup.asInstanceOf[js.Any], withLogging.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  }
}
