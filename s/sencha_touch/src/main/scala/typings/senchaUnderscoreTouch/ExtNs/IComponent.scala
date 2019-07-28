package typings.senchaUnderscoreTouch.ExtNs

import typings.senchaUnderscoreTouch.ExtNs.dataNs.IModel
import typings.senchaUnderscoreTouch.ExtNs.mixinNs.IObservable
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
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number/String) */
  var border: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number/String) */
  var bottom: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var centered: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/String[]) */
  var cls: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.Element/HTMLElement/String) */
  var contentEl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.undefined
  /** [Method] Disables this Component */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var disabledCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dock: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var docked: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Enables this Component */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String/Mixed) */
  var enterAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String/Mixed) */
  var exitAnimation: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var flex: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var floating: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var floatingCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  /** [Method] Prepares information on aligning this to component using alignment
  		* @param component Object
  		* @param alignment Object
  		*/
  var getAlignmentInfo: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any], Unit]
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
  var getCentered: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getEl: js.UndefOr[js.Function0[typings.senchaUnderscoreTouch.ExtNs.domNs.IElement]] = js.undefined
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
  var getFlex: js.UndefOr[js.Function0[Double]] = js.undefined
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
  var getHidden: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.undefined
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
  var getStyleHtmlContent: js.UndefOr[js.Function0[Boolean]] = js.undefined
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
  var getZIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns true if this component has a parent
  		* @returns Boolean true if this component has a parent.
  		*/
  var hasParent: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Number/String) */
  var height: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
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
  var hideOnMaskTap: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Ext.Element/HTMLElement) */
  var html: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Allows addition of behavior to the rendering phase  */
  var initialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns true if this Component is currently disabled
  		* @returns Boolean true if currently disabled.
  		*/
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns true if this Component is currently hidden
  		* @returns Boolean true if currently hidden.
  		*/
  var isHidden: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Tests whether or not this Component is of a specific xtype
  		* @param xtype String The xtype to check for this Component.
  		* @param shallow Boolean false to check whether this Component is descended from the xtype (this is the default), or true to check whether this Component is directly of the specified xtype.
  		* @returns Boolean true if this component descends from the specified xtype, false otherwise.
  		*/
  var isXType: js.UndefOr[
    js.Function2[/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean], Boolean]
  ] = js.undefined
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var layoutOnOrientationChange: js.UndefOr[Boolean] = js.undefined
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
  var modal: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var monitorOrientation: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.data.Model) */
  var record: js.UndefOr[IModel] = js.undefined
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
      Unit
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
      Unit
    ]
  ] = js.undefined
  /** [Method] Resets top right bottom and left configurations to null which will un float this component  */
  var resetFloating: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number/String) */
  var right: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean/String/Object) */
  var scroll: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of baseCls
  		* @param baseCls String The new value.
  		*/
  var setBaseCls: js.UndefOr[js.Function1[/* baseCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of border
  		* @param border Number/String The new value.
  		*/
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of bottom
  		* @param bottom Number/String The new value.
  		*/
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of centered
  		* @param centered Boolean The new value.
  		*/
  var setCentered: js.UndefOr[js.Function1[/* centered */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String/String[] The new value.
  		*/
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of contentEl
  		* @param contentEl Ext.Element/HTMLElement/String The new value.
  		*/
  var setContentEl: js.UndefOr[js.Function1[/* contentEl */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of data
  		* @param data Object The new value.
  		*/
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disabledCls
  		* @param disabledCls String The new value.
  		*/
  var setDisabledCls: js.UndefOr[js.Function1[/* disabledCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of docked
  		* @param docked String The new value.
  		*/
  var setDocked: js.UndefOr[js.Function1[/* docked */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of draggable
  		* @param draggable Object The new value.
  		*/
  var setDraggable: js.UndefOr[js.Function1[/* draggable */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of enterAnimation
  		* @param enterAnimation String/Mixed The new value.
  		*/
  var setEnterAnimation: js.UndefOr[js.Function1[/* enterAnimation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of exitAnimation
  		* @param exitAnimation String/Mixed The new value.
  		*/
  var setExitAnimation: js.UndefOr[js.Function1[/* exitAnimation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of flex
  		* @param flex Number The new value.
  		*/
  var setFlex: js.UndefOr[js.Function1[/* flex */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Used to update the floating state of this component
  		* @param floating Boolean true if you want to float this component.
  		*/
  var setFloating: js.UndefOr[js.Function1[/* floating */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of floatingCls
  		* @param floatingCls String The new value.
  		*/
  var setFloatingCls: js.UndefOr[js.Function1[/* floatingCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of height
  		* @param height Number/String The new value.
  		*/
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of hiddenCls
  		* @param hiddenCls String The new value.
  		*/
  var setHiddenCls: js.UndefOr[js.Function1[/* hiddenCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of hideAnimation
  		* @param hideAnimation String/Mixed The new value.
  		*/
  var setHideAnimation: js.UndefOr[js.Function1[/* hideAnimation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of html
  		* @param html String/Ext.Element/HTMLElement The new value.
  		*/
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of itemId
  		* @param itemId String The new value.
  		*/
  var setItemId: js.UndefOr[js.Function1[/* itemId */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of left
  		* @param left Number/String The new value.
  		*/
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of margin
  		* @param margin Number/String The new value.
  		*/
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxHeight
  		* @param maxHeight Number/String The new value.
  		*/
  var setMaxHeight: js.UndefOr[js.Function1[/* maxHeight */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of maxWidth
  		* @param maxWidth Number/String The new value.
  		*/
  var setMaxWidth: js.UndefOr[js.Function1[/* maxWidth */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of minHeight
  		* @param minHeight Number/String The new value.
  		*/
  var setMinHeight: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of minWidth
  		* @param minWidth Number/String The new value.
  		*/
  var setMinWidth: js.UndefOr[js.Function1[/* minWidth */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of padding
  		* @param padding Number/String The new value.
  		*/
  var setPadding: js.UndefOr[js.Function1[/* padding */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of plugins
  		* @param plugins Object/Array The new value.
  		*/
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of record
  		* @param record Ext.data.Model The new value.
  		*/
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Unit]] = js.undefined
  /** [Method] Sets the value of renderTo
  		* @param renderTo Ext.Element The new value.
  		*/
  var setRenderTo: js.UndefOr[js.Function1[/* renderTo */ js.UndefOr[IElement], Unit]] = js.undefined
  /** [Method] Sets the value of right
  		* @param right Number/String The new value.
  		*/
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method has moved to Ext Container  */
  var setScrollable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets the value of showAnimation
  		* @param showAnimation String/Mixed The new value.
  		*/
  var setShowAnimation: js.UndefOr[js.Function1[/* showAnimation */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the size of the Component
  		* @param width Number The new width for the Component.
  		* @param height Number The new height for the Component.
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Sets the value of style
  		* @param style String/Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of styleHtmlCls
  		* @param styleHtmlCls String The new value.
  		*/
  var setStyleHtmlCls: js.UndefOr[js.Function1[/* styleHtmlCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of styleHtmlContent
  		* @param styleHtmlContent Boolean The new value.
  		*/
  var setStyleHtmlContent: js.UndefOr[js.Function1[/* styleHtmlContent */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of top
  		* @param top Number/String The new value.
  		*/
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of tpl
  		* @param tpl String/String[]/Ext.Template/Ext.XTemplate[] The new value.
  		*/
  var setTpl: js.UndefOr[js.Function1[/* tpl */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of tplWriteMode
  		* @param tplWriteMode String The new value.
  		*/
  var setTplWriteMode: js.UndefOr[js.Function1[/* tplWriteMode */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of ui
  		* @param ui String The new value.
  		*/
  var setUi: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Method] Sets the value of width
  		* @param width Number/String The new value.
  		*/
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of zIndex
  		* @param zIndex Number The new value.
  		*/
  var setZIndex: js.UndefOr[js.Function1[/* zIndex */ js.UndefOr[Double], Unit]] = js.undefined
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
      Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var stopMaskTapEvent: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var styleHtmlCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var styleHtmlContent: js.UndefOr[Boolean] = js.undefined
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
  var update: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Updates the styleHtmlCls configuration
  		* @param newHtmlCls Object
  		* @param oldHtmlCls Object
  		*/
  var updateStyleHtmlCls: js.UndefOr[
    js.Function2[/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Number/String) */
  var width: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String[]) */
  var xtype: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IComponent {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addCls: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    baseCls: java.lang.String = null,
    border: js.Any = null,
    bottom: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    clearListeners: () => Unit = null,
    cls: js.Any = null,
    componentCls: java.lang.String = null,
    config: js.Any = null,
    contentEl: js.Any = null,
    data: js.Any = null,
    destroy: () => Unit = null,
    disable: () => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledCls: java.lang.String = null,
    dock: java.lang.String = null,
    docked: java.lang.String = null,
    enable: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    enterAnimation: js.Any = null,
    exitAnimation: js.Any = null,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    flex: Int | Double = null,
    floating: js.UndefOr[Boolean] = js.undefined,
    floatingCls: java.lang.String = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    getAlignmentInfo: (/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any]) => Unit = null,
    getBaseCls: () => java.lang.String = null,
    getBorder: () => _ = null,
    getBottom: () => _ = null,
    getBubbleEvents: () => _ = null,
    getCentered: () => Boolean = null,
    getCls: () => _ = null,
    getContentEl: () => _ = null,
    getData: () => _ = null,
    getDisabled: () => Boolean = null,
    getDisabledCls: () => java.lang.String = null,
    getDocked: () => java.lang.String = null,
    getEl: () => typings.senchaUnderscoreTouch.ExtNs.domNs.IElement = null,
    getEnterAnimation: () => _ = null,
    getExitAnimation: () => _ = null,
    getFlex: () => Double = null,
    getFloatingCls: () => java.lang.String = null,
    getHeight: () => _ = null,
    getHidden: () => Boolean = null,
    getHiddenCls: () => java.lang.String = null,
    getHideAnimation: () => _ = null,
    getHtml: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemId: () => java.lang.String = null,
    getLeft: () => _ = null,
    getListeners: () => _ = null,
    getMargin: () => _ = null,
    getMaxHeight: () => _ = null,
    getMaxWidth: () => _ = null,
    getMinHeight: () => _ = null,
    getMinWidth: () => _ = null,
    getPadding: () => _ = null,
    getParent: () => IComponent = null,
    getPlugins: () => _ = null,
    getRecord: () => IModel = null,
    getRenderTo: () => IElement = null,
    getRight: () => _ = null,
    getShowAnimation: () => _ = null,
    getSize: () => _ = null,
    getStyle: () => _ = null,
    getStyleHtmlCls: () => java.lang.String = null,
    getStyleHtmlContent: () => Boolean = null,
    getTop: () => _ = null,
    getTpl: () => _ = null,
    getTplWriteMode: () => java.lang.String = null,
    getUi: () => java.lang.String = null,
    getWidth: () => _ = null,
    getXTypes: () => java.lang.String = null,
    getZIndex: () => Double = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    hasParent: () => Boolean = null,
    height: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hiddenCls: java.lang.String = null,
    hide: /* animation */ js.UndefOr[js.Any] => IComponent = null,
    hideAnimation: js.Any = null,
    hideOnMaskTap: js.UndefOr[Boolean] = js.undefined,
    html: js.Any = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    initialize: () => Unit = null,
    isDisabled: () => Boolean = null,
    isHidden: () => Boolean = null,
    isXType: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean]) => Boolean = null,
    itemId: java.lang.String = null,
    layoutOnOrientationChange: js.UndefOr[Boolean] = js.undefined,
    left: js.Any = null,
    listeners: js.Any = null,
    margin: js.Any = null,
    maxHeight: js.Any = null,
    maxWidth: js.Any = null,
    minHeight: js.Any = null,
    minWidth: js.Any = null,
    mixins: js.Any = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    monitorOrientation: js.UndefOr[Boolean] = js.undefined,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    padding: js.Any = null,
    platformConfig: js.Any = null,
    plugins: js.Any = null,
    record: IModel = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeCls: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    renderTo: IElement = null,
    replaceCls: (/* oldCls */ js.UndefOr[java.lang.String], /* newCls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit = null,
    resetFloating: () => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    right: js.Any = null,
    scroll: js.Any = null,
    self: IClass = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => Unit = null,
    setBorder: /* border */ js.UndefOr[js.Any] => Unit = null,
    setBottom: /* bottom */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setCentered: /* centered */ js.UndefOr[Boolean] => Unit = null,
    setCls: /* cls */ js.UndefOr[js.Any] => Unit = null,
    setContentEl: /* contentEl */ js.UndefOr[js.Any] => Unit = null,
    setData: /* data */ js.UndefOr[js.Any] => Unit = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Unit = null,
    setDisabledCls: /* disabledCls */ js.UndefOr[java.lang.String] => Unit = null,
    setDocked: /* docked */ js.UndefOr[java.lang.String] => Unit = null,
    setDraggable: /* draggable */ js.UndefOr[js.Any] => Unit = null,
    setEnterAnimation: /* enterAnimation */ js.UndefOr[js.Any] => Unit = null,
    setExitAnimation: /* exitAnimation */ js.UndefOr[js.Any] => Unit = null,
    setFlex: /* flex */ js.UndefOr[Double] => Unit = null,
    setFloating: /* floating */ js.UndefOr[Boolean] => Unit = null,
    setFloatingCls: /* floatingCls */ js.UndefOr[java.lang.String] => Unit = null,
    setHeight: /* height */ js.UndefOr[js.Any] => Unit = null,
    setHidden: /* hidden */ js.UndefOr[Boolean] => Unit = null,
    setHiddenCls: /* hiddenCls */ js.UndefOr[java.lang.String] => Unit = null,
    setHideAnimation: /* hideAnimation */ js.UndefOr[js.Any] => Unit = null,
    setHtml: /* html */ js.UndefOr[js.Any] => Unit = null,
    setItemId: /* itemId */ js.UndefOr[java.lang.String] => Unit = null,
    setLeft: /* left */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMargin: /* margin */ js.UndefOr[js.Any] => Unit = null,
    setMaxHeight: /* maxHeight */ js.UndefOr[js.Any] => Unit = null,
    setMaxWidth: /* maxWidth */ js.UndefOr[js.Any] => Unit = null,
    setMinHeight: /* minHeight */ js.UndefOr[js.Any] => Unit = null,
    setMinWidth: /* minWidth */ js.UndefOr[js.Any] => Unit = null,
    setPadding: /* padding */ js.UndefOr[js.Any] => Unit = null,
    setPlugins: /* plugins */ js.UndefOr[js.Any] => Unit = null,
    setRecord: /* record */ js.UndefOr[IModel] => Unit = null,
    setRenderTo: /* renderTo */ js.UndefOr[IElement] => Unit = null,
    setRight: /* right */ js.UndefOr[js.Any] => Unit = null,
    setScrollable: () => Unit = null,
    setShowAnimation: /* showAnimation */ js.UndefOr[js.Any] => Unit = null,
    setSize: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => Unit = null,
    setStyleHtmlCls: /* styleHtmlCls */ js.UndefOr[java.lang.String] => Unit = null,
    setStyleHtmlContent: /* styleHtmlContent */ js.UndefOr[Boolean] => Unit = null,
    setTop: /* top */ js.UndefOr[js.Any] => Unit = null,
    setTpl: /* tpl */ js.UndefOr[js.Any] => Unit = null,
    setTplWriteMode: /* tplWriteMode */ js.UndefOr[java.lang.String] => Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => Unit = null,
    setWidth: /* width */ js.UndefOr[js.Any] => Unit = null,
    setZIndex: /* zIndex */ js.UndefOr[Double] => Unit = null,
    show: /* animation */ js.UndefOr[js.Any] => IComponent = null,
    showAnimation: js.Any = null,
    showBy: (/* component */ js.UndefOr[IComponent], /* alignment */ js.UndefOr[java.lang.String]) => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stopMaskTapEvent: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    styleHtmlCls: java.lang.String = null,
    styleHtmlContent: js.UndefOr[Boolean] = js.undefined,
    suspendEvents: () => Unit = null,
    top: js.Any = null,
    tpl: js.Any = null,
    tplWriteMode: java.lang.String = null,
    ui: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    up: /* selector */ js.UndefOr[java.lang.String] => IContainer = null,
    update: () => Unit = null,
    updateStyleHtmlCls: (/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    width: js.Any = null,
    xtype: java.lang.String = null,
    zIndex: Int | Double = null
  ): IComponent = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3(addCls))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (border != null) __obj.updateDynamic("border")(border)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contentEl != null) __obj.updateDynamic("contentEl")(contentEl)
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledCls != null) __obj.updateDynamic("disabledCls")(disabledCls)
    if (dock != null) __obj.updateDynamic("dock")(dock)
    if (docked != null) __obj.updateDynamic("docked")(docked)
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (exitAnimation != null) __obj.updateDynamic("exitAnimation")(exitAnimation)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (floatingCls != null) __obj.updateDynamic("floatingCls")(floatingCls)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (getAlignmentInfo != null) __obj.updateDynamic("getAlignmentInfo")(js.Any.fromFunction2(getAlignmentInfo))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getBorder != null) __obj.updateDynamic("getBorder")(js.Any.fromFunction0(getBorder))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCentered != null) __obj.updateDynamic("getCentered")(js.Any.fromFunction0(getCentered))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getContentEl != null) __obj.updateDynamic("getContentEl")(js.Any.fromFunction0(getContentEl))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getDisabled != null) __obj.updateDynamic("getDisabled")(js.Any.fromFunction0(getDisabled))
    if (getDisabledCls != null) __obj.updateDynamic("getDisabledCls")(js.Any.fromFunction0(getDisabledCls))
    if (getDocked != null) __obj.updateDynamic("getDocked")(js.Any.fromFunction0(getDocked))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getEnterAnimation != null) __obj.updateDynamic("getEnterAnimation")(js.Any.fromFunction0(getEnterAnimation))
    if (getExitAnimation != null) __obj.updateDynamic("getExitAnimation")(js.Any.fromFunction0(getExitAnimation))
    if (getFlex != null) __obj.updateDynamic("getFlex")(js.Any.fromFunction0(getFlex))
    if (getFloatingCls != null) __obj.updateDynamic("getFloatingCls")(js.Any.fromFunction0(getFloatingCls))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction0(getHeight))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getHiddenCls != null) __obj.updateDynamic("getHiddenCls")(js.Any.fromFunction0(getHiddenCls))
    if (getHideAnimation != null) __obj.updateDynamic("getHideAnimation")(js.Any.fromFunction0(getHideAnimation))
    if (getHtml != null) __obj.updateDynamic("getHtml")(js.Any.fromFunction0(getHtml))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemId != null) __obj.updateDynamic("getItemId")(js.Any.fromFunction0(getItemId))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction0(getLeft))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction0(getMargin))
    if (getMaxHeight != null) __obj.updateDynamic("getMaxHeight")(js.Any.fromFunction0(getMaxHeight))
    if (getMaxWidth != null) __obj.updateDynamic("getMaxWidth")(js.Any.fromFunction0(getMaxWidth))
    if (getMinHeight != null) __obj.updateDynamic("getMinHeight")(js.Any.fromFunction0(getMinHeight))
    if (getMinWidth != null) __obj.updateDynamic("getMinWidth")(js.Any.fromFunction0(getMinWidth))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction0(getPadding))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction0(getParent))
    if (getPlugins != null) __obj.updateDynamic("getPlugins")(js.Any.fromFunction0(getPlugins))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (getRenderTo != null) __obj.updateDynamic("getRenderTo")(js.Any.fromFunction0(getRenderTo))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction0(getRight))
    if (getShowAnimation != null) __obj.updateDynamic("getShowAnimation")(js.Any.fromFunction0(getShowAnimation))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction0(getSize))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getStyleHtmlCls != null) __obj.updateDynamic("getStyleHtmlCls")(js.Any.fromFunction0(getStyleHtmlCls))
    if (getStyleHtmlContent != null) __obj.updateDynamic("getStyleHtmlContent")(js.Any.fromFunction0(getStyleHtmlContent))
    if (getTop != null) __obj.updateDynamic("getTop")(js.Any.fromFunction0(getTop))
    if (getTpl != null) __obj.updateDynamic("getTpl")(js.Any.fromFunction0(getTpl))
    if (getTplWriteMode != null) __obj.updateDynamic("getTplWriteMode")(js.Any.fromFunction0(getTplWriteMode))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (getXTypes != null) __obj.updateDynamic("getXTypes")(js.Any.fromFunction0(getXTypes))
    if (getZIndex != null) __obj.updateDynamic("getZIndex")(js.Any.fromFunction0(getZIndex))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasParent != null) __obj.updateDynamic("hasParent")(js.Any.fromFunction0(hasParent))
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hiddenCls != null) __obj.updateDynamic("hiddenCls")(hiddenCls)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation)
    if (!js.isUndefined(hideOnMaskTap)) __obj.updateDynamic("hideOnMaskTap")(hideOnMaskTap)
    if (html != null) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (isDisabled != null) __obj.updateDynamic("isDisabled")(js.Any.fromFunction0(isDisabled))
    if (isHidden != null) __obj.updateDynamic("isHidden")(js.Any.fromFunction0(isHidden))
    if (isXType != null) __obj.updateDynamic("isXType")(js.Any.fromFunction2(isXType))
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (!js.isUndefined(layoutOnOrientationChange)) __obj.updateDynamic("layoutOnOrientationChange")(layoutOnOrientationChange)
    if (left != null) __obj.updateDynamic("left")(left)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (!js.isUndefined(monitorOrientation)) __obj.updateDynamic("monitorOrientation")(monitorOrientation)
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (record != null) __obj.updateDynamic("record")(record)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction3(removeCls))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderTo != null) __obj.updateDynamic("renderTo")(renderTo)
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4(replaceCls))
    if (resetFloating != null) __obj.updateDynamic("resetFloating")(js.Any.fromFunction0(resetFloating))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (right != null) __obj.updateDynamic("right")(right)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setBorder != null) __obj.updateDynamic("setBorder")(js.Any.fromFunction1(setBorder))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCentered != null) __obj.updateDynamic("setCentered")(js.Any.fromFunction1(setCentered))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setContentEl != null) __obj.updateDynamic("setContentEl")(js.Any.fromFunction1(setContentEl))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1(setDisabled))
    if (setDisabledCls != null) __obj.updateDynamic("setDisabledCls")(js.Any.fromFunction1(setDisabledCls))
    if (setDocked != null) __obj.updateDynamic("setDocked")(js.Any.fromFunction1(setDocked))
    if (setDraggable != null) __obj.updateDynamic("setDraggable")(js.Any.fromFunction1(setDraggable))
    if (setEnterAnimation != null) __obj.updateDynamic("setEnterAnimation")(js.Any.fromFunction1(setEnterAnimation))
    if (setExitAnimation != null) __obj.updateDynamic("setExitAnimation")(js.Any.fromFunction1(setExitAnimation))
    if (setFlex != null) __obj.updateDynamic("setFlex")(js.Any.fromFunction1(setFlex))
    if (setFloating != null) __obj.updateDynamic("setFloating")(js.Any.fromFunction1(setFloating))
    if (setFloatingCls != null) __obj.updateDynamic("setFloatingCls")(js.Any.fromFunction1(setFloatingCls))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setHiddenCls != null) __obj.updateDynamic("setHiddenCls")(js.Any.fromFunction1(setHiddenCls))
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(js.Any.fromFunction1(setHideAnimation))
    if (setHtml != null) __obj.updateDynamic("setHtml")(js.Any.fromFunction1(setHtml))
    if (setItemId != null) __obj.updateDynamic("setItemId")(js.Any.fromFunction1(setItemId))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMargin != null) __obj.updateDynamic("setMargin")(js.Any.fromFunction1(setMargin))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1(setMaxHeight))
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(js.Any.fromFunction1(setMaxWidth))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1(setMinHeight))
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(js.Any.fromFunction1(setMinWidth))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction1(setPadding))
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(js.Any.fromFunction1(setPlugins))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1(setRecord))
    if (setRenderTo != null) __obj.updateDynamic("setRenderTo")(js.Any.fromFunction1(setRenderTo))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    if (setScrollable != null) __obj.updateDynamic("setScrollable")(js.Any.fromFunction0(setScrollable))
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(js.Any.fromFunction1(setShowAnimation))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setStyleHtmlCls != null) __obj.updateDynamic("setStyleHtmlCls")(js.Any.fromFunction1(setStyleHtmlCls))
    if (setStyleHtmlContent != null) __obj.updateDynamic("setStyleHtmlContent")(js.Any.fromFunction1(setStyleHtmlContent))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1(setTop))
    if (setTpl != null) __obj.updateDynamic("setTpl")(js.Any.fromFunction1(setTpl))
    if (setTplWriteMode != null) __obj.updateDynamic("setTplWriteMode")(js.Any.fromFunction1(setTplWriteMode))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(js.Any.fromFunction1(setZIndex))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation)
    if (showBy != null) __obj.updateDynamic("showBy")(js.Any.fromFunction2(showBy))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(stopMaskTapEvent)) __obj.updateDynamic("stopMaskTapEvent")(stopMaskTapEvent)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styleHtmlCls != null) __obj.updateDynamic("styleHtmlCls")(styleHtmlCls)
    if (!js.isUndefined(styleHtmlContent)) __obj.updateDynamic("styleHtmlContent")(styleHtmlContent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (top != null) __obj.updateDynamic("top")(top)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (tplWriteMode != null) __obj.updateDynamic("tplWriteMode")(tplWriteMode)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction1(up))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction0(update))
    if (updateStyleHtmlCls != null) __obj.updateDynamic("updateStyleHtmlCls")(js.Any.fromFunction2(updateStyleHtmlCls))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (width != null) __obj.updateDynamic("width")(width)
    if (xtype != null) __obj.updateDynamic("xtype")(xtype)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponent]
  }
}

