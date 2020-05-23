package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.ITemplate
import typings.senchaTouch.Ext.IXTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.XTemplate")
@js.native
class XTemplate ()
  extends typings.senchaTouch.Ext.XTemplate

/* static members */
@JSGlobal("Ext.XTemplate")
@js.native
object XTemplate extends js.Object {
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
  /** [Method] Creates a template from the passed element s value display none textarea preferred or innerHTML
    * @param el String/HTMLElement A DOM element or its id.
    * @param config Object Config object.
    * @returns Ext.Template The created template.
    */
  def from(): ITemplate = js.native
  def from(el: js.Any): ITemplate = js.native
  def from(el: js.Any, config: js.Any): ITemplate = js.native
  /** [Method] Get the current class name in string format
    * @returns String className
    */
  def getName(): java.lang.String = js.native
  /** [Method] Gets an XTemplate from an object an instance of an Ext define d class
    * @param instance Object The object from which to get the XTemplate (must be an instance of an Ext.define'd class).
    * @param name String The name of the property by which to get the XTemplate.
    * @returns Ext.XTemplate The XTemplate instance or null if not found.
    */
  def getTpl(): IXTemplate = js.native
  def getTpl(instance: js.Any): IXTemplate = js.native
  def getTpl(instance: js.Any, name: java.lang.String): IXTemplate = js.native
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  def `override`(): IBase = js.native
  def `override`(members: js.Any): IBase = js.native
}

