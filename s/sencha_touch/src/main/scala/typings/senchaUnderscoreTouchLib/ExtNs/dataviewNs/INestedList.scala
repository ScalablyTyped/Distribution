package typings
package senchaUnderscoreTouchLib.ExtNs.dataviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INestedList
  extends senchaUnderscoreTouchLib.ExtNs.IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var backButton: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var backText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var clearSelectionDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Ext.Component) */
  var detailCard: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IComponent] = js.undefined
  /** [Config Option] (Ext.Container) */
  var detailContainer: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IContainer] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of allowDeselect
  		* @returns Boolean
  		*/
  var getAllowDeselect: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var getClearSelectionOnListChange: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of detailCard
  		* @returns Ext.Component
  		*/
  var getDetailCard: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Returns the value of detailContainer
  		* @returns Ext.Container
  		*/
  var getDetailContainer: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.IContainer]] = js.undefined
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
  var getItemHeight: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Override this method to provide custom template rendering of individual nodes
  		* @param node Ext.data.Record
  		* @returns String
  		*/
  var getItemTextTpl: js.UndefOr[
    js.Function1[
      /* node */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      java.lang.String
    ]
  ] = js.undefined
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
  var getSubList: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String
  		*/
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Override this method to provide custom template rendering of titles back buttons when useTitleAsBackText is enabled
  		* @param node Ext.data.Record
  		* @returns String
  		*/
  var getTitleTextTpl: js.UndefOr[
    js.Function1[
      /* node */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Method] Returns the value of toolbar
  		* @returns Ext.Toolbar/Object/Boolean
  		*/
  var getToolbar: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of updateTitleText
  		* @returns Boolean
  		*/
  var getUpdateTitleText: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useSimpleItems
  		* @returns Boolean
  		*/
  var getUseSimpleItems: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useTitleAsBackText
  		* @returns Boolean
  		*/
  var getUseTitleAsBackText: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useToolbar
  		* @returns Boolean
  		*/
  var getUseToolbar: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of variableHeights
  		* @returns Boolean
  		*/
  var getVariableHeights: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] The leaf you want to navigate to
  		* @param node Ext.data.NodeInterface The specified node to navigate to.
  		*/
  var goToLeaf: js.UndefOr[
    js.Function1[
      /* node */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.INodeInterface], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Method to handle going to a specific node within this nested list
  		* @param node Ext.data.NodeInterface The specified node to navigate to.
  		*/
  var goToNode: js.UndefOr[
    js.Function1[
      /* node */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.INodeInterface], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var itemHeight: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var listConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Called when the backButton has been tapped  */
  var onBackTap: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
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
      /* list */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IList], 
      /* index */ js.UndefOr[scala.Double], 
      /* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IElement], 
      /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      /* e */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.eventNs.IEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of allowDeselect
  		* @param allowDeselect Boolean The new value.
  		*/
  var setAllowDeselect: js.UndefOr[js.Function1[/* allowDeselect */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of backButton
  		* @param backButton Object The new value.
  		*/
  var setBackButton: js.UndefOr[js.Function1[/* backButton */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of backText
  		* @param backText String The new value.
  		*/
  var setBackText: js.UndefOr[js.Function1[/* backText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of clearSelectionOnListChange
  		* @param clearSelectionOnListChange Boolean The new value.
  		*/
  var setClearSelectionOnListChange: js.UndefOr[
    js.Function1[/* clearSelectionOnListChange */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of detailCard
  		* @param detailCard Ext.Component The new value.
  		*/
  var setDetailCard: js.UndefOr[
    js.Function1[/* detailCard */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IComponent], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of detailContainer
  		* @param detailContainer Ext.Container The new value.
  		*/
  var setDetailContainer: js.UndefOr[
    js.Function1[
      /* detailContainer */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IContainer], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of displayField
  		* @param displayField String The new value.
  		*/
  var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of emptyText
  		* @param emptyText String The new value.
  		*/
  var setEmptyText: js.UndefOr[js.Function1[/* emptyText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemHeight
  		* @param itemHeight Number The new value.
  		*/
  var setItemHeight: js.UndefOr[js.Function1[/* itemHeight */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of listConfig
  		* @param listConfig Object The new value.
  		*/
  var setListConfig: js.UndefOr[js.Function1[/* listConfig */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of onItemDisclosure
  		* @param onItemDisclosure Boolean/Function The new value.
  		*/
  var setOnItemDisclosure: js.UndefOr[js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.TreeStore/String The new value.
  		*/
  var setStore: js.UndefOr[js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of toolbar
  		* @param toolbar Ext.Toolbar/Object/Boolean The new value.
  		*/
  var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of ui
  		* @param ui Object The new value.
  		*/
  @JSName("setUi")
  var setUi_INestedList: js.UndefOr[js.Function1[/* ui */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of updateTitleText
  		* @param updateTitleText Boolean The new value.
  		*/
  var setUpdateTitleText: js.UndefOr[js.Function1[/* updateTitleText */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useSimpleItems
  		* @param useSimpleItems Boolean The new value.
  		*/
  var setUseSimpleItems: js.UndefOr[js.Function1[/* useSimpleItems */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useTitleAsBackText
  		* @param useTitleAsBackText Boolean The new value.
  		*/
  var setUseTitleAsBackText: js.UndefOr[js.Function1[/* useTitleAsBackText */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useToolbar
  		* @param useToolbar Boolean The new value.
  		*/
  var setUseToolbar: js.UndefOr[js.Function1[/* useToolbar */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of variableHeights
  		* @param variableHeights Boolean The new value.
  		*/
  var setVariableHeights: js.UndefOr[js.Function1[/* variableHeights */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.data.TreeStore/String) */
  var store: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.Toolbar/Object/Boolean) */
  var toolbar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var updateTitleText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useSimpleItems: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useTitleAsBackText: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var useToolbar: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var variableHeights: js.UndefOr[scala.Boolean] = js.undefined
}

object INestedList {
  @scala.inline
  def apply(
    IContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    allowDeselect: js.UndefOr[scala.Boolean] = js.undefined,
    backButton: js.Any = null,
    backText: java.lang.String = null,
    baseCls: java.lang.String = null,
    cardSwitchAnimation: js.Any = null,
    clearSelectionDelay: scala.Int | scala.Double = null,
    detailCard: senchaUnderscoreTouchLib.ExtNs.IComponent = null,
    detailContainer: senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    displayField: java.lang.String = null,
    emptyText: java.lang.String = null,
    getAllowDeselect: js.Function0[scala.Boolean] = null,
    getBackButton: js.Function0[_] = null,
    getBackText: js.Function0[java.lang.String] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getClearSelectionOnListChange: js.Function0[scala.Boolean] = null,
    getDetailCard: js.Function0[senchaUnderscoreTouchLib.ExtNs.IComponent] = null,
    getDetailContainer: js.Function0[senchaUnderscoreTouchLib.ExtNs.IContainer] = null,
    getDisplayField: js.Function0[java.lang.String] = null,
    getEmptyText: js.Function0[java.lang.String] = null,
    getItemHeight: js.Function0[scala.Double] = null,
    getItemTextTpl: js.Function1[
      /* node */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      java.lang.String
    ] = null,
    getListConfig: js.Function0[_] = null,
    getLoadingText: js.Function0[java.lang.String] = null,
    getOnItemDisclosure: js.Function0[_] = null,
    getStore: js.Function0[_] = null,
    getSubList: js.Function0[scala.Unit] = null,
    getTitle: js.Function0[java.lang.String] = null,
    getTitleTextTpl: js.Function1[
      /* node */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      java.lang.String
    ] = null,
    getToolbar: js.Function0[_] = null,
    getUpdateTitleText: js.Function0[scala.Boolean] = null,
    getUseSimpleItems: js.Function0[scala.Boolean] = null,
    getUseTitleAsBackText: js.Function0[scala.Boolean] = null,
    getUseToolbar: js.Function0[scala.Boolean] = null,
    getVariableHeights: js.Function0[scala.Boolean] = null,
    goToLeaf: js.Function1[
      /* node */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.INodeInterface], 
      scala.Unit
    ] = null,
    goToNode: js.Function1[
      /* node */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.INodeInterface], 
      scala.Unit
    ] = null,
    itemHeight: scala.Int | scala.Double = null,
    listConfig: js.Any = null,
    loadingText: java.lang.String = null,
    onBackTap: js.Function0[scala.Unit] = null,
    onItemDisclosure: js.Any = null,
    onItemTap: js.Function5[
      /* list */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IList], 
      /* index */ js.UndefOr[scala.Double], 
      /* target */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IElement], 
      /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IRecord], 
      /* e */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.eventNs.IEvent], 
      scala.Unit
    ] = null,
    setAllowDeselect: js.Function1[/* allowDeselect */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setBackButton: js.Function1[/* backButton */ js.UndefOr[js.Any], scala.Unit] = null,
    setBackText: js.Function1[/* backText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setClearSelectionOnListChange: js.Function1[/* clearSelectionOnListChange */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDetailCard: js.Function1[/* detailCard */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IComponent], scala.Unit] = null,
    setDetailContainer: js.Function1[
      /* detailContainer */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IContainer], 
      scala.Unit
    ] = null,
    setDisplayField: js.Function1[/* displayField */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setEmptyText: js.Function1[/* emptyText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setItemHeight: js.Function1[/* itemHeight */ js.UndefOr[scala.Double], scala.Unit] = null,
    setListConfig: js.Function1[/* listConfig */ js.UndefOr[js.Any], scala.Unit] = null,
    setLoadingText: js.Function1[/* loadingText */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setOnItemDisclosure: js.Function1[/* onItemDisclosure */ js.UndefOr[js.Any], scala.Unit] = null,
    setStore: js.Function1[/* store */ js.UndefOr[js.Any], scala.Unit] = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setToolbar: js.Function1[/* toolbar */ js.UndefOr[js.Any], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[js.Any], scala.Unit] = null,
    setUpdateTitleText: js.Function1[/* updateTitleText */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUseSimpleItems: js.Function1[/* useSimpleItems */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUseTitleAsBackText: js.Function1[/* useTitleAsBackText */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setUseToolbar: js.Function1[/* useToolbar */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setVariableHeights: js.Function1[/* variableHeights */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    store: js.Any = null,
    title: java.lang.String = null,
    toolbar: js.Any = null,
    ui: java.lang.String = null,
    updateTitleText: js.UndefOr[scala.Boolean] = js.undefined,
    useSimpleItems: js.UndefOr[scala.Boolean] = js.undefined,
    useTitleAsBackText: js.UndefOr[scala.Boolean] = js.undefined,
    useToolbar: js.UndefOr[scala.Boolean] = js.undefined,
    variableHeights: js.UndefOr[scala.Boolean] = js.undefined
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
    if (getAllowDeselect != null) __obj.updateDynamic("getAllowDeselect")(getAllowDeselect)
    if (getBackButton != null) __obj.updateDynamic("getBackButton")(getBackButton)
    if (getBackText != null) __obj.updateDynamic("getBackText")(getBackText)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getClearSelectionOnListChange != null) __obj.updateDynamic("getClearSelectionOnListChange")(getClearSelectionOnListChange)
    if (getDetailCard != null) __obj.updateDynamic("getDetailCard")(getDetailCard)
    if (getDetailContainer != null) __obj.updateDynamic("getDetailContainer")(getDetailContainer)
    if (getDisplayField != null) __obj.updateDynamic("getDisplayField")(getDisplayField)
    if (getEmptyText != null) __obj.updateDynamic("getEmptyText")(getEmptyText)
    if (getItemHeight != null) __obj.updateDynamic("getItemHeight")(getItemHeight)
    if (getItemTextTpl != null) __obj.updateDynamic("getItemTextTpl")(getItemTextTpl)
    if (getListConfig != null) __obj.updateDynamic("getListConfig")(getListConfig)
    if (getLoadingText != null) __obj.updateDynamic("getLoadingText")(getLoadingText)
    if (getOnItemDisclosure != null) __obj.updateDynamic("getOnItemDisclosure")(getOnItemDisclosure)
    if (getStore != null) __obj.updateDynamic("getStore")(getStore)
    if (getSubList != null) __obj.updateDynamic("getSubList")(getSubList)
    if (getTitle != null) __obj.updateDynamic("getTitle")(getTitle)
    if (getTitleTextTpl != null) __obj.updateDynamic("getTitleTextTpl")(getTitleTextTpl)
    if (getToolbar != null) __obj.updateDynamic("getToolbar")(getToolbar)
    if (getUpdateTitleText != null) __obj.updateDynamic("getUpdateTitleText")(getUpdateTitleText)
    if (getUseSimpleItems != null) __obj.updateDynamic("getUseSimpleItems")(getUseSimpleItems)
    if (getUseTitleAsBackText != null) __obj.updateDynamic("getUseTitleAsBackText")(getUseTitleAsBackText)
    if (getUseToolbar != null) __obj.updateDynamic("getUseToolbar")(getUseToolbar)
    if (getVariableHeights != null) __obj.updateDynamic("getVariableHeights")(getVariableHeights)
    if (goToLeaf != null) __obj.updateDynamic("goToLeaf")(goToLeaf)
    if (goToNode != null) __obj.updateDynamic("goToNode")(goToNode)
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (listConfig != null) __obj.updateDynamic("listConfig")(listConfig)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (onBackTap != null) __obj.updateDynamic("onBackTap")(onBackTap)
    if (onItemDisclosure != null) __obj.updateDynamic("onItemDisclosure")(onItemDisclosure)
    if (onItemTap != null) __obj.updateDynamic("onItemTap")(onItemTap)
    if (setAllowDeselect != null) __obj.updateDynamic("setAllowDeselect")(setAllowDeselect)
    if (setBackButton != null) __obj.updateDynamic("setBackButton")(setBackButton)
    if (setBackText != null) __obj.updateDynamic("setBackText")(setBackText)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setClearSelectionOnListChange != null) __obj.updateDynamic("setClearSelectionOnListChange")(setClearSelectionOnListChange)
    if (setDetailCard != null) __obj.updateDynamic("setDetailCard")(setDetailCard)
    if (setDetailContainer != null) __obj.updateDynamic("setDetailContainer")(setDetailContainer)
    if (setDisplayField != null) __obj.updateDynamic("setDisplayField")(setDisplayField)
    if (setEmptyText != null) __obj.updateDynamic("setEmptyText")(setEmptyText)
    if (setItemHeight != null) __obj.updateDynamic("setItemHeight")(setItemHeight)
    if (setListConfig != null) __obj.updateDynamic("setListConfig")(setListConfig)
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(setLoadingText)
    if (setOnItemDisclosure != null) __obj.updateDynamic("setOnItemDisclosure")(setOnItemDisclosure)
    if (setStore != null) __obj.updateDynamic("setStore")(setStore)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (setToolbar != null) __obj.updateDynamic("setToolbar")(setToolbar)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (setUpdateTitleText != null) __obj.updateDynamic("setUpdateTitleText")(setUpdateTitleText)
    if (setUseSimpleItems != null) __obj.updateDynamic("setUseSimpleItems")(setUseSimpleItems)
    if (setUseTitleAsBackText != null) __obj.updateDynamic("setUseTitleAsBackText")(setUseTitleAsBackText)
    if (setUseToolbar != null) __obj.updateDynamic("setUseToolbar")(setUseToolbar)
    if (setVariableHeights != null) __obj.updateDynamic("setVariableHeights")(setVariableHeights)
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

