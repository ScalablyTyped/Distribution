package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComponent
  extends StObject
     with IEvented {
  
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
  var border: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/String) */
  var bottom: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var centered: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String/String[]) */
  var cls: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Ext.Element/HTMLElement/String) */
  var contentEl: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var data: js.UndefOr[Any] = js.undefined
  
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
  var enterAnimation: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/Mixed) */
  var exitAnimation: js.UndefOr[Any] = js.undefined
  
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
    js.Function2[/* component */ js.UndefOr[Any], /* alignment */ js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Method] Returns the value of baseCls
    * @returns String
    */
  var getBaseCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of border
    * @returns Number/String
    */
  var getBorder: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of bottom
    * @returns any
    */
  var getBottom: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of centered
    * @returns Boolean
    */
  var getCentered: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of cls
    * @returns any
    */
  var getCls: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of contentEl
    * @returns Ext.Element/HTMLElement/String
    */
  var getContentEl: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of data
    * @returns Object
    */
  var getData: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getEl: js.UndefOr[js.Function0[typings.senchaTouch.Ext.dom.IElement]] = js.undefined
  
  /** [Method] Returns the value of enterAnimation
    * @returns String/Mixed
    */
  var getEnterAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of exitAnimation
    * @returns String/Mixed
    */
  var getExitAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getHeight: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getHideAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of html
    * @returns String/Ext.Element/HTMLElement
    */
  var getHtml: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of itemId
    * @returns String
    */
  var getItemId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of left
    * @returns Number/String
    */
  var getLeft: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of margin
    * @returns Number/String
    */
  var getMargin: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of maxHeight
    * @returns Number/String
    */
  var getMaxHeight: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of maxWidth
    * @returns Number/String
    */
  var getMaxWidth: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of minHeight
    * @returns Number/String
    */
  var getMinHeight: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of minWidth
    * @returns Number/String
    */
  var getMinWidth: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of padding
    * @returns Number/String
    */
  var getPadding: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the parent of this component if it has one
    * @returns Ext.Component The parent of this component.
    */
  var getParent: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Returns the value of plugins
    * @returns Object/Array
    */
  var getPlugins: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getRight: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of showAnimation
    * @returns String/Mixed
    */
  var getShowAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the height and width of the Component
    * @returns Object The current height and width of the Component.
    */
  var getSize: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of style
    * @returns String/Object
    */
  var getStyle: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getTop: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of tpl
    * @returns String/String[]/Ext.Template/Ext.XTemplate[]
    */
  var getTpl: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var getWidth: js.UndefOr[js.Function0[Any]] = js.undefined
  
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
  var height: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var hiddenCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Hides this Component optionally using an animation
    * @param animation Object/Boolean You can specify an animation here or a bool to use the hideAnimation config.
    * @returns Ext.Component
    */
  var hide: js.UndefOr[js.Function1[/* animation */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Config Option] (String/Mixed) */
  var hideAnimation: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hideOnMaskTap: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String/Ext.Element/HTMLElement) */
  var html: js.UndefOr[Any] = js.undefined
  
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
  var left: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/String) */
  var margin: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/String) */
  var maxHeight: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/String) */
  var maxWidth: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/String) */
  var minHeight: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number/String) */
  var minWidth: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var monitorOrientation: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[Any] = js.undefined
  
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
  var right: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean/String/Object) */
  var scroll: js.UndefOr[Any] = js.undefined
  
  /** [Method] Sets the value of baseCls
    * @param baseCls String The new value.
    */
  var setBaseCls: js.UndefOr[js.Function1[/* baseCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of border
    * @param border Number/String The new value.
    */
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of bottom
    * @param bottom Number/String The new value.
    */
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of centered
    * @param centered Boolean The new value.
    */
  var setCentered: js.UndefOr[js.Function1[/* centered */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String/String[] The new value.
    */
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of contentEl
    * @param contentEl Ext.Element/HTMLElement/String The new value.
    */
  var setContentEl: js.UndefOr[js.Function1[/* contentEl */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setDraggable: js.UndefOr[js.Function1[/* draggable */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of enterAnimation
    * @param enterAnimation String/Mixed The new value.
    */
  var setEnterAnimation: js.UndefOr[js.Function1[/* enterAnimation */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of exitAnimation
    * @param exitAnimation String/Mixed The new value.
    */
  var setExitAnimation: js.UndefOr[js.Function1[/* exitAnimation */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setHideAnimation: js.UndefOr[js.Function1[/* hideAnimation */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of html
    * @param html String/Ext.Element/HTMLElement The new value.
    */
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of itemId
    * @param itemId String The new value.
    */
  var setItemId: js.UndefOr[js.Function1[/* itemId */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of left
    * @param left Number/String The new value.
    */
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of margin
    * @param margin Number/String The new value.
    */
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxHeight
    * @param maxHeight Number/String The new value.
    */
  var setMaxHeight: js.UndefOr[js.Function1[/* maxHeight */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxWidth
    * @param maxWidth Number/String The new value.
    */
  var setMaxWidth: js.UndefOr[js.Function1[/* maxWidth */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of minHeight
    * @param minHeight Number/String The new value.
    */
  var setMinHeight: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of minWidth
    * @param minWidth Number/String The new value.
    */
  var setMinWidth: js.UndefOr[js.Function1[/* minWidth */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of padding
    * @param padding Number/String The new value.
    */
  var setPadding: js.UndefOr[js.Function1[/* padding */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of plugins
    * @param plugins Object/Array The new value.
    */
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method has moved to Ext Container  */
  var setScrollable: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the value of showAnimation
    * @param showAnimation String/Mixed The new value.
    */
  var setShowAnimation: js.UndefOr[js.Function1[/* showAnimation */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of tpl
    * @param tpl String/String[]/Ext.Template/Ext.XTemplate[] The new value.
    */
  var setTpl: js.UndefOr[js.Function1[/* tpl */ js.UndefOr[Any], Unit]] = js.undefined
  
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
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of zIndex
    * @param zIndex Number The new value.
    */
  var setZIndex: js.UndefOr[js.Function1[/* zIndex */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Shows this component optionally using an animation
    * @param animation Object/Boolean You can specify an animation here or a bool to use the showAnimation config.
    * @returns Ext.Component
    */
  var show: js.UndefOr[js.Function1[/* animation */ js.UndefOr[Any], this.type]] = js.undefined
  
  /** [Config Option] (String/Mixed) */
  var showAnimation: js.UndefOr[Any] = js.undefined
  
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
  var style: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var styleHtmlCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var styleHtmlContent: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number/String) */
  var top: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String/String[]/Ext.Template/Ext.XTemplate[]) */
  var tpl: js.UndefOr[Any] = js.undefined
  
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
    js.Function2[/* newHtmlCls */ js.UndefOr[Any], /* oldHtmlCls */ js.UndefOr[Any], Unit]
  ] = js.undefined
  
  /** [Config Option] (Number/String) */
  var width: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String[]) */
  var xtype: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object IComponent {
  
  inline def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  
  extension [Self <: IComponent](x: Self) {
    
    inline def setAddCls(
      value: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit
    ): Self = StObject.set(x, "addCls", js.Any.fromFunction3(value))
    
    inline def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
    
    inline def setBaseCls(value: java.lang.String): Self = StObject.set(x, "baseCls", value.asInstanceOf[js.Any])
    
    inline def setBaseClsUndefined: Self = StObject.set(x, "baseCls", js.undefined)
    
    inline def setBorder(value: Any): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBottom(value: Any): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    inline def setCls(value: Any): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setComponentCls(value: java.lang.String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    
    inline def setComponentClsUndefined: Self = StObject.set(x, "componentCls", js.undefined)
    
    inline def setContentEl(value: Any): Self = StObject.set(x, "contentEl", value.asInstanceOf[js.Any])
    
    inline def setContentElUndefined: Self = StObject.set(x, "contentEl", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledCls(value: java.lang.String): Self = StObject.set(x, "disabledCls", value.asInstanceOf[js.Any])
    
    inline def setDisabledClsUndefined: Self = StObject.set(x, "disabledCls", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDock(value: java.lang.String): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
    
    inline def setDockUndefined: Self = StObject.set(x, "dock", js.undefined)
    
    inline def setDocked(value: java.lang.String): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
    
    inline def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setEnterAnimation(value: Any): Self = StObject.set(x, "enterAnimation", value.asInstanceOf[js.Any])
    
    inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
    
    inline def setExitAnimation(value: Any): Self = StObject.set(x, "exitAnimation", value.asInstanceOf[js.Any])
    
    inline def setExitAnimationUndefined: Self = StObject.set(x, "exitAnimation", js.undefined)
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
    
    inline def setFloatingCls(value: java.lang.String): Self = StObject.set(x, "floatingCls", value.asInstanceOf[js.Any])
    
    inline def setFloatingClsUndefined: Self = StObject.set(x, "floatingCls", js.undefined)
    
    inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setGetAlignmentInfo(value: (/* component */ js.UndefOr[Any], /* alignment */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "getAlignmentInfo", js.Any.fromFunction2(value))
    
    inline def setGetAlignmentInfoUndefined: Self = StObject.set(x, "getAlignmentInfo", js.undefined)
    
    inline def setGetBaseCls(value: () => java.lang.String): Self = StObject.set(x, "getBaseCls", js.Any.fromFunction0(value))
    
    inline def setGetBaseClsUndefined: Self = StObject.set(x, "getBaseCls", js.undefined)
    
    inline def setGetBorder(value: () => Any): Self = StObject.set(x, "getBorder", js.Any.fromFunction0(value))
    
    inline def setGetBorderUndefined: Self = StObject.set(x, "getBorder", js.undefined)
    
    inline def setGetBottom(value: () => Any): Self = StObject.set(x, "getBottom", js.Any.fromFunction0(value))
    
    inline def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
    
    inline def setGetCentered(value: () => Boolean): Self = StObject.set(x, "getCentered", js.Any.fromFunction0(value))
    
    inline def setGetCenteredUndefined: Self = StObject.set(x, "getCentered", js.undefined)
    
    inline def setGetCls(value: () => Any): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetContentEl(value: () => Any): Self = StObject.set(x, "getContentEl", js.Any.fromFunction0(value))
    
    inline def setGetContentElUndefined: Self = StObject.set(x, "getContentEl", js.undefined)
    
    inline def setGetData(value: () => Any): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    inline def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    inline def setGetDisabled(value: () => Boolean): Self = StObject.set(x, "getDisabled", js.Any.fromFunction0(value))
    
    inline def setGetDisabledCls(value: () => java.lang.String): Self = StObject.set(x, "getDisabledCls", js.Any.fromFunction0(value))
    
    inline def setGetDisabledClsUndefined: Self = StObject.set(x, "getDisabledCls", js.undefined)
    
    inline def setGetDisabledUndefined: Self = StObject.set(x, "getDisabled", js.undefined)
    
    inline def setGetDocked(value: () => java.lang.String): Self = StObject.set(x, "getDocked", js.Any.fromFunction0(value))
    
    inline def setGetDockedUndefined: Self = StObject.set(x, "getDocked", js.undefined)
    
    inline def setGetEl(value: () => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "getEl", js.Any.fromFunction0(value))
    
    inline def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
    
    inline def setGetEnterAnimation(value: () => Any): Self = StObject.set(x, "getEnterAnimation", js.Any.fromFunction0(value))
    
    inline def setGetEnterAnimationUndefined: Self = StObject.set(x, "getEnterAnimation", js.undefined)
    
    inline def setGetExitAnimation(value: () => Any): Self = StObject.set(x, "getExitAnimation", js.Any.fromFunction0(value))
    
    inline def setGetExitAnimationUndefined: Self = StObject.set(x, "getExitAnimation", js.undefined)
    
    inline def setGetFlex(value: () => Double): Self = StObject.set(x, "getFlex", js.Any.fromFunction0(value))
    
    inline def setGetFlexUndefined: Self = StObject.set(x, "getFlex", js.undefined)
    
    inline def setGetFloatingCls(value: () => java.lang.String): Self = StObject.set(x, "getFloatingCls", js.Any.fromFunction0(value))
    
    inline def setGetFloatingClsUndefined: Self = StObject.set(x, "getFloatingCls", js.undefined)
    
    inline def setGetHeight(value: () => Any): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    inline def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
    
    inline def setGetHidden(value: () => Boolean): Self = StObject.set(x, "getHidden", js.Any.fromFunction0(value))
    
    inline def setGetHiddenCls(value: () => java.lang.String): Self = StObject.set(x, "getHiddenCls", js.Any.fromFunction0(value))
    
    inline def setGetHiddenClsUndefined: Self = StObject.set(x, "getHiddenCls", js.undefined)
    
    inline def setGetHiddenUndefined: Self = StObject.set(x, "getHidden", js.undefined)
    
    inline def setGetHideAnimation(value: () => Any): Self = StObject.set(x, "getHideAnimation", js.Any.fromFunction0(value))
    
    inline def setGetHideAnimationUndefined: Self = StObject.set(x, "getHideAnimation", js.undefined)
    
    inline def setGetHtml(value: () => Any): Self = StObject.set(x, "getHtml", js.Any.fromFunction0(value))
    
    inline def setGetHtmlUndefined: Self = StObject.set(x, "getHtml", js.undefined)
    
    inline def setGetItemId(value: () => java.lang.String): Self = StObject.set(x, "getItemId", js.Any.fromFunction0(value))
    
    inline def setGetItemIdUndefined: Self = StObject.set(x, "getItemId", js.undefined)
    
    inline def setGetLeft(value: () => Any): Self = StObject.set(x, "getLeft", js.Any.fromFunction0(value))
    
    inline def setGetLeftUndefined: Self = StObject.set(x, "getLeft", js.undefined)
    
    inline def setGetMargin(value: () => Any): Self = StObject.set(x, "getMargin", js.Any.fromFunction0(value))
    
    inline def setGetMarginUndefined: Self = StObject.set(x, "getMargin", js.undefined)
    
    inline def setGetMaxHeight(value: () => Any): Self = StObject.set(x, "getMaxHeight", js.Any.fromFunction0(value))
    
    inline def setGetMaxHeightUndefined: Self = StObject.set(x, "getMaxHeight", js.undefined)
    
    inline def setGetMaxWidth(value: () => Any): Self = StObject.set(x, "getMaxWidth", js.Any.fromFunction0(value))
    
    inline def setGetMaxWidthUndefined: Self = StObject.set(x, "getMaxWidth", js.undefined)
    
    inline def setGetMinHeight(value: () => Any): Self = StObject.set(x, "getMinHeight", js.Any.fromFunction0(value))
    
    inline def setGetMinHeightUndefined: Self = StObject.set(x, "getMinHeight", js.undefined)
    
    inline def setGetMinWidth(value: () => Any): Self = StObject.set(x, "getMinWidth", js.Any.fromFunction0(value))
    
    inline def setGetMinWidthUndefined: Self = StObject.set(x, "getMinWidth", js.undefined)
    
    inline def setGetPadding(value: () => Any): Self = StObject.set(x, "getPadding", js.Any.fromFunction0(value))
    
    inline def setGetPaddingUndefined: Self = StObject.set(x, "getPadding", js.undefined)
    
    inline def setGetParent(value: () => IComponent): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    inline def setGetParentUndefined: Self = StObject.set(x, "getParent", js.undefined)
    
    inline def setGetPlugins(value: () => Any): Self = StObject.set(x, "getPlugins", js.Any.fromFunction0(value))
    
    inline def setGetPluginsUndefined: Self = StObject.set(x, "getPlugins", js.undefined)
    
    inline def setGetRecord(value: () => IModel): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
    
    inline def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
    
    inline def setGetRenderTo(value: () => IElement): Self = StObject.set(x, "getRenderTo", js.Any.fromFunction0(value))
    
    inline def setGetRenderToUndefined: Self = StObject.set(x, "getRenderTo", js.undefined)
    
    inline def setGetRight(value: () => Any): Self = StObject.set(x, "getRight", js.Any.fromFunction0(value))
    
    inline def setGetRightUndefined: Self = StObject.set(x, "getRight", js.undefined)
    
    inline def setGetShowAnimation(value: () => Any): Self = StObject.set(x, "getShowAnimation", js.Any.fromFunction0(value))
    
    inline def setGetShowAnimationUndefined: Self = StObject.set(x, "getShowAnimation", js.undefined)
    
    inline def setGetSize(value: () => Any): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    inline def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
    
    inline def setGetStyle(value: () => Any): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
    
    inline def setGetStyleHtmlCls(value: () => java.lang.String): Self = StObject.set(x, "getStyleHtmlCls", js.Any.fromFunction0(value))
    
    inline def setGetStyleHtmlClsUndefined: Self = StObject.set(x, "getStyleHtmlCls", js.undefined)
    
    inline def setGetStyleHtmlContent(value: () => Boolean): Self = StObject.set(x, "getStyleHtmlContent", js.Any.fromFunction0(value))
    
    inline def setGetStyleHtmlContentUndefined: Self = StObject.set(x, "getStyleHtmlContent", js.undefined)
    
    inline def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
    
    inline def setGetTop(value: () => Any): Self = StObject.set(x, "getTop", js.Any.fromFunction0(value))
    
    inline def setGetTopUndefined: Self = StObject.set(x, "getTop", js.undefined)
    
    inline def setGetTpl(value: () => Any): Self = StObject.set(x, "getTpl", js.Any.fromFunction0(value))
    
    inline def setGetTplUndefined: Self = StObject.set(x, "getTpl", js.undefined)
    
    inline def setGetTplWriteMode(value: () => java.lang.String): Self = StObject.set(x, "getTplWriteMode", js.Any.fromFunction0(value))
    
    inline def setGetTplWriteModeUndefined: Self = StObject.set(x, "getTplWriteMode", js.undefined)
    
    inline def setGetUi(value: () => java.lang.String): Self = StObject.set(x, "getUi", js.Any.fromFunction0(value))
    
    inline def setGetUiUndefined: Self = StObject.set(x, "getUi", js.undefined)
    
    inline def setGetWidth(value: () => Any): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
    
    inline def setGetXTypes(value: () => java.lang.String): Self = StObject.set(x, "getXTypes", js.Any.fromFunction0(value))
    
    inline def setGetXTypesUndefined: Self = StObject.set(x, "getXTypes", js.undefined)
    
    inline def setGetZIndex(value: () => Double): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
    
    inline def setGetZIndexUndefined: Self = StObject.set(x, "getZIndex", js.undefined)
    
    inline def setHasParent(value: () => Boolean): Self = StObject.set(x, "hasParent", js.Any.fromFunction0(value))
    
    inline def setHasParentUndefined: Self = StObject.set(x, "hasParent", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenCls(value: java.lang.String): Self = StObject.set(x, "hiddenCls", value.asInstanceOf[js.Any])
    
    inline def setHiddenClsUndefined: Self = StObject.set(x, "hiddenCls", js.undefined)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHide(value: /* animation */ js.UndefOr[Any] => IComponent): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setHideAnimation(value: Any): Self = StObject.set(x, "hideAnimation", value.asInstanceOf[js.Any])
    
    inline def setHideAnimationUndefined: Self = StObject.set(x, "hideAnimation", js.undefined)
    
    inline def setHideOnMaskTap(value: Boolean): Self = StObject.set(x, "hideOnMaskTap", value.asInstanceOf[js.Any])
    
    inline def setHideOnMaskTapUndefined: Self = StObject.set(x, "hideOnMaskTap", js.undefined)
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setHtml(value: Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
    
    inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    inline def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setIsHidden(value: () => Boolean): Self = StObject.set(x, "isHidden", js.Any.fromFunction0(value))
    
    inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
    
    inline def setIsXType(value: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean]) => Boolean): Self = StObject.set(x, "isXType", js.Any.fromFunction2(value))
    
    inline def setIsXTypeUndefined: Self = StObject.set(x, "isXType", js.undefined)
    
    inline def setItemId(value: java.lang.String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setLayoutOnOrientationChange(value: Boolean): Self = StObject.set(x, "layoutOnOrientationChange", value.asInstanceOf[js.Any])
    
    inline def setLayoutOnOrientationChangeUndefined: Self = StObject.set(x, "layoutOnOrientationChange", js.undefined)
    
    inline def setLeft(value: Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMargin(value: Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxHeight(value: Any): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Any): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Any): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Any): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setMonitorOrientation(value: Boolean): Self = StObject.set(x, "monitorOrientation", value.asInstanceOf[js.Any])
    
    inline def setMonitorOrientationUndefined: Self = StObject.set(x, "monitorOrientation", js.undefined)
    
    inline def setPadding(value: Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPlugins(value: Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setRecord(value: IModel): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setRemoveCls(
      value: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit
    ): Self = StObject.set(x, "removeCls", js.Any.fromFunction3(value))
    
    inline def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
    
    inline def setRenderTo(value: IElement): Self = StObject.set(x, "renderTo", value.asInstanceOf[js.Any])
    
    inline def setRenderToUndefined: Self = StObject.set(x, "renderTo", js.undefined)
    
    inline def setReplaceCls(
      value: (/* oldCls */ js.UndefOr[java.lang.String], /* newCls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit
    ): Self = StObject.set(x, "replaceCls", js.Any.fromFunction4(value))
    
    inline def setReplaceClsUndefined: Self = StObject.set(x, "replaceCls", js.undefined)
    
    inline def setResetFloating(value: () => Unit): Self = StObject.set(x, "resetFloating", js.Any.fromFunction0(value))
    
    inline def setResetFloatingUndefined: Self = StObject.set(x, "resetFloating", js.undefined)
    
    inline def setRight(value: Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setScroll(value: Any): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSetBaseCls(value: /* baseCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setBaseCls", js.Any.fromFunction1(value))
    
    inline def setSetBaseClsUndefined: Self = StObject.set(x, "setBaseCls", js.undefined)
    
    inline def setSetBorder(value: /* border */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBorder", js.Any.fromFunction1(value))
    
    inline def setSetBorderUndefined: Self = StObject.set(x, "setBorder", js.undefined)
    
    inline def setSetBottom(value: /* bottom */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
    
    inline def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
    
    inline def setSetCentered(value: /* centered */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setCentered", js.Any.fromFunction1(value))
    
    inline def setSetCenteredUndefined: Self = StObject.set(x, "setCentered", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetContentEl(value: /* contentEl */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setContentEl", js.Any.fromFunction1(value))
    
    inline def setSetContentElUndefined: Self = StObject.set(x, "setContentEl", js.undefined)
    
    inline def setSetData(value: /* data */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
    
    inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
    
    inline def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    
    inline def setSetDisabledCls(value: /* disabledCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDisabledCls", js.Any.fromFunction1(value))
    
    inline def setSetDisabledClsUndefined: Self = StObject.set(x, "setDisabledCls", js.undefined)
    
    inline def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
    
    inline def setSetDocked(value: /* docked */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDocked", js.Any.fromFunction1(value))
    
    inline def setSetDockedUndefined: Self = StObject.set(x, "setDocked", js.undefined)
    
    inline def setSetDraggable(value: /* draggable */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setDraggable", js.Any.fromFunction1(value))
    
    inline def setSetDraggableUndefined: Self = StObject.set(x, "setDraggable", js.undefined)
    
    inline def setSetEnterAnimation(value: /* enterAnimation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setEnterAnimation", js.Any.fromFunction1(value))
    
    inline def setSetEnterAnimationUndefined: Self = StObject.set(x, "setEnterAnimation", js.undefined)
    
    inline def setSetExitAnimation(value: /* exitAnimation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setExitAnimation", js.Any.fromFunction1(value))
    
    inline def setSetExitAnimationUndefined: Self = StObject.set(x, "setExitAnimation", js.undefined)
    
    inline def setSetFlex(value: /* flex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setFlex", js.Any.fromFunction1(value))
    
    inline def setSetFlexUndefined: Self = StObject.set(x, "setFlex", js.undefined)
    
    inline def setSetFloating(value: /* floating */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setFloating", js.Any.fromFunction1(value))
    
    inline def setSetFloatingCls(value: /* floatingCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setFloatingCls", js.Any.fromFunction1(value))
    
    inline def setSetFloatingClsUndefined: Self = StObject.set(x, "setFloatingCls", js.undefined)
    
    inline def setSetFloatingUndefined: Self = StObject.set(x, "setFloating", js.undefined)
    
    inline def setSetHeight(value: /* height */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHidden", js.Any.fromFunction1(value))
    
    inline def setSetHiddenCls(value: /* hiddenCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setHiddenCls", js.Any.fromFunction1(value))
    
    inline def setSetHiddenClsUndefined: Self = StObject.set(x, "setHiddenCls", js.undefined)
    
    inline def setSetHiddenUndefined: Self = StObject.set(x, "setHidden", js.undefined)
    
    inline def setSetHideAnimation(value: /* hideAnimation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setHideAnimation", js.Any.fromFunction1(value))
    
    inline def setSetHideAnimationUndefined: Self = StObject.set(x, "setHideAnimation", js.undefined)
    
    inline def setSetHtml(value: /* html */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setHtml", js.Any.fromFunction1(value))
    
    inline def setSetHtmlUndefined: Self = StObject.set(x, "setHtml", js.undefined)
    
    inline def setSetItemId(value: /* itemId */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setItemId", js.Any.fromFunction1(value))
    
    inline def setSetItemIdUndefined: Self = StObject.set(x, "setItemId", js.undefined)
    
    inline def setSetLeft(value: /* left */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
    
    inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
    
    inline def setSetMargin(value: /* margin */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMargin", js.Any.fromFunction1(value))
    
    inline def setSetMarginUndefined: Self = StObject.set(x, "setMargin", js.undefined)
    
    inline def setSetMaxHeight(value: /* maxHeight */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
    
    inline def setSetMaxHeightUndefined: Self = StObject.set(x, "setMaxHeight", js.undefined)
    
    inline def setSetMaxWidth(value: /* maxWidth */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMaxWidth", js.Any.fromFunction1(value))
    
    inline def setSetMaxWidthUndefined: Self = StObject.set(x, "setMaxWidth", js.undefined)
    
    inline def setSetMinHeight(value: /* minHeight */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1(value))
    
    inline def setSetMinHeightUndefined: Self = StObject.set(x, "setMinHeight", js.undefined)
    
    inline def setSetMinWidth(value: /* minWidth */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setMinWidth", js.Any.fromFunction1(value))
    
    inline def setSetMinWidthUndefined: Self = StObject.set(x, "setMinWidth", js.undefined)
    
    inline def setSetPadding(value: /* padding */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setPadding", js.Any.fromFunction1(value))
    
    inline def setSetPaddingUndefined: Self = StObject.set(x, "setPadding", js.undefined)
    
    inline def setSetPlugins(value: /* plugins */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setPlugins", js.Any.fromFunction1(value))
    
    inline def setSetPluginsUndefined: Self = StObject.set(x, "setPlugins", js.undefined)
    
    inline def setSetRecord(value: /* record */ js.UndefOr[IModel] => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction1(value))
    
    inline def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
    
    inline def setSetRenderTo(value: /* renderTo */ js.UndefOr[IElement] => Unit): Self = StObject.set(x, "setRenderTo", js.Any.fromFunction1(value))
    
    inline def setSetRenderToUndefined: Self = StObject.set(x, "setRenderTo", js.undefined)
    
    inline def setSetRight(value: /* right */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
    
    inline def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
    
    inline def setSetScrollable(value: () => Unit): Self = StObject.set(x, "setScrollable", js.Any.fromFunction0(value))
    
    inline def setSetScrollableUndefined: Self = StObject.set(x, "setScrollable", js.undefined)
    
    inline def setSetShowAnimation(value: /* showAnimation */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setShowAnimation", js.Any.fromFunction1(value))
    
    inline def setSetShowAnimationUndefined: Self = StObject.set(x, "setShowAnimation", js.undefined)
    
    inline def setSetSize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    inline def setSetStyle(value: /* style */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
    
    inline def setSetStyleHtmlCls(value: /* styleHtmlCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setStyleHtmlCls", js.Any.fromFunction1(value))
    
    inline def setSetStyleHtmlClsUndefined: Self = StObject.set(x, "setStyleHtmlCls", js.undefined)
    
    inline def setSetStyleHtmlContent(value: /* styleHtmlContent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStyleHtmlContent", js.Any.fromFunction1(value))
    
    inline def setSetStyleHtmlContentUndefined: Self = StObject.set(x, "setStyleHtmlContent", js.undefined)
    
    inline def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
    
    inline def setSetTop(value: /* top */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
    
    inline def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
    
    inline def setSetTpl(value: /* tpl */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setTpl", js.Any.fromFunction1(value))
    
    inline def setSetTplUndefined: Self = StObject.set(x, "setTpl", js.undefined)
    
    inline def setSetTplWriteMode(value: /* tplWriteMode */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTplWriteMode", js.Any.fromFunction1(value))
    
    inline def setSetTplWriteModeUndefined: Self = StObject.set(x, "setTplWriteMode", js.undefined)
    
    inline def setSetUi(value: /* ui */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setUi", js.Any.fromFunction1(value))
    
    inline def setSetUiUndefined: Self = StObject.set(x, "setUi", js.undefined)
    
    inline def setSetWidth(value: /* width */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
    
    inline def setSetZIndex(value: /* zIndex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1(value))
    
    inline def setSetZIndexUndefined: Self = StObject.set(x, "setZIndex", js.undefined)
    
    inline def setShow(value: /* animation */ js.UndefOr[Any] => IComponent): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
    
    inline def setShowAnimation(value: Any): Self = StObject.set(x, "showAnimation", value.asInstanceOf[js.Any])
    
    inline def setShowAnimationUndefined: Self = StObject.set(x, "showAnimation", js.undefined)
    
    inline def setShowBy(
      value: (/* component */ js.UndefOr[IComponent], /* alignment */ js.UndefOr[java.lang.String]) => Unit
    ): Self = StObject.set(x, "showBy", js.Any.fromFunction2(value))
    
    inline def setShowByUndefined: Self = StObject.set(x, "showBy", js.undefined)
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setStopMaskTapEvent(value: Boolean): Self = StObject.set(x, "stopMaskTapEvent", value.asInstanceOf[js.Any])
    
    inline def setStopMaskTapEventUndefined: Self = StObject.set(x, "stopMaskTapEvent", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleHtmlCls(value: java.lang.String): Self = StObject.set(x, "styleHtmlCls", value.asInstanceOf[js.Any])
    
    inline def setStyleHtmlClsUndefined: Self = StObject.set(x, "styleHtmlCls", js.undefined)
    
    inline def setStyleHtmlContent(value: Boolean): Self = StObject.set(x, "styleHtmlContent", value.asInstanceOf[js.Any])
    
    inline def setStyleHtmlContentUndefined: Self = StObject.set(x, "styleHtmlContent", js.undefined)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTop(value: Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTpl(value: Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    inline def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
    
    inline def setTplWriteMode(value: java.lang.String): Self = StObject.set(x, "tplWriteMode", value.asInstanceOf[js.Any])
    
    inline def setTplWriteModeUndefined: Self = StObject.set(x, "tplWriteMode", js.undefined)
    
    inline def setUi(value: java.lang.String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
    
    inline def setUp(value: /* selector */ js.UndefOr[java.lang.String] => IContainer): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    inline def setUpdateStyleHtmlCls(value: (/* newHtmlCls */ js.UndefOr[Any], /* oldHtmlCls */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "updateStyleHtmlCls", js.Any.fromFunction2(value))
    
    inline def setUpdateStyleHtmlClsUndefined: Self = StObject.set(x, "updateStyleHtmlCls", js.undefined)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXtype(value: java.lang.String): Self = StObject.set(x, "xtype", value.asInstanceOf[js.Any])
    
    inline def setXtypeUndefined: Self = StObject.set(x, "xtype", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
