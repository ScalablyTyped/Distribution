package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.dom.ICompositeElementLite
import typings.senchaTouch.Ext.dom.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Element")
@js.native
class Element ()
  extends StObject
     with typings.senchaTouch.Ext.Element
/* static members */
object Element {
  
  @JSGlobal("Ext.Element")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Add methods  properties to the prototype of this class
    * @param members Object
    */
  @scala.inline
  def addMembers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")().asInstanceOf[Unit]
  @scala.inline
  def addMembers(members: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMembers")(members.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Add  override static properties of this class
    * @param members Object
    * @returns Ext.Base this
    */
  @scala.inline
  def addStatics(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")().asInstanceOf[IBase]
  @scala.inline
  def addStatics(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("addStatics")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method]
    * @param args Object
    */
  @scala.inline
  def callParent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[Unit]
  @scala.inline
  def callParent(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Create aliases for existing prototype methods
    * @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
    * @param origin String/Object The original method name
    */
  @scala.inline
  def createAlias(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")().asInstanceOf[Unit]
  @scala.inline
  def createAlias(alias: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def createAlias(alias: js.Any, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def createAlias(alias: Unit, origin: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createAlias")(alias.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Gets the globally shared flyweight Element with the passed node as the active element
    * @param element String/HTMLElement The DOM node or id.
    * @param named String Allows for creation of named reusable flyweights to prevent conflicts (e.g. internally Ext uses "_global").
    * @returns Ext.dom.Element The shared Element object (or null if no matching element was found).
    */
  @scala.inline
  def fly(): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")().asInstanceOf[IElement]
  @scala.inline
  def fly(element: js.Any): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")(element.asInstanceOf[js.Any]).asInstanceOf[IElement]
  @scala.inline
  def fly(element: js.Any, named: java.lang.String): IElement = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(element.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[IElement]
  @scala.inline
  def fly(element: Unit, named: java.lang.String): IElement = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(element.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[IElement]
  
  /** [Method] Returns the top Element that is located at the passed coordinates
    * @param x Number The x coordinate
    * @param y Number The y coordinate
    * @returns String The found Element
    */
  @scala.inline
  def fromPoint(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")().asInstanceOf[java.lang.String]
  @scala.inline
  def fromPoint(x: Double): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def fromPoint(x: Double, y: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def fromPoint(x: Unit, y: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /** [Method] Retrieves Ext dom Element objects
    * @param element String/HTMLElement/Ext.Element The id of the node, a DOM Node or an existing Element.
    * @returns Ext.dom.Element The Element object (or null if no matching element was found).
    */
  @scala.inline
  def get(): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[IElement]
  @scala.inline
  def get(element: js.Any): IElement = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(element.asInstanceOf[js.Any]).asInstanceOf[IElement]
  
  /** [Method] Retrieves the document height
    * @returns Number documentHeight
    */
  @scala.inline
  def getDocumentHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentHeight")().asInstanceOf[Double]
  
  /** [Method] Retrieves the document width
    * @returns Number documentWidth
    */
  @scala.inline
  def getDocumentWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentWidth")().asInstanceOf[Double]
  
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  @scala.inline
  def getName(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[java.lang.String]
  
  /** [Method] Retrieves the current orientation of the window
    * @returns String Orientation of window: 'portrait' or 'landscape'
    */
  @scala.inline
  def getOrientation(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrientation")().asInstanceOf[java.lang.String]
  
  /** [Method] Retrieves the viewport size of the window
    * @returns Object object containing width and height properties
    */
  @scala.inline
  def getViewSize(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewSize")().asInstanceOf[js.Any]
  
  /** [Method] Retrieves the viewport height of the window
    * @returns Number viewportHeight
    */
  @scala.inline
  def getViewportHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportHeight")().asInstanceOf[Double]
  
  /** [Method] Retrieves the viewport width of the window
    * @returns Number viewportWidth
    */
  @scala.inline
  def getViewportWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportWidth")().asInstanceOf[Double]
  
  /** [Method] Normalizes CSS property keys from dash delimited to camel case JavaScript Syntax
    * @param prop String The property to normalize
    * @returns String The normalized string
    */
  @scala.inline
  def normalize(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[java.lang.String]
  @scala.inline
  def normalize(prop: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(prop.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  @scala.inline
  def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
  @scala.inline
  def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
  
  /** [Method] Parses a number or string representing margin sizes into an object
    * @param box Number/String The encoded margins
    * @returns Object An object with margin sizes for top, right, bottom and left containing the unit
    */
  @scala.inline
  def parseBox(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")().asInstanceOf[js.Any]
  @scala.inline
  def parseBox(box: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBox")(box.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Converts a CSS string into an object with a property for each style
    * @param styles String A CSS string
    * @returns Object styles
    */
  @scala.inline
  def parseStyles(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyles")().asInstanceOf[js.Any]
  @scala.inline
  def parseStyles(styles: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
    * @param selector String/HTMLElement[] The CSS selector or an array of elements
    * @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
    * @param root HTMLElement/String The root element of the query or id of the root
    * @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
    */
  @scala.inline
  def select(): ICompositeElementLite = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[ICompositeElementLite]
  @scala.inline
  def select(selector: js.Any): ICompositeElementLite = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any]).asInstanceOf[ICompositeElementLite]
  @scala.inline
  def select(selector: js.Any, composite: Boolean): ICompositeElementLite = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], composite.asInstanceOf[js.Any])).asInstanceOf[ICompositeElementLite]
  @scala.inline
  def select(selector: js.Any, composite: Boolean, root: js.Any): ICompositeElementLite = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], composite.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[ICompositeElementLite]
  @scala.inline
  def select(selector: js.Any, composite: Unit, root: js.Any): ICompositeElementLite = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], composite.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[ICompositeElementLite]
  @scala.inline
  def select(selector: Unit, composite: Boolean): ICompositeElementLite = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], composite.asInstanceOf[js.Any])).asInstanceOf[ICompositeElementLite]
  @scala.inline
  def select(selector: Unit, composite: Boolean, root: js.Any): ICompositeElementLite = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], composite.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[ICompositeElementLite]
  @scala.inline
  def select(selector: Unit, composite: Unit, root: js.Any): ICompositeElementLite = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], composite.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[ICompositeElementLite]
  
  /** [Method] Serializes a DOM form into a url encoded string
    * @param form Object The form
    * @returns String The url encoded form
    */
  @scala.inline
  def serializeForm(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeForm")().asInstanceOf[java.lang.String]
  @scala.inline
  def serializeForm(form: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeForm")(form.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Serializes a DOM element and its children recursively into a string
    * @param node Object DOM element to serialize.
    * @returns String
    */
  @scala.inline
  def serializeNode(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeNode")().asInstanceOf[java.lang.String]
  @scala.inline
  def serializeNode(node: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeNode")(node.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Method] Parses a number or string representing margin sizes into an object
    * @param box Number/String The encoded margins
    * @param units String The type of units to add
    * @returns String An string with unitized (px if units is not specified) metrics for top, right, bottom and left
    */
  @scala.inline
  def unitizeBox(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")().asInstanceOf[java.lang.String]
  @scala.inline
  def unitizeBox(box: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def unitizeBox(box: js.Any, units: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def unitizeBox(box: Unit, units: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("unitizeBox")(box.asInstanceOf[js.Any], units.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
