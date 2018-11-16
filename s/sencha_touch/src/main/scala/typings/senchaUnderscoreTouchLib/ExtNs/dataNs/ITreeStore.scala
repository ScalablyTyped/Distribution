package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITreeStore extends INodeStore {
  /** [Config Option] (Boolean) */
  var clearOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var defaultRootId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultRootProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Get the Record with the specified id
  		* @param id Object
  		* @returns Ext.data.Model/undefined The Record with the passed id. Returns undefined if not found.
  		*/
  @JSName("getById")
  var getById_ITreeStore: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of clearOnLoad
  		* @returns Boolean
  		*/
  var getClearOnLoad: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of defaultRootId
  		* @returns String
  		*/
  var getDefaultRootId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of defaultRootProperty
  		* @returns String
  		*/
  var getDefaultRootProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the record node by id
  		* @param id Object
  		* @returns Ext.data.NodeInterface
  		*/
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
  /** [Method] Returns the value of nodeParam
  		* @returns String
  		*/
  var getNodeParam: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of root
  		* @returns Ext.data.Model/Ext.data.NodeInterface/Object
  		*/
  var getRoot: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the root node for this tree
  		* @param node Object
  		* @returns Ext.data.Model
  		*/
  var getRootNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], IModel]] = js.undefined
  /** [Method] Loads the Store using its configured proxy
  		* @param options Object config object. This is passed into the Operation object that is created and then sent to the proxy's Ext.data.proxy.Proxy.read function. The options can also contain a node, which indicates which node is to be loaded. If not specified, it will default to the root node.
  		* @returns Object
  		*/
  @JSName("load")
  var load_ITreeStore: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (String) */
  var nodeParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Called internally when a Proxy has completed a load request
  		* @param operation Object
  		*/
  var onProxyLoad: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of clearOnLoad
  		* @param clearOnLoad Boolean The new value.
  		*/
  var setClearOnLoad: js.UndefOr[js.Function1[/* clearOnLoad */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultRootId
  		* @param defaultRootId String The new value.
  		*/
  var setDefaultRootId: js.UndefOr[js.Function1[/* defaultRootId */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaultRootProperty
  		* @param defaultRootProperty String The new value.
  		*/
  var setDefaultRootProperty: js.UndefOr[js.Function1[/* defaultRootProperty */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of nodeParam
  		* @param nodeParam String The new value.
  		*/
  var setNodeParam: js.UndefOr[js.Function1[/* nodeParam */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of root
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object The new value.
  		*/
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the root node for this tree
  		* @param node Ext.data.Model
  		* @returns Ext.data.Model
  		*/
  var setRootNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[IModel], IModel]] = js.undefined
}

