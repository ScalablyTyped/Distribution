package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent extends IEvented {
  /** [Method] Adds a CSS class or classes to this Component s rendered element
  		* @param cls String The CSS class to add.
  		* @param prefix String Optional prefix to add to each class.
  		* @param suffix String Optional suffix to add to each class.
  		*/
  var addCls: js.UndefOr[
    js.Function3[
      /* cls */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number/String) */
  var border: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var bottom: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/String[]) */
  var cls: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.Element/HTMLElement/String) */
  var contentEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Method] Disables this Component */
  var disable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var disabledCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dock: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var docked: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Enables this Component */
  var enable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String/Mixed) */
  var enterAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Mixed) */
  var exitAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var flex: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var floatingCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Prepares information on aligning this to component using alignment
  		* @param component Object
  		* @param alignment Object
  		*/
  var getAlignmentInfo: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Returns the value of baseCls
  		* @returns String
  		*/
  var getBaseCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of border
  		* @returns Number/String
  		*/
  var getBorder: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of bottom
  		* @returns any
  		*/
  var getBottom: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of centered
  		* @returns Boolean
  		*/
  var getCentered: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of cls
  		* @returns any
  		*/
  var getCls: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of contentEl
  		* @returns Ext.Element/HTMLElement/String
  		*/
  var getContentEl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of data
  		* @returns Object
  		*/
  var getData: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of disabled
  		* @returns Boolean
  		*/
  var getDisabled: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of disabledCls
  		* @returns String
  		*/
  var getDisabledCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of docked
  		* @returns String
  		*/
  var getDocked: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Retrieves the top level element representing this component
  		* @returns Ext.dom.Element
  		*/
  var getEl: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.domNs.IElement]] = js.undefined
  /** [Method] Returns the value of enterAnimation
  		* @returns String/Mixed
  		*/
  var getEnterAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of exitAnimation
  		* @returns String/Mixed
  		*/
  var getExitAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of flex
  		* @returns Number
  		*/
  var getFlex: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of floatingCls
  		* @returns String
  		*/
  var getFloatingCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of height
  		* @returns Number/String
  		*/
  var getHeight: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hidden
  		* @returns Boolean
  		*/
  var getHidden: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of hiddenCls
  		* @returns String
  		*/
  var getHiddenCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of hideAnimation
  		* @returns String/Mixed
  		*/
  var getHideAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of html
  		* @returns String/Ext.Element/HTMLElement
  		*/
  var getHtml: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of itemId
  		* @returns String
  		*/
  var getItemId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of left
  		* @returns Number/String
  		*/
  var getLeft: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of margin
  		* @returns Number/String
  		*/
  var getMargin: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxHeight
  		* @returns Number/String
  		*/
  var getMaxHeight: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of maxWidth
  		* @returns Number/String
  		*/
  var getMaxWidth: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of minHeight
  		* @returns Number/String
  		*/
  var getMinHeight: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of minWidth
  		* @returns Number/String
  		*/
  var getMinWidth: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of padding
  		* @returns Number/String
  		*/
  var getPadding: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the parent of this component if it has one
  		* @returns Ext.Component The parent of this component.
  		*/
  var getParent: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of plugins
  		* @returns Object/Array
  		*/
  var getPlugins: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of record
  		* @returns Ext.data.Model
  		*/
  var getRecord: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel]] = js.undefined
  /** [Method] Returns the value of renderTo
  		* @returns Ext.Element
  		*/
  var getRenderTo: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Returns the value of right
  		* @returns Number/String
  		*/
  var getRight: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of showAnimation
  		* @returns String/Mixed
  		*/
  var getShowAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the height and width of the Component
  		* @returns Object The current height and width of the Component.
  		*/
  var getSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of style
  		* @returns String/Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of styleHtmlCls
  		* @returns String
  		*/
  var getStyleHtmlCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of styleHtmlContent
  		* @returns Boolean
  		*/
  var getStyleHtmlContent: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of top
  		* @returns Number/String
  		*/
  var getTop: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of tpl
  		* @returns String/String[]/Ext.Template/Ext.XTemplate[]
  		*/
  var getTpl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of tplWriteMode
  		* @returns String
  		*/
  var getTplWriteMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of ui
  		* @returns String
  		*/
  var getUi: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of width
  		* @returns Number/String
  		*/
  var getWidth: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
  		* @returns String The xtype hierarchy string.
  		*/
  var getXTypes: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of zIndex
  		* @returns Number
  		*/
  var getZIndex: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns true if this component has a parent
  		* @returns Boolean true if this component has a parent.
  		*/
  var hasParent: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Number/String) */
  var height: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var hiddenCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Hides this Component optionally using an animation
  		* @param animation Object/Boolean You can specify an animation here or a bool to use the hideAnimation config.
  		* @returns Ext.Component
  		*/
  var hide: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String/Mixed) */
  var hideAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hideOnMaskTap: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/Ext.Element/HTMLElement) */
  var html: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Allows addition of behavior to the rendering phase  */
  var initialize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns true if this Component is currently disabled
  		* @returns Boolean true if currently disabled.
  		*/
  var isDisabled: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns true if this Component is currently hidden
  		* @returns Boolean true if currently hidden.
  		*/
  var isHidden: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Tests whether or not this Component is of a specific xtype
  		* @param xtype String The xtype to check for this Component.
  		* @param shallow Boolean false to check whether this Component is descended from the xtype (this is the default), or true to check whether this Component is directly of the specified xtype.
  		* @returns Boolean true if this component descends from the specified xtype, false otherwise.
  		*/
  var isXType: js.UndefOr[
    js.Function2[
      /* xtype */ js.UndefOr[java.lang.String], 
      /* shallow */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var layoutOnOrientationChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number/String) */
  var left: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var margin: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var maxHeight: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var maxWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var minHeight: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var minWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var monitorOrientation: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.data.Model) */
  var record: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] = js.undefined
  /** [Method] Removes the given CSS class es from this Component s rendered element
  		* @param cls String The class(es) to remove.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  var removeCls: js.UndefOr[
    js.Function3[
      /* cls */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Ext.Element) */
  var renderTo: js.UndefOr[IElement] = js.undefined
  /** [Method] Replaces specified classes with the newly specified classes
  		* @param oldCls String The class(es) to remove.
  		* @param newCls String The class(es) to add.
  		* @param prefix String Optional prefix to prepend before each class.
  		* @param suffix String Optional suffix to append to each class.
  		*/
  var replaceCls: js.UndefOr[
    js.Function4[
      /* oldCls */ js.UndefOr[java.lang.String], 
      /* newCls */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Resets top right bottom and left configurations to null which will un float this component  */
  var resetFloating: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number/String) */
  var right: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/String/Object) */
  var scroll: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of baseCls
  		* @param baseCls String The new value.
  		*/
  var setBaseCls: js.UndefOr[js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of border
  		* @param border Number/String The new value.
  		*/
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of bottom
  		* @param bottom Number/String The new value.
  		*/
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of centered
  		* @param centered Boolean The new value.
  		*/
  var setCentered: js.UndefOr[js.Function1[/* centered */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String/String[] The new value.
  		*/
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of contentEl
  		* @param contentEl Ext.Element/HTMLElement/String The new value.
  		*/
  var setContentEl: js.UndefOr[js.Function1[/* contentEl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disabledCls
  		* @param disabledCls String The new value.
  		*/
  var setDisabledCls: js.UndefOr[js.Function1[/* disabledCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of docked
  		* @param docked String The new value.
  		*/
  var setDocked: js.UndefOr[js.Function1[/* docked */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of draggable
  		* @param draggable Object The new value.
  		*/
  var setDraggable: js.UndefOr[js.Function1[/* draggable */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of enterAnimation
  		* @param enterAnimation String/Mixed The new value.
  		*/
  var setEnterAnimation: js.UndefOr[js.Function1[/* enterAnimation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of exitAnimation
  		* @param exitAnimation String/Mixed The new value.
  		*/
  var setExitAnimation: js.UndefOr[js.Function1[/* exitAnimation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of flex
  		* @param flex Number The new value.
  		*/
  var setFlex: js.UndefOr[js.Function1[/* flex */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Used to update the floating state of this component
  		* @param floating Boolean true if you want to float this component.
  		*/
  var setFloating: js.UndefOr[js.Function1[/* floating */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of floatingCls
  		* @param floatingCls String The new value.
  		*/
  var setFloatingCls: js.UndefOr[js.Function1[/* floatingCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of height
  		* @param height Number/String The new value.
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hiddenCls
  		* @param hiddenCls String The new value.
  		*/
  var setHiddenCls: js.UndefOr[js.Function1[/* hiddenCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hideAnimation
  		* @param hideAnimation String/Mixed The new value.
  		*/
  var setHideAnimation: js.UndefOr[js.Function1[/* hideAnimation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of html
  		* @param html String/Ext.Element/HTMLElement The new value.
  		*/
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of itemId
  		* @param itemId String The new value.
  		*/
  var setItemId: js.UndefOr[js.Function1[/* itemId */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of left
  		* @param left Number/String The new value.
  		*/
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of margin
  		* @param margin Number/String The new value.
  		*/
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxHeight
  		* @param maxHeight Number/String The new value.
  		*/
  var setMaxHeight: js.UndefOr[js.Function1[/* maxHeight */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxWidth
  		* @param maxWidth Number/String The new value.
  		*/
  var setMaxWidth: js.UndefOr[js.Function1[/* maxWidth */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight Number/String The new value.
  		*/
  var setMinHeight: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minWidth
  		* @param minWidth Number/String The new value.
  		*/
  var setMinWidth: js.UndefOr[js.Function1[/* minWidth */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of padding
  		* @param padding Number/String The new value.
  		*/
  var setPadding: js.UndefOr[js.Function1[/* padding */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of record
  		* @param record Ext.data.Model The new value.
  		*/
  var setRecord: js.UndefOr[
    js.Function1[/* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of renderTo
  		* @param renderTo Ext.Element The new value.
  		*/
  var setRenderTo: js.UndefOr[js.Function1[/* renderTo */ js.UndefOr[IElement], scala.Unit]] = js.undefined
  /** [Method] Sets the value of right
  		* @param right Number/String The new value.
  		*/
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method has moved to Ext Container  */
  var setScrollable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets the value of showAnimation
  		* @param showAnimation String/Mixed The new value.
  		*/
  var setShowAnimation: js.UndefOr[js.Function1[/* showAnimation */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the size of the Component
  		* @param width Number The new width for the Component.
  		* @param height Number The new height for the Component.
  		*/
  var setSize: js.UndefOr[
    js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of style
  		* @param style String/Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of styleHtmlCls
  		* @param styleHtmlCls String The new value.
  		*/
  var setStyleHtmlCls: js.UndefOr[js.Function1[/* styleHtmlCls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of styleHtmlContent
  		* @param styleHtmlContent Boolean The new value.
  		*/
  var setStyleHtmlContent: js.UndefOr[js.Function1[/* styleHtmlContent */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of top
  		* @param top Number/String The new value.
  		*/
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of tpl
  		* @param tpl String/String[]/Ext.Template/Ext.XTemplate[] The new value.
  		*/
  var setTpl: js.UndefOr[js.Function1[/* tpl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of tplWriteMode
  		* @param tplWriteMode String The new value.
  		*/
  var setTplWriteMode: js.UndefOr[js.Function1[/* tplWriteMode */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of ui
  		* @param ui String The new value.
  		*/
  var setUi: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of width
  		* @param width Number/String The new value.
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of zIndex
  		* @param zIndex Number The new value.
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zIndex */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Shows this component optionally using an animation
  		* @param animation Object/Boolean You can specify an animation here or a bool to use the showAnimation config.
  		* @returns Ext.Component
  		*/
  var show: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String/Mixed) */
  var showAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Method] Shows this component by another component
  		* @param component Ext.Component The target component to show this component by.
  		* @param alignment String The specific alignment.
  		*/
  var showBy: js.UndefOr[
    js.Function2[
      /* component */ js.UndefOr[this.type], 
      /* alignment */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var stopMaskTapEvent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String/Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var styleHtmlCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var styleHtmlContent: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number/String) */
  var top: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/String[]/Ext.Template/Ext.XTemplate[]) */
  var tpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var tplWriteMode: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var ui: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Walks up the ownerCt axis looking for an ancestor Container which matches the passed simple selector
  		* @param selector String The simple selector to test.
  		* @returns Ext.Container The matching ancestor Container (or undefined if no match was found).
  		*/
  var up: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IContainer]] = js.undefined
  /** [Method] Updates the HTML content of the Component  */
  var update: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Updates the styleHtmlCls configuration
  		* @param newHtmlCls Object
  		* @param oldHtmlCls Object
  		*/
  var updateStyleHtmlCls: js.UndefOr[
    js.Function2[/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number/String) */
  var width: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String[]) */
  var xtype: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object IComponent {
  @scala.inline
  def apply(
    IEvented: IEvented = null,
    addCls: js.Function3[
      /* cls */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    baseCls: java.lang.String = null,
    border: js.Any = null,
    bottom: js.Any = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    cls: js.Any = null,
    componentCls: java.lang.String = null,
    contentEl: js.Any = null,
    data: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    disable: js.Function0[scala.Unit] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledCls: java.lang.String = null,
    dock: java.lang.String = null,
    docked: java.lang.String = null,
    enable: js.Function0[scala.Unit] = null,
    enterAnimation: js.Any = null,
    exitAnimation: js.Any = null,
    flex: scala.Int | scala.Double = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    floatingCls: java.lang.String = null,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    getAlignmentInfo: js.Function2[/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any], scala.Unit] = null,
    getBaseCls: js.Function0[java.lang.String] = null,
    getBorder: js.Function0[_] = null,
    getBottom: js.Function0[_] = null,
    getCentered: js.Function0[scala.Boolean] = null,
    getCls: js.Function0[_] = null,
    getContentEl: js.Function0[_] = null,
    getData: js.Function0[_] = null,
    getDisabled: js.Function0[scala.Boolean] = null,
    getDisabledCls: js.Function0[java.lang.String] = null,
    getDocked: js.Function0[java.lang.String] = null,
    getEl: js.Function0[senchaUnderscoreTouchLib.ExtNs.domNs.IElement] = null,
    getEnterAnimation: js.Function0[_] = null,
    getExitAnimation: js.Function0[_] = null,
    getFlex: js.Function0[scala.Double] = null,
    getFloatingCls: js.Function0[java.lang.String] = null,
    getHeight: js.Function0[_] = null,
    getHidden: js.Function0[scala.Boolean] = null,
    getHiddenCls: js.Function0[java.lang.String] = null,
    getHideAnimation: js.Function0[_] = null,
    getHtml: js.Function0[_] = null,
    getItemId: js.Function0[java.lang.String] = null,
    getLeft: js.Function0[_] = null,
    getMargin: js.Function0[_] = null,
    getMaxHeight: js.Function0[_] = null,
    getMaxWidth: js.Function0[_] = null,
    getMinHeight: js.Function0[_] = null,
    getMinWidth: js.Function0[_] = null,
    getPadding: js.Function0[_] = null,
    getParent: js.Function0[IComponent] = null,
    getPlugins: js.Function0[_] = null,
    getRecord: js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] = null,
    getRenderTo: js.Function0[IElement] = null,
    getRight: js.Function0[_] = null,
    getShowAnimation: js.Function0[_] = null,
    getSize: js.Function0[_] = null,
    getStyle: js.Function0[_] = null,
    getStyleHtmlCls: js.Function0[java.lang.String] = null,
    getStyleHtmlContent: js.Function0[scala.Boolean] = null,
    getTop: js.Function0[_] = null,
    getTpl: js.Function0[_] = null,
    getTplWriteMode: js.Function0[java.lang.String] = null,
    getUi: js.Function0[java.lang.String] = null,
    getWidth: js.Function0[_] = null,
    getXTypes: js.Function0[java.lang.String] = null,
    getZIndex: js.Function0[scala.Double] = null,
    hasParent: js.Function0[scala.Boolean] = null,
    height: js.Any = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hiddenCls: java.lang.String = null,
    hide: js.Function1[/* animation */ js.UndefOr[js.Any], IComponent] = null,
    hideAnimation: js.Any = null,
    hideOnMaskTap: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.Any = null,
    id: java.lang.String = null,
    initialize: js.Function0[scala.Unit] = null,
    isDisabled: js.Function0[scala.Boolean] = null,
    isHidden: js.Function0[scala.Boolean] = null,
    isXType: js.Function2[
      /* xtype */ js.UndefOr[java.lang.String], 
      /* shallow */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ] = null,
    itemId: java.lang.String = null,
    layoutOnOrientationChange: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.Any = null,
    margin: js.Any = null,
    maxHeight: js.Any = null,
    maxWidth: js.Any = null,
    minHeight: js.Any = null,
    minWidth: js.Any = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    monitorOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    padding: js.Any = null,
    plugins: js.Any = null,
    record: senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    removeCls: js.Function3[
      /* cls */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    renderTo: IElement = null,
    replaceCls: js.Function4[
      /* oldCls */ js.UndefOr[java.lang.String], 
      /* newCls */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    resetFloating: js.Function0[scala.Unit] = null,
    right: js.Any = null,
    scroll: js.Any = null,
    setBaseCls: js.Function1[/* baseCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setBorder: js.Function1[/* border */ js.UndefOr[js.Any], scala.Unit] = null,
    setBottom: js.Function1[/* bottom */ js.UndefOr[js.Any], scala.Unit] = null,
    setCentered: js.Function1[/* centered */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setCls: js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit] = null,
    setContentEl: js.Function1[/* contentEl */ js.UndefOr[js.Any], scala.Unit] = null,
    setData: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit] = null,
    setDisabled: js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDisabledCls: js.Function1[/* disabledCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDocked: js.Function1[/* docked */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDraggable: js.Function1[/* draggable */ js.UndefOr[js.Any], scala.Unit] = null,
    setEnterAnimation: js.Function1[/* enterAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    setExitAnimation: js.Function1[/* exitAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    setFlex: js.Function1[/* flex */ js.UndefOr[scala.Double], scala.Unit] = null,
    setFloating: js.Function1[/* floating */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setFloatingCls: js.Function1[/* floatingCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setHeight: js.Function1[/* height */ js.UndefOr[js.Any], scala.Unit] = null,
    setHidden: js.Function1[/* hidden */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setHiddenCls: js.Function1[/* hiddenCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setHideAnimation: js.Function1[/* hideAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    setHtml: js.Function1[/* html */ js.UndefOr[js.Any], scala.Unit] = null,
    setItemId: js.Function1[/* itemId */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setLeft: js.Function1[/* left */ js.UndefOr[js.Any], scala.Unit] = null,
    setMargin: js.Function1[/* margin */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxHeight: js.Function1[/* maxHeight */ js.UndefOr[js.Any], scala.Unit] = null,
    setMaxWidth: js.Function1[/* maxWidth */ js.UndefOr[js.Any], scala.Unit] = null,
    setMinHeight: js.Function1[/* minHeight */ js.UndefOr[js.Any], scala.Unit] = null,
    setMinWidth: js.Function1[/* minWidth */ js.UndefOr[js.Any], scala.Unit] = null,
    setPadding: js.Function1[/* padding */ js.UndefOr[js.Any], scala.Unit] = null,
    setPlugins: js.Function1[/* plugins */ js.UndefOr[js.Any], scala.Unit] = null,
    setRecord: js.Function1[/* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel], scala.Unit] = null,
    setRenderTo: js.Function1[/* renderTo */ js.UndefOr[IElement], scala.Unit] = null,
    setRight: js.Function1[/* right */ js.UndefOr[js.Any], scala.Unit] = null,
    setScrollable: js.Function0[scala.Unit] = null,
    setShowAnimation: js.Function1[/* showAnimation */ js.UndefOr[js.Any], scala.Unit] = null,
    setSize: js.Function2[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    setStyle: js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit] = null,
    setStyleHtmlCls: js.Function1[/* styleHtmlCls */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setStyleHtmlContent: js.Function1[/* styleHtmlContent */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setTop: js.Function1[/* top */ js.UndefOr[js.Any], scala.Unit] = null,
    setTpl: js.Function1[/* tpl */ js.UndefOr[js.Any], scala.Unit] = null,
    setTplWriteMode: js.Function1[/* tplWriteMode */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setUi: js.Function1[/* ui */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setWidth: js.Function1[/* width */ js.UndefOr[js.Any], scala.Unit] = null,
    setZIndex: js.Function1[/* zIndex */ js.UndefOr[scala.Double], scala.Unit] = null,
    show: js.Function1[/* animation */ js.UndefOr[js.Any], IComponent] = null,
    showAnimation: js.Any = null,
    showBy: js.Function2[
      /* component */ js.UndefOr[IComponent], 
      /* alignment */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    stopMaskTapEvent: js.UndefOr[scala.Boolean] = js.undefined
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IEvented)
    if (addCls != null) __obj.updateDynamic("addCls")(addCls)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (border != null) __obj.updateDynamic("border")(border)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls)
    if (contentEl != null) __obj.updateDynamic("contentEl")(contentEl)
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledCls != null) __obj.updateDynamic("disabledCls")(disabledCls)
    if (dock != null) __obj.updateDynamic("dock")(dock)
    if (docked != null) __obj.updateDynamic("docked")(docked)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (exitAnimation != null) __obj.updateDynamic("exitAnimation")(exitAnimation)
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (floatingCls != null) __obj.updateDynamic("floatingCls")(floatingCls)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (getAlignmentInfo != null) __obj.updateDynamic("getAlignmentInfo")(getAlignmentInfo)
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(getBaseCls)
    if (getBorder != null) __obj.updateDynamic("getBorder")(getBorder)
    if (getBottom != null) __obj.updateDynamic("getBottom")(getBottom)
    if (getCentered != null) __obj.updateDynamic("getCentered")(getCentered)
    if (getCls != null) __obj.updateDynamic("getCls")(getCls)
    if (getContentEl != null) __obj.updateDynamic("getContentEl")(getContentEl)
    if (getData != null) __obj.updateDynamic("getData")(getData)
    if (getDisabled != null) __obj.updateDynamic("getDisabled")(getDisabled)
    if (getDisabledCls != null) __obj.updateDynamic("getDisabledCls")(getDisabledCls)
    if (getDocked != null) __obj.updateDynamic("getDocked")(getDocked)
    if (getEl != null) __obj.updateDynamic("getEl")(getEl)
    if (getEnterAnimation != null) __obj.updateDynamic("getEnterAnimation")(getEnterAnimation)
    if (getExitAnimation != null) __obj.updateDynamic("getExitAnimation")(getExitAnimation)
    if (getFlex != null) __obj.updateDynamic("getFlex")(getFlex)
    if (getFloatingCls != null) __obj.updateDynamic("getFloatingCls")(getFloatingCls)
    if (getHeight != null) __obj.updateDynamic("getHeight")(getHeight)
    if (getHidden != null) __obj.updateDynamic("getHidden")(getHidden)
    if (getHiddenCls != null) __obj.updateDynamic("getHiddenCls")(getHiddenCls)
    if (getHideAnimation != null) __obj.updateDynamic("getHideAnimation")(getHideAnimation)
    if (getHtml != null) __obj.updateDynamic("getHtml")(getHtml)
    if (getItemId != null) __obj.updateDynamic("getItemId")(getItemId)
    if (getLeft != null) __obj.updateDynamic("getLeft")(getLeft)
    if (getMargin != null) __obj.updateDynamic("getMargin")(getMargin)
    if (getMaxHeight != null) __obj.updateDynamic("getMaxHeight")(getMaxHeight)
    if (getMaxWidth != null) __obj.updateDynamic("getMaxWidth")(getMaxWidth)
    if (getMinHeight != null) __obj.updateDynamic("getMinHeight")(getMinHeight)
    if (getMinWidth != null) __obj.updateDynamic("getMinWidth")(getMinWidth)
    if (getPadding != null) __obj.updateDynamic("getPadding")(getPadding)
    if (getParent != null) __obj.updateDynamic("getParent")(getParent)
    if (getPlugins != null) __obj.updateDynamic("getPlugins")(getPlugins)
    if (getRecord != null) __obj.updateDynamic("getRecord")(getRecord)
    if (getRenderTo != null) __obj.updateDynamic("getRenderTo")(getRenderTo)
    if (getRight != null) __obj.updateDynamic("getRight")(getRight)
    if (getShowAnimation != null) __obj.updateDynamic("getShowAnimation")(getShowAnimation)
    if (getSize != null) __obj.updateDynamic("getSize")(getSize)
    if (getStyle != null) __obj.updateDynamic("getStyle")(getStyle)
    if (getStyleHtmlCls != null) __obj.updateDynamic("getStyleHtmlCls")(getStyleHtmlCls)
    if (getStyleHtmlContent != null) __obj.updateDynamic("getStyleHtmlContent")(getStyleHtmlContent)
    if (getTop != null) __obj.updateDynamic("getTop")(getTop)
    if (getTpl != null) __obj.updateDynamic("getTpl")(getTpl)
    if (getTplWriteMode != null) __obj.updateDynamic("getTplWriteMode")(getTplWriteMode)
    if (getUi != null) __obj.updateDynamic("getUi")(getUi)
    if (getWidth != null) __obj.updateDynamic("getWidth")(getWidth)
    if (getXTypes != null) __obj.updateDynamic("getXTypes")(getXTypes)
    if (getZIndex != null) __obj.updateDynamic("getZIndex")(getZIndex)
    if (hasParent != null) __obj.updateDynamic("hasParent")(hasParent)
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hiddenCls != null) __obj.updateDynamic("hiddenCls")(hiddenCls)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation)
    if (!js.isUndefined(hideOnMaskTap)) __obj.updateDynamic("hideOnMaskTap")(hideOnMaskTap)
    if (html != null) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (isDisabled != null) __obj.updateDynamic("isDisabled")(isDisabled)
    if (isHidden != null) __obj.updateDynamic("isHidden")(isHidden)
    if (isXType != null) __obj.updateDynamic("isXType")(isXType)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (!js.isUndefined(layoutOnOrientationChange)) __obj.updateDynamic("layoutOnOrientationChange")(layoutOnOrientationChange)
    if (left != null) __obj.updateDynamic("left")(left)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (!js.isUndefined(monitorOrientation)) __obj.updateDynamic("monitorOrientation")(monitorOrientation)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (record != null) __obj.updateDynamic("record")(record)
    if (removeCls != null) __obj.updateDynamic("removeCls")(removeCls)
    if (renderTo != null) __obj.updateDynamic("renderTo")(renderTo)
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(replaceCls)
    if (resetFloating != null) __obj.updateDynamic("resetFloating")(resetFloating)
    if (right != null) __obj.updateDynamic("right")(right)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(setBaseCls)
    if (setBorder != null) __obj.updateDynamic("setBorder")(setBorder)
    if (setBottom != null) __obj.updateDynamic("setBottom")(setBottom)
    if (setCentered != null) __obj.updateDynamic("setCentered")(setCentered)
    if (setCls != null) __obj.updateDynamic("setCls")(setCls)
    if (setContentEl != null) __obj.updateDynamic("setContentEl")(setContentEl)
    if (setData != null) __obj.updateDynamic("setData")(setData)
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(setDisabled)
    if (setDisabledCls != null) __obj.updateDynamic("setDisabledCls")(setDisabledCls)
    if (setDocked != null) __obj.updateDynamic("setDocked")(setDocked)
    if (setDraggable != null) __obj.updateDynamic("setDraggable")(setDraggable)
    if (setEnterAnimation != null) __obj.updateDynamic("setEnterAnimation")(setEnterAnimation)
    if (setExitAnimation != null) __obj.updateDynamic("setExitAnimation")(setExitAnimation)
    if (setFlex != null) __obj.updateDynamic("setFlex")(setFlex)
    if (setFloating != null) __obj.updateDynamic("setFloating")(setFloating)
    if (setFloatingCls != null) __obj.updateDynamic("setFloatingCls")(setFloatingCls)
    if (setHeight != null) __obj.updateDynamic("setHeight")(setHeight)
    if (setHidden != null) __obj.updateDynamic("setHidden")(setHidden)
    if (setHiddenCls != null) __obj.updateDynamic("setHiddenCls")(setHiddenCls)
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(setHideAnimation)
    if (setHtml != null) __obj.updateDynamic("setHtml")(setHtml)
    if (setItemId != null) __obj.updateDynamic("setItemId")(setItemId)
    if (setLeft != null) __obj.updateDynamic("setLeft")(setLeft)
    if (setMargin != null) __obj.updateDynamic("setMargin")(setMargin)
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(setMaxHeight)
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(setMaxWidth)
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(setMinHeight)
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(setMinWidth)
    if (setPadding != null) __obj.updateDynamic("setPadding")(setPadding)
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(setPlugins)
    if (setRecord != null) __obj.updateDynamic("setRecord")(setRecord)
    if (setRenderTo != null) __obj.updateDynamic("setRenderTo")(setRenderTo)
    if (setRight != null) __obj.updateDynamic("setRight")(setRight)
    if (setScrollable != null) __obj.updateDynamic("setScrollable")(setScrollable)
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(setShowAnimation)
    if (setSize != null) __obj.updateDynamic("setSize")(setSize)
    if (setStyle != null) __obj.updateDynamic("setStyle")(setStyle)
    if (setStyleHtmlCls != null) __obj.updateDynamic("setStyleHtmlCls")(setStyleHtmlCls)
    if (setStyleHtmlContent != null) __obj.updateDynamic("setStyleHtmlContent")(setStyleHtmlContent)
    if (setTop != null) __obj.updateDynamic("setTop")(setTop)
    if (setTpl != null) __obj.updateDynamic("setTpl")(setTpl)
    if (setTplWriteMode != null) __obj.updateDynamic("setTplWriteMode")(setTplWriteMode)
    if (setUi != null) __obj.updateDynamic("setUi")(setUi)
    if (setWidth != null) __obj.updateDynamic("setWidth")(setWidth)
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(setZIndex)
    if (show != null) __obj.updateDynamic("show")(show)
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation)
    if (showBy != null) __obj.updateDynamic("showBy")(showBy)
    if (!js.isUndefined(stopMaskTapEvent)) __obj.updateDynamic("stopMaskTapEvent")(stopMaskTapEvent)
    __obj.asInstanceOf[IComponent]
  }
}

