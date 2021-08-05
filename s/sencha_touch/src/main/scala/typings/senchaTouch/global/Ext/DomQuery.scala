package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.DomQuery")
@js.native
class DomQuery ()
  extends StObject
     with typings.senchaTouch.Ext.DomQuery
/* static members */
object DomQuery {
  
  @JSGlobal("Ext.DomQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
    * @returns Object Returns the result of calling the overridden method
    */
  inline def callOverridden(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")().asInstanceOf[js.Any]
  inline def callOverridden(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callOverridden")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Call the parent method of the current method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
    * @returns Object Returns the result of calling the parent method
    */
  inline def callParent(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")().asInstanceOf[js.Any]
  inline def callParent(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callParent")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
    * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
    * @returns Object Returns the result of calling the superclass method
    */
  inline def callSuper(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")().asInstanceOf[js.Any]
  inline def callSuper(args: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callSuper")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method]  */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** [Method] Returns the initial configuration passed to constructor
    * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
    * @returns Object/Mixed
    */
  inline def getInitialConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")().asInstanceOf[js.Any]
  inline def getInitialConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Initialize configuration for this class
    * @param instanceConfig Object
    * @returns Object mixins The mixin prototypes as key - value pairs
    */
  inline def initConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")().asInstanceOf[js.Any]
  inline def initConfig(instanceConfig: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initConfig")(instanceConfig.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Returns true if the passed element s match the passed simple selector e g
    * @param el String/HTMLElement/Array An element id, element or array of elements
    * @param selector String The simple selector to test
    * @returns Boolean
    */
  inline def is(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
  inline def is(el: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def is(el: js.Any, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def is(el: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Selects a group of elements
    * @param selector String The selector/xpath query (can be a comma separated list of selectors)
    * @param root HTMLElement/String The start of the query (defaults to document).
    * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
    */
  inline def select(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("select")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def select(selector: java.lang.String): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def select(selector: java.lang.String, root: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def select(selector: Unit, root: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Selects a single element
    * @param selector String The selector/xpath query
    * @param root HTMLElement/String The start of the query (defaults to document).
    * @returns HTMLElement The DOM element which matched the selector.
    */
  inline def selectNode(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")().asInstanceOf[HTMLElement]
  inline def selectNode(selector: java.lang.String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def selectNode(selector: java.lang.String, root: js.Any): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def selectNode(selector: Unit, root: js.Any): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNode")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  
  /** [Property] (Ext.Class) */
  @JSGlobal("Ext.DomQuery.self")
  @js.native
  def self: IClass = js.native
  inline def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the reference to the class from which this object was instantiated
    * @returns Ext.Class
    */
  inline def statics(): IClass = ^.asInstanceOf[js.Dynamic].applyDynamic("statics")().asInstanceOf[IClass]
}
