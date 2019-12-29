package typings.senchaUnderscoreTouch.Ext.util

import typings.senchaUnderscoreTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.util.Region")
@js.native
class Region () extends js.Object

/* static members */
@JSGlobal("Ext.util.Region")
@js.native
object Region extends js.Object {
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
  /** [Method] Creates new Region from an object  Ext util Region from top 0 right 5 bottom 3 left  1  the above is eq
  		* @param o Object An object with top, right, bottom, and left properties.
  		* @returns Ext.util.Region The region constructed based on the passed object.
  		*/
  def from(): IRegion = js.native
  def from(o: js.Any): IRegion = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): String = js.native
  /** [Method] Retrieves an Ext util Region for a particular element
  		* @param el String/HTMLElement/Ext.Element The element or its ID.
  		* @returns Ext.util.Region region
  		*/
  def getRegion(): IRegion = js.native
  def getRegion(el: js.Any): IRegion = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
}

