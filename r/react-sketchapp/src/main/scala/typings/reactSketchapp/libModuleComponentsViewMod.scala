package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.reactSketchapp.anon.AlignContent
import typings.reactSketchapp.anon.AnimationType
import typings.reactSketchapp.anon.Bottom
import typings.reactSketchapp.anon.Name
import typings.reactSketchapp.anon.ShadowColor
import typings.reactSketchapp.anon.Shadows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsViewMod {
  
  @JSImport("react-sketchapp/lib/module/components/View", "View")
  @js.native
  open class View protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object View {
    
    @JSImport("react-sketchapp/lib/module/components/View", "View")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/View", "View.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/View", "View.propTypes")
    @js.native
    def propTypes: Shadows = js.native
    inline def propTypes_=(x: Shadows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object ViewPropTypes {
    
    @JSImport("react-sketchapp/lib/module/components/View", "ViewPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/View", "ViewPropTypes.children")
    @js.native
    def children: Requireable[ReactNodeLike] = js.native
    inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/View", "ViewPropTypes.flow")
    @js.native
    def flow: Requireable[InferProps[AnimationType]] = js.native
    inline def flow_=(x: Requireable[InferProps[AnimationType]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flow")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/View", "ViewPropTypes.name")
    @js.native
    def name: Requireable[String] = js.native
    inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/View", "ViewPropTypes.resizingConstraint")
    @js.native
    def resizingConstraint: Requireable[InferProps[Bottom]] = js.native
    inline def resizingConstraint_=(x: Requireable[InferProps[Bottom]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizingConstraint")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/View", "ViewPropTypes.shadows")
    @js.native
    def shadows: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]] = js.native
    inline def shadows_=(x: Requireable[js.Array[js.UndefOr[InferProps[ShadowColor] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shadows")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/View", "ViewPropTypes.style")
    @js.native
    def style: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]] = js.native
    inline def style_=(x: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[Shadows]
}
