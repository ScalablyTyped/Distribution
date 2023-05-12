package typings.reactSizeme

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactSizeme.anon.Height
import typings.reactSizeme.reactSizemeStrings.`object`
import typings.reactSizeme.reactSizemeStrings.debounce
import typings.reactSizeme.reactSizemeStrings.scroll
import typings.reactSizeme.reactSizemeStrings.size
import typings.reactSizeme.reactSizemeStrings.throttle
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) & WithSizeProps]
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) & WithSizeProps]
  ]]
  inline def apply(options: SizeMeOptions): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) & WithSizeProps]
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) & WithSizeProps]
  ]]
  
  @JSImport("react-sizeme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sizeme", "SizeMe")
  @js.native
  open class SizeMe protected ()
    extends Component[SizeMeRenderProps, js.Object, Any] {
    def this(props: SizeMeRenderProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: SizeMeRenderProps, context: Any) = this()
  }
  
  @JSImport("react-sizeme", "noPlaceholders")
  @js.native
  def noPlaceholders: Boolean = js.native
  inline def noPlaceholders_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noPlaceholders")(x.asInstanceOf[js.Any])
  
  inline def withSize(): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) & WithSizeProps]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSize")().asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) & WithSizeProps]
  ]]
  inline def withSize(options: SizeMeOptions): js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) & WithSizeProps]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[js.Object], 
    ComponentType[(Omit[js.Object, size]) & WithSizeProps]
  ]]
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait SizeMeOptions extends StObject {
    
    var monitorHeight: js.UndefOr[Boolean] = js.undefined
    
    var monitorWidth: js.UndefOr[Boolean] = js.undefined
    
    var noPlaceholder: js.UndefOr[Boolean] = js.undefined
    
    var refreshMode: js.UndefOr[throttle | debounce] = js.undefined
    
    var refreshRate: js.UndefOr[Double] = js.undefined
    
    var resizeDetectorStrategy: js.UndefOr[scroll | `object`] = js.undefined
  }
  object SizeMeOptions {
    
    inline def apply(): SizeMeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeMeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeMeOptions] (val x: Self) extends AnyVal {
      
      inline def setMonitorHeight(value: Boolean): Self = StObject.set(x, "monitorHeight", value.asInstanceOf[js.Any])
      
      inline def setMonitorHeightUndefined: Self = StObject.set(x, "monitorHeight", js.undefined)
      
      inline def setMonitorWidth(value: Boolean): Self = StObject.set(x, "monitorWidth", value.asInstanceOf[js.Any])
      
      inline def setMonitorWidthUndefined: Self = StObject.set(x, "monitorWidth", js.undefined)
      
      inline def setNoPlaceholder(value: Boolean): Self = StObject.set(x, "noPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setNoPlaceholderUndefined: Self = StObject.set(x, "noPlaceholder", js.undefined)
      
      inline def setRefreshMode(value: throttle | debounce): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
      
      inline def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
      
      inline def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
      
      inline def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
      
      inline def setResizeDetectorStrategy(value: scroll | `object`): Self = StObject.set(x, "resizeDetectorStrategy", value.asInstanceOf[js.Any])
      
      inline def setResizeDetectorStrategyUndefined: Self = StObject.set(x, "resizeDetectorStrategy", js.undefined)
    }
  }
  
  trait SizeMeProps extends StObject {
    
    val size: Height
  }
  object SizeMeProps {
    
    inline def apply(size: Height): SizeMeProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeMeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeMeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizeMeRenderProps
    extends StObject
       with SizeMeOptions {
    
    def children(props: SizeMeProps): ReactElement
  }
  object SizeMeRenderProps {
    
    inline def apply(children: SizeMeProps => ReactElement): SizeMeRenderProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[SizeMeRenderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeMeRenderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: SizeMeProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  type WithSizeOnSizeCallback = js.Function1[/* size */ Height, Unit]
  
  trait WithSizeProps extends StObject {
    
    var onSize: js.UndefOr[WithSizeOnSizeCallback] = js.undefined
  }
  object WithSizeProps {
    
    inline def apply(): WithSizeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithSizeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithSizeProps] (val x: Self) extends AnyVal {
      
      inline def setOnSize(value: /* size */ Height => Unit): Self = StObject.set(x, "onSize", js.Any.fromFunction1(value))
      
      inline def setOnSizeUndefined: Self = StObject.set(x, "onSize", js.undefined)
    }
  }
}
