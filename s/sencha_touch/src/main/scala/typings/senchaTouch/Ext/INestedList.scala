package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.INodeInterface
import typings.senchaTouch.Ext.data.IRecord
import typings.senchaTouch.Ext.event.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class INestedListOps[Self <: INestedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDeselect(value: Boolean): Self = this.set("allowDeselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDeselect: Self = this.set("allowDeselect", js.undefined)
    @scala.inline
    def setBackButton(value: js.Any): Self = this.set("backButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButton: Self = this.set("backButton", js.undefined)
    @scala.inline
    def setBackText(value: java.lang.String): Self = this.set("backText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackText: Self = this.set("backText", js.undefined)
    @scala.inline
    def setClearSelectionDelay(value: Double): Self = this.set("clearSelectionDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearSelectionDelay: Self = this.set("clearSelectionDelay", js.undefined)
    @scala.inline
    def setDetailCard(value: IComponent): Self = this.set("detailCard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailCard: Self = this.set("detailCard", js.undefined)
    @scala.inline
    def setDetailContainer(value: IContainer): Self = this.set("detailContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailContainer: Self = this.set("detailContainer", js.undefined)
    @scala.inline
    def setDisplayField(value: java.lang.String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    @scala.inline
    def setEmptyText(value: java.lang.String): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    @scala.inline
    def setGetAllowDeselect(value: () => Boolean): Self = this.set("getAllowDeselect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAllowDeselect: Self = this.set("getAllowDeselect", js.undefined)
    @scala.inline
    def setGetBackButton(value: () => _): Self = this.set("getBackButton", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBackButton: Self = this.set("getBackButton", js.undefined)
    @scala.inline
    def setGetBackText(value: () => java.lang.String): Self = this.set("getBackText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBackText: Self = this.set("getBackText", js.undefined)
    @scala.inline
    def setGetClearSelectionOnListChange(value: () => Boolean): Self = this.set("getClearSelectionOnListChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetClearSelectionOnListChange: Self = this.set("getClearSelectionOnListChange", js.undefined)
    @scala.inline
    def setGetDetailCard(value: () => IComponent): Self = this.set("getDetailCard", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDetailCard: Self = this.set("getDetailCard", js.undefined)
    @scala.inline
    def setGetDetailContainer(value: () => IContainer): Self = this.set("getDetailContainer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDetailContainer: Self = this.set("getDetailContainer", js.undefined)
    @scala.inline
    def setGetDisplayField(value: () => java.lang.String): Self = this.set("getDisplayField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDisplayField: Self = this.set("getDisplayField", js.undefined)
    @scala.inline
    def setGetEmptyText(value: () => java.lang.String): Self = this.set("getEmptyText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEmptyText: Self = this.set("getEmptyText", js.undefined)
    @scala.inline
    def setGetItemHeight(value: () => Double): Self = this.set("getItemHeight", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetItemHeight: Self = this.set("getItemHeight", js.undefined)
    @scala.inline
    def setGetItemTextTpl(value: /* node */ js.UndefOr[IRecord] => java.lang.String): Self = this.set("getItemTextTpl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetItemTextTpl: Self = this.set("getItemTextTpl", js.undefined)
    @scala.inline
    def setGetListConfig(value: () => _): Self = this.set("getListConfig", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetListConfig: Self = this.set("getListConfig", js.undefined)
    @scala.inline
    def setGetLoadingText(value: () => java.lang.String): Self = this.set("getLoadingText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLoadingText: Self = this.set("getLoadingText", js.undefined)
    @scala.inline
    def setGetOnItemDisclosure(value: () => _): Self = this.set("getOnItemDisclosure", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOnItemDisclosure: Self = this.set("getOnItemDisclosure", js.undefined)
    @scala.inline
    def setGetStore(value: () => _): Self = this.set("getStore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetStore: Self = this.set("getStore", js.undefined)
    @scala.inline
    def setGetSubList(value: () => Unit): Self = this.set("getSubList", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSubList: Self = this.set("getSubList", js.undefined)
    @scala.inline
    def setGetTitle(value: () => java.lang.String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    @scala.inline
    def setGetTitleTextTpl(value: /* node */ js.UndefOr[IRecord] => java.lang.String): Self = this.set("getTitleTextTpl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetTitleTextTpl: Self = this.set("getTitleTextTpl", js.undefined)
    @scala.inline
    def setGetToolbar(value: () => _): Self = this.set("getToolbar", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetToolbar: Self = this.set("getToolbar", js.undefined)
    @scala.inline
    def setGetUpdateTitleText(value: () => Boolean): Self = this.set("getUpdateTitleText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUpdateTitleText: Self = this.set("getUpdateTitleText", js.undefined)
    @scala.inline
    def setGetUseSimpleItems(value: () => Boolean): Self = this.set("getUseSimpleItems", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseSimpleItems: Self = this.set("getUseSimpleItems", js.undefined)
    @scala.inline
    def setGetUseTitleAsBackText(value: () => Boolean): Self = this.set("getUseTitleAsBackText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseTitleAsBackText: Self = this.set("getUseTitleAsBackText", js.undefined)
    @scala.inline
    def setGetUseToolbar(value: () => Boolean): Self = this.set("getUseToolbar", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseToolbar: Self = this.set("getUseToolbar", js.undefined)
    @scala.inline
    def setGetVariableHeights(value: () => Boolean): Self = this.set("getVariableHeights", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetVariableHeights: Self = this.set("getVariableHeights", js.undefined)
    @scala.inline
    def setGoToLeaf(value: /* node */ js.UndefOr[INodeInterface] => Unit): Self = this.set("goToLeaf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGoToLeaf: Self = this.set("goToLeaf", js.undefined)
    @scala.inline
    def setGoToNode(value: /* node */ js.UndefOr[INodeInterface] => Unit): Self = this.set("goToNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGoToNode: Self = this.set("goToNode", js.undefined)
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    @scala.inline
    def setListConfig(value: js.Any): Self = this.set("listConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListConfig: Self = this.set("listConfig", js.undefined)
    @scala.inline
    def setLoadingText(value: java.lang.String): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
    @scala.inline
    def setOnBackTap(value: () => Unit): Self = this.set("onBackTap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBackTap: Self = this.set("onBackTap", js.undefined)
    @scala.inline
    def setOnItemDisclosure(value: js.Any): Self = this.set("onItemDisclosure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnItemDisclosure: Self = this.set("onItemDisclosure", js.undefined)
    @scala.inline
    def setOnItemTap(
      value: (/* list */ js.UndefOr[IList], /* index */ js.UndefOr[Double], /* target */ js.UndefOr[IElement], /* record */ js.UndefOr[IRecord], /* e */ js.UndefOr[IEvent]) => Unit
    ): Self = this.set("onItemTap", js.Any.fromFunction5(value))
    @scala.inline
    def deleteOnItemTap: Self = this.set("onItemTap", js.undefined)
    @scala.inline
    def setSetAllowDeselect(value: /* allowDeselect */ js.UndefOr[Boolean] => Unit): Self = this.set("setAllowDeselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAllowDeselect: Self = this.set("setAllowDeselect", js.undefined)
    @scala.inline
    def setSetBackButton(value: /* backButton */ js.UndefOr[js.Any] => Unit): Self = this.set("setBackButton", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBackButton: Self = this.set("setBackButton", js.undefined)
    @scala.inline
    def setSetBackText(value: /* backText */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setBackText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetBackText: Self = this.set("setBackText", js.undefined)
    @scala.inline
    def setSetClearSelectionOnListChange(value: /* clearSelectionOnListChange */ js.UndefOr[Boolean] => Unit): Self = this.set("setClearSelectionOnListChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetClearSelectionOnListChange: Self = this.set("setClearSelectionOnListChange", js.undefined)
    @scala.inline
    def setSetDetailCard(value: /* detailCard */ js.UndefOr[IComponent] => Unit): Self = this.set("setDetailCard", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDetailCard: Self = this.set("setDetailCard", js.undefined)
    @scala.inline
    def setSetDetailContainer(value: /* detailContainer */ js.UndefOr[IContainer] => Unit): Self = this.set("setDetailContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDetailContainer: Self = this.set("setDetailContainer", js.undefined)
    @scala.inline
    def setSetDisplayField(value: /* displayField */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setDisplayField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDisplayField: Self = this.set("setDisplayField", js.undefined)
    @scala.inline
    def setSetEmptyText(value: /* emptyText */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setEmptyText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetEmptyText: Self = this.set("setEmptyText", js.undefined)
    @scala.inline
    def setSetItemHeight(value: /* itemHeight */ js.UndefOr[Double] => Unit): Self = this.set("setItemHeight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetItemHeight: Self = this.set("setItemHeight", js.undefined)
    @scala.inline
    def setSetListConfig(value: /* listConfig */ js.UndefOr[js.Any] => Unit): Self = this.set("setListConfig", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetListConfig: Self = this.set("setListConfig", js.undefined)
    @scala.inline
    def setSetLoadingText(value: /* loadingText */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setLoadingText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLoadingText: Self = this.set("setLoadingText", js.undefined)
    @scala.inline
    def setSetOnItemDisclosure(value: /* onItemDisclosure */ js.UndefOr[js.Any] => Unit): Self = this.set("setOnItemDisclosure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOnItemDisclosure: Self = this.set("setOnItemDisclosure", js.undefined)
    @scala.inline
    def setSetStore(value: /* store */ js.UndefOr[js.Any] => Unit): Self = this.set("setStore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetStore: Self = this.set("setStore", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setSetToolbar(value: /* toolbar */ js.UndefOr[js.Any] => Unit): Self = this.set("setToolbar", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetToolbar: Self = this.set("setToolbar", js.undefined)
    @scala.inline
    def setSetUi(value: /* ui */ js.UndefOr[js.Any] => Unit): Self = this.set("setUi", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUi: Self = this.set("setUi", js.undefined)
    @scala.inline
    def setSetUpdateTitleText(value: /* updateTitleText */ js.UndefOr[Boolean] => Unit): Self = this.set("setUpdateTitleText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUpdateTitleText: Self = this.set("setUpdateTitleText", js.undefined)
    @scala.inline
    def setSetUseSimpleItems(value: /* useSimpleItems */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseSimpleItems", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseSimpleItems: Self = this.set("setUseSimpleItems", js.undefined)
    @scala.inline
    def setSetUseTitleAsBackText(value: /* useTitleAsBackText */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseTitleAsBackText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseTitleAsBackText: Self = this.set("setUseTitleAsBackText", js.undefined)
    @scala.inline
    def setSetUseToolbar(value: /* useToolbar */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseToolbar", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseToolbar: Self = this.set("setUseToolbar", js.undefined)
    @scala.inline
    def setSetVariableHeights(value: /* variableHeights */ js.UndefOr[Boolean] => Unit): Self = this.set("setVariableHeights", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetVariableHeights: Self = this.set("setVariableHeights", js.undefined)
    @scala.inline
    def setStore(value: js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setToolbar(value: js.Any): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    @scala.inline
    def setUpdateTitleText(value: Boolean): Self = this.set("updateTitleText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTitleText: Self = this.set("updateTitleText", js.undefined)
    @scala.inline
    def setUseSimpleItems(value: Boolean): Self = this.set("useSimpleItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSimpleItems: Self = this.set("useSimpleItems", js.undefined)
    @scala.inline
    def setUseTitleAsBackText(value: Boolean): Self = this.set("useTitleAsBackText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTitleAsBackText: Self = this.set("useTitleAsBackText", js.undefined)
    @scala.inline
    def setUseToolbar(value: Boolean): Self = this.set("useToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseToolbar: Self = this.set("useToolbar", js.undefined)
    @scala.inline
    def setVariableHeights(value: Boolean): Self = this.set("variableHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableHeights: Self = this.set("variableHeights", js.undefined)
  }
  
}

