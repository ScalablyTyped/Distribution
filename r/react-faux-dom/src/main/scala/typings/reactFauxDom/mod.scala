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
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-faux-dom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def compareDocumentPosition(): Double = js.native
  
  def createElement(nodeName: String): Element = js.native
  
  def createElementNS(namespace: String, nodeName: String): Element = js.native
  
  def withFauxDOM[P](WrappedComponent: ComponentClass[P, ComponentState]): ComponentClass[
    Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        /* keyof react-faux-dom.react-faux-dom.ReactFauxDomProps */ connectFauxDOM | drawFauxDOM | animateFauxDOM | stopAnimatingFauxDOM | isAnimatingFauxDOM
      ]
    ], 
    ComponentState
  ] = js.native
  
  @js.native
  class Element protected () extends HTMLElement {
    def this(nodeName: String) = this()
    def this(nodeName: String, parentNode: Element) = this()
    
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
  
  @js.native
  object defaultView extends js.Object {
    
    def getComputedStyle(node: Element): GetPropertyValue = js.native
  }
}
