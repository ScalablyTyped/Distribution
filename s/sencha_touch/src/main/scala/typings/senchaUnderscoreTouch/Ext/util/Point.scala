package typings.senchaUnderscoreTouch.Ext.util

import typings.senchaUnderscoreTouch.Ext.IBase
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Point")
@js.native
class Point () extends js.Object

/* static members */
@JSGlobal("Ext.util.Point")
@js.native
object Point extends js.Object {
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
  /** [Method] Create a new instance of this Class
  		* @returns Object the created instance.
  		*/
  def create(): js.Any = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): Unit = js.native
  def createAlias(alias: js.Any): Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): Unit = js.native
  /** [Method] Returns a new point from an object that has x and y properties if that object is not an instance of Ext util Point
  		* @param object Object
  		* @returns Ext.util.Point
  		*/
  def from(): IPoint = js.native
  def from(`object`: js.Any): IPoint = js.native
  /** [Method] Returns a new instance of Ext util Point based on the pageX  pageY values of the given event
  		* @param e Event The event.
  		* @returns Ext.util.Point
  		*/
  def fromEvent(): IPoint = js.native
  def fromEvent(e: Event): IPoint = js.native
  /** [Method] Returns a new instance of Ext util Point based on the pageX  pageY values of the given touch
  		* @param touch Event
  		* @returns Ext.util.Point
  		*/
  def fromTouch(): IPoint = js.native
  def fromTouch(touch: Event): IPoint = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): String = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
}

