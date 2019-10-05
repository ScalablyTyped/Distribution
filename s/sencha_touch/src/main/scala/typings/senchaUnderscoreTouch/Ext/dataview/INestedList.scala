package typings.senchaUnderscoreTouch.Ext.dataview

import typings.senchaUnderscoreTouch.Ext.IComponent
import typings.senchaUnderscoreTouch.Ext.IContainer
import typings.senchaUnderscoreTouch.Ext.IElement
import typings.senchaUnderscoreTouch.Ext.data.INodeInterface
import typings.senchaUnderscoreTouch.Ext.data.IRecord
import typings.senchaUnderscoreTouch.Ext.event.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INestedList extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var backButton: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var backText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var clearSelectionDelay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Ext.Component) */
  var detailCard: js.UndefOr[IComponent] = js.undefined
  /** [Config Option] (Ext.Container) */
  var detailContainer: js.UndefOr[IContainer] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of backButton
  		* @returns Object
  		*/
  var getBackButton: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of backText
  		* @returns String
  		*/
  var getBackText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of clearSelectionOnListChange
  		* @returns Boolean
  		*/
  var getClearSelectionOnListChange: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of detailCard
  		* @returns Ext.Component
  		*/
  var getDetailCard: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Returns the value of detailContainer
  		* @returns Ext.Container
  		*/
  var getDetailContainer: js.UndefOr[js.Function0[IContainer]] = js.undefined
  /** [Method] Returns the value of displayField
  		* @returns String
  		*/
  var getDisplayField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of emptyText
  		* @returns String
  		*/
  var getEmptyText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of itemHeight
  		* @returns Number
  		*/
  var getItemHeight: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Override this method to provide custom template rendering of individual nodes
  		* @param node Ext.data.Record
  		* @returns String
  		*/
  var getItemTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], java.lang.String]] = js.undefined
  /** [Method] Returns the value of listConfig
  		* @returns Object
  		*/
  var getListConfig: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of loadingText
  		* @returns String
  		*/
  var getLoadingText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of onItemDisclosure
  		* @returns Boolean/Function
  		*/
  var getOnItemDisclosure: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Ext.data.TreeStore/String
  		*/
  var getStore: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the subList for a specified node  */
  var getSubList: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Override this method to provide custom template rendering of titles back buttons when useTitleAsBackText is enabled
  		* @param node Ext.data.Record
  		* @returns String
  		*/
  var getTitleTextTpl: js.UndefOr[js.Function1[/* node */ js.UndefOr[IRecord], java.lang.String]] = js.undefined
  /** [Method] Returns the value of toolbar
  		* @returns Ext.Toolbar/Object/Boolean
  		*/
  var getToolbar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of updateTitleText
  		* @returns Boolean
  		*/
  var getUpdateTitleText: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useSimpleItems
  		* @returns Boolean
  		*/
  var getUseSimpleItems: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useTitleAsBackText
  		* @returns Boolean
  		*/
  var getUseTitleAsBackText: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of useToolbar
  		* @returns Boolean
  		*/
  var getUseToolbar: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of variableHeights
  		* @returns Boolean
  		*/
  var getVariableHeights: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] The leaf you want to navigate to
  		* @param node Ext.data.NodeInterface The specified node to navigate to.
  		*/
  var goToLeaf: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.undefined
  /** [Method] Method to handle going to a specific node within this nested list
  		* @param node Ext.data.NodeInterface The specified node to navigate to.
  		*/
  var goToNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Called when the backButton has been tapped  */
  var onBackTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean/Function) */
  var onItemDisclosure: js.UndefOr[js.Any] = js.undefined
  /** [Method] Called when an list item has been tapped
  		* @param list Ext.List The subList the item is on.
  		* @param index Number The id of the item tapped.
  		* @param target Ext.Element The list item tapped.
  		* @param record Ext.data.Record The record which as tapped.
  		* @param e Ext.event.Event The event.
  		*/
  var onItemTap: js.UndefOr[
    js.Function5[
      /* list */ js.UndefOr[typings.senchaUnderscoreTouch.Ext.IList], 
      /* index */ js.UndefOr[Double], 
      /* target */ js.UndefOr[IElement], 
      /* record */ js.UndefOr[IRecord], 
      /* e */ js.UndefOr[IEvent], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of backButton
  		* @param backButton Object The new value.
  		*/
  var setBackButton: js.UndefOr[js.Function1[/* backButton */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of backText
  		* @param backText String The new value.
  		*/
  var setBackText: js.UndefOr[js.Function1[/* backText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of clearSelectionOnListChange
  		* @param clearSelectionOnListChange Boolean The new value.
  		*/
  var setClearSelectionOnListChange: js.UndefOr[js.Function1[/* clearSelectionOnListChange */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of detailCard
  		* @param detailCard Ext.Component The new value.
  		*/
  var setDetailCard: js.UndefOr[js.Function1[/* detailCard */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Sets the value of detailContainer
  		* @param detailContainer Ext.Container The new value.
  		*/
  var setDetailContainer: js.UndefOr[js.Function1[/* detailContainer */ js.UndefOr[IContainer], Unit]] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of emptyText
  		* @param emptyText String The new value.
  		*/
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of itemHeight
  		* @param itemHeight Number The new value.
  		*/
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of listConfig
  		* @param listConfig Object The new value.
  		*/
  var setListConfig: js.UndefOr[js.Function1[/* listConfig */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of onItemDisclosure
  		* @param onItemDisclosure Boolean/Function The new value.
  		*/
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.TreeStore/String The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of toolbar
  		* @param toolbar Ext.Toolbar/Object/Boolean The new value.
  		*/
  var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of ui
  		* @param ui Object The new value.
  		*/
  @JSName("setUi")
  var setUi_INestedList: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of updateTitleText
  		* @param updateTitleText Boolean The new value.
  		*/
  var setUpdateTitleText: js.UndefOr[js.Function1[/* updateTitleText */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useSimpleItems
  		* @param useSimpleItems Boolean The new value.
  		*/
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useTitleAsBackText
  		* @param useTitleAsBackText Boolean The new value.
  		*/
  var setUseTitleAsBackText: js.UndefOr[js.Function1[/* useTitleAsBackText */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of useToolbar
  		* @param useToolbar Boolean The new value.
  		*/
  var setUseToolbar: js.UndefOr[js.Function1[/* useToolbar */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of variableHeights
  		* @param variableHeights Boolean The new value.
  		*/
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Ext.data.TreeStore/String) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.Toolbar/Object/Boolean) */
  var toolbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var updateTitleText: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useTitleAsBackText: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useToolbar: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[Boolean] = js.undefined
}

object INestedList {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    allowDeselect: js.UndefOr[Boolean] = js.undefined,
    backButton: js.Any = null,
    backText: java.lang.String = null,
    baseCls: java.lang.String = null,
    cardSwitchAnimation: js.Any = null,
    clearSelectionDelay: Int | Double = null,
    detailCard: IComponent = null,
    detailContainer: IContainer = null,
    displayField: java.lang.String = null,
    emptyText: java.lang.String = null,
    getAllowDeselect: () => Boolean = null,
    getBackButton: () => _ = null,
    getBackText: () => java.lang.String = null,
    getBaseCls: () => java.lang.String = null,
    getClearSelectionOnListChange: () => Boolean = null,
    getDetailCard: () => IComponent = null,
    getDetailContainer: () => IContainer = null,
    getDisplayField: () => java.lang.String = null,
    getEmptyText: () => java.lang.String = null,
    getItemHeight: () => Double = null,
    getItemTextTpl: /* node */ js.UndefOr[IRecord] => java.lang.String = null,
    getListConfig: () => _ = null,
    getLoadingText: () => java.lang.String = null,
    getOnItemDisclosure: () => _ = null,
    getStore: () => _ = null,
    getSubList: () => Unit = null,
    getTitle: () => java.lang.String = null,
    getTitleTextTpl: /* node */ js.UndefOr[IRecord] => java.lang.String = null,
    getToolbar: () => _ = null,
    getUpdateTitleText: () => Boolean = null,
    getUseSimpleItems: () => Boolean = null,
    getUseTitleAsBackText: () => Boolean = null,
    getUseToolbar: () => Boolean = null,
    getVariableHeights: () => Boolean = null,
    goToLeaf: /* node */ js.UndefOr[INodeInterface] => Unit = null,
    goToNode: /* node */ js.UndefOr[INodeInterface] => Unit = null,
    itemHeight: Int | Double = null,
    listConfig: js.Any = null,
    loadingText: java.lang.String = null,
    onBackTap: () => Unit = null,
    onItemDisclosure: js.Any = null,
    onItemTap: (/* list */ js.UndefOr[typings.senchaUnderscoreTouch.Ext.IList], /* index */ js.UndefOr[Double], /* target */ js.UndefOr[IElement], /* record */ js.UndefOr[IRecord], /* e */ js.UndefOr[IEvent]) => Unit = null,
    setAllowDeselect: /* allowDeselect */ js.UndefOr[Boolean] => Unit = null,
    setBackButton: /* backButton */ js.UndefOr[js.Any] => Unit = null,
    setBackText: /* backText */ js.UndefOr[java.lang.String] => Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setClearSelectionOnListChange: /* clearSelectionOnListChange */ js.UndefOr[Boolean] => Unit = null,
    setDetailCard: /* detailCard */ js.UndefOr[IComponent] => Unit = null,
    setDetailContainer: /* detailContainer */ js.UndefOr[IContainer] => Unit = null,
    setDisplayField: /* displayField */ js.UndefOr[java.lang.String] => Unit = null,
    setEmptyText: /* emptyText */ js.UndefOr[java.lang.String] => Unit = null,
    setItemHeight: /* itemHeight */ js.UndefOr[Double] => Unit = null,
    setListConfig: /* listConfig */ js.UndefOr[js.Any] => Unit = null,
    setLoadingText: /* loadingText */ js.UndefOr[java.lang.String] => Unit = null,
    setOnItemDisclosure: /* onItemDisclosure */ js.UndefOr[js.Any] => Unit = null,
    setStore: /* store */ js.UndefOr[js.Any] => Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Unit = null,
    setToolbar: /* toolbar */ js.UndefOr[js.Any] => Unit = null,
    setUi: /* ui */ js.UndefOr[js.Any] => Unit = null,
    setUpdateTitleText: /* updateTitleText */ js.UndefOr[Boolean] => Unit = null,
    setUseSimpleItems: /* useSimpleItems */ js.UndefOr[Boolean] => Unit = null,
    setUseTitleAsBackText: /* useTitleAsBackText */ js.UndefOr[Boolean] => Unit = null,
    setUseToolbar: /* useToolbar */ js.UndefOr[Boolean] => Unit = null,
    setVariableHeights: /* variableHeights */ js.UndefOr[Boolean] => Unit = null,
    store: js.Any = null,
    title: java.lang.String = null,
    toolbar: js.Any = null,
    ui: java.lang.String = null,
    updateTitleText: js.UndefOr[Boolean] = js.undefined,
    useSimpleItems: js.UndefOr[Boolean] = js.undefined,
    useTitleAsBackText: js.UndefOr[Boolean] = js.undefined,
    useToolbar: js.UndefOr[Boolean] = js.undefined,
    variableHeights: js.UndefOr[Boolean] = js.undefined
  ): INestedList = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (!js.isUndefined(allowDeselect)) __obj.updateDynamic("allowDeselect")(allowDeselect)
    if (backButton != null) __obj.updateDynamic("backButton")(backButton)
    if (backText != null) __obj.updateDynamic("backText")(backText)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (cardSwitchAnimation != null) __obj.updateDynamic("cardSwitchAnimation")(cardSwitchAnimation)
    if (clearSelectionDelay != null) __obj.updateDynamic("clearSelectionDelay")(clearSelectionDelay.asInstanceOf[js.Any])
    if (detailCard != null) __obj.updateDynamic("detailCard")(detailCard)
    if (detailContainer != null) __obj.updateDynamic("detailContainer")(detailContainer)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText)
    if (getAllowDeselect != null) __obj.updateDynamic("getAllowDeselect")(js.Any.fromFunction0(getAllowDeselect))
    if (getBackButton != null) __obj.updateDynamic("getBackButton")(js.Any.fromFunction0(getBackButton))
    if (getBackText != null) __obj.updateDynamic("getBackText")(js.Any.fromFunction0(getBackText))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getClearSelectionOnListChange != null) __obj.updateDynamic("getClearSelectionOnListChange")(js.Any.fromFunction0(getClearSelectionOnListChange))
    if (getDetailCard != null) __obj.updateDynamic("getDetailCard")(js.Any.fromFunction0(getDetailCard))
    if (getDetailContainer != null) __obj.updateDynamic("getDetailContainer")(js.Any.fromFunction0(getDetailContainer))
    if (getDisplayField != null) __obj.updateDynamic("getDisplayField")(js.Any.fromFunction0(getDisplayField))
    if (getEmptyText != null) __obj.updateDynamic("getEmptyText")(js.Any.fromFunction0(getEmptyText))
    if (getItemHeight != null) __obj.updateDynamic("getItemHeight")(js.Any.fromFunction0(getItemHeight))
    if (getItemTextTpl != null) __obj.updateDynamic("getItemTextTpl")(js.Any.fromFunction1(getItemTextTpl))
    if (getListConfig != null) __obj.updateDynamic("getListConfig")(js.Any.fromFunction0(getListConfig))
    if (getLoadingText != null) __obj.updateDynamic("getLoadingText")(js.Any.fromFunction0(getLoadingText))
    if (getOnItemDisclosure != null) __obj.updateDynamic("getOnItemDisclosure")(js.Any.fromFunction0(getOnItemDisclosure))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getSubList != null) __obj.updateDynamic("getSubList")(js.Any.fromFunction0(getSubList))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getTitleTextTpl != null) __obj.updateDynamic("getTitleTextTpl")(js.Any.fromFunction1(getTitleTextTpl))
    if (getToolbar != null) __obj.updateDynamic("getToolbar")(js.Any.fromFunction0(getToolbar))
    if (getUpdateTitleText != null) __obj.updateDynamic("getUpdateTitleText")(js.Any.fromFunction0(getUpdateTitleText))
    if (getUseSimpleItems != null) __obj.updateDynamic("getUseSimpleItems")(js.Any.fromFunction0(getUseSimpleItems))
    if (getUseTitleAsBackText != null) __obj.updateDynamic("getUseTitleAsBackText")(js.Any.fromFunction0(getUseTitleAsBackText))
    if (getUseToolbar != null) __obj.updateDynamic("getUseToolbar")(js.Any.fromFunction0(getUseToolbar))
    if (getVariableHeights != null) __obj.updateDynamic("getVariableHeights")(js.Any.fromFunction0(getVariableHeights))
    if (goToLeaf != null) __obj.updateDynamic("goToLeaf")(js.Any.fromFunction1(goToLeaf))
    if (goToNode != null) __obj.updateDynamic("goToNode")(js.Any.fromFunction1(goToNode))
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (listConfig != null) __obj.updateDynamic("listConfig")(listConfig)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (onBackTap != null) __obj.updateDynamic("onBackTap")(js.Any.fromFunction0(onBackTap))
    if (onItemDisclosure != null) __obj.updateDynamic("onItemDisclosure")(onItemDisclosure)
    if (onItemTap != null) __obj.updateDynamic("onItemTap")(js.Any.fromFunction5(onItemTap))
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(js.Any.fromFunction1(setAllowDeselect))
    if (setBackButton != null) __obj.updateDynamic("setBackButton")(js.Any.fromFunction1(setBackButton))
    if (setBackText != null) __obj.updateDynamic("setBackText")(js.Any.fromFunction1(setBackText))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setClearSelectionOnListChange != null) __obj.updateDynamic("setClearSelectionOnListChange")(js.Any.fromFunction1(setClearSelectionOnListChange))
    if (setDetailCard != null) __obj.updateDynamic("setDetailCard")(js.Any.fromFunction1(setDetailCard))
    if (setDetailContainer != null) __obj.updateDynamic("setDetailContainer")(js.Any.fromFunction1(setDetailContainer))
    if (setDisplayField != null) __obj.updateDynamic("setDisplayField")(js.Any.fromFunction1(setDisplayField))
    if (setEmptyText != null) __obj.updateDynamic("setEmptyText")(js.Any.fromFunction1(setEmptyText))
    if (setItemHeight != null) __obj.updateDynamic("setItemHeight")(js.Any.fromFunction1(setItemHeight))
    if (setListConfig != null) __obj.updateDynamic("setListConfig")(js.Any.fromFunction1(setListConfig))
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(js.Any.fromFunction1(setLoadingText))
    if (setOnItemDisclosure != null) __obj.updateDynamic("setOnItemDisclosure")(js.Any.fromFunction1(setOnItemDisclosure))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setToolbar != null) __obj.updateDynamic("setToolbar")(js.Any.fromFunction1(setToolbar))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (setUpdateTitleText != null) __obj.updateDynamic("setUpdateTitleText")(js.Any.fromFunction1(setUpdateTitleText))
    if (setUseSimpleItems != null) __obj.updateDynamic("setUseSimpleItems")(js.Any.fromFunction1(setUseSimpleItems))
    if (setUseTitleAsBackText != null) __obj.updateDynamic("setUseTitleAsBackText")(js.Any.fromFunction1(setUseTitleAsBackText))
    if (setUseToolbar != null) __obj.updateDynamic("setUseToolbar")(js.Any.fromFunction1(setUseToolbar))
    if (setVariableHeights != null) __obj.updateDynamic("setVariableHeights")(js.Any.fromFunction1(setVariableHeights))
    if (store != null) __obj.updateDynamic("store")(store)
    if (title != null) __obj.updateDynamic("title")(title)
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (!js.isUndefined(updateTitleText)) __obj.updateDynamic("updateTitleText")(updateTitleText)
    if (!js.isUndefined(useSimpleItems)) __obj.updateDynamic("useSimpleItems")(useSimpleItems)
    if (!js.isUndefined(useTitleAsBackText)) __obj.updateDynamic("useTitleAsBackText")(useTitleAsBackText)
    if (!js.isUndefined(useToolbar)) __obj.updateDynamic("useToolbar")(useToolbar)
    if (!js.isUndefined(variableHeights)) __obj.updateDynamic("variableHeights")(variableHeights)
    __obj.asInstanceOf[INestedList]
  }
}

