package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Element")
@js.native
class Element () extends js.Object

/* static members */
@JSGlobal("Ext.Element")
@js.native
object Element extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(): scala.Unit = js.native
  def addMembers(members: js.Any): scala.Unit = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(): senchaUnderscoreTouchLib.ExtNs.IBase = js.native
  def addStatics(members: js.Any): senchaUnderscoreTouchLib.ExtNs.IBase = js.native
  /** [Method]
  		* @param args Object
  		*/
  def callParent(): scala.Unit = js.native
  def callParent(args: js.Any): scala.Unit = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): scala.Unit = js.native
  def createAlias(alias: js.Any): scala.Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): scala.Unit = js.native
  /** [Method] Gets the globally shared flyweight Element with the passed node as the active element
  		* @param element String/HTMLElement The DOM node or id.
  		* @param named String Allows for creation of named reusable flyweights to prevent conflicts (e.g. internally Ext uses "_global").
  		* @returns Ext.dom.Element The shared Element object (or null if no matching element was found).
  		*/
  def fly(): senchaUnderscoreTouchLib.ExtNs.domNs.IElement = js.native
  def fly(element: js.Any): senchaUnderscoreTouchLib.ExtNs.domNs.IElement = js.native
  def fly(element: js.Any, named: java.lang.String): senchaUnderscoreTouchLib.ExtNs.domNs.IElement = js.native
  /** [Method] Returns the top Element that is located at the passed coordinates
  		* @param x Number The x coordinate
  		* @param y Number The y coordinate
  		* @returns String The found Element
  		*/
  def fromPoint(): java.lang.String = js.native
  def fromPoint(x: scala.Double): java.lang.String = js.native
  def fromPoint(x: scala.Double, y: scala.Double): java.lang.String = js.native
  /** [Method] Retrieves Ext dom Element objects
  		* @param element String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element The Element object (or null if no matching element was found).
  		*/
  def get(): senchaUnderscoreTouchLib.ExtNs.domNs.IElement = js.native
  def get(element: js.Any): senchaUnderscoreTouchLib.ExtNs.domNs.IElement = js.native
  /** [Method] Retrieves the document height
  		* @returns Number documentHeight
  		*/
  def getDocumentHeight(): scala.Double = js.native
  /** [Method] Retrieves the document width
  		* @returns Number documentWidth
  		*/
  def getDocumentWidth(): scala.Double = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): java.lang.String = js.native
  /** [Method] Retrieves the current orientation of the window
  		* @returns String Orientation of window: 'portrait' or 'landscape'
  		*/
  def getOrientation(): java.lang.String = js.native
  /** [Method] Retrieves the viewport size of the window
  		* @returns Object object containing width and height properties
  		*/
  def getViewSize(): js.Any = js.native
  /** [Method] Retrieves the viewport height of the window
  		* @returns Number viewportHeight
  		*/
  def getViewportHeight(): scala.Double = js.native
  /** [Method] Retrieves the viewport width of the window
  		* @returns Number viewportWidth
  		*/
  def getViewportWidth(): scala.Double = js.native
  /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
  		* @param prop String The property to normalize
  		* @returns String The normalized string
  		*/
  def normalize(): java.lang.String = js.native
  def normalize(prop: java.lang.String): java.lang.String = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): senchaUnderscoreTouchLib.ExtNs.IBase = js.native
  def `override`(members: js.Any): senchaUnderscoreTouchLib.ExtNs.IBase = js.native
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
  def parseStyles(styles: java.lang.String): js.Any = js.native
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
  		* @param selector String/HTMLElement[] The CSS selector or an array of elements
  		* @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
  		* @param root HTMLElement/String The root element of the query or id of the root
  		* @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
  		*/
  def select(): senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite = js.native
  def select(selector: js.Any): senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite = js.native
  def select(selector: js.Any, composite: scala.Boolean): senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite = js.native
  def select(selector: js.Any, composite: scala.Boolean, root: js.Any): senchaUnderscoreTouchLib.ExtNs.domNs.ICompositeElementLite = js.native
  /** [Method] Serializes a DOM form into a url encoded string
  		* @param form Object The form
  		* @returns String The url encoded form
  		*/
  def serializeForm(): java.lang.String = js.native
  def serializeForm(form: js.Any): java.lang.String = js.native
  /** [Method] Serializes a DOM element and its children recursively into a string
  		* @param node Object DOM element to serialize.
  		* @returns String
  		*/
  def serializeNode(): java.lang.String = js.native
  def serializeNode(node: js.Any): java.lang.String = js.native
  /** [Method] Parses a number or string representing margin sizes into an object
  		* @param box Number/String The encoded margins
  		* @param units String The type of units to add
  		* @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
  		*/
  def unitizeBox(): java.lang.String = js.native
  def unitizeBox(box: js.Any): java.lang.String = js.native
  def unitizeBox(box: js.Any, units: java.lang.String): java.lang.String = js.native
}

