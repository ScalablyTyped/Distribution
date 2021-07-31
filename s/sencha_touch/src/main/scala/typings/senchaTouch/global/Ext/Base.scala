package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Base")
@js.native
class Base ()
  extends StObject
     with typings.senchaTouch.Ext.Base
/* static members */
object Base {
  
  @JSGlobal("Ext.Base")
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
  
  /** [Method] Create a new instance of this Class
    * @returns Object the created instance.
    */
  @scala.inline
  def create(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Any]
  
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
  
  /** [Method] Get the current class name in string format
    * @returns any className
    */
  @scala.inline
  def getName(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")().asInstanceOf[js.Any]
  
  /** [Method] Override members of this class
    * @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
    * @returns Ext.Base this class
    */
  @scala.inline
  def `override`(): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")().asInstanceOf[IBase]
  @scala.inline
  def `override`(members: js.Any): IBase = ^.asInstanceOf[js.Dynamic].applyDynamic("override")(members.asInstanceOf[js.Any]).asInstanceOf[IBase]
}
