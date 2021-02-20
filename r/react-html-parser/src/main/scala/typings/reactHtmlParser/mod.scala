package typings.reactHtmlParser

import typings.domhandler.mod.DomElement
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-html-parser", JSImport.Default)
  @js.native
  def default(html: String): js.Array[ReactElement] = js.native
  @JSImport("react-html-parser", JSImport.Default)
  @js.native
  def default(html: String, options: Options): js.Array[ReactElement] = js.native
  
  @JSImport("react-html-parser", "convertNodeToElement")
  @js.native
  def convertNodeToElement(node: DomElement, index: Double, transform: Transform): ReactElement = js.native
  
  @JSImport("react-html-parser", "processNodes")
  @js.native
  def processNodes(nodes: js.Array[DomElement], transform: Transform): js.Array[ReactElement] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var decodeEntities: js.UndefOr[Boolean] = js.native
    
    var preprocessNodes: js.UndefOr[js.Function1[/* nodes */ js.Array[DomElement], _]] = js.native
    
    var transform: js.UndefOr[Transform] = js.native
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
      def setPreprocessNodes(value: /* nodes */ js.Array[DomElement] => _): Self = StObject.set(x, "preprocessNodes", js.Any.fromFunction1(value))
      
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
