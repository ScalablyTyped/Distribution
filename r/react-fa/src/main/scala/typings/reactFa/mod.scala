package typings.reactFa

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLProps
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-fa", JSImport.Default)
  @js.native
  val default: ComponentClass[IconProps, ComponentState] = js.native
  
  @JSImport("react-fa", "Icon")
  @js.native
  val Icon: ComponentClass[IconProps, ComponentState] = js.native
  type Icon = Component[IconProps, js.Object, Any]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-fa", "Icon")
  @js.native
  open class IconCls protected () extends Component[IconProps, ComponentState, Any] {
    def this(props: IconProps) = this()
    def this(props: IconProps, context: Any) = this()
  }
  
  @JSImport("react-fa", "IconStack")
  @js.native
  val IconStack: ComponentClass[IconStackProps, ComponentState] = js.native
  type IconStack = Component[IconStackProps, js.Object, Any]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-fa", "IconStack")
  @js.native
  open class IconStackCls protected () extends Component[IconStackProps, ComponentState, Any] {
    def this(props: IconStackProps) = this()
    def this(props: IconStackProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-fa", JSImport.Default)
  @js.native
  open class defaultCls protected () extends Component[IconProps, ComponentState, Any] {
    def this(props: IconProps) = this()
    def this(props: IconProps, context: Any) = this()
  }
  
  type CustomComponent = String | (ComponentClass[Any, ComponentState]) | FunctionComponent[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFa.reactFaStrings.horizontal
    - typings.reactFa.reactFaStrings.vertical
  */
  trait IconFlip extends StObject
  object IconFlip {
    
    inline def horizontal: typings.reactFa.reactFaStrings.horizontal = "horizontal".asInstanceOf[typings.reactFa.reactFaStrings.horizontal]
    
    inline def vertical: typings.reactFa.reactFaStrings.vertical = "vertical".asInstanceOf[typings.reactFa.reactFaStrings.vertical]
  }
  
  trait IconProps
    extends StObject
       with SizeOverrideHTMLProps[typings.reactFa.mod.Icon] {
    
    var Component: js.UndefOr[CustomComponent] = js.undefined
    
    var fixedWidth: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[IconFlip] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    @JSName("name")
    var name_IconProps: String
    
    var pulse: js.UndefOr[Boolean] = js.undefined
    
    var rotate: js.UndefOr[IconRotation] = js.undefined
    
    @JSName("size")
    var size_IconProps: js.UndefOr[IconSize] = js.undefined
    
    var spin: js.UndefOr[Boolean] = js.undefined
    
    var stack: js.UndefOr[IconStackSize] = js.undefined
  }
  object IconProps {
    
    inline def apply(name: String): IconProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setComponent(value: CustomComponent): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      inline def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      inline def setFlip(value: IconFlip): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPulse(value: Boolean): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
      
      inline def setPulseUndefined: Self = StObject.set(x, "pulse", js.undefined)
      
      inline def setRotate(value: IconRotation): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSize(value: IconSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      inline def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      inline def setStack(value: IconStackSize): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFa.reactFaStrings.`45`
    - typings.reactFa.reactFaStrings.`90`
    - typings.reactFa.reactFaStrings.`135`
    - typings.reactFa.reactFaStrings.`180`
    - typings.reactFa.reactFaStrings.`225`
    - typings.reactFa.reactFaStrings.`270`
    - typings.reactFa.reactFaStrings.`315`
  */
  trait IconRotation extends StObject
  object IconRotation {
    
    inline def `135`: typings.reactFa.reactFaStrings.`135` = "135".asInstanceOf[typings.reactFa.reactFaStrings.`135`]
    
    inline def `180`: typings.reactFa.reactFaStrings.`180` = "180".asInstanceOf[typings.reactFa.reactFaStrings.`180`]
    
    inline def `225`: typings.reactFa.reactFaStrings.`225` = "225".asInstanceOf[typings.reactFa.reactFaStrings.`225`]
    
    inline def `270`: typings.reactFa.reactFaStrings.`270` = "270".asInstanceOf[typings.reactFa.reactFaStrings.`270`]
    
    inline def `315`: typings.reactFa.reactFaStrings.`315` = "315".asInstanceOf[typings.reactFa.reactFaStrings.`315`]
    
    inline def `45`: typings.reactFa.reactFaStrings.`45` = "45".asInstanceOf[typings.reactFa.reactFaStrings.`45`]
    
    inline def `90`: typings.reactFa.reactFaStrings.`90` = "90".asInstanceOf[typings.reactFa.reactFaStrings.`90`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFa.reactFaStrings.lg
    - typings.reactFa.reactFaStrings.`2x`
    - typings.reactFa.reactFaStrings.`3x`
    - typings.reactFa.reactFaStrings.`4x`
    - typings.reactFa.reactFaStrings.`5x`
  */
  trait IconSize extends StObject
  object IconSize {
    
    inline def `2x`: typings.reactFa.reactFaStrings.`2x` = "2x".asInstanceOf[typings.reactFa.reactFaStrings.`2x`]
    
    inline def `3x`: typings.reactFa.reactFaStrings.`3x` = "3x".asInstanceOf[typings.reactFa.reactFaStrings.`3x`]
    
    inline def `4x`: typings.reactFa.reactFaStrings.`4x` = "4x".asInstanceOf[typings.reactFa.reactFaStrings.`4x`]
    
    inline def `5x`: typings.reactFa.reactFaStrings.`5x` = "5x".asInstanceOf[typings.reactFa.reactFaStrings.`5x`]
    
    inline def lg: typings.reactFa.reactFaStrings.lg = "lg".asInstanceOf[typings.reactFa.reactFaStrings.lg]
  }
  
  trait IconStackProps
    extends StObject
       with SizeOverrideHTMLProps[typings.reactFa.mod.IconStack] {
    
    @JSName("children")
    var children_IconStackProps: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
    
    @JSName("size")
    var size_IconStackProps: js.UndefOr[IconSize] = js.undefined
  }
  object IconStackProps {
    
    inline def apply(): IconStackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconStackProps]
    }
    
    extension [Self <: IconStackProps](x: Self) {
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setSize(value: IconSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFa.reactFaStrings.`1x`
    - typings.reactFa.reactFaStrings.`2x`
  */
  trait IconStackSize extends StObject
  object IconStackSize {
    
    inline def `1x`: typings.reactFa.reactFaStrings.`1x` = "1x".asInstanceOf[typings.reactFa.reactFaStrings.`1x`]
    
    inline def `2x`: typings.reactFa.reactFaStrings.`2x` = "2x".asInstanceOf[typings.reactFa.reactFaStrings.`2x`]
  }
  
  // fake intermediate interface to remove typing on size, as the typing
  // is overrided by react-fa
  trait SizeOverrideHTMLProps[T]
    extends StObject
       with HTMLProps[T] {
    
    @JSName("size")
    var size_SizeOverrideHTMLProps: js.UndefOr[Any] = js.undefined
  }
  object SizeOverrideHTMLProps {
    
    inline def apply[T](): SizeOverrideHTMLProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeOverrideHTMLProps[T]]
    }
    
    extension [Self <: SizeOverrideHTMLProps[?], T](x: Self & SizeOverrideHTMLProps[T]) {
      
      inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ComponentClass[IconProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[IconProps, ComponentState] = default
}
