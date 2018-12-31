package typings
package riotLib.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMUtil extends js.Object {
  /**
    * Select a single node in the DOM
    * @param selector - unique dom selector
    * @param ctx - DOM node where the target of search will is located
    * @returns DOM node found
    */
  @JSName("$")
  def $(selector: java.lang.String): stdLib.Element | scala.Null = js.native
  @JSName("$")
  def $(selector: java.lang.String, ctx: stdLib.Element): stdLib.Element | scala.Null = js.native
  /**
    * Select multiple nodes in the DOM
    * @param selector - DOM selector
    * @param ctx - DOM node where the targets of our search will is located
    * @returns DOM nodes found
    */
  @JSName("$$")
  def $$(selector: java.lang.String): js.Array[stdLib.Element] = js.native
  @JSName("$$")
  def $$(selector: java.lang.String, ctx: stdLib.Element): js.Array[stdLib.Element] = js.native
  /**
    * Create a document text node
    * @returns Text node
    */
  def createDOMPlaceholder(): stdLib.Text = js.native
  /**
    * Create a document fragment
    * @returns Document fragment
    */
  def createFrag(): stdLib.DocumentFragment = js.native
  /**
    * Get the value of any DOM attribute on a node
    * @param element - DOM node
    * @param name - name of the attribute
    * @returns Attribute value
    */
  def getAttr(element: stdLib.Element, name: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Check if a DOM node is an svg element
    * @param element - node to check
    * @returns True if element is an svg element
    */
  def isSvg(element: stdLib.Element): /* is std.SVGElement */ scala.Boolean = js.native
  /**
    * Create a generic DOM node
    * @param name - name of the DOM node
    * @returns Created element
    */
  def mkEl(name: java.lang.String): stdLib.Element = js.native
  /**
    * Remove any DOM attribute from a node
    * @param element - DOM node to update
    * @param name - name of the attribute
    */
  def remAttr(element: stdLib.Element, name: java.lang.String): scala.Unit = js.native
  /**
    * Insert tag safely
    * @param root - children container
    * @param curr - node to insert
    * @param next - node that should precede inserted node
    */
  def safeInsert(root: stdLib.Node, curr: stdLib.Node, next: stdLib.Node): scala.Unit = js.native
  /**
    * Set any DOM attribute
    * @param element - DOM node we want to update
    * @param name - name of the property we want to set
    * @param value - value of the property we want to set
    */
  def setAttr(element: stdLib.Element, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Set the inner html of any DOM node SVGs included
    * @param container - DOM node where html should be injected
    * @param html - html to inject
    */
  def setInnerHTML(container: stdLib.Element, html: java.lang.String): scala.Unit = js.native
  /**
    * Convert a style object to a string
    * @param style - style object to parse
    * @returns Resulting css string
    */
  def styleObjectToString(style: js.Any): java.lang.String = js.native
  /**
    * Toggle the visibility of a DOM node
    * @param element - DOM node to update visibility for
    * @param show - If true element is shown
    */
  def toggleVisibility(element: stdLib.Element): scala.Unit = js.native
  def toggleVisibility(element: stdLib.Element, show: scala.Boolean): scala.Unit = js.native
  /**
    * Run callback function for each attribute in html string
    * @param html - html string we want to parse
    * @param fn - callback function to apply on found attributes
    */
  def walkAttrs(
    html: java.lang.String,
    fn: js.Function2[/* attrName */ java.lang.String, /* attrValue */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Walk down recursively through all child nodes starting with provided dom node
    * @param node - starting node where we will start the recursion
    * @param fn - callback to transform the child node just found
    * @param context - fn can optionally return an object, which is passed to children
    */
  def walkNodes(
    node: stdLib.Node,
    fn: js.Function2[/* node */ stdLib.Node, /* context */ js.Any, _],
    context: js.Any
  ): scala.Unit = js.native
}

