package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INestedList extends IContainer {
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object) */
  var backButton: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var backText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var clearSelectionDelay: js.UndefOr[scala.Double] = js.undefined
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
      /* list */ js.UndefOr[IList], 
      /* index */ js.UndefOr[scala.Double], 
      /* target */ js.UndefOr[IElement], 
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
  var setDetailCard: js.UndefOr[js.Function1[/* detailCard */ js.UndefOr[IComponent], scala.Unit]] = js.undefined
  /** [Method] Sets the value of detailContainer
  		* @param detailContainer Ext.Container The new value.
  		*/
  var setDetailContainer: js.UndefOr[js.Function1[/* detailContainer */ js.UndefOr[IContainer], scala.Unit]] = js.undefined
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

