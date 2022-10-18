package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.reactSketchapp.anon.AlignSelf
import typings.reactSketchapp.anon.AnimationType
import typings.reactSketchapp.anon.Bottom
import typings.reactSketchapp.anon.ResizingConstraint
import typings.reactSketchapp.anon.ShadowColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsTextMod {
  
  @JSImport("react-sketchapp/lib/module/components/Text", "Text")
  @js.native
  open class Text protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Text {
    
    @JSImport("react-sketchapp/lib/module/components/Text", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Text", "Text.propTypes")
    @js.native
    def propTypes: ResizingConstraint = js.native
    inline def propTypes_=(x: ResizingConstraint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object TextPropTypes {
    
    @JSImport("react-sketchapp/lib/module/components/Text", "TextPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Text", "TextPropTypes.children")
    @js.native
    def children: Requireable[ReactNodeLike] = js.native
    inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Text", "TextPropTypes.flow")
    @js.native
    def flow: Requireable[InferProps[AnimationType]] = js.native
    inline def flow_=(x: Requireable[InferProps[AnimationType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flow")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Text", "TextPropTypes.name")
    @js.native
    def name: Requireable[String] = js.native
    inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Text", "TextPropTypes.resizingConstraint")
    @js.native
    def resizingConstraint: Requireable[InferProps[Bottom]] = js.native
    inline def resizingConstraint_=(x: Requireable[InferProps[Bottom]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizingConstraint")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Text", "TextPropTypes.shadows")
    @js.native
    def shadows: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]] = js.native
    inline def shadows_=(x: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadows")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Text", "TextPropTypes.style")
    @js.native
    def style: Requireable[js.UndefOr[Double | InferProps[AlignSelf] | Null]] = js.native
    inline def style_=(x: Requireable[js.UndefOr[Double | InferProps[AlignSelf] | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[ResizingConstraint]
}
