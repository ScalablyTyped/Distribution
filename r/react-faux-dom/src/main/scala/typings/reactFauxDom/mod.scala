package typings.reactFauxDom

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactFauxDom.reactFauxDomStrings.animateFauxDOM
import typings.reactFauxDom.reactFauxDomStrings.connectFauxDOM
import typings.reactFauxDom.reactFauxDomStrings.drawFauxDOM
import typings.reactFauxDom.reactFauxDomStrings.isAnimatingFauxDOM
import typings.reactFauxDom.reactFauxDomStrings.stopAnimatingFauxDOM
import typings.std.CSSStyleDeclaration
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-faux-dom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Element protected () extends HTMLElement {
    def this(nodeName: String) = this()
    def this(nodeName: String, parentNode: Element) = this()
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    /* CompleteClass */
    override var contentEditable: String = js.native
    /* CompleteClass */
    override var innerHTML: String = js.native
    /* CompleteClass */
    override var inputMode: String = js.native
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
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
    def toReact(): ReactElement = js.native
  }
  
  @js.native
  trait ReactFauxDomProps extends js.Object {
    def animateFauxDOM(duration: Double): Unit = js.native
    def connectFauxDOM(node: String, name: String): Element = js.native
    def connectFauxDOM(node: String, name: String, discardNode: js.Any): Element = js.native
    def drawFauxDOM(): Unit = js.native
    def isAnimatingFauxDOM(): Boolean = js.native
    def stopAnimatingFauxDOM(): Unit = js.native
  }
  
  def compareDocumentPosition(): Double = js.native
  def createElement(nodeName: String): Element = js.native
  def createElementNS(namespace: String, nodeName: String): Element = js.native
  def withFauxDOM[P](WrappedComponent: ComponentClass[P, ComponentState]): ComponentClass[
    Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        connectFauxDOM | drawFauxDOM | animateFauxDOM | stopAnimatingFauxDOM | isAnimatingFauxDOM
      ]
    ], 
    ComponentState
  ] = js.native
  @js.native
  object defaultView extends js.Object {
    def getComputedStyle(node: Element): AnonGetPropertyValue = js.native
  }
  
}

