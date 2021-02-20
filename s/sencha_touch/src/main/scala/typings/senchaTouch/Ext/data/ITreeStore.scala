package typings.senchaTouch.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITreeStore extends INodeStore {
  
  /** [Config Option] (Boolean) */
  var clearOnLoad: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var defaultRootId: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var defaultRootProperty: js.UndefOr[String] = js.native
  
  /** [Method] Get the Record with the specified id
    * @param id Object
    * @returns Ext.data.Model/undefined The Record with the passed id. Returns undefined if not found.
    */
  @JSName("getById")
  var getById_ITreeStore: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the value of clearOnLoad
    * @returns Boolean
    */
  var getClearOnLoad: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of defaultRootId
    * @returns String
    */
  var getDefaultRootId: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of defaultRootProperty
    * @returns String
    */
  var getDefaultRootProperty: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the record node by id
    * @param id Object
    * @returns Ext.data.NodeInterface
    */
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], INodeInterface]] = js.native
  
  /** [Method] Returns the value of nodeParam
    * @returns String
    */
  var getNodeParam: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of root
    * @returns Ext.data.Model/Ext.data.NodeInterface/Object
    */
  var getRoot: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the root node for this tree
    * @param node Object
    * @returns Ext.data.Model
    */
  var getRootNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], IModel]] = js.native
  
  /** [Method] Loads the Store using its configured proxy
    * @param options Object config object. This is passed into the Operation object that is created and then sent to the proxy's Ext.data.proxy.Proxy.read function. The options can also contain a node, which indicates which node is to be loaded. If not specified, it will default to the root node.
    * @returns Object
    */
  @JSName("load")
  var load_ITreeStore: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Config Option] (String) */
  var nodeParam: js.UndefOr[String] = js.native
  
  /** [Method] Called internally when a Proxy has completed a load request
    * @param operation Object
    */
  var onProxyLoad: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of clearOnLoad
    * @param clearOnLoad Boolean The new value.
    */
  var setClearOnLoad: js.UndefOr[js.Function1[/* clearOnLoad */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of defaultRootId
    * @param defaultRootId String The new value.
    */
  var setDefaultRootId: js.UndefOr[js.Function1[/* defaultRootId */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of defaultRootProperty
    * @param defaultRootProperty String The new value.
    */
  var setDefaultRootProperty: js.UndefOr[js.Function1[/* defaultRootProperty */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of nodeParam
    * @param nodeParam String The new value.
    */
  var setNodeParam: js.UndefOr[js.Function1[/* nodeParam */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of root
    * @param root Ext.data.Model/Ext.data.NodeInterface/Object The new value.
    */
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the root node for this tree
    * @param node Ext.data.Model
    * @returns Ext.data.Model
    */
  var setRootNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[IModel], IModel]] = js.native
}
object ITreeStore {
  
  @scala.inline
  def apply(): ITreeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreeStore]
  }
  
  @scala.inline
  implicit class ITreeStoreMutableBuilder[Self <: ITreeStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearOnLoad(value: Boolean): Self = StObject.set(x, "clearOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearOnLoadUndefined: Self = StObject.set(x, "clearOnLoad", js.undefined)
    
    @scala.inline
    def setDefaultRootId(value: String): Self = StObject.set(x, "defaultRootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRootIdUndefined: Self = StObject.set(x, "defaultRootId", js.undefined)
    
    @scala.inline
    def setDefaultRootProperty(value: String): Self = StObject.set(x, "defaultRootProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRootPropertyUndefined: Self = StObject.set(x, "defaultRootProperty", js.undefined)
    
    @scala.inline
    def setGetById(value: /* id */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetByIdUndefined: Self = StObject.set(x, "getById", js.undefined)
    
    @scala.inline
    def setGetClearOnLoad(value: () => Boolean): Self = StObject.set(x, "getClearOnLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClearOnLoadUndefined: Self = StObject.set(x, "getClearOnLoad", js.undefined)
    
    @scala.inline
    def setGetDefaultRootId(value: () => String): Self = StObject.set(x, "getDefaultRootId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultRootIdUndefined: Self = StObject.set(x, "getDefaultRootId", js.undefined)
    
    @scala.inline
    def setGetDefaultRootProperty(value: () => String): Self = StObject.set(x, "getDefaultRootProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultRootPropertyUndefined: Self = StObject.set(x, "getDefaultRootProperty", js.undefined)
    
    @scala.inline
    def setGetNodeById(value: /* id */ js.UndefOr[js.Any] => INodeInterface): Self = StObject.set(x, "getNodeById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeByIdUndefined: Self = StObject.set(x, "getNodeById", js.undefined)
    
    @scala.inline
    def setGetNodeParam(value: () => String): Self = StObject.set(x, "getNodeParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeParamUndefined: Self = StObject.set(x, "getNodeParam", js.undefined)
    
    @scala.inline
    def setGetRoot(value: () => _): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRootNode(value: /* node */ js.UndefOr[js.Any] => IModel): Self = StObject.set(x, "getRootNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRootNodeUndefined: Self = StObject.set(x, "getRootNode", js.undefined)
    
    @scala.inline
    def setGetRootUndefined: Self = StObject.set(x, "getRoot", js.undefined)
    
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setNodeParam(value: String): Self = StObject.set(x, "nodeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeParamUndefined: Self = StObject.set(x, "nodeParam", js.undefined)
    
    @scala.inline
    def setOnProxyLoad(value: /* operation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onProxyLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProxyLoadUndefined: Self = StObject.set(x, "onProxyLoad", js.undefined)
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSetClearOnLoad(value: /* clearOnLoad */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setClearOnLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClearOnLoadUndefined: Self = StObject.set(x, "setClearOnLoad", js.undefined)
    
    @scala.inline
    def setSetDefaultRootId(value: /* defaultRootId */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultRootId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultRootIdUndefined: Self = StObject.set(x, "setDefaultRootId", js.undefined)
    
    @scala.inline
    def setSetDefaultRootProperty(value: /* defaultRootProperty */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDefaultRootProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDefaultRootPropertyUndefined: Self = StObject.set(x, "setDefaultRootProperty", js.undefined)
    
    @scala.inline
    def setSetNodeParam(value: /* nodeParam */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setNodeParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNodeParamUndefined: Self = StObject.set(x, "setNodeParam", js.undefined)
    
    @scala.inline
    def setSetRoot(value: /* root */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRootNode(value: /* node */ js.UndefOr[IModel] => IModel): Self = StObject.set(x, "setRootNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRootNodeUndefined: Self = StObject.set(x, "setRootNode", js.undefined)
    
    @scala.inline
    def setSetRootUndefined: Self = StObject.set(x, "setRoot", js.undefined)
  }
}
