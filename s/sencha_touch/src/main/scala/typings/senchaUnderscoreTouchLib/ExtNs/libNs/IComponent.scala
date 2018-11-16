package typings
package senchaUnderscoreTouchLib.ExtNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IComponent
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
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
  var getRenderTo: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.IElement]] = js.undefined
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
  var renderTo: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IElement] = js.undefined
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
  var setRenderTo: js.UndefOr[
    js.Function1[/* renderTo */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IElement], scala.Unit]
  ] = js.undefined
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
  var up: js.UndefOr[
    js.Function1[
      /* selector */ js.UndefOr[java.lang.String], 
      senchaUnderscoreTouchLib.ExtNs.IContainer
    ]
  ] = js.undefined
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

