package typings.reactHtmlParser

import typings.domhandler.mod.DomElement
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-html-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(html: String): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactElement]]
  @scala.inline
  def default(html: String, options: Options): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  
  @scala.inline
  def convertNodeToElement(node: DomElement, index: Double, transform: Transform): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("convertNodeToElement")(node.asInstanceOf[js.Any], index.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  @scala.inline
  def processNodes(nodes: js.Array[DomElement], transform: Transform): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("processNodes")(nodes.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  
  trait Options extends StObject {
    
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    var preprocessNodes: js.UndefOr[js.Function1[/* nodes */ js.Array[DomElement], js.Any]] = js.undefined
    
    var transform: js.UndefOr[Transform] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      @scala.inline
      def setPreprocessNodes(value: /* nodes */ js.Array[DomElement] => js.Any): Self = StObject.set(x, "preprocessNodes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreprocessNodesUndefined: Self = StObject.set(x, "preprocessNodes", js.undefined)
      
      @scala.inline
      def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait Transform extends StObject {
    
    def apply(node: DomElement, index: Double): ReactElement | Unit | Null = js.native
    def apply(node: DomElement, index: Double, transform: Transform): ReactElement | Unit | Null = js.native
  }
}
