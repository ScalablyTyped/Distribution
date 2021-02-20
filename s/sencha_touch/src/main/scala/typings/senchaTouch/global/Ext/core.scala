package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IClass
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSGlobal("Ext.core.DomQuery")
  @js.native
  class DomQuery ()
    extends typings.senchaTouch.Ext.core.DomQuery
  /* static members */
  object DomQuery {
    
    @JSGlobal("Ext.core.DomQuery")
    @js.native
    val ^ : js.Any = js.native
    
    /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
      * @returns Object Returns the result of calling the overridden method
      */
    @JSGlobal("Ext.core.DomQuery.callOverridden")
    @js.native
    def callOverridden(): js.Any = js.native
    @JSGlobal("Ext.core.DomQuery.callOverridden")
    @js.native
    def callOverridden(args: js.Any): js.Any = js.native
    
    /** [Method] Call the parent method of the current method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
      * @returns Object Returns the result of calling the parent method
      */
    @JSGlobal("Ext.core.DomQuery.callParent")
    @js.native
    def callParent(): js.Any = js.native
    @JSGlobal("Ext.core.DomQuery.callParent")
    @js.native
    def callParent(args: js.Any): js.Any = js.native
    
    /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
      * @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
      * @returns Object Returns the result of calling the superclass method
      */
    @JSGlobal("Ext.core.DomQuery.callSuper")
    @js.native
    def callSuper(): js.Any = js.native
    @JSGlobal("Ext.core.DomQuery.callSuper")
    @js.native
    def callSuper(args: js.Any): js.Any = js.native
    
    /** [Method]  */
    @JSGlobal("Ext.core.DomQuery.destroy")
    @js.native
    def destroy(): Unit = js.native
    
    /** [Method] Returns the initial configuration passed to constructor
      * @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
      * @returns Object/Mixed
      */
    @JSGlobal("Ext.core.DomQuery.getInitialConfig")
    @js.native
    def getInitialConfig(): js.Any = js.native
    @JSGlobal("Ext.core.DomQuery.getInitialConfig")
    @js.native
    def getInitialConfig(name: java.lang.String): js.Any = js.native
    
    /** [Method] Initialize configuration for this class
      * @param instanceConfig Object
      * @returns Object mixins The mixin prototypes as key - value pairs
      */
    @JSGlobal("Ext.core.DomQuery.initConfig")
    @js.native
    def initConfig(): js.Any = js.native
    @JSGlobal("Ext.core.DomQuery.initConfig")
    @js.native
    def initConfig(instanceConfig: js.Any): js.Any = js.native
    
    /** [Method] Returns true if the passed element s match the passed simple selector e g
      * @param el String/HTMLElement/Array An element id, element or array of elements
      * @param selector String The simple selector to test
      * @returns Boolean
      */
    @JSGlobal("Ext.core.DomQuery.is")
    @js.native
    def is(): Boolean = js.native
    @JSGlobal("Ext.core.DomQuery.is")
    @js.native
    def is(el: js.UndefOr[scala.Nothing], selector: java.lang.String): Boolean = js.native
    @JSGlobal("Ext.core.DomQuery.is")
    @js.native
    def is(el: js.Any): Boolean = js.native
    @JSGlobal("Ext.core.DomQuery.is")
    @js.native
    def is(el: js.Any, selector: java.lang.String): Boolean = js.native
    
    /** [Method] Selects a group of elements
      * @param selector String The selector/xpath query (can be a comma separated list of selectors)
      * @param root HTMLElement/String The start of the query (defaults to document).
      * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
      */
    @JSGlobal("Ext.core.DomQuery.select")
    @js.native
    def select(): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.core.DomQuery.select")
    @js.native
    def select(selector: js.UndefOr[scala.Nothing], root: js.Any): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.core.DomQuery.select")
    @js.native
    def select(selector: java.lang.String): typings.senchaTouch.Ext.Array = js.native
    @JSGlobal("Ext.core.DomQuery.select")
    @js.native
    def select(selector: java.lang.String, root: js.Any): typings.senchaTouch.Ext.Array = js.native
    
    /** [Method] Selects a single element
      * @param selector String The selector/xpath query
      * @param root HTMLElement/String The start of the query (defaults to document).
      * @returns HTMLElement The DOM element which matched the selector.
      */
    @JSGlobal("Ext.core.DomQuery.selectNode")
    @js.native
    def selectNode(): HTMLElement = js.native
    @JSGlobal("Ext.core.DomQuery.selectNode")
    @js.native
    def selectNode(selector: js.UndefOr[scala.Nothing], root: js.Any): HTMLElement = js.native
    @JSGlobal("Ext.core.DomQuery.selectNode")
    @js.native
    def selectNode(selector: java.lang.String): HTMLElement = js.native
    @JSGlobal("Ext.core.DomQuery.selectNode")
    @js.native
    def selectNode(selector: java.lang.String, root: js.Any): HTMLElement = js.native
    
    /** [Property] (Ext.Class) */
    @JSGlobal("Ext.core.DomQuery.self")
    @js.native
    def self: IClass = js.native
    @scala.inline
    def self_=(x: IClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("self")(x.asInstanceOf[js.Any])
    
    /** [Method] Get the reference to the class from which this object was instantiated
      * @returns Ext.Class
      */
    @JSGlobal("Ext.core.DomQuery.statics")
    @js.native
    def statics(): IClass = js.native
  }
}
