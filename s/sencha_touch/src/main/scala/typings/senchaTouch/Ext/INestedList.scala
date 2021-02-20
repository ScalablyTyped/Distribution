package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.INodeInterface
import typings.senchaTouch.Ext.data.IRecord
import typings.senchaTouch.Ext.event.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INestedList extends IContainer {
  
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Object) */
  var backButton: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var backText: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number) */
  var clearSelectionDelay: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Ext.Component) */
  var detailCard: js.UndefOr[IComponent] = js.native
  
  /** [Config Option] (Ext.Container) */
  var detailContainer: js.UndefOr[IContainer] = js.native
  
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns the value of allowDeselect
    * @returns Boolean
    */
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of backButton
    * @returns Object
    */
  var getBackButton: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of backText
    * @returns String
    */
  var getBackText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of clearSelectionOnListChange
    * @returns Boolean
    */
  var getClearSelectionOnListChange: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of detailCard
    * @returns Ext.Component
    */
  var getDetailCard: js.UndefOr[js.Function0[IComponent]] = js.native
  
  /** [Method] Returns the value of detailContainer
    * @returns Ext.Container
    */
  var getDetailContainer: js.UndefOr[js.Function0[IContainer]] = js.native
  
  /** [Method] Returns the value of displayField
    * @returns String
    */
  var getDisplayField: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of emptyText
    * @returns String
    */
  var getEmptyText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of itemHeight
    * @returns Number
    */
  var getItemHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Override this method to provide custom template rendering of individual nodes
    * @param node Ext.data.Record
    * @returns String
    */
  var getItemTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], java.lang.String]] = js.native
  
  /** [Method] Returns the value of listConfig
    * @returns Object
    */
  var getListConfig: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of loadingText
    * @returns String
    */
  var getLoadingText: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of onItemDisclosure
    * @returns Boolean/Function
    */
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of store
    * @returns Ext.data.TreeStore/String
    */
  var getStore: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the subList for a specified node  */
  var getSubList: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Override this method to provide custom template rendering of titles back buttons when useTitleAsBackText is enabled
    * @param node Ext.data.Record
    * @returns String
    */
  var getTitleTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], java.lang.String]] = js.native
  
  /** [Method] Returns the value of toolbar
    * @returns Ext.Toolbar/Object/Boolean
    */
  var getToolbar: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of updateTitleText
    * @returns Boolean
    */
  var getUpdateTitleText: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of useSimpleItems
    * @returns Boolean
    */
  var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of useTitleAsBackText
    * @returns Boolean
    */
  var getUseTitleAsBackText: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of useToolbar
    * @returns Boolean
    */
  var getUseToolbar: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of variableHeights
    * @returns Boolean
    */
  var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] The leaf you want to navigate to
    * @param node Ext.data.NodeInterface The specified node to navigate to.
    */
  var goToLeaf: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.native
  
  /** [Method] Method to handle going to a specific node within this nested list
    * @param node Ext.data.NodeInterface The specified node to navigate to.
    */
  var goToNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Called when the backButton has been tapped  */
  var onBackTap: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean/Function) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.native
  
  /** [Method] Called when an list item has been tapped
    * @param list Ext.List The subList the item is on.
    * @param index Number The id of the item tapped.
    * @param target Ext.Element The list item tapped.
    * @param record Ext.data.Record The record which as tapped.
    * @param e Ext.event.Event The event.
    */
  var onItemTap: js.UndefOr[
    js.Function5[
      /* list */ js.UndefOr[IList], 
      /* index */ js.UndefOr[Double], 
      /* target */ js.UndefOr[IElement], 
      /* record */ js.UndefOr[IRecord], 
      /* e */ js.UndefOr[IEvent], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Sets the value of allowDeselect
    * @param allowDeselect Boolean The new value.
    */
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of backButton
    * @param backButton Object The new value.
    */
  var setBackButton: js.UndefOr[js.Function1[/* backButton */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of backText
    * @param backText String The new value.
    */
  var setBackText: js.UndefOr[js.Function1[/* backText */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of clearSelectionOnListChange
    * @param clearSelectionOnListChange Boolean The new value.
    */
  var setClearSelectionOnListChange: js.UndefOr[js.Function1[/* clearSelectionOnListChange */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of detailCard
    * @param detailCard Ext.Component The new value.
    */
  var setDetailCard: js.UndefOr[js.Function1[/* detailCard */ js.UndefOr[IComponent], Unit]] = js.native
  
  /** [Method] Sets the value of detailContainer
    * @param detailContainer Ext.Container The new value.
    */
  var setDetailContainer: js.UndefOr[js.Function1[/* detailContainer */ js.UndefOr[IContainer], Unit]] = js.native
  
  /** [Method] Sets the value of displayField
    * @param displayField String The new value.
    */
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of emptyText
    * @param emptyText String The new value.
    */
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of itemHeight
    * @param itemHeight Number The new value.
    */
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of listConfig
    * @param listConfig Object The new value.
    */
  var setListConfig: js.UndefOr[js.Function1[/* listConfig */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of loadingText
    * @param loadingText String The new value.
    */
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of onItemDisclosure
    * @param onItemDisclosure Boolean/Function The new value.
    */
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of store
    * @param store Ext.data.TreeStore/String The new value.
    */
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of toolbar
    * @param toolbar Ext.Toolbar/Object/Boolean The new value.
    */
  var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of ui
    * @param ui Object The new value.
    */
  @JSName("setUi")
  var setUi_INestedList: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of updateTitleText
    * @param updateTitleText Boolean The new value.
    */
  var setUpdateTitleText: js.UndefOr[js.Function1[/* updateTitleText */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of useSimpleItems
    * @param useSimpleItems Boolean The new value.
    */
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of useTitleAsBackText
    * @param useTitleAsBackText Boolean The new value.
    */
  var setUseTitleAsBackText: js.UndefOr[js.Function1[/* useTitleAsBackText */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of useToolbar
    * @param useToolbar Boolean The new value.
    */
  var setUseToolbar: js.UndefOr[js.Function1[/* useToolbar */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of variableHeights
    * @param variableHeights Boolean The new value.
    */
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Ext.data.TreeStore/String) */
  var store: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Ext.Toolbar/Object/Boolean) */
  var toolbar: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var updateTitleText: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var useTitleAsBackText: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var useToolbar: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[Boolean] = js.native
}
object INestedList {
  
  @scala.inline
  def apply(): INestedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INestedList]
  }
  
  @scala.inline
  implicit class INestedListMutableBuilder[Self <: INestedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDeselect(value: Boolean): Self = StObject.set(x, "allowDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeselectUndefined: Self = StObject.set(x, "allowDeselect", js.undefined)
    
    @scala.inline
    def setBackButton(value: js.Any): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    @scala.inline
    def setBackText(value: java.lang.String): Self = StObject.set(x, "backText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackTextUndefined: Self = StObject.set(x, "backText", js.undefined)
    
    @scala.inline
    def setClearSelectionDelay(value: Double): Self = StObject.set(x, "clearSelectionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearSelectionDelayUndefined: Self = StObject.set(x, "clearSelectionDelay", js.undefined)
    
    @scala.inline
    def setDetailCard(value: IComponent): Self = StObject.set(x, "detailCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailCardUndefined: Self = StObject.set(x, "detailCard", js.undefined)
    
    @scala.inline
    def setDetailContainer(value: IContainer): Self = StObject.set(x, "detailContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailContainerUndefined: Self = StObject.set(x, "detailContainer", js.undefined)
    
    @scala.inline
    def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
    
    @scala.inline
    def setEmptyText(value: java.lang.String): Self = StObject.set(x, "emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
    
    @scala.inline
    def setGetAllowDeselect(value: () => Boolean): Self = StObject.set(x, "getAllowDeselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllowDeselectUndefined: Self = StObject.set(x, "getAllowDeselect", js.undefined)
    
    @scala.inline
    def setGetBackButton(value: () => _): Self = StObject.set(x, "getBackButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBackButtonUndefined: Self = StObject.set(x, "getBackButton", js.undefined)
    
    @scala.inline
    def setGetBackText(value: () => java.lang.String): Self = StObject.set(x, "getBackText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBackTextUndefined: Self = StObject.set(x, "getBackText", js.undefined)
    
    @scala.inline
    def setGetClearSelectionOnListChange(value: () => Boolean): Self = StObject.set(x, "getClearSelectionOnListChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClearSelectionOnListChangeUndefined: Self = StObject.set(x, "getClearSelectionOnListChange", js.undefined)
    
    @scala.inline
    def setGetDetailCard(value: () => IComponent): Self = StObject.set(x, "getDetailCard", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDetailCardUndefined: Self = StObject.set(x, "getDetailCard", js.undefined)
    
    @scala.inline
    def setGetDetailContainer(value: () => IContainer): Self = StObject.set(x, "getDetailContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDetailContainerUndefined: Self = StObject.set(x, "getDetailContainer", js.undefined)
    
    @scala.inline
    def setGetDisplayField(value: () => java.lang.String): Self = StObject.set(x, "getDisplayField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayFieldUndefined: Self = StObject.set(x, "getDisplayField", js.undefined)
    
    @scala.inline
    def setGetEmptyText(value: () => java.lang.String): Self = StObject.set(x, "getEmptyText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEmptyTextUndefined: Self = StObject.set(x, "getEmptyText", js.undefined)
    
    @scala.inline
    def setGetItemHeight(value: () => Double): Self = StObject.set(x, "getItemHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemHeightUndefined: Self = StObject.set(x, "getItemHeight", js.undefined)
    
    @scala.inline
    def setGetItemTextTpl(value: /* node */ js.UndefOr[IRecord] => java.lang.String): Self = StObject.set(x, "getItemTextTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemTextTplUndefined: Self = StObject.set(x, "getItemTextTpl", js.undefined)
    
    @scala.inline
    def setGetListConfig(value: () => _): Self = StObject.set(x, "getListConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetListConfigUndefined: Self = StObject.set(x, "getListConfig", js.undefined)
    
    @scala.inline
    def setGetLoadingText(value: () => java.lang.String): Self = StObject.set(x, "getLoadingText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLoadingTextUndefined: Self = StObject.set(x, "getLoadingText", js.undefined)
    
    @scala.inline
    def setGetOnItemDisclosure(value: () => _): Self = StObject.set(x, "getOnItemDisclosure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOnItemDisclosureUndefined: Self = StObject.set(x, "getOnItemDisclosure", js.undefined)
    
    @scala.inline
    def setGetStore(value: () => _): Self = StObject.set(x, "getStore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStoreUndefined: Self = StObject.set(x, "getStore", js.undefined)
    
    @scala.inline
    def setGetSubList(value: () => Unit): Self = StObject.set(x, "getSubList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubListUndefined: Self = StObject.set(x, "getSubList", js.undefined)
    
    @scala.inline
    def setGetTitle(value: () => java.lang.String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitleTextTpl(value: /* node */ js.UndefOr[IRecord] => java.lang.String): Self = StObject.set(x, "getTitleTextTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTitleTextTplUndefined: Self = StObject.set(x, "getTitleTextTpl", js.undefined)
    
    @scala.inline
    def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    @scala.inline
    def setGetToolbar(value: () => _): Self = StObject.set(x, "getToolbar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetToolbarUndefined: Self = StObject.set(x, "getToolbar", js.undefined)
    
    @scala.inline
    def setGetUpdateTitleText(value: () => Boolean): Self = StObject.set(x, "getUpdateTitleText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUpdateTitleTextUndefined: Self = StObject.set(x, "getUpdateTitleText", js.undefined)
    
    @scala.inline
    def setGetUseSimpleItems(value: () => Boolean): Self = StObject.set(x, "getUseSimpleItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseSimpleItemsUndefined: Self = StObject.set(x, "getUseSimpleItems", js.undefined)
    
    @scala.inline
    def setGetUseTitleAsBackText(value: () => Boolean): Self = StObject.set(x, "getUseTitleAsBackText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseTitleAsBackTextUndefined: Self = StObject.set(x, "getUseTitleAsBackText", js.undefined)
    
    @scala.inline
    def setGetUseToolbar(value: () => Boolean): Self = StObject.set(x, "getUseToolbar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseToolbarUndefined: Self = StObject.set(x, "getUseToolbar", js.undefined)
    
    @scala.inline
    def setGetVariableHeights(value: () => Boolean): Self = StObject.set(x, "getVariableHeights", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVariableHeightsUndefined: Self = StObject.set(x, "getVariableHeights", js.undefined)
    
    @scala.inline
    def setGoToLeaf(value: /* node */ js.UndefOr[INodeInterface] => Unit): Self = StObject.set(x, "goToLeaf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGoToLeafUndefined: Self = StObject.set(x, "goToLeaf", js.undefined)
    
    @scala.inline
    def setGoToNode(value: /* node */ js.UndefOr[INodeInterface] => Unit): Self = StObject.set(x, "goToNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGoToNodeUndefined: Self = StObject.set(x, "goToNode", js.undefined)
    
    @scala.inline
    def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    @scala.inline
    def setListConfig(value: js.Any): Self = StObject.set(x, "listConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListConfigUndefined: Self = StObject.set(x, "listConfig", js.undefined)
    
    @scala.inline
    def setLoadingText(value: java.lang.String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    @scala.inline
    def setOnBackTap(value: () => Unit): Self = StObject.set(x, "onBackTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBackTapUndefined: Self = StObject.set(x, "onBackTap", js.undefined)
    
    @scala.inline
    def setOnItemDisclosure(value: js.Any): Self = StObject.set(x, "onItemDisclosure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnItemDisclosureUndefined: Self = StObject.set(x, "onItemDisclosure", js.undefined)
    
    @scala.inline
    def setOnItemTap(
      value: (/* list */ js.UndefOr[IList], /* index */ js.UndefOr[Double], /* target */ js.UndefOr[IElement], /* record */ js.UndefOr[IRecord], /* e */ js.UndefOr[IEvent]) => Unit
    ): Self = StObject.set(x, "onItemTap", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnItemTapUndefined: Self = StObject.set(x, "onItemTap", js.undefined)
    
    @scala.inline
    def setSetAllowDeselect(value: /* allowDeselect */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAllowDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowDeselectUndefined: Self = StObject.set(x, "setAllowDeselect", js.undefined)
    
    @scala.inline
    def setSetBackButton(value: /* backButton */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBackButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBackButtonUndefined: Self = StObject.set(x, "setBackButton", js.undefined)
    
    @scala.inline
    def setSetBackText(value: /* backText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setBackText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBackTextUndefined: Self = StObject.set(x, "setBackText", js.undefined)
    
    @scala.inline
    def setSetClearSelectionOnListChange(value: /* clearSelectionOnListChange */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setClearSelectionOnListChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetClearSelectionOnListChangeUndefined: Self = StObject.set(x, "setClearSelectionOnListChange", js.undefined)
    
    @scala.inline
    def setSetDetailCard(value: /* detailCard */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "setDetailCard", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDetailCardUndefined: Self = StObject.set(x, "setDetailCard", js.undefined)
    
    @scala.inline
    def setSetDetailContainer(value: /* detailContainer */ js.UndefOr[IContainer] => Unit): Self = StObject.set(x, "setDetailContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDetailContainerUndefined: Self = StObject.set(x, "setDetailContainer", js.undefined)
    
    @scala.inline
    def setSetDisplayField(value: /* displayField */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDisplayField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisplayFieldUndefined: Self = StObject.set(x, "setDisplayField", js.undefined)
    
    @scala.inline
    def setSetEmptyText(value: /* emptyText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setEmptyText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEmptyTextUndefined: Self = StObject.set(x, "setEmptyText", js.undefined)
    
    @scala.inline
    def setSetItemHeight(value: /* itemHeight */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setItemHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetItemHeightUndefined: Self = StObject.set(x, "setItemHeight", js.undefined)
    
    @scala.inline
    def setSetListConfig(value: /* listConfig */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setListConfig", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetListConfigUndefined: Self = StObject.set(x, "setListConfig", js.undefined)
    
    @scala.inline
    def setSetLoadingText(value: /* loadingText */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setLoadingText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLoadingTextUndefined: Self = StObject.set(x, "setLoadingText", js.undefined)
    
    @scala.inline
    def setSetOnItemDisclosure(value: /* onItemDisclosure */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setOnItemDisclosure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnItemDisclosureUndefined: Self = StObject.set(x, "setOnItemDisclosure", js.undefined)
    
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStoreUndefined: Self = StObject.set(x, "setStore", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    @scala.inline
    def setSetToolbar(value: /* toolbar */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setToolbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetToolbarUndefined: Self = StObject.set(x, "setToolbar", js.undefined)
    
    @scala.inline
    def setSetUi(value: /* ui */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setUi", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUiUndefined: Self = StObject.set(x, "setUi", js.undefined)
    
    @scala.inline
    def setSetUpdateTitleText(value: /* updateTitleText */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUpdateTitleText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUpdateTitleTextUndefined: Self = StObject.set(x, "setUpdateTitleText", js.undefined)
    
    @scala.inline
    def setSetUseSimpleItems(value: /* useSimpleItems */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseSimpleItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseSimpleItemsUndefined: Self = StObject.set(x, "setUseSimpleItems", js.undefined)
    
    @scala.inline
    def setSetUseTitleAsBackText(value: /* useTitleAsBackText */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseTitleAsBackText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseTitleAsBackTextUndefined: Self = StObject.set(x, "setUseTitleAsBackText", js.undefined)
    
    @scala.inline
    def setSetUseToolbar(value: /* useToolbar */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setUseToolbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseToolbarUndefined: Self = StObject.set(x, "setUseToolbar", js.undefined)
    
    @scala.inline
    def setSetVariableHeights(value: /* variableHeights */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setVariableHeights", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVariableHeightsUndefined: Self = StObject.set(x, "setVariableHeights", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToolbar(value: js.Any): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setUpdateTitleText(value: Boolean): Self = StObject.set(x, "updateTitleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTitleTextUndefined: Self = StObject.set(x, "updateTitleText", js.undefined)
    
    @scala.inline
    def setUseSimpleItems(value: Boolean): Self = StObject.set(x, "useSimpleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSimpleItemsUndefined: Self = StObject.set(x, "useSimpleItems", js.undefined)
    
    @scala.inline
    def setUseTitleAsBackText(value: Boolean): Self = StObject.set(x, "useTitleAsBackText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTitleAsBackTextUndefined: Self = StObject.set(x, "useTitleAsBackText", js.undefined)
    
    @scala.inline
    def setUseToolbar(value: Boolean): Self = StObject.set(x, "useToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseToolbarUndefined: Self = StObject.set(x, "useToolbar", js.undefined)
    
    @scala.inline
    def setVariableHeights(value: Boolean): Self = StObject.set(x, "variableHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableHeightsUndefined: Self = StObject.set(x, "variableHeights", js.undefined)
  }
}
