package typings.reactFauxDom

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactFauxDom.anon.GetPropertyValue
import typings.reactFauxDom.reactFauxDomStrings.animateFauxDOM
import typings.reactFauxDom.reactFauxDomStrings.connectFauxDOM
import typings.reactFauxDom.reactFauxDomStrings.drawFauxDOM
import typings.reactFauxDom.reactFauxDomStrings.isAnimatingFauxDOM
import typings.reactFauxDom.reactFauxDomStrings.stopAnimatingFauxDOM
import typings.std.AddEventListenerOptions
import typings.std.CSSStyleDeclaration
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-faux-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-faux-dom", "Element")
  @js.native
  class Element protected ()
    extends StObject
       with HTMLElement {
    def this(nodeName: String) = this()
    def this(nodeName: String, parentNode: Element) = this()
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    /* CompleteClass */
    var contentEditable: String = js.native
    
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /* CompleteClass */
    var inputMode: String = js.native
    
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val nextElementSibling: typings.std.Element | Null = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      */
    /* CompleteClass */
    override val previousElementSibling: typings.std.Element | Null = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
    
    def toReact(): ReactElement = js.native
  }
  
  @scala.inline
  def compareDocumentPosition(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareDocumentPosition")().asInstanceOf[Double]
  
  @scala.inline
  def createElement(nodeName: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(nodeName.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def createElementNS(namespace: String, nodeName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementNS")(namespace.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  object defaultView {
    
    @JSImport("react-faux-dom", "defaultView")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getComputedStyle(node: Element): GetPropertyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(node.asInstanceOf[js.Any]).asInstanceOf[GetPropertyValue]
  }
  
  @scala.inline
  def withFauxDOM[P](WrappedComponent: ComponentClass[P, ComponentState]): ComponentClass[
    Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        /* keyof react-faux-dom.react-faux-dom.ReactFauxDomProps */ connectFauxDOM | drawFauxDOM | animateFauxDOM | stopAnimatingFauxDOM | isAnimatingFauxDOM
      ]
    ], 
    ComponentState
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFauxDOM")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[
    Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        /* keyof react-faux-dom.react-faux-dom.ReactFauxDomProps */ connectFauxDOM | drawFauxDOM | animateFauxDOM | stopAnimatingFauxDOM | isAnimatingFauxDOM
      ]
    ], 
    ComponentState
  ]]
  
  @js.native
  trait ReactFauxDomProps extends StObject {
    
    def animateFauxDOM(duration: Double): Unit = js.native
    
    def connectFauxDOM(node: String, name: String): Element = js.native
    def connectFauxDOM(node: String, name: String, discardNode: js.Any): Element = js.native
    
    def drawFauxDOM(): Unit = js.native
    
    def isAnimatingFauxDOM(): Boolean = js.native
    
    def stopAnimatingFauxDOM(): Unit = js.native
  }
}
