package typings.senchaTouch.Ext.data

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
  implicit class ITreeStoreOps[Self <: ITreeStore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearOnLoad(value: Boolean): Self = this.set("clearOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearOnLoad: Self = this.set("clearOnLoad", js.undefined)
    
    @scala.inline
    def setDefaultRootId(value: String): Self = this.set("defaultRootId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRootId: Self = this.set("defaultRootId", js.undefined)
    
    @scala.inline
    def setDefaultRootProperty(value: String): Self = this.set("defaultRootProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRootProperty: Self = this.set("defaultRootProperty", js.undefined)
    
    @scala.inline
    def setGetById(value: /* id */ js.UndefOr[js.Any] => _): Self = this.set("getById", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetById: Self = this.set("getById", js.undefined)
    
    @scala.inline
    def setGetClearOnLoad(value: () => Boolean): Self = this.set("getClearOnLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetClearOnLoad: Self = this.set("getClearOnLoad", js.undefined)
    
    @scala.inline
    def setGetDefaultRootId(value: () => String): Self = this.set("getDefaultRootId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultRootId: Self = this.set("getDefaultRootId", js.undefined)
    
    @scala.inline
    def setGetDefaultRootProperty(value: () => String): Self = this.set("getDefaultRootProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultRootProperty: Self = this.set("getDefaultRootProperty", js.undefined)
    
    @scala.inline
    def setGetNodeById(value: /* id */ js.UndefOr[js.Any] => INodeInterface): Self = this.set("getNodeById", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetNodeById: Self = this.set("getNodeById", js.undefined)
    
    @scala.inline
    def setGetNodeParam(value: () => String): Self = this.set("getNodeParam", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNodeParam: Self = this.set("getNodeParam", js.undefined)
    
    @scala.inline
    def setGetRoot(value: () => _): Self = this.set("getRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRoot: Self = this.set("getRoot", js.undefined)
    
    @scala.inline
    def setGetRootNode(value: /* node */ js.UndefOr[js.Any] => IModel): Self = this.set("getRootNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetRootNode: Self = this.set("getRootNode", js.undefined)
    
    @scala.inline
    def setLoad(value: /* options */ js.UndefOr[js.Any] => _): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setNodeParam(value: String): Self = this.set("nodeParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeParam: Self = this.set("nodeParam", js.undefined)
    
    @scala.inline
    def setOnProxyLoad(value: /* operation */ js.UndefOr[js.Any] => Unit): Self = this.set("onProxyLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProxyLoad: Self = this.set("onProxyLoad", js.undefined)
    
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSetClearOnLoad(value: /* clearOnLoad */ js.UndefOr[Boolean] => Unit): Self = this.set("setClearOnLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetClearOnLoad: Self = this.set("setClearOnLoad", js.undefined)
    
    @scala.inline
    def setSetDefaultRootId(value: /* defaultRootId */ js.UndefOr[String] => Unit): Self = this.set("setDefaultRootId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultRootId: Self = this.set("setDefaultRootId", js.undefined)
    
    @scala.inline
    def setSetDefaultRootProperty(value: /* defaultRootProperty */ js.UndefOr[String] => Unit): Self = this.set("setDefaultRootProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultRootProperty: Self = this.set("setDefaultRootProperty", js.undefined)
    
    @scala.inline
    def setSetNodeParam(value: /* nodeParam */ js.UndefOr[String] => Unit): Self = this.set("setNodeParam", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetNodeParam: Self = this.set("setNodeParam", js.undefined)
    
    @scala.inline
    def setSetRoot(value: /* root */ js.UndefOr[js.Any] => Unit): Self = this.set("setRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRoot: Self = this.set("setRoot", js.undefined)
    
    @scala.inline
    def setSetRootNode(value: /* node */ js.UndefOr[IModel] => IModel): Self = this.set("setRootNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRootNode: Self = this.set("setRootNode", js.undefined)
  }
}
