package typings.reactSvgMorph

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactSvgMorph.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-morph", "MorphReplace")
  @js.native
  open class MorphReplace protected () extends Component[MorphReplaceProps, ComponentState, Any] {
    def this(props: MorphReplaceProps) = this()
    def this(props: MorphReplaceProps, context: Any) = this()
  }
  @JSImport("react-svg-morph", "MorphReplace")
  @js.native
  val MorphReplace: ComponentClass[MorphReplaceProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-morph", "MorphReplaceResize")
  @js.native
  open class MorphReplaceResize protected () extends Component[MorphReplaceProps, ComponentState, Any] {
    def this(props: MorphReplaceProps) = this()
    def this(props: MorphReplaceProps, context: Any) = this()
  }
  @JSImport("react-svg-morph", "MorphReplaceResize")
  @js.native
  val MorphReplaceResize: ComponentClass[MorphReplaceProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-morph", "MorphTransition")
  @js.native
  open class MorphTransition protected () extends Component[MorphTransitionProps, ComponentState, Any] {
    def this(props: MorphTransitionProps) = this()
    def this(props: MorphTransitionProps, context: Any) = this()
  }
  @JSImport("react-svg-morph", "MorphTransition")
  @js.native
  val MorphTransition: ComponentClass[MorphTransitionProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-morph", "MorphTransitionResize")
  @js.native
  open class MorphTransitionResize protected () extends Component[MorphTransitionProps, ComponentState, Any] {
    def this(props: MorphTransitionProps) = this()
    def this(props: MorphTransitionProps, context: Any) = this()
  }
  @JSImport("react-svg-morph", "MorphTransitionResize")
  @js.native
  val MorphTransitionResize: ComponentClass[MorphTransitionProps, ComponentState] = js.native
  
  trait MorphReplaceProps extends StObject {
    
    var children: ReactElement
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* props */ Any, Double]] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var rotation: js.UndefOr[String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object MorphReplaceProps {
    
    inline def apply(children: ReactElement): MorphReplaceProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MorphReplaceProps]
    }
    
    extension [Self <: MorphReplaceProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* props */ Any => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MorphTransitionProps extends StObject {
    
    var children: From
    
    var height: js.UndefOr[Double] = js.undefined
    
    var propgress: js.UndefOr[Double] = js.undefined
    
    var rotation: js.UndefOr[String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object MorphTransitionProps {
    
    inline def apply(children: From): MorphTransitionProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MorphTransitionProps]
    }
    
    extension [Self <: MorphTransitionProps](x: Self) {
      
      inline def setChildren(value: From): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPropgress(value: Double): Self = StObject.set(x, "propgress", value.asInstanceOf[js.Any])
      
      inline def setPropgressUndefined: Self = StObject.set(x, "propgress", js.undefined)
      
      inline def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
