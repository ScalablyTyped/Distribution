package typings.reactSvgMorph

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactSvgMorph.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-morph", "MorphReplace")
  @js.native
  class MorphReplace protected ()
    extends Component[MorphReplaceProps, ComponentState, js.Any] {
    def this(props: MorphReplaceProps) = this()
    def this(props: MorphReplaceProps, context: js.Any) = this()
  }
  @JSImport("react-svg-morph", "MorphReplace")
  @js.native
  val MorphReplace: ComponentClass[MorphReplaceProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-morph", "MorphReplaceResize")
  @js.native
  class MorphReplaceResize protected ()
    extends Component[MorphReplaceProps, ComponentState, js.Any] {
    def this(props: MorphReplaceProps) = this()
    def this(props: MorphReplaceProps, context: js.Any) = this()
  }
  @JSImport("react-svg-morph", "MorphReplaceResize")
  @js.native
  val MorphReplaceResize: ComponentClass[MorphReplaceProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-morph", "MorphTransition")
  @js.native
  class MorphTransition protected ()
    extends Component[MorphTransitionProps, ComponentState, js.Any] {
    def this(props: MorphTransitionProps) = this()
    def this(props: MorphTransitionProps, context: js.Any) = this()
  }
  @JSImport("react-svg-morph", "MorphTransition")
  @js.native
  val MorphTransition: ComponentClass[MorphTransitionProps, ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-svg-morph", "MorphTransitionResize")
  @js.native
  class MorphTransitionResize protected ()
    extends Component[MorphTransitionProps, ComponentState, js.Any] {
    def this(props: MorphTransitionProps) = this()
    def this(props: MorphTransitionProps, context: js.Any) = this()
  }
  @JSImport("react-svg-morph", "MorphTransitionResize")
  @js.native
  val MorphTransitionResize: ComponentClass[MorphTransitionProps, ComponentState] = js.native
  
  @js.native
  trait MorphReplaceProps extends StObject {
    
    var children: ReactElement = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[js.Function1[/* props */ js.Any, Double]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var preserveAspectRatio: js.UndefOr[String] = js.native
    
    var rotation: js.UndefOr[String] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object MorphReplaceProps {
    
    @scala.inline
    def apply(children: ReactElement): MorphReplaceProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MorphReplaceProps]
    }
    
    @scala.inline
    implicit class MorphReplacePropsMutableBuilder[Self <: MorphReplaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: /* props */ js.Any => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait MorphTransitionProps extends StObject {
    
    var children: From = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var propgress: js.UndefOr[Double] = js.native
    
    var rotation: js.UndefOr[String] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object MorphTransitionProps {
    
    @scala.inline
    def apply(children: From): MorphTransitionProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[MorphTransitionProps]
    }
    
    @scala.inline
    implicit class MorphTransitionPropsMutableBuilder[Self <: MorphTransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: From): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPropgress(value: Double): Self = StObject.set(x, "propgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropgressUndefined: Self = StObject.set(x, "propgress", js.undefined)
      
      @scala.inline
      def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
