package typings.senchaTouch.Ext.dom

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.dom.Element")
@js.native
class Element () extends js.Object

/* static members */
@JSGlobal("Ext.dom.Element")
@js.native
object Element extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(): Unit = js.native
  def addMembers(members: js.Any): Unit = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(): IBase = js.native
  def addStatics(members: js.Any): IBase = js.native
  /** [Method]
  		* @param args Object
  		*/
  def callParent(): Unit = js.native
  def callParent(args: js.Any): Unit = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): Unit = js.native
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  /** [Method] Gets the globally shared flyweight Element with the passed node as the active element
  		* @param element String/HTMLElement The DOM node or id.
  		* @param named String Allows for creation of named reusable flyweights to prevent conflicts (e.g. internally Ext uses "_global").
  		* @returns Ext.dom.Element The shared Element object (or null if no matching element was found).
  		*/
  def fly(): IElement = js.native
  def fly(element: js.Any): IElement = js.native
  def fly(element: js.Any, named: String): IElement = js.native
  /** [Method] Returns the top Element that is located at the passed coordinates
  		* @param x Number The x coordinate
  		* @param y Number The y coordinate
  		* @returns String The found Element
  		*/
  def fromPoint(): String = js.native
  def fromPoint(x: Double): String = js.native
  def fromPoint(x: Double, y: Double): String = js.native
  /** [Method] Retrieves Ext dom Element objects
  		* @param element String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element The Element object (or null if no matching element was found).
  		*/
  def get(): IElement = js.native
  def get(element: js.Any): IElement = js.native
  /** [Method] Retrieves the document height
  		* @returns Number documentHeight
  		*/
  def getDocumentHeight(): Double = js.native
  /** [Method] Retrieves the document width
  		* @returns Number documentWidth
  		*/
  def getDocumentWidth(): Double = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): String = js.native
  /** [Method] Retrieves the current orientation of the window
  		* @returns String Orientation of window: 'portrait' or 'landscape'
  		*/
  def getOrientation(): String = js.native
  /** [Method] Retrieves the viewport size of the window
  		* @returns Object object containing width and height properties
  		*/
  def getViewSize(): js.Any = js.native
  /** [Method] Retrieves the viewport height of the window
  		* @returns Number viewportHeight
  		*/
  def getViewportHeight(): Double = js.native
  /** [Method] Retrieves the viewport width of the window
  		* @returns Number viewportWidth
  		*/
  def getViewportWidth(): Double = js.native
  /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
  		* @param prop String The property to normalize
  		* @returns String The normalized string
  		*/
  def normalize(): String = js.native
  def normalize(prop: String): String = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
  /** [Method] Parses a number or string representing margin sizes into an object
  		* @param box Number/String The encoded margins
  		* @returns Object An object with margin sizes for top, right, bottom and left containing the unit
  		*/
  def parseBox(): js.Any = js.native
  def parseBox(box: js.Any): js.Any = js.native
  /** [Method] Converts a CSS string into an object with a property for each style
  		* @param styles String A CSS string
  		* @returns Object styles
  		*/
  def parseStyles(): js.Any = js.native
  def parseStyles(styles: String): js.Any = js.native
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
  		* @param selector String/HTMLElement[] The CSS selector or an array of elements
  		* @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
  		* @param root HTMLElement/String The root element of the query or id of the root
  		* @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
  		*/
  def select(): ICompositeElementLite = js.native
  def select(selector: js.Any): ICompositeElementLite = js.native
  def select(selector: js.Any, composite: Boolean): ICompositeElementLite = js.native
  def select(selector: js.Any, composite: Boolean, root: js.Any): ICompositeElementLite = js.native
  /** [Method] Serializes a DOM form into a url encoded string
  		* @param form Object The form
  		* @returns String The url encoded form
  		*/
  def serializeForm(): String = js.native
  def serializeForm(form: js.Any): String = js.native
  /** [Method] Serializes a DOM element and its children recursively into a string
  		* @param node Object DOM element to serialize.
  		* @returns String
  		*/
  def serializeNode(): String = js.native
  def serializeNode(node: js.Any): String = js.native
  /** [Method] Parses a number or string representing margin sizes into an object
  		* @param box Number/String The encoded margins
  		* @param units String The type of units to add
  		* @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
  		*/
  def unitizeBox(): String = js.native
  def unitizeBox(box: js.Any): String = js.native
  def unitizeBox(box: js.Any, units: String): String = js.native
}

