package typings.reactFrontload

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("react-frontload", "frontloadConnect")
  @js.native
  def frontloadConnect(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]]): js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]] = js.native
  @JSImport("react-frontload", "frontloadConnect")
  @js.native
  def frontloadConnect(frontload: js.Function1[/* props */ js.Any, js.Promise[Unit]], options: FrontloadConnectOptions): js.Function1[/* Component */ ComponentType[js.Object], ComponentType[js.Object]] = js.native
  
  @JSImport("react-frontload", "frontloadServerRender")
  @js.native
  def frontloadServerRender(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String]): js.Promise[String] = js.native
  @JSImport("react-frontload", "frontloadServerRender")
  @js.native
  def frontloadServerRender(renderMarkup: js.Function1[/* dryRun */ js.UndefOr[Boolean], String], withLogging: Boolean): js.Promise[String] = js.native
  
  @js.native
  trait FrontloadConnectOptions extends StObject {
    
    var noServerRender: js.UndefOr[Boolean] = js.native
    
    var onMount: js.UndefOr[Boolean] = js.native
    
    var onUpdate: js.UndefOr[Boolean] = js.native
  }
  object FrontloadConnectOptions {
    
    @scala.inline
    def apply(): FrontloadConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrontloadConnectOptions]
    }
    
    @scala.inline
    implicit class FrontloadConnectOptionsMutableBuilder[Self <: FrontloadConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoServerRender(value: Boolean): Self = StObject.set(x, "noServerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoServerRenderUndefined: Self = StObject.set(x, "noServerRender", js.undefined)
      
      @scala.inline
      def setOnMount(value: Boolean): Self = StObject.set(x, "onMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: Boolean): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  @js.native
  trait FrontloadProps extends StObject {
    
    var noServerRender: js.UndefOr[Boolean] = js.native
  }
  object FrontloadProps {
    
    @scala.inline
    def apply(): FrontloadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrontloadProps]
    }
    
    @scala.inline
    implicit class FrontloadPropsMutableBuilder[Self <: FrontloadProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoServerRender(value: Boolean): Self = StObject.set(x, "noServerRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoServerRenderUndefined: Self = StObject.set(x, "noServerRender", js.undefined)
    }
  }
}
