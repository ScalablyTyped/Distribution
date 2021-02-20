package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typings.stormReactDiagrams.linkModelMod.LinkModel
import typings.stormReactDiagrams.linkModelMod.LinkModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/LinkWidget", "LinkWidget")
  @js.native
  class LinkWidget protected () extends BaseWidget[LinkProps, LinkState] {
    def this(props: LinkProps) = this()
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MLinkWidget(): Boolean = js.native
  }
  
  @js.native
  trait LinkProps extends BaseWidgetProps {
    
    var children: js.UndefOr[js.Any] = js.native
    
    var diagramEngine: DiagramEngine = js.native
    
    var link: LinkModel[LinkModelListener] = js.native
  }
  object LinkProps {
    
    @scala.inline
    def apply(diagramEngine: DiagramEngine, link: LinkModel[LinkModelListener]): LinkProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: LinkModel[LinkModelListener]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinkState extends StObject
}
