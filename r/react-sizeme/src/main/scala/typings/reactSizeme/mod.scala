package typings.reactSizeme

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactSizeme.anon.Height
import typings.reactSizeme.reactSizemeStrings.debounce
import typings.reactSizeme.reactSizemeStrings.size
import typings.reactSizeme.reactSizemeStrings.throttle
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sizeme", JSImport.Namespace)
  @js.native
  def apply(): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
  @JSImport("react-sizeme", JSImport.Namespace)
  @js.native
  def apply(options: SizeMeOptions): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
  
  @JSImport("react-sizeme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sizeme", "SizeMe")
  @js.native
  class SizeMe protected ()
    extends Component[SizeMeRenderProps, js.Object, js.Any] {
    def this(props: SizeMeRenderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SizeMeRenderProps, context: js.Any) = this()
  }
  
  @JSImport("react-sizeme", "noPlaceholders")
  @js.native
  def noPlaceholders: Boolean = js.native
  @scala.inline
  def noPlaceholders_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noPlaceholders")(x.asInstanceOf[js.Any])
  
  @JSImport("react-sizeme", "withSize")
  @js.native
  def withSize(): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
  @JSImport("react-sizeme", "withSize")
  @js.native
  def withSize(options: SizeMeOptions): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) with WithSizeProps]
  ] = js.native
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait SizeMeOptions extends StObject {
    
    var monitorHeight: js.UndefOr[Boolean] = js.native
    
    var monitorPosition: js.UndefOr[Boolean] = js.native
    
    var monitorWidth: js.UndefOr[Boolean] = js.native
    
    var noPlaceholder: js.UndefOr[Boolean] = js.native
    
    var refreshMode: js.UndefOr[throttle | debounce] = js.native
    
    var refreshRate: js.UndefOr[Double] = js.native
  }
  object SizeMeOptions {
    
    @scala.inline
    def apply(): SizeMeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeMeOptions]
    }
    
    @scala.inline
    implicit class SizeMeOptionsMutableBuilder[Self <: SizeMeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMonitorHeight(value: Boolean): Self = StObject.set(x, "monitorHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorHeightUndefined: Self = StObject.set(x, "monitorHeight", js.undefined)
      
      @scala.inline
      def setMonitorPosition(value: Boolean): Self = StObject.set(x, "monitorPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorPositionUndefined: Self = StObject.set(x, "monitorPosition", js.undefined)
      
      @scala.inline
      def setMonitorWidth(value: Boolean): Self = StObject.set(x, "monitorWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorWidthUndefined: Self = StObject.set(x, "monitorWidth", js.undefined)
      
      @scala.inline
      def setNoPlaceholder(value: Boolean): Self = StObject.set(x, "noPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPlaceholderUndefined: Self = StObject.set(x, "noPlaceholder", js.undefined)
      
      @scala.inline
      def setRefreshMode(value: throttle | debounce): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
      
      @scala.inline
      def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
    }
  }
  
  @js.native
  trait SizeMeProps extends StObject {
    
    val size: Height = js.native
  }
  object SizeMeProps {
    
    @scala.inline
    def apply(size: Height): SizeMeProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeMeProps]
    }
    
    @scala.inline
    implicit class SizeMePropsMutableBuilder[Self <: SizeMeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SizeMeRenderProps extends SizeMeOptions {
    
    def children(props: SizeMeProps): ReactElement = js.native
  }
  object SizeMeRenderProps {
    
    @scala.inline
    def apply(children: SizeMeProps => ReactElement): SizeMeRenderProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[SizeMeRenderProps]
    }
    
    @scala.inline
    implicit class SizeMeRenderPropsMutableBuilder[Self <: SizeMeRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: SizeMeProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  type WithSizeOnSizeCallback = js.Function1[/* size */ Height, Unit]
  
  @js.native
  trait WithSizeProps extends StObject {
    
    var onSize: js.UndefOr[WithSizeOnSizeCallback] = js.native
  }
  object WithSizeProps {
    
    @scala.inline
    def apply(): WithSizeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithSizeProps]
    }
    
    @scala.inline
    implicit class WithSizePropsMutableBuilder[Self <: WithSizeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnSize(value: /* size */ Height => Unit): Self = StObject.set(x, "onSize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSizeUndefined: Self = StObject.set(x, "onSize", js.undefined)
    }
  }
}
