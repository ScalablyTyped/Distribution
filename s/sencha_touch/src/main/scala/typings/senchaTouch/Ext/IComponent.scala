package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  ] = js.native
  
  /** [Config Option] (String) */
  var baseCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number/String) */
  var border: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number/String) */
  var bottom: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var centered: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/String[]) */
  var cls: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var componentCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Ext.Element/HTMLElement/String) */
  var contentEl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var data: js.UndefOr[js.Any] = js.native
  
  /** [Method] Disables this Component */
  var disable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var disabledCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var dock: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var docked: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Enables this Component */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (String/Mixed) */
  var enterAnimation: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/Mixed) */
  var exitAnimation: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var flex: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean) */
  var floating: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var floatingCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Boolean) */
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  /** [Method] Prepares information on aligning this to component using alignment
    * @param component Object
    * @param alignment Object
    */
  var getAlignmentInfo: js.UndefOr[
    js.Function2[/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Returns the value of baseCls
    * @returns String
    */
  var getBaseCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of border
    * @returns Number/String
    */
  var getBorder: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of bottom
    * @returns any
    */
  var getBottom: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of centered
    * @returns Boolean
    */
  var getCentered: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of cls
    * @returns any
    */
  var getCls: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of contentEl
    * @returns Ext.Element/HTMLElement/String
    */
  var getContentEl: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of data
    * @returns Object
    */
  var getData: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of disabled
    * @returns Boolean
    */
  var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of disabledCls
    * @returns String
    */
  var getDisabledCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of docked
    * @returns String
    */
  var getDocked: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Retrieves the top level element representing this component
    * @returns Ext.dom.Element
    */
  var getEl: js.UndefOr[js.Function0[typings.senchaTouch.Ext.dom.IElement]] = js.native
  
  /** [Method] Returns the value of enterAnimation
    * @returns String/Mixed
    */
  var getEnterAnimation: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of exitAnimation
    * @returns String/Mixed
    */
  var getExitAnimation: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of flex
    * @returns Number
    */
  var getFlex: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of floatingCls
    * @returns String
    */
  var getFloatingCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of height
    * @returns Number/String
    */
  var getHeight: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of hidden
    * @returns Boolean
    */
  var getHidden: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of hiddenCls
    * @returns String
    */
  var getHiddenCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of hideAnimation
    * @returns String/Mixed
    */
  var getHideAnimation: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of html
    * @returns String/Ext.Element/HTMLElement
    */
  var getHtml: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of itemId
    * @returns String
    */
  var getItemId: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of left
    * @returns Number/String
    */
  var getLeft: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of margin
    * @returns Number/String
    */
  var getMargin: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of maxHeight
    * @returns Number/String
    */
  var getMaxHeight: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of maxWidth
    * @returns Number/String
    */
  var getMaxWidth: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of minHeight
    * @returns Number/String
    */
  var getMinHeight: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of minWidth
    * @returns Number/String
    */
  var getMinWidth: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of padding
    * @returns Number/String
    */
  var getPadding: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the parent of this component if it has one
    * @returns Ext.Component The parent of this component.
    */
  var getParent: js.UndefOr[js.Function0[this.type]] = js.native
  
  /** [Method] Returns the value of plugins
    * @returns Object/Array
    */
  var getPlugins: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of record
    * @returns Ext.data.Model
    */
  var getRecord: js.UndefOr[js.Function0[IModel]] = js.native
  
  /** [Method] Returns the value of renderTo
    * @returns Ext.Element
    */
  var getRenderTo: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Returns the value of right
    * @returns Number/String
    */
  var getRight: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of showAnimation
    * @returns String/Mixed
    */
  var getShowAnimation: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the height and width of the Component
    * @returns Object The current height and width of the Component.
    */
  var getSize: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of style
    * @returns String/Object
    */
  var getStyle: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of styleHtmlCls
    * @returns String
    */
  var getStyleHtmlCls: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of styleHtmlContent
    * @returns Boolean
    */
  var getStyleHtmlContent: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of top
    * @returns Number/String
    */
  var getTop: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of tpl
    * @returns String/String[]/Ext.Template/Ext.XTemplate[]
    */
  var getTpl: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of tplWriteMode
    * @returns String
    */
  var getTplWriteMode: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of ui
    * @returns String
    */
  var getUi: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of width
    * @returns Number/String
    */
  var getWidth: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns this Component s xtype hierarchy as a slash delimited string
    * @returns String The xtype hierarchy string.
    */
  var getXTypes: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of zIndex
    * @returns Number
    */
  var getZIndex: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns true if this component has a parent
    * @returns Boolean true if this component has a parent.
    */
  var hasParent: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Number/String) */
  var height: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var hiddenCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Hides this Component optionally using an animation
    * @param animation Object/Boolean You can specify an animation here or a bool to use the hideAnimation config.
    * @returns Ext.Component
    */
  var hide: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Config Option] (String/Mixed) */
  var hideAnimation: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var hideOnMaskTap: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/Ext.Element/HTMLElement) */
  var html: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Allows addition of behavior to the rendering phase  */
  var initialize: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Returns true if this Component is currently disabled
    * @returns Boolean true if currently disabled.
    */
  var isDisabled: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns true if this Component is currently hidden
    * @returns Boolean true if currently hidden.
    */
  var isHidden: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Tests whether or not this Component is of a specific xtype
    * @param xtype String The xtype to check for this Component.
    * @param shallow Boolean false to check whether this Component is descended from the xtype (this is the default), or true to check whether this Component is directly of the specified xtype.
    * @returns Boolean true if this component descends from the specified xtype, false otherwise.
    */
  var isXType: js.UndefOr[
    js.Function2[/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean], Boolean]
  ] = js.native
  
  /** [Config Option] (String) */
  var itemId: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Boolean) */
  var layoutOnOrientationChange: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number/String) */
  var left: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number/String) */
  var margin: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number/String) */
  var maxHeight: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number/String) */
  var maxWidth: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number/String) */
  var minHeight: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number/String) */
  var minWidth: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean) */
  var modal: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var monitorOrientation: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number/String) */
  var padding: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object/Array) */
  var plugins: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Ext.data.Model) */
  var record: js.UndefOr[IModel] = js.native
  
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
  ] = js.native
  
  /** [Config Option] (Ext.Element) */
  var renderTo: js.UndefOr[IElement] = js.native
  
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
  ] = js.native
  
  /** [Method] Resets top right bottom and left configurations to null which will un float this component  */
  var resetFloating: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Number/String) */
  var right: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Boolean/String/Object) */
  var scroll: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of baseCls
    * @param baseCls String The new value.
    */
  var setBaseCls: js.UndefOr[js.Function1[/* baseCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of border
    * @param border Number/String The new value.
    */
  var setBorder: js.UndefOr[js.Function1[/* border */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of bottom
    * @param bottom Number/String The new value.
    */
  var setBottom: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of centered
    * @param centered Boolean The new value.
    */
  var setCentered: js.UndefOr[js.Function1[/* centered */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of cls
    * @param cls String/String[] The new value.
    */
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of contentEl
    * @param contentEl Ext.Element/HTMLElement/String The new value.
    */
  var setContentEl: js.UndefOr[js.Function1[/* contentEl */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of data
    * @param data Object The new value.
    */
  var setData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of disabled
    * @param disabled Boolean The new value.
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of disabledCls
    * @param disabledCls String The new value.
    */
  var setDisabledCls: js.UndefOr[js.Function1[/* disabledCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of docked
    * @param docked String The new value.
    */
  var setDocked: js.UndefOr[js.Function1[/* docked */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of draggable
    * @param draggable Object The new value.
    */
  var setDraggable: js.UndefOr[js.Function1[/* draggable */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of enterAnimation
    * @param enterAnimation String/Mixed The new value.
    */
  var setEnterAnimation: js.UndefOr[js.Function1[/* enterAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of exitAnimation
    * @param exitAnimation String/Mixed The new value.
    */
  var setExitAnimation: js.UndefOr[js.Function1[/* exitAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of flex
    * @param flex Number The new value.
    */
  var setFlex: js.UndefOr[js.Function1[/* flex */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Used to update the floating state of this component
    * @param floating Boolean true if you want to float this component.
    */
  var setFloating: js.UndefOr[js.Function1[/* floating */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of floatingCls
    * @param floatingCls String The new value.
    */
  var setFloatingCls: js.UndefOr[js.Function1[/* floatingCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of height
    * @param height Number/String The new value.
    */
  var setHeight: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of hidden
    * @param hidden Boolean The new value.
    */
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of hiddenCls
    * @param hiddenCls String The new value.
    */
  var setHiddenCls: js.UndefOr[js.Function1[/* hiddenCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of hideAnimation
    * @param hideAnimation String/Mixed The new value.
    */
  var setHideAnimation: js.UndefOr[js.Function1[/* hideAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of html
    * @param html String/Ext.Element/HTMLElement The new value.
    */
  var setHtml: js.UndefOr[js.Function1[/* html */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of itemId
    * @param itemId String The new value.
    */
  var setItemId: js.UndefOr[js.Function1[/* itemId */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of left
    * @param left Number/String The new value.
    */
  var setLeft: js.UndefOr[js.Function1[/* left */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of margin
    * @param margin Number/String The new value.
    */
  var setMargin: js.UndefOr[js.Function1[/* margin */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of maxHeight
    * @param maxHeight Number/String The new value.
    */
  var setMaxHeight: js.UndefOr[js.Function1[/* maxHeight */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of maxWidth
    * @param maxWidth Number/String The new value.
    */
  var setMaxWidth: js.UndefOr[js.Function1[/* maxWidth */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of minHeight
    * @param minHeight Number/String The new value.
    */
  var setMinHeight: js.UndefOr[js.Function1[/* minHeight */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of minWidth
    * @param minWidth Number/String The new value.
    */
  var setMinWidth: js.UndefOr[js.Function1[/* minWidth */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of padding
    * @param padding Number/String The new value.
    */
  var setPadding: js.UndefOr[js.Function1[/* padding */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of plugins
    * @param plugins Object/Array The new value.
    */
  var setPlugins: js.UndefOr[js.Function1[/* plugins */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of record
    * @param record Ext.data.Model The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[IModel], Unit]] = js.native
  
  /** [Method] Sets the value of renderTo
    * @param renderTo Ext.Element The new value.
    */
  var setRenderTo: js.UndefOr[js.Function1[/* renderTo */ js.UndefOr[IElement], Unit]] = js.native
  
  /** [Method] Sets the value of right
    * @param right Number/String The new value.
    */
  var setRight: js.UndefOr[js.Function1[/* right */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] This method has moved to Ext Container  */
  var setScrollable: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Sets the value of showAnimation
    * @param showAnimation String/Mixed The new value.
    */
  var setShowAnimation: js.UndefOr[js.Function1[/* showAnimation */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the size of the Component
    * @param width Number The new width for the Component.
    * @param height Number The new height for the Component.
    */
  var setSize: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double], Unit]
  ] = js.native
  
  /** [Method] Sets the value of style
    * @param style String/Object The new value.
    */
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of styleHtmlCls
    * @param styleHtmlCls String The new value.
    */
  var setStyleHtmlCls: js.UndefOr[js.Function1[/* styleHtmlCls */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of styleHtmlContent
    * @param styleHtmlContent Boolean The new value.
    */
  var setStyleHtmlContent: js.UndefOr[js.Function1[/* styleHtmlContent */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of top
    * @param top Number/String The new value.
    */
  var setTop: js.UndefOr[js.Function1[/* top */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of tpl
    * @param tpl String/String[]/Ext.Template/Ext.XTemplate[] The new value.
    */
  var setTpl: js.UndefOr[js.Function1[/* tpl */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of tplWriteMode
    * @param tplWriteMode String The new value.
    */
  var setTplWriteMode: js.UndefOr[js.Function1[/* tplWriteMode */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of ui
    * @param ui String The new value.
    */
  var setUi: js.UndefOr[js.Function1[/* ui */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of width
    * @param width Number/String The new value.
    */
  var setWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of zIndex
    * @param zIndex Number The new value.
    */
  var setZIndex: js.UndefOr[js.Function1[/* zIndex */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Shows this component optionally using an animation
    * @param animation Object/Boolean You can specify an animation here or a bool to use the showAnimation config.
    * @returns Ext.Component
    */
  var show: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.native
  
  /** [Config Option] (String/Mixed) */
  var showAnimation: js.UndefOr[js.Any] = js.native
  
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
  ] = js.native
  
  /** [Config Option] (Boolean) */
  var stopMaskTapEvent: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String/Object) */
  var style: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var styleHtmlCls: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Boolean) */
  var styleHtmlContent: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number/String) */
  var top: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String/String[]/Ext.Template/Ext.XTemplate[]) */
  var tpl: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var tplWriteMode: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var ui: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Walks up the ownerCt axis looking for an ancestor Container which matches the passed simple selector
    * @param selector String The simple selector to test.
    * @returns Ext.Container The matching ancestor Container (or undefined if no match was found).
    */
  var up: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], IContainer]] = js.native
  
  /** [Method] Updates the HTML content of the Component  */
  var update: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Updates the styleHtmlCls configuration
    * @param newHtmlCls Object
    * @param oldHtmlCls Object
    */
  var updateStyleHtmlCls: js.UndefOr[
    js.Function2[/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Config Option] (Number/String) */
  var width: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String[]) */
  var xtype: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[Double] = js.native
}
object IComponent {
  
  @scala.inline
  def apply(): IComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponent]
  }
  
  @scala.inline
  implicit class IComponentOps[Self <: IComponent] (val x: Self) extends AnyVal {
    
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
    def setAddCls(
      value: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit
    ): Self = this.set("addCls", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAddCls: Self = this.set("addCls", js.undefined)
    
    @scala.inline
    def setBaseCls(value: java.lang.String): Self = this.set("baseCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseCls: Self = this.set("baseCls", js.undefined)
    
    @scala.inline
    def setBorder(value: js.Any): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBottom(value: js.Any): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    
    @scala.inline
    def setCls(value: js.Any): Self = this.set("cls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCls: Self = this.set("cls", js.undefined)
    
    @scala.inline
    def setComponentCls(value: java.lang.String): Self = this.set("componentCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentCls: Self = this.set("componentCls", js.undefined)
    
    @scala.inline
    def setContentEl(value: js.Any): Self = this.set("contentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEl: Self = this.set("contentEl", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDisable(value: () => Unit): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDisabledCls(value: java.lang.String): Self = this.set("disabledCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledCls: Self = this.set("disabledCls", js.undefined)
    
    @scala.inline
    def setDock(value: java.lang.String): Self = this.set("dock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDock: Self = this.set("dock", js.undefined)
    
    @scala.inline
    def setDocked(value: java.lang.String): Self = this.set("docked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocked: Self = this.set("docked", js.undefined)
    
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setEnterAnimation(value: js.Any): Self = this.set("enterAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterAnimation: Self = this.set("enterAnimation", js.undefined)
    
    @scala.inline
    def setExitAnimation(value: js.Any): Self = this.set("exitAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitAnimation: Self = this.set("exitAnimation", js.undefined)
    
    @scala.inline
    def setFlex(value: Double): Self = this.set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
    
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    
    @scala.inline
    def setFloatingCls(value: java.lang.String): Self = this.set("floatingCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingCls: Self = this.set("floatingCls", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setGetAlignmentInfo(value: (/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any]) => Unit): Self = this.set("getAlignmentInfo", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetAlignmentInfo: Self = this.set("getAlignmentInfo", js.undefined)
    
    @scala.inline
    def setGetBaseCls(value: () => java.lang.String): Self = this.set("getBaseCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBaseCls: Self = this.set("getBaseCls", js.undefined)
    
    @scala.inline
    def setGetBorder(value: () => _): Self = this.set("getBorder", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBorder: Self = this.set("getBorder", js.undefined)
    
    @scala.inline
    def setGetBottom(value: () => _): Self = this.set("getBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBottom: Self = this.set("getBottom", js.undefined)
    
    @scala.inline
    def setGetCentered(value: () => Boolean): Self = this.set("getCentered", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCentered: Self = this.set("getCentered", js.undefined)
    
    @scala.inline
    def setGetCls(value: () => _): Self = this.set("getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    
    @scala.inline
    def setGetContentEl(value: () => _): Self = this.set("getContentEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetContentEl: Self = this.set("getContentEl", js.undefined)
    
    @scala.inline
    def setGetData(value: () => _): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetData: Self = this.set("getData", js.undefined)
    
    @scala.inline
    def setGetDisabled(value: () => Boolean): Self = this.set("getDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisabled: Self = this.set("getDisabled", js.undefined)
    
    @scala.inline
    def setGetDisabledCls(value: () => java.lang.String): Self = this.set("getDisabledCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDisabledCls: Self = this.set("getDisabledCls", js.undefined)
    
    @scala.inline
    def setGetDocked(value: () => java.lang.String): Self = this.set("getDocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDocked: Self = this.set("getDocked", js.undefined)
    
    @scala.inline
    def setGetEl(value: () => typings.senchaTouch.Ext.dom.IElement): Self = this.set("getEl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEl: Self = this.set("getEl", js.undefined)
    
    @scala.inline
    def setGetEnterAnimation(value: () => _): Self = this.set("getEnterAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEnterAnimation: Self = this.set("getEnterAnimation", js.undefined)
    
    @scala.inline
    def setGetExitAnimation(value: () => _): Self = this.set("getExitAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetExitAnimation: Self = this.set("getExitAnimation", js.undefined)
    
    @scala.inline
    def setGetFlex(value: () => Double): Self = this.set("getFlex", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFlex: Self = this.set("getFlex", js.undefined)
    
    @scala.inline
    def setGetFloatingCls(value: () => java.lang.String): Self = this.set("getFloatingCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFloatingCls: Self = this.set("getFloatingCls", js.undefined)
    
    @scala.inline
    def setGetHeight(value: () => _): Self = this.set("getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHeight: Self = this.set("getHeight", js.undefined)
    
    @scala.inline
    def setGetHidden(value: () => Boolean): Self = this.set("getHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHidden: Self = this.set("getHidden", js.undefined)
    
    @scala.inline
    def setGetHiddenCls(value: () => java.lang.String): Self = this.set("getHiddenCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHiddenCls: Self = this.set("getHiddenCls", js.undefined)
    
    @scala.inline
    def setGetHideAnimation(value: () => _): Self = this.set("getHideAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHideAnimation: Self = this.set("getHideAnimation", js.undefined)
    
    @scala.inline
    def setGetHtml(value: () => _): Self = this.set("getHtml", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHtml: Self = this.set("getHtml", js.undefined)
    
    @scala.inline
    def setGetItemId(value: () => java.lang.String): Self = this.set("getItemId", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetItemId: Self = this.set("getItemId", js.undefined)
    
    @scala.inline
    def setGetLeft(value: () => _): Self = this.set("getLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLeft: Self = this.set("getLeft", js.undefined)
    
    @scala.inline
    def setGetMargin(value: () => _): Self = this.set("getMargin", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMargin: Self = this.set("getMargin", js.undefined)
    
    @scala.inline
    def setGetMaxHeight(value: () => _): Self = this.set("getMaxHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxHeight: Self = this.set("getMaxHeight", js.undefined)
    
    @scala.inline
    def setGetMaxWidth(value: () => _): Self = this.set("getMaxWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxWidth: Self = this.set("getMaxWidth", js.undefined)
    
    @scala.inline
    def setGetMinHeight(value: () => _): Self = this.set("getMinHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinHeight: Self = this.set("getMinHeight", js.undefined)
    
    @scala.inline
    def setGetMinWidth(value: () => _): Self = this.set("getMinWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinWidth: Self = this.set("getMinWidth", js.undefined)
    
    @scala.inline
    def setGetPadding(value: () => _): Self = this.set("getPadding", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPadding: Self = this.set("getPadding", js.undefined)
    
    @scala.inline
    def setGetParent(value: () => IComponent): Self = this.set("getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetParent: Self = this.set("getParent", js.undefined)
    
    @scala.inline
    def setGetPlugins(value: () => _): Self = this.set("getPlugins", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPlugins: Self = this.set("getPlugins", js.undefined)
    
    @scala.inline
    def setGetRecord(value: () => IModel): Self = this.set("getRecord", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRecord: Self = this.set("getRecord", js.undefined)
    
    @scala.inline
    def setGetRenderTo(value: () => IElement): Self = this.set("getRenderTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRenderTo: Self = this.set("getRenderTo", js.undefined)
    
    @scala.inline
    def setGetRight(value: () => _): Self = this.set("getRight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRight: Self = this.set("getRight", js.undefined)
    
    @scala.inline
    def setGetShowAnimation(value: () => _): Self = this.set("getShowAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetShowAnimation: Self = this.set("getShowAnimation", js.undefined)
    
    @scala.inline
    def setGetSize(value: () => _): Self = this.set("getSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSize: Self = this.set("getSize", js.undefined)
    
    @scala.inline
    def setGetStyle(value: () => _): Self = this.set("getStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStyle: Self = this.set("getStyle", js.undefined)
    
    @scala.inline
    def setGetStyleHtmlCls(value: () => java.lang.String): Self = this.set("getStyleHtmlCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStyleHtmlCls: Self = this.set("getStyleHtmlCls", js.undefined)
    
    @scala.inline
    def setGetStyleHtmlContent(value: () => Boolean): Self = this.set("getStyleHtmlContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStyleHtmlContent: Self = this.set("getStyleHtmlContent", js.undefined)
    
    @scala.inline
    def setGetTop(value: () => _): Self = this.set("getTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTop: Self = this.set("getTop", js.undefined)
    
    @scala.inline
    def setGetTpl(value: () => _): Self = this.set("getTpl", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTpl: Self = this.set("getTpl", js.undefined)
    
    @scala.inline
    def setGetTplWriteMode(value: () => java.lang.String): Self = this.set("getTplWriteMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTplWriteMode: Self = this.set("getTplWriteMode", js.undefined)
    
    @scala.inline
    def setGetUi(value: () => java.lang.String): Self = this.set("getUi", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetUi: Self = this.set("getUi", js.undefined)
    
    @scala.inline
    def setGetWidth(value: () => _): Self = this.set("getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    
    @scala.inline
    def setGetXTypes(value: () => java.lang.String): Self = this.set("getXTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetXTypes: Self = this.set("getXTypes", js.undefined)
    
    @scala.inline
    def setGetZIndex(value: () => Double): Self = this.set("getZIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetZIndex: Self = this.set("getZIndex", js.undefined)
    
    @scala.inline
    def setHasParent(value: () => Boolean): Self = this.set("hasParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHasParent: Self = this.set("hasParent", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHiddenCls(value: java.lang.String): Self = this.set("hiddenCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenCls: Self = this.set("hiddenCls", js.undefined)
    
    @scala.inline
    def setHide(value: /* animation */ js.UndefOr[js.Any] => IComponent): Self = this.set("hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setHideAnimation(value: js.Any): Self = this.set("hideAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAnimation: Self = this.set("hideAnimation", js.undefined)
    
    @scala.inline
    def setHideOnMaskTap(value: Boolean): Self = this.set("hideOnMaskTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnMaskTap: Self = this.set("hideOnMaskTap", js.undefined)
    
    @scala.inline
    def setHtml(value: js.Any): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: () => Boolean): Self = this.set("isDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    
    @scala.inline
    def setIsHidden(value: () => Boolean): Self = this.set("isHidden", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    
    @scala.inline
    def setIsXType(value: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean]) => Boolean): Self = this.set("isXType", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsXType: Self = this.set("isXType", js.undefined)
    
    @scala.inline
    def setItemId(value: java.lang.String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setLayoutOnOrientationChange(value: Boolean): Self = this.set("layoutOnOrientationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutOnOrientationChange: Self = this.set("layoutOnOrientationChange", js.undefined)
    
    @scala.inline
    def setLeft(value: js.Any): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMargin(value: js.Any): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: js.Any): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: js.Any): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: js.Any): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: js.Any): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setMonitorOrientation(value: Boolean): Self = this.set("monitorOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorOrientation: Self = this.set("monitorOrientation", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRecord(value: IModel): Self = this.set("record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    
    @scala.inline
    def setRemoveCls(
      value: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit
    ): Self = this.set("removeCls", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRemoveCls: Self = this.set("removeCls", js.undefined)
    
    @scala.inline
    def setRenderTo(value: IElement): Self = this.set("renderTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderTo: Self = this.set("renderTo", js.undefined)
    
    @scala.inline
    def setReplaceCls(
      value: (/* oldCls */ js.UndefOr[java.lang.String], /* newCls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit
    ): Self = this.set("replaceCls", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteReplaceCls: Self = this.set("replaceCls", js.undefined)
    
    @scala.inline
    def setResetFloating(value: () => Unit): Self = this.set("resetFloating", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResetFloating: Self = this.set("resetFloating", js.undefined)
    
    @scala.inline
    def setRight(value: js.Any): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setScroll(value: js.Any): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setSetBaseCls(value: /* baseCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setBaseCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBaseCls: Self = this.set("setBaseCls", js.undefined)
    
    @scala.inline
    def setSetBorder(value: /* border */ js.UndefOr[js.Any] => Unit): Self = this.set("setBorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBorder: Self = this.set("setBorder", js.undefined)
    
    @scala.inline
    def setSetBottom(value: /* bottom */ js.UndefOr[js.Any] => Unit): Self = this.set("setBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBottom: Self = this.set("setBottom", js.undefined)
    
    @scala.inline
    def setSetCentered(value: /* centered */ js.UndefOr[Boolean] => Unit): Self = this.set("setCentered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCentered: Self = this.set("setCentered", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    
    @scala.inline
    def setSetContentEl(value: /* contentEl */ js.UndefOr[js.Any] => Unit): Self = this.set("setContentEl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetContentEl: Self = this.set("setContentEl", js.undefined)
    
    @scala.inline
    def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetData: Self = this.set("setData", js.undefined)
    
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisabled: Self = this.set("setDisabled", js.undefined)
    
    @scala.inline
    def setSetDisabledCls(value: /* disabledCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setDisabledCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDisabledCls: Self = this.set("setDisabledCls", js.undefined)
    
    @scala.inline
    def setSetDocked(value: /* docked */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setDocked", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDocked: Self = this.set("setDocked", js.undefined)
    
    @scala.inline
    def setSetDraggable(value: /* draggable */ js.UndefOr[js.Any] => Unit): Self = this.set("setDraggable", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDraggable: Self = this.set("setDraggable", js.undefined)
    
    @scala.inline
    def setSetEnterAnimation(value: /* enterAnimation */ js.UndefOr[js.Any] => Unit): Self = this.set("setEnterAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEnterAnimation: Self = this.set("setEnterAnimation", js.undefined)
    
    @scala.inline
    def setSetExitAnimation(value: /* exitAnimation */ js.UndefOr[js.Any] => Unit): Self = this.set("setExitAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetExitAnimation: Self = this.set("setExitAnimation", js.undefined)
    
    @scala.inline
    def setSetFlex(value: /* flex */ js.UndefOr[Double] => Unit): Self = this.set("setFlex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFlex: Self = this.set("setFlex", js.undefined)
    
    @scala.inline
    def setSetFloating(value: /* floating */ js.UndefOr[Boolean] => Unit): Self = this.set("setFloating", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFloating: Self = this.set("setFloating", js.undefined)
    
    @scala.inline
    def setSetFloatingCls(value: /* floatingCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setFloatingCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFloatingCls: Self = this.set("setFloatingCls", js.undefined)
    
    @scala.inline
    def setSetHeight(value: /* height */ js.UndefOr[js.Any] => Unit): Self = this.set("setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    
    @scala.inline
    def setSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = this.set("setHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHidden: Self = this.set("setHidden", js.undefined)
    
    @scala.inline
    def setSetHiddenCls(value: /* hiddenCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setHiddenCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHiddenCls: Self = this.set("setHiddenCls", js.undefined)
    
    @scala.inline
    def setSetHideAnimation(value: /* hideAnimation */ js.UndefOr[js.Any] => Unit): Self = this.set("setHideAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHideAnimation: Self = this.set("setHideAnimation", js.undefined)
    
    @scala.inline
    def setSetHtml(value: /* html */ js.UndefOr[js.Any] => Unit): Self = this.set("setHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHtml: Self = this.set("setHtml", js.undefined)
    
    @scala.inline
    def setSetItemId(value: /* itemId */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setItemId", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetItemId: Self = this.set("setItemId", js.undefined)
    
    @scala.inline
    def setSetLeft(value: /* left */ js.UndefOr[js.Any] => Unit): Self = this.set("setLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLeft: Self = this.set("setLeft", js.undefined)
    
    @scala.inline
    def setSetMargin(value: /* margin */ js.UndefOr[js.Any] => Unit): Self = this.set("setMargin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMargin: Self = this.set("setMargin", js.undefined)
    
    @scala.inline
    def setSetMaxHeight(value: /* maxHeight */ js.UndefOr[js.Any] => Unit): Self = this.set("setMaxHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxHeight: Self = this.set("setMaxHeight", js.undefined)
    
    @scala.inline
    def setSetMaxWidth(value: /* maxWidth */ js.UndefOr[js.Any] => Unit): Self = this.set("setMaxWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxWidth: Self = this.set("setMaxWidth", js.undefined)
    
    @scala.inline
    def setSetMinHeight(value: /* minHeight */ js.UndefOr[js.Any] => Unit): Self = this.set("setMinHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinHeight: Self = this.set("setMinHeight", js.undefined)
    
    @scala.inline
    def setSetMinWidth(value: /* minWidth */ js.UndefOr[js.Any] => Unit): Self = this.set("setMinWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinWidth: Self = this.set("setMinWidth", js.undefined)
    
    @scala.inline
    def setSetPadding(value: /* padding */ js.UndefOr[js.Any] => Unit): Self = this.set("setPadding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPadding: Self = this.set("setPadding", js.undefined)
    
    @scala.inline
    def setSetPlugins(value: /* plugins */ js.UndefOr[js.Any] => Unit): Self = this.set("setPlugins", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPlugins: Self = this.set("setPlugins", js.undefined)
    
    @scala.inline
    def setSetRecord(value: /* record */ js.UndefOr[IModel] => Unit): Self = this.set("setRecord", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRecord: Self = this.set("setRecord", js.undefined)
    
    @scala.inline
    def setSetRenderTo(value: /* renderTo */ js.UndefOr[IElement] => Unit): Self = this.set("setRenderTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRenderTo: Self = this.set("setRenderTo", js.undefined)
    
    @scala.inline
    def setSetRight(value: /* right */ js.UndefOr[js.Any] => Unit): Self = this.set("setRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRight: Self = this.set("setRight", js.undefined)
    
    @scala.inline
    def setSetScrollable(value: () => Unit): Self = this.set("setScrollable", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSetScrollable: Self = this.set("setScrollable", js.undefined)
    
    @scala.inline
    def setSetShowAnimation(value: /* showAnimation */ js.UndefOr[js.Any] => Unit): Self = this.set("setShowAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetShowAnimation: Self = this.set("setShowAnimation", js.undefined)
    
    @scala.inline
    def setSetSize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = this.set("setSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    
    @scala.inline
    def setSetStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = this.set("setStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStyle: Self = this.set("setStyle", js.undefined)
    
    @scala.inline
    def setSetStyleHtmlCls(value: /* styleHtmlCls */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setStyleHtmlCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStyleHtmlCls: Self = this.set("setStyleHtmlCls", js.undefined)
    
    @scala.inline
    def setSetStyleHtmlContent(value: /* styleHtmlContent */ js.UndefOr[Boolean] => Unit): Self = this.set("setStyleHtmlContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStyleHtmlContent: Self = this.set("setStyleHtmlContent", js.undefined)
    
    @scala.inline
    def setSetTop(value: /* top */ js.UndefOr[js.Any] => Unit): Self = this.set("setTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTop: Self = this.set("setTop", js.undefined)
    
    @scala.inline
    def setSetTpl(value: /* tpl */ js.UndefOr[js.Any] => Unit): Self = this.set("setTpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTpl: Self = this.set("setTpl", js.undefined)
    
    @scala.inline
    def setSetTplWriteMode(value: /* tplWriteMode */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setTplWriteMode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTplWriteMode: Self = this.set("setTplWriteMode", js.undefined)
    
    @scala.inline
    def setSetUi(value: /* ui */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setUi", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetUi: Self = this.set("setUi", js.undefined)
    
    @scala.inline
    def setSetWidth(value: /* width */ js.UndefOr[js.Any] => Unit): Self = this.set("setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    
    @scala.inline
    def setSetZIndex(value: /* zIndex */ js.UndefOr[Double] => Unit): Self = this.set("setZIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetZIndex: Self = this.set("setZIndex", js.undefined)
    
    @scala.inline
    def setShow(value: /* animation */ js.UndefOr[js.Any] => IComponent): Self = this.set("show", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowAnimation(value: js.Any): Self = this.set("showAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAnimation: Self = this.set("showAnimation", js.undefined)
    
    @scala.inline
    def setShowBy(
      value: (/* component */ js.UndefOr[IComponent], /* alignment */ js.UndefOr[java.lang.String]) => Unit
    ): Self = this.set("showBy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShowBy: Self = this.set("showBy", js.undefined)
    
    @scala.inline
    def setStopMaskTapEvent(value: Boolean): Self = this.set("stopMaskTapEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopMaskTapEvent: Self = this.set("stopMaskTapEvent", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleHtmlCls(value: java.lang.String): Self = this.set("styleHtmlCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleHtmlCls: Self = this.set("styleHtmlCls", js.undefined)
    
    @scala.inline
    def setStyleHtmlContent(value: Boolean): Self = this.set("styleHtmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleHtmlContent: Self = this.set("styleHtmlContent", js.undefined)
    
    @scala.inline
    def setTop(value: js.Any): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTpl(value: js.Any): Self = this.set("tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTpl: Self = this.set("tpl", js.undefined)
    
    @scala.inline
    def setTplWriteMode(value: java.lang.String): Self = this.set("tplWriteMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTplWriteMode: Self = this.set("tplWriteMode", js.undefined)
    
    @scala.inline
    def setUi(value: java.lang.String): Self = this.set("ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUi: Self = this.set("ui", js.undefined)
    
    @scala.inline
    def setUp(value: /* selector */ js.UndefOr[java.lang.String] => IContainer): Self = this.set("up", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setUpdateStyleHtmlCls(value: (/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any]) => Unit): Self = this.set("updateStyleHtmlCls", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateStyleHtmlCls: Self = this.set("updateStyleHtmlCls", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXtype(value: java.lang.String): Self = this.set("xtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXtype: Self = this.set("xtype", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
