package typings.servicenowLondon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlidePluginManager extends StObject {
  
  /**
    * Determines if the specified plugin has been activated.
    *
    * @param pluginId The plugin ID
    * @returns True if the plugin has been activated.
    * @example
    *
    * var gr = new GlideRecord('sys_plugins');
    * var queryString = "active=0^ORactive=1";
    * gr.addEncodedQuery(queryString);
    * gr.query();
    * pMgr = new GlidePluginManager();
    * while (gr.next()) {
    *   var name = gr.getValue('name');
    *   var pID = gr.getValue('source');
    *   isActive = pMgr.isActive(pID);
    *   if (isActive)
    *     gs.info('The plugin ' + name + " is  active"  );
    * }
    * // The plugin Country Lookup Data is active
    * // The plugin Database Replication is active
    * // The plugin REST API Provider is active
    * // The plugin Ten Cool Things is active
    * // ...
    */
  def isActive(pluginId: String): Boolean
}
object GlidePluginManager {
  
  inline def apply(isActive: String => Boolean): GlidePluginManager = {
    val __obj = js.Dynamic.literal(isActive = js.Any.fromFunction1(isActive))
    __obj.asInstanceOf[GlidePluginManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlidePluginManager] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: String => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction1(value))
  }
}
