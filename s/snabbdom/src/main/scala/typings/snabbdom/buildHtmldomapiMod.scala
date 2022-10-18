package typings.snabbdom

import typings.std.ChildNode
import typings.std.Comment
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.ElementCreationOptions
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildHtmldomapiMod {
  
  @JSImport("snabbdom/build/htmldomapi", "htmlDomApi")
  @js.native
  val htmlDomApi: DOMAPI = js.native
  
  @js.native
  trait DOMAPI extends StObject {
    
    def appendChild(node: Node, child: Node): Unit = js.native
    
    def createComment(text: String): Comment = js.native
    
    /**
      * @experimental
      * @todo Make it required when the fragment is considered stable.
      */
    var createDocumentFragment: js.UndefOr[js.Function0[SnabbdomFragment]] = js.native
    
    def createElement(tagName: Any): HTMLElement = js.native
    def createElement(tagName: Any, options: ElementCreationOptions): HTMLElement = js.native
    
    def createElementNS(namespaceURI: String, qualifiedName: String): Element = js.native
    def createElementNS(namespaceURI: String, qualifiedName: String, options: ElementCreationOptions): Element = js.native
    
    def createTextNode(text: String): Text = js.native
    
    def getTextContent(node: Node): String | Null = js.native
    
    def insertBefore(parentNode: Node, newNode: Node): Unit = js.native
    def insertBefore(parentNode: Node, newNode: Node, referenceNode: Node): Unit = js.native
    
    def isComment(node: Node): /* is std.Comment */ Boolean = js.native
    
    /**
      * @experimental
      * @todo Make it required when the fragment is considered stable.
      */
    var isDocumentFragment: js.UndefOr[js.Function1[/* node */ Node, /* is std.DocumentFragment */ Boolean]] = js.native
    
    def isElement(node: Node): /* is std.Element */ Boolean = js.native
    
    def isText(node: Node): /* is std.Text */ Boolean = js.native
    
    def nextSibling(node: Node): Node | Null = js.native
    
    def parentNode(node: Node): Node | Null = js.native
    
    def removeChild(node: Node, child: Node): Unit = js.native
    
    def setTextContent(node: Node): Unit = js.native
    def setTextContent(node: Node, text: String): Unit = js.native
    
    def tagName(elm: Element): String = js.native
  }
  
  @js.native
  trait SnabbdomFragment
    extends StObject
       with DocumentFragment {
    
    var firstChildNode: ChildNode | Null = js.native
    
    var lastChildNode: ChildNode | Null = js.native
    
    var parent: Node | Null = js.native
  }
}
