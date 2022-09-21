package typings.reactNativeFlipCard

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-flip-card", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FlipCardProps, js.Object, Any]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-flip-card", "Back")
  @js.native
  open class Back protected () extends Component[BackProps, ComponentState, Any] {
    def this(props: BackProps) = this()
    def this(props: BackProps, context: Any) = this()
  }
  @JSImport("react-native-flip-card", "Back")
  @js.native
  val Back: ComponentClass[BackProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-flip-card", "Face")
  @js.native
  open class Face protected () extends Component[FaceProps, ComponentState, Any] {
    def this(props: FaceProps) = this()
    def this(props: FaceProps, context: Any) = this()
  }
  @JSImport("react-native-flip-card", "Face")
  @js.native
  val Face: ComponentClass[FaceProps, ComponentState] = js.native
  
  trait BackProps extends StObject {
    
    var chilren: js.Array[Element]
    
    var flipHorizontal: Boolean
    
    var flipVertical: Boolean
    
    var perspective: Double
  }
  object BackProps {
    
    inline def apply(chilren: js.Array[Element], flipHorizontal: Boolean, flipVertical: Boolean, perspective: Double): BackProps = {
      val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any], flipHorizontal = flipHorizontal.asInstanceOf[js.Any], flipVertical = flipVertical.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackProps]
    }
    
    extension [Self <: BackProps](x: Self) {
      
      inline def setChilren(value: js.Array[Element]): Self = StObject.set(x, "chilren", value.asInstanceOf[js.Any])
      
      inline def setChilrenVarargs(value: Element*): Self = StObject.set(x, "chilren", js.Array(value*))
      
      inline def setFlipHorizontal(value: Boolean): Self = StObject.set(x, "flipHorizontal", value.asInstanceOf[js.Any])
      
      inline def setFlipVertical(value: Boolean): Self = StObject.set(x, "flipVertical", value.asInstanceOf[js.Any])
      
      inline def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    }
  }
  
  trait FaceProps extends StObject {
    
    var chilren: js.Array[Element]
  }
  object FaceProps {
    
    inline def apply(chilren: js.Array[Element]): FaceProps = {
      val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaceProps]
    }
    
    extension [Self <: FaceProps](x: Self) {
      
      inline def setChilren(value: js.Array[Element]): Self = StObject.set(x, "chilren", value.asInstanceOf[js.Any])
      
      inline def setChilrenVarargs(value: Element*): Self = StObject.set(x, "chilren", js.Array(value*))
    }
  }
  
  type FlipCard = Component[FlipCardProps, js.Object, Any]
  
  trait FlipCardProps extends StObject {
    
    var alignHeight: js.UndefOr[Boolean] = js.undefined
    
    var alignWidth: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var flipHorizontal: js.UndefOr[Boolean] = js.undefined
    
    var flipVertical: js.UndefOr[Boolean] = js.undefined
    
    var friction: js.UndefOr[Double] = js.undefined
    
    var onFlipEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFlipStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var perspective: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  object FlipCardProps {
    
    inline def apply(): FlipCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlipCardProps]
    }
    
    extension [Self <: FlipCardProps](x: Self) {
      
      inline def setAlignHeight(value: Boolean): Self = StObject.set(x, "alignHeight", value.asInstanceOf[js.Any])
      
      inline def setAlignHeightUndefined: Self = StObject.set(x, "alignHeight", js.undefined)
      
      inline def setAlignWidth(value: Boolean): Self = StObject.set(x, "alignWidth", value.asInstanceOf[js.Any])
      
      inline def setAlignWidthUndefined: Self = StObject.set(x, "alignWidth", js.undefined)
      
      inline def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipHorizontal(value: Boolean): Self = StObject.set(x, "flipHorizontal", value.asInstanceOf[js.Any])
      
      inline def setFlipHorizontalUndefined: Self = StObject.set(x, "flipHorizontal", js.undefined)
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFlipVertical(value: Boolean): Self = StObject.set(x, "flipVertical", value.asInstanceOf[js.Any])
      
      inline def setFlipVerticalUndefined: Self = StObject.set(x, "flipVertical", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setOnFlipEnd(value: () => Unit): Self = StObject.set(x, "onFlipEnd", js.Any.fromFunction0(value))
      
      inline def setOnFlipEndUndefined: Self = StObject.set(x, "onFlipEnd", js.undefined)
      
      inline def setOnFlipStart(value: () => Unit): Self = StObject.set(x, "onFlipStart", js.Any.fromFunction0(value))
      
      inline def setOnFlipStartUndefined: Self = StObject.set(x, "onFlipStart", js.undefined)
      
      inline def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
}
