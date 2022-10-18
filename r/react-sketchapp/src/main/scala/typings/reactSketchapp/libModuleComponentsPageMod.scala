package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.reactSketchapp.anon.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsPageMod {
  
  @JSImport("react-sketchapp/lib/module/components/Page", "Page")
  @js.native
  open class Page protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Page {
    
    @JSImport("react-sketchapp/lib/module/components/Page", "Page")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Page", "Page.propTypes")
    @js.native
    def propTypes: Style = js.native
    inline def propTypes_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object PagePropTypes {
    
    @JSImport("react-sketchapp/lib/module/components/Page", "PagePropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Page", "PagePropTypes.children")
    @js.native
    def children: Requireable[ReactNodeLike] = js.native
    inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Page", "PagePropTypes.name")
    @js.native
    def name: Requireable[String] = js.native
    inline def name_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/module/components/Page", "PagePropTypes.style")
    @js.native
    def style: Requireable[js.UndefOr[Double | InferProps[js.Object] | Null]] = js.native
    inline def style_=(x: Requireable[js.UndefOr[Double | InferProps[js.Object] | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[Style]
}
