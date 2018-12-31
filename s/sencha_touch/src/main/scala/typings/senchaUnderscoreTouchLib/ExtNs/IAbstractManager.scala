package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractManager extends IBase {
  /** [Property] (Ext.util.HashMap) */
  var all: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IHashMap] = js.undefined
  /** [Method] Creates and returns an instance of whatever this manager manages based on the supplied type and config object
  		* @param config Object The config object.
  		* @param defaultType String If no type is discovered in the config object, we fall back to this type.
  		* @returns Object The instance of whatever this manager is managing.
  		*/
  var create: js.UndefOr[
    js.Function2[/* config */ js.UndefOr[js.Any], /* defaultType */ js.UndefOr[java.lang.String], _]
  ] = js.undefined
  /** [Method] Executes the specified function once for each item in the collection
  		* @param fn Function The function to execute.
  		* @param scope Object The scope to execute in.
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Returns an item by id
  		* @param id String The id of the item.
  		* @returns Object The item, undefined if not found.
  		*/
  var get: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Gets the number of items in the collection
  		* @returns Number The number of items in the collection.
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Checks if an item type is registered
  		* @param type String The mnemonic string by which the class may be looked up.
  		* @returns Boolean Whether the type is registered.
  		*/
  var isRegistered: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
  /** [Method] Registers a function that will be called when an item with the specified id is added to the manager
  		* @param id String The item id.
  		* @param fn Function The callback function. Called with a single parameter, the item.
  		* @param scope Object The scope (this reference) in which the callback is executed. Defaults to the item.
  		*/
  var onAvailable: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[java.lang.String], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Registers an item to be managed
  		* @param item Object The item to register.
  		*/
  var register: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Registers a new item constructor keyed by a type key
  		* @param type String The mnemonic string by which the class may be looked up.
  		* @param cls Function The new instance class.
  		*/
  var registerType: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[java.lang.String], /* cls */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Unregisters an item by removing it from this manager
  		* @param item Object The item to unregister.
  		*/
  var unregister: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

