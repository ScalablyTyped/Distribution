package typings.reactSketchapp

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.reactSketchapp.anon.ChildrenRequireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleComponentsDocumentMod {
  
  @JSImport("react-sketchapp/lib/module/components/Document", "Document")
  @js.native
  open class Document protected ()
    extends Component[Props, js.Object, Any] {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Document {
    
    @JSImport("react-sketchapp/lib/module/components/Document", "Document")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Document", "Document.propTypes")
    @js.native
    def propTypes: ChildrenRequireable = js.native
    inline def propTypes_=(x: ChildrenRequireable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object DocumentPropTypes {
    
    @JSImport("react-sketchapp/lib/module/components/Document", "DocumentPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/module/components/Document", "DocumentPropTypes.children")
    @js.native
    def children: Requireable[ReactNodeLike] = js.native
    inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
  }
  
  type Props = InferProps[ChildrenRequireable]
}
