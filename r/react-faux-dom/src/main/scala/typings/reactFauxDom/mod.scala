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
import typings.std.StylePropertyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-faux-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-faux-dom", "Element")
  @js.native
  open class Element protected ()
    extends StObject
       with HTMLElement {
    def this(nodeName: String) = this()
    def this(nodeName: String, parentNode: Element) = this()
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAtomic) */
    /* standard dom */
    /* CompleteClass */
    var ariaAtomic: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAutoComplete) */
    /* standard dom */
    /* CompleteClass */
    var ariaAutoComplete: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBusy) */
    /* standard dom */
    /* CompleteClass */
    var ariaBusy: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaChecked) */
    /* standard dom */
    /* CompleteClass */
    var ariaChecked: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColCount) */
    /* standard dom */
    /* CompleteClass */
    var ariaColCount: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColIndex) */
    /* standard dom */
    /* CompleteClass */
    var ariaColIndex: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColSpan) */
    /* standard dom */
    /* CompleteClass */
    var ariaColSpan: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaCurrent) */
    /* standard dom */
    /* CompleteClass */
    var ariaCurrent: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDisabled) */
    /* standard dom */
    /* CompleteClass */
    var ariaDisabled: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaExpanded) */
    /* standard dom */
    /* CompleteClass */
    var ariaExpanded: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHasPopup) */
    /* standard dom */
    /* CompleteClass */
    var ariaHasPopup: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHidden) */
    /* standard dom */
    /* CompleteClass */
    var ariaHidden: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaInvalid: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaKeyShortcuts) */
    /* standard dom */
    /* CompleteClass */
    var ariaKeyShortcuts: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLabel) */
    /* standard dom */
    /* CompleteClass */
    var ariaLabel: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLevel) */
    /* standard dom */
    /* CompleteClass */
    var ariaLevel: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLive) */
    /* standard dom */
    /* CompleteClass */
    var ariaLive: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaModal) */
    /* standard dom */
    /* CompleteClass */
    var ariaModal: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiLine) */
    /* standard dom */
    /* CompleteClass */
    var ariaMultiLine: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiSelectable) */
    /* standard dom */
    /* CompleteClass */
    var ariaMultiSelectable: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaOrientation) */
    /* standard dom */
    /* CompleteClass */
    var ariaOrientation: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPlaceholder) */
    /* standard dom */
    /* CompleteClass */
    var ariaPlaceholder: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPosInSet) */
    /* standard dom */
    /* CompleteClass */
    var ariaPosInSet: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPressed) */
    /* standard dom */
    /* CompleteClass */
    var ariaPressed: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaReadOnly) */
    /* standard dom */
    /* CompleteClass */
    var ariaReadOnly: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRequired) */
    /* standard dom */
    /* CompleteClass */
    var ariaRequired: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRoleDescription) */
    /* standard dom */
    /* CompleteClass */
    var ariaRoleDescription: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowCount) */
    /* standard dom */
    /* CompleteClass */
    var ariaRowCount: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowIndex) */
    /* standard dom */
    /* CompleteClass */
    var ariaRowIndex: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowSpan) */
    /* standard dom */
    /* CompleteClass */
    var ariaRowSpan: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSelected) */
    /* standard dom */
    /* CompleteClass */
    var ariaSelected: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSetSize) */
    /* standard dom */
    /* CompleteClass */
    var ariaSetSize: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSort) */
    /* standard dom */
    /* CompleteClass */
    var ariaSort: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueMax) */
    /* standard dom */
    /* CompleteClass */
    var ariaValueMax: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueMin) */
    /* standard dom */
    /* CompleteClass */
    var ariaValueMin: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueNow) */
    /* standard dom */
    /* CompleteClass */
    var ariaValueNow: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueText) */
    /* standard dom */
    /* CompleteClass */
    var ariaValueText: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/assignedSlot) */
    /* standard dom */
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val attributeStyleMap: StylePropertyMap = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/contentEditable) */
    /* standard dom */
    /* CompleteClass */
    var contentEditable: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/enterKeyHint) */
    /* standard dom */
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/innerHTML) */
    /* standard dom */
    /* CompleteClass */
    var innerHTML: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode) */
    /* standard dom */
    /* CompleteClass */
    var inputMode: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/isContentEditable) */
    /* standard dom */
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/nextElementSibling)
      */
    /* standard dom */
    /* CompleteClass */
    override val nextElementSibling: typings.std.Element | Null = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/previousElementSibling)
      */
    /* standard dom */
    /* CompleteClass */
    override val previousElementSibling: typings.std.Element | Null = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* CompleteClass */
    var role: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/style) */
    /* standard dom */
    /* CompleteClass */
    override val style: CSSStyleDeclaration = js.native
    
    def toReact(): ReactElement = js.native
  }
  
  inline def compareDocumentPosition(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compareDocumentPosition")().asInstanceOf[Double]
  
  inline def createElement(nodeName: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(nodeName.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createElementNS(namespace: String, nodeName: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElementNS")(namespace.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  object defaultView {
    
    @JSImport("react-faux-dom", "defaultView")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getComputedStyle(node: Element): GetPropertyValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputedStyle")(node.asInstanceOf[js.Any]).asInstanceOf[GetPropertyValue]
  }
  
  inline def withFauxDOM[P](WrappedComponent: ComponentClass[P, ComponentState]): ComponentClass[
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
    def connectFauxDOM(node: String, name: String, discardNode: Any): Element = js.native
    
    def drawFauxDOM(): Unit = js.native
    
    def isAnimatingFauxDOM(): Boolean = js.native
    
    def stopAnimatingFauxDOM(): Unit = js.native
  }
}
