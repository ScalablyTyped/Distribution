package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.IComponent
import typings.senchaTouch.Ext.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.ComponentQuery")
@js.native
open class ComponentQuery ()
  extends StObject
     with typings.senchaTouch.Ext.ComponentQuery
/* static members */
object ComponentQuery {
  
  @JSGlobal("Ext.ComponentQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Tests whether the passed Component matches the selector string
    * @param component Ext.Component The Component to test.
    * @param selector String The selector string to test against.
    * @returns Boolean true if the Component matches the selector.
    */
  inline def is(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[Boolean]
  inline def is(component: Unit, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(component.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def is(component: IComponent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def is(component: IComponent, selector: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(component.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** [Method] Returns an array of matched Components from within the passed root object
    * @param selector String The selector string to filter returned Components
    * @param root Ext.Container The Container within which to perform the query. If omitted, all Components within the document are included in the search. This parameter may also be an array of Components to filter according to the selector.
    * @returns Ext.Component[] The matched Components.
    */
  inline def query(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def query(selector: java.lang.String): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def query(selector: java.lang.String, root: IContainer): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def query(selector: Unit, root: IContainer): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(selector.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
}
