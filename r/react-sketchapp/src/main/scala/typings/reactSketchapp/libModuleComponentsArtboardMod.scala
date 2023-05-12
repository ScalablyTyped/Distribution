package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.reactSketchapp.anon.AlignContent
import typings.reactSketchapp.anon.Children
import typings.reactSketchapp.anon.FontScale
import typings.reactSketchapp.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsArtboardMod {
  
  @JSImport("react-sketchapp/lib/module/components/Artboard", "Artboard")
  @js.native
  open class Artboard protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Artboard {
    
    @JSImport("react-sketchapp/lib/module/components/Artboard", "Artboard")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Artboard", "Artboard.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Artboard", "Artboard.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object ArtboardPropTypes {
    
    @JSImport("react-sketchapp/lib/module/components/Artboard", "ArtboardPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Artboard", "ArtboardPropTypes.children")
    @js.native
    def children: Requireable[ReactNodeLike] = js.native
    inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Artboard", "ArtboardPropTypes.isHome")
    @js.native
    def isHome: Requireable[Boolean] = js.native
    inline def isHome_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isHome")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Artboard", "ArtboardPropTypes.name")
    @js.native
    def name: Requireable[String] = js.native
    inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Artboard", "ArtboardPropTypes.style")
    @js.native
    def style: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]] = js.native
    inline def style_=(x: Requireable[js.UndefOr[Double | InferProps[AlignContent] | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Artboard", "ArtboardPropTypes.viewport")
    @js.native
    def viewport: Requireable[InferProps[FontScale]] = js.native
    inline def viewport_=(x: Requireable[InferProps[FontScale]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("viewport")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[Children]
}
