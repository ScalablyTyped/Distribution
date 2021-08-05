package typings.reactFrontload

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-frontload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-frontload", "Frontload")
  @js.native
  class Frontload protected ()
    extends Component[FrontloadProps, ComponentState, js.Any] {
    def this(props: FrontloadProps) = this()
    def this(props: FrontloadProps, context: js.Any) = this()
  }
  @JSImport("react-frontload", "Frontload")
  @js.native
  val Frontload: ComponentClass[FrontloadProps, ComponentState] = js.native
  
  inline def frontloadConnect(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]]): js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("frontloadConnect")(frontload.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]]]
  inline def frontloadConnect(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]], options: FrontloadConnectOptions): js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("frontloadConnect")(frontload.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]]]
  
  inline def frontloadServerRender(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("frontloadServerRender")(renderMarkup.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def frontloadServerRender(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String], withLogging: Boolean): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("frontloadServerRender")(renderMarkup.asInstanceOf[js.Any], withLogging.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait FrontloadConnectOptions extends StObject {
    
    var noServerRender: js.UndefOr[Boolean] = js.undefined
    
    var onMount: js.UndefOr[Boolean] = js.undefined
    
    var onUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object FrontloadConnectOptions {
    
    inline def apply(): FrontloadConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrontloadConnectOptions]
    }
    
    extension [Self <: FrontloadConnectOptions](x: Self) {
      
      inline def setNoServerRender(value: Boolean): Self = StObject.set(x, "noServerRender", value.asInstanceOf[js.Any])
      
      inline def setNoServerRenderUndefined: Self = StObject.set(x, "noServerRender", js.undefined)
      
      inline def setOnMount(value: Boolean): Self = StObject.set(x, "onMount", value.asInstanceOf[js.Any])
      
      inline def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      inline def setOnUpdate(value: Boolean): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  trait FrontloadProps extends StObject {
    
    var noServerRender: js.UndefOr[Boolean] = js.undefined
  }
  object FrontloadProps {
    
    inline def apply(): FrontloadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrontloadProps]
    }
    
    extension [Self <: FrontloadProps](x: Self) {
      
      inline def setNoServerRender(value: Boolean): Self = StObject.set(x, "noServerRender", value.asInstanceOf[js.Any])
      
      inline def setNoServerRenderUndefined: Self = StObject.set(x, "noServerRender", js.undefined)
    }
  }
}
