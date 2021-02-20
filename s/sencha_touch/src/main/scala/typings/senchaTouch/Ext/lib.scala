package typings.senchaTouch.Ext

import typings.senchaTouch.Ext.data.IModel
import typings.senchaTouch.Ext.scroll.IView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lib {
  
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
    var up: js.UndefOr[
        js.Function1[/* selector */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.IContainer]
      ] = js.native
    
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
    def apply(): typings.senchaTouch.Ext.lib.IComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.lib.IComponent]
    }
    
    @scala.inline
    implicit class IComponentMutableBuilder[Self <: typings.senchaTouch.Ext.lib.IComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddCls(
        value: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit
      ): Self = StObject.set(x, "addCls", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddClsUndefined: Self = StObject.set(x, "addCls", js.undefined)
      
      @scala.inline
      def setBaseCls(value: java.lang.String): Self = StObject.set(x, "baseCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseClsUndefined: Self = StObject.set(x, "baseCls", js.undefined)
      
      @scala.inline
      def setBorder(value: js.Any): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBottom(value: js.Any): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      @scala.inline
      def setCls(value: js.Any): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
      
      @scala.inline
      def setComponentCls(value: java.lang.String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClsUndefined: Self = StObject.set(x, "componentCls", js.undefined)
      
      @scala.inline
      def setContentEl(value: js.Any): Self = StObject.set(x, "contentEl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentElUndefined: Self = StObject.set(x, "contentEl", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledCls(value: java.lang.String): Self = StObject.set(x, "disabledCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledClsUndefined: Self = StObject.set(x, "disabledCls", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDock(value: java.lang.String): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockUndefined: Self = StObject.set(x, "dock", js.undefined)
      
      @scala.inline
      def setDocked(value: java.lang.String): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setEnterAnimation(value: js.Any): Self = StObject.set(x, "enterAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      @scala.inline
      def setExitAnimation(value: js.Any): Self = StObject.set(x, "exitAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitAnimationUndefined: Self = StObject.set(x, "exitAnimation", js.undefined)
      
      @scala.inline
      def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingCls(value: java.lang.String): Self = StObject.set(x, "floatingCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingClsUndefined: Self = StObject.set(x, "floatingCls", js.undefined)
      
      @scala.inline
      def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      @scala.inline
      def setGetAlignmentInfo(value: (/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "getAlignmentInfo", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetAlignmentInfoUndefined: Self = StObject.set(x, "getAlignmentInfo", js.undefined)
      
      @scala.inline
      def setGetBaseCls(value: () => java.lang.String): Self = StObject.set(x, "getBaseCls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBaseClsUndefined: Self = StObject.set(x, "getBaseCls", js.undefined)
      
      @scala.inline
      def setGetBorder(value: () => _): Self = StObject.set(x, "getBorder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBorderUndefined: Self = StObject.set(x, "getBorder", js.undefined)
      
      @scala.inline
      def setGetBottom(value: () => _): Self = StObject.set(x, "getBottom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
      
      @scala.inline
      def setGetCentered(value: () => Boolean): Self = StObject.set(x, "getCentered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCenteredUndefined: Self = StObject.set(x, "getCentered", js.undefined)
      
      @scala.inline
      def setGetCls(value: () => _): Self = StObject.set(x, "getCls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
      
      @scala.inline
      def setGetContentEl(value: () => _): Self = StObject.set(x, "getContentEl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentElUndefined: Self = StObject.set(x, "getContentEl", js.undefined)
      
      @scala.inline
      def setGetData(value: () => _): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
      
      @scala.inline
      def setGetDisabled(value: () => Boolean): Self = StObject.set(x, "getDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDisabledCls(value: () => java.lang.String): Self = StObject.set(x, "getDisabledCls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDisabledClsUndefined: Self = StObject.set(x, "getDisabledCls", js.undefined)
      
      @scala.inline
      def setGetDisabledUndefined: Self = StObject.set(x, "getDisabled", js.undefined)
      
      @scala.inline
      def setGetDocked(value: () => java.lang.String): Self = StObject.set(x, "getDocked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDockedUndefined: Self = StObject.set(x, "getDocked", js.undefined)
      
      @scala.inline
      def setGetEl(value: () => typings.senchaTouch.Ext.dom.IElement): Self = StObject.set(x, "getEl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElUndefined: Self = StObject.set(x, "getEl", js.undefined)
      
      @scala.inline
      def setGetEnterAnimation(value: () => _): Self = StObject.set(x, "getEnterAnimation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEnterAnimationUndefined: Self = StObject.set(x, "getEnterAnimation", js.undefined)
      
      @scala.inline
      def setGetExitAnimation(value: () => _): Self = StObject.set(x, "getExitAnimation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetExitAnimationUndefined: Self = StObject.set(x, "getExitAnimation", js.undefined)
      
      @scala.inline
      def setGetFlex(value: () => Double): Self = StObject.set(x, "getFlex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFlexUndefined: Self = StObject.set(x, "getFlex", js.undefined)
      
      @scala.inline
      def setGetFloatingCls(value: () => java.lang.String): Self = StObject.set(x, "getFloatingCls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFloatingClsUndefined: Self = StObject.set(x, "getFloatingCls", js.undefined)
      
      @scala.inline
      def setGetHeight(value: () => _): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
      
      @scala.inline
      def setGetHidden(value: () => Boolean): Self = StObject.set(x, "getHidden", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHiddenCls(value: () => java.lang.String): Self = StObject.set(x, "getHiddenCls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHiddenClsUndefined: Self = StObject.set(x, "getHiddenCls", js.undefined)
      
      @scala.inline
      def setGetHiddenUndefined: Self = StObject.set(x, "getHidden", js.undefined)
      
      @scala.inline
      def setGetHideAnimation(value: () => _): Self = StObject.set(x, "getHideAnimation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHideAnimationUndefined: Self = StObject.set(x, "getHideAnimation", js.undefined)
      
      @scala.inline
      def setGetHtml(value: () => _): Self = StObject.set(x, "getHtml", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHtmlUndefined: Self = StObject.set(x, "getHtml", js.undefined)
      
      @scala.inline
      def setGetItemId(value: () => java.lang.String): Self = StObject.set(x, "getItemId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItemIdUndefined: Self = StObject.set(x, "getItemId", js.undefined)
      
      @scala.inline
      def setGetLeft(value: () => _): Self = StObject.set(x, "getLeft", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLeftUndefined: Self = StObject.set(x, "getLeft", js.undefined)
      
      @scala.inline
      def setGetMargin(value: () => _): Self = StObject.set(x, "getMargin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMarginUndefined: Self = StObject.set(x, "getMargin", js.undefined)
      
      @scala.inline
      def setGetMaxHeight(value: () => _): Self = StObject.set(x, "getMaxHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxHeightUndefined: Self = StObject.set(x, "getMaxHeight", js.undefined)
      
      @scala.inline
      def setGetMaxWidth(value: () => _): Self = StObject.set(x, "getMaxWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxWidthUndefined: Self = StObject.set(x, "getMaxWidth", js.undefined)
      
      @scala.inline
      def setGetMinHeight(value: () => _): Self = StObject.set(x, "getMinHeight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinHeightUndefined: Self = StObject.set(x, "getMinHeight", js.undefined)
      
      @scala.inline
      def setGetMinWidth(value: () => _): Self = StObject.set(x, "getMinWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMinWidthUndefined: Self = StObject.set(x, "getMinWidth", js.undefined)
      
      @scala.inline
      def setGetPadding(value: () => _): Self = StObject.set(x, "getPadding", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPaddingUndefined: Self = StObject.set(x, "getPadding", js.undefined)
      
      @scala.inline
      def setGetParent(value: () => typings.senchaTouch.Ext.lib.IComponent): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParentUndefined: Self = StObject.set(x, "getParent", js.undefined)
      
      @scala.inline
      def setGetPlugins(value: () => _): Self = StObject.set(x, "getPlugins", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPluginsUndefined: Self = StObject.set(x, "getPlugins", js.undefined)
      
      @scala.inline
      def setGetRecord(value: () => IModel): Self = StObject.set(x, "getRecord", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRecordUndefined: Self = StObject.set(x, "getRecord", js.undefined)
      
      @scala.inline
      def setGetRenderTo(value: () => IElement): Self = StObject.set(x, "getRenderTo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRenderToUndefined: Self = StObject.set(x, "getRenderTo", js.undefined)
      
      @scala.inline
      def setGetRight(value: () => _): Self = StObject.set(x, "getRight", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRightUndefined: Self = StObject.set(x, "getRight", js.undefined)
      
      @scala.inline
      def setGetShowAnimation(value: () => _): Self = StObject.set(x, "getShowAnimation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetShowAnimationUndefined: Self = StObject.set(x, "getShowAnimation", js.undefined)
      
      @scala.inline
      def setGetSize(value: () => _): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSizeUndefined: Self = StObject.set(x, "getSize", js.undefined)
      
      @scala.inline
      def setGetStyle(value: () => _): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStyleHtmlCls(value: () => java.lang.String): Self = StObject.set(x, "getStyleHtmlCls", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStyleHtmlClsUndefined: Self = StObject.set(x, "getStyleHtmlCls", js.undefined)
      
      @scala.inline
      def setGetStyleHtmlContent(value: () => Boolean): Self = StObject.set(x, "getStyleHtmlContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStyleHtmlContentUndefined: Self = StObject.set(x, "getStyleHtmlContent", js.undefined)
      
      @scala.inline
      def setGetStyleUndefined: Self = StObject.set(x, "getStyle", js.undefined)
      
      @scala.inline
      def setGetTop(value: () => _): Self = StObject.set(x, "getTop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTopUndefined: Self = StObject.set(x, "getTop", js.undefined)
      
      @scala.inline
      def setGetTpl(value: () => _): Self = StObject.set(x, "getTpl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTplUndefined: Self = StObject.set(x, "getTpl", js.undefined)
      
      @scala.inline
      def setGetTplWriteMode(value: () => java.lang.String): Self = StObject.set(x, "getTplWriteMode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTplWriteModeUndefined: Self = StObject.set(x, "getTplWriteMode", js.undefined)
      
      @scala.inline
      def setGetUi(value: () => java.lang.String): Self = StObject.set(x, "getUi", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUiUndefined: Self = StObject.set(x, "getUi", js.undefined)
      
      @scala.inline
      def setGetWidth(value: () => _): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      @scala.inline
      def setGetXTypes(value: () => java.lang.String): Self = StObject.set(x, "getXTypes", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetXTypesUndefined: Self = StObject.set(x, "getXTypes", js.undefined)
      
      @scala.inline
      def setGetZIndex(value: () => Double): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetZIndexUndefined: Self = StObject.set(x, "getZIndex", js.undefined)
      
      @scala.inline
      def setHasParent(value: () => Boolean): Self = StObject.set(x, "hasParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasParentUndefined: Self = StObject.set(x, "hasParent", js.undefined)
      
      @scala.inline
      def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenCls(value: java.lang.String): Self = StObject.set(x, "hiddenCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenClsUndefined: Self = StObject.set(x, "hiddenCls", js.undefined)
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHide(value: /* animation */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.lib.IComponent): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHideAnimation(value: js.Any): Self = StObject.set(x, "hideAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideAnimationUndefined: Self = StObject.set(x, "hideAnimation", js.undefined)
      
      @scala.inline
      def setHideOnMaskTap(value: Boolean): Self = StObject.set(x, "hideOnMaskTap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnMaskTapUndefined: Self = StObject.set(x, "hideOnMaskTap", js.undefined)
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setHtml(value: js.Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: () => Boolean): Self = StObject.set(x, "isDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsHidden(value: () => Boolean): Self = StObject.set(x, "isHidden", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setIsXType(value: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[Boolean]) => Boolean): Self = StObject.set(x, "isXType", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsXTypeUndefined: Self = StObject.set(x, "isXType", js.undefined)
      
      @scala.inline
      def setItemId(value: java.lang.String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setLayoutOnOrientationChange(value: Boolean): Self = StObject.set(x, "layoutOnOrientationChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutOnOrientationChangeUndefined: Self = StObject.set(x, "layoutOnOrientationChange", js.undefined)
      
      @scala.inline
      def setLeft(value: js.Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: js.Any): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: js.Any): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: js.Any): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: js.Any): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      @scala.inline
      def setMonitorOrientation(value: Boolean): Self = StObject.set(x, "monitorOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorOrientationUndefined: Self = StObject.set(x, "monitorOrientation", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setRecord(value: IModel): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
      
      @scala.inline
      def setRemoveCls(
        value: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit
      ): Self = StObject.set(x, "removeCls", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveClsUndefined: Self = StObject.set(x, "removeCls", js.undefined)
      
      @scala.inline
      def setRenderTo(value: IElement): Self = StObject.set(x, "renderTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderToUndefined: Self = StObject.set(x, "renderTo", js.undefined)
      
      @scala.inline
      def setReplaceCls(
        value: (/* oldCls */ js.UndefOr[java.lang.String], /* newCls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => Unit
      ): Self = StObject.set(x, "replaceCls", js.Any.fromFunction4(value))
      
      @scala.inline
      def setReplaceClsUndefined: Self = StObject.set(x, "replaceCls", js.undefined)
      
      @scala.inline
      def setResetFloating(value: () => Unit): Self = StObject.set(x, "resetFloating", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetFloatingUndefined: Self = StObject.set(x, "resetFloating", js.undefined)
      
      @scala.inline
      def setRight(value: js.Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setScroll(value: js.Any): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSetBaseCls(value: /* baseCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setBaseCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBaseClsUndefined: Self = StObject.set(x, "setBaseCls", js.undefined)
      
      @scala.inline
      def setSetBorder(value: /* border */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBorder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBorderUndefined: Self = StObject.set(x, "setBorder", js.undefined)
      
      @scala.inline
      def setSetBottom(value: /* bottom */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
      
      @scala.inline
      def setSetCentered(value: /* centered */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setCentered", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCenteredUndefined: Self = StObject.set(x, "setCentered", js.undefined)
      
      @scala.inline
      def setSetCls(value: /* cls */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      
      @scala.inline
      def setSetContentEl(value: /* contentEl */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setContentEl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetContentElUndefined: Self = StObject.set(x, "setContentEl", js.undefined)
      
      @scala.inline
      def setSetData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
      
      @scala.inline
      def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDisabledCls(value: /* disabledCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDisabledCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDisabledClsUndefined: Self = StObject.set(x, "setDisabledCls", js.undefined)
      
      @scala.inline
      def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
      
      @scala.inline
      def setSetDocked(value: /* docked */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDocked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDockedUndefined: Self = StObject.set(x, "setDocked", js.undefined)
      
      @scala.inline
      def setSetDraggable(value: /* draggable */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDraggable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDraggableUndefined: Self = StObject.set(x, "setDraggable", js.undefined)
      
      @scala.inline
      def setSetEnterAnimation(value: /* enterAnimation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setEnterAnimation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEnterAnimationUndefined: Self = StObject.set(x, "setEnterAnimation", js.undefined)
      
      @scala.inline
      def setSetExitAnimation(value: /* exitAnimation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setExitAnimation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetExitAnimationUndefined: Self = StObject.set(x, "setExitAnimation", js.undefined)
      
      @scala.inline
      def setSetFlex(value: /* flex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setFlex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFlexUndefined: Self = StObject.set(x, "setFlex", js.undefined)
      
      @scala.inline
      def setSetFloating(value: /* floating */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setFloating", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFloatingCls(value: /* floatingCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setFloatingCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFloatingClsUndefined: Self = StObject.set(x, "setFloatingCls", js.undefined)
      
      @scala.inline
      def setSetFloatingUndefined: Self = StObject.set(x, "setFloating", js.undefined)
      
      @scala.inline
      def setSetHeight(value: /* height */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      @scala.inline
      def setSetHidden(value: /* hidden */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHidden", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHiddenCls(value: /* hiddenCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setHiddenCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHiddenClsUndefined: Self = StObject.set(x, "setHiddenCls", js.undefined)
      
      @scala.inline
      def setSetHiddenUndefined: Self = StObject.set(x, "setHidden", js.undefined)
      
      @scala.inline
      def setSetHideAnimation(value: /* hideAnimation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHideAnimation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHideAnimationUndefined: Self = StObject.set(x, "setHideAnimation", js.undefined)
      
      @scala.inline
      def setSetHtml(value: /* html */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHtml", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHtmlUndefined: Self = StObject.set(x, "setHtml", js.undefined)
      
      @scala.inline
      def setSetItemId(value: /* itemId */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setItemId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItemIdUndefined: Self = StObject.set(x, "setItemId", js.undefined)
      
      @scala.inline
      def setSetLeft(value: /* left */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
      
      @scala.inline
      def setSetMargin(value: /* margin */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMargin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMarginUndefined: Self = StObject.set(x, "setMargin", js.undefined)
      
      @scala.inline
      def setSetMaxHeight(value: /* maxHeight */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMaxHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxHeightUndefined: Self = StObject.set(x, "setMaxHeight", js.undefined)
      
      @scala.inline
      def setSetMaxWidth(value: /* maxWidth */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMaxWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaxWidthUndefined: Self = StObject.set(x, "setMaxWidth", js.undefined)
      
      @scala.inline
      def setSetMinHeight(value: /* minHeight */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMinHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinHeightUndefined: Self = StObject.set(x, "setMinHeight", js.undefined)
      
      @scala.inline
      def setSetMinWidth(value: /* minWidth */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMinWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMinWidthUndefined: Self = StObject.set(x, "setMinWidth", js.undefined)
      
      @scala.inline
      def setSetPadding(value: /* padding */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPadding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPaddingUndefined: Self = StObject.set(x, "setPadding", js.undefined)
      
      @scala.inline
      def setSetPlugins(value: /* plugins */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setPlugins", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPluginsUndefined: Self = StObject.set(x, "setPlugins", js.undefined)
      
      @scala.inline
      def setSetRecord(value: /* record */ js.UndefOr[IModel] => Unit): Self = StObject.set(x, "setRecord", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRecordUndefined: Self = StObject.set(x, "setRecord", js.undefined)
      
      @scala.inline
      def setSetRenderTo(value: /* renderTo */ js.UndefOr[IElement] => Unit): Self = StObject.set(x, "setRenderTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRenderToUndefined: Self = StObject.set(x, "setRenderTo", js.undefined)
      
      @scala.inline
      def setSetRight(value: /* right */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
      
      @scala.inline
      def setSetScrollable(value: () => Unit): Self = StObject.set(x, "setScrollable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetScrollableUndefined: Self = StObject.set(x, "setScrollable", js.undefined)
      
      @scala.inline
      def setSetShowAnimation(value: /* showAnimation */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setShowAnimation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetShowAnimationUndefined: Self = StObject.set(x, "setShowAnimation", js.undefined)
      
      @scala.inline
      def setSetSize(value: (/* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
      
      @scala.inline
      def setSetStyle(value: /* style */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStyleHtmlCls(value: /* styleHtmlCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setStyleHtmlCls", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStyleHtmlClsUndefined: Self = StObject.set(x, "setStyleHtmlCls", js.undefined)
      
      @scala.inline
      def setSetStyleHtmlContent(value: /* styleHtmlContent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setStyleHtmlContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStyleHtmlContentUndefined: Self = StObject.set(x, "setStyleHtmlContent", js.undefined)
      
      @scala.inline
      def setSetStyleUndefined: Self = StObject.set(x, "setStyle", js.undefined)
      
      @scala.inline
      def setSetTop(value: /* top */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTopUndefined: Self = StObject.set(x, "setTop", js.undefined)
      
      @scala.inline
      def setSetTpl(value: /* tpl */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setTpl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTplUndefined: Self = StObject.set(x, "setTpl", js.undefined)
      
      @scala.inline
      def setSetTplWriteMode(value: /* tplWriteMode */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTplWriteMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTplWriteModeUndefined: Self = StObject.set(x, "setTplWriteMode", js.undefined)
      
      @scala.inline
      def setSetUi(value: /* ui */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setUi", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUiUndefined: Self = StObject.set(x, "setUi", js.undefined)
      
      @scala.inline
      def setSetWidth(value: /* width */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
      
      @scala.inline
      def setSetZIndex(value: /* zIndex */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetZIndexUndefined: Self = StObject.set(x, "setZIndex", js.undefined)
      
      @scala.inline
      def setShow(value: /* animation */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.lib.IComponent): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowAnimation(value: js.Any): Self = StObject.set(x, "showAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAnimationUndefined: Self = StObject.set(x, "showAnimation", js.undefined)
      
      @scala.inline
      def setShowBy(
        value: (/* component */ js.UndefOr[typings.senchaTouch.Ext.lib.IComponent], /* alignment */ js.UndefOr[java.lang.String]) => Unit
      ): Self = StObject.set(x, "showBy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShowByUndefined: Self = StObject.set(x, "showBy", js.undefined)
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setStopMaskTapEvent(value: Boolean): Self = StObject.set(x, "stopMaskTapEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopMaskTapEventUndefined: Self = StObject.set(x, "stopMaskTapEvent", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleHtmlCls(value: java.lang.String): Self = StObject.set(x, "styleHtmlCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleHtmlClsUndefined: Self = StObject.set(x, "styleHtmlCls", js.undefined)
      
      @scala.inline
      def setStyleHtmlContent(value: Boolean): Self = StObject.set(x, "styleHtmlContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleHtmlContentUndefined: Self = StObject.set(x, "styleHtmlContent", js.undefined)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTop(value: js.Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTpl(value: js.Any): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
      
      @scala.inline
      def setTplWriteMode(value: java.lang.String): Self = StObject.set(x, "tplWriteMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTplWriteModeUndefined: Self = StObject.set(x, "tplWriteMode", js.undefined)
      
      @scala.inline
      def setUi(value: java.lang.String): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiUndefined: Self = StObject.set(x, "ui", js.undefined)
      
      @scala.inline
      def setUp(value: /* selector */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.IContainer): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdateStyleHtmlCls(value: (/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "updateStyleHtmlCls", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateStyleHtmlClsUndefined: Self = StObject.set(x, "updateStyleHtmlCls", js.undefined)
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      
      @scala.inline
      def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setXtype(value: java.lang.String): Self = StObject.set(x, "xtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXtypeUndefined: Self = StObject.set(x, "xtype", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait IContainer
    extends typings.senchaTouch.Ext.IComponent {
    
    /** [Config Option] (Object/String/Number) */
    var activeItem: js.UndefOr[js.Any] = js.native
    
    /** [Method] Adds one or more Components to this Container
      * @param newItems Object/Object[]/Ext.Component/Ext.Component[] The new items to add to the Container.
      * @returns Ext.Component The last item added to the Container from the newItems array.
      */
    var add: js.UndefOr[
        js.Function1[/* newItems */ js.UndefOr[js.Any], typings.senchaTouch.Ext.IComponent]
      ] = js.native
    
    /** [Method] Adds an array of Components to this Container
      * @param items Array The array of items to add to this container.
      * @returns Array The array of items after they have been added.
      */
    var addAll: js.UndefOr[js.Function1[/* items */ js.UndefOr[Array], Array]] = js.native
    
    /** [Method] Animates to the supplied activeItem with a specified animation
      * @param activeItem Object/Number The item or item index to make active.
      * @param animation Object/Ext.fx.layout.Card Card animation configuration or instance.
      */
    var animateActiveItem: js.UndefOr[
        js.Function2[/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Method] Changes the masked configuration when its setter is called which will convert the value into a proper object instanc
      * @param masked Boolean/Object/Ext.Mask/Ext.LoadMask
      * @returns Object
      */
    var applyMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Config Option] (Boolean) */
    var autoDestroy: js.UndefOr[Boolean] = js.native
    
    /** [Config Option] (String/Object/Boolean) */
    var cardSwitchAnimation: js.UndefOr[js.Any] = js.native
    
    /** [Method] Retrieves the first direct child of this container which matches the passed selector
      * @param selector String An Ext.ComponentQuery selector.
      * @returns Ext.Component
      */
    var child: js.UndefOr[
        js.Function1[/* selector */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.IComponent]
      ] = js.native
    
    /** [Config Option] (Object) */
    var control: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (String) */
    var defaultType: js.UndefOr[java.lang.String] = js.native
    
    /** [Config Option] (Object) */
    var defaults: js.UndefOr[js.Any] = js.native
    
    /** [Method] Retrieves the first descendant of this container which matches the passed selector
      * @param selector String An Ext.ComponentQuery selector.
      * @returns Ext.Component
      */
    var down: js.UndefOr[
        js.Function1[/* selector */ js.UndefOr[java.lang.String], typings.senchaTouch.Ext.IComponent]
      ] = js.native
    
    /** [Method] Returns the value of activeItem
      * @returns Object/String/Number
      */
    var getActiveItem: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the Component for a given index in the Container s items
      * @param index Number The index of the Component to return.
      * @returns Ext.Component The item at the specified index, if found.
      */
    var getAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], typings.senchaTouch.Ext.IComponent]] = js.native
    
    /** [Method] Returns the value of autoDestroy
      * @returns Boolean
      */
    var getAutoDestroy: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Examines this container s items property and gets a direct child component of this container
      * @param component String/Number This parameter may be any of the following:  {String} : representing the itemId or id of the child component. {Number} : representing the position of the child component within the items property. For additional information see Ext.util.MixedCollection.get.
      * @returns Ext.Component The component (if found).
      */
    var getComponent: js.UndefOr[
        js.Function1[/* component */ js.UndefOr[js.Any], typings.senchaTouch.Ext.IComponent]
      ] = js.native
    
    /** [Method] Returns the value of control
      * @returns Object
      */
    var getControl: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of defaultType
      * @returns String
      */
    var getDefaultType: js.UndefOr[js.Function0[java.lang.String]] = js.native
    
    /** [Method] Returns the value of defaults
      * @returns Object
      */
    var getDefaults: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Finds a docked item of this container using a reference idor an index of its location in getDockedItems
      * @param component String/Number The id or index of the component to find.
      * @returns Ext.Component/Boolean The docked component, if found.
      */
    var getDockedComponent: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Returns all the Ext Component docked items in this container
      * @returns Array The docked items of this container.
      */
    var getDockedItems: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Returns the value of hideOnMaskTap
      * @returns Boolean
      */
    var getHideOnMaskTap: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns all inner items of this container
      * @returns Array The inner items of this container.
      */
    var getInnerItems: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Returns the value of items
      * @returns Array/Object
      */
    var getItems: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of masked
      * @returns Boolean/Object/Ext.Mask/Ext.LoadMask
      */
    var getMasked: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of modal
      * @returns Boolean
      */
    var getModal: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns an the scrollable instance for this container which is a Ext scroll View class
      * @returns Ext.scroll.View The scroll view.
      */
    var getScrollable: js.UndefOr[js.Function0[IView]] = js.native
    
    /** [Method] Hides this Component optionally using an animation
      * @returns Ext.Component
      */
    @JSName("hide")
    var hide_IContainer: js.UndefOr[js.Function0[typings.senchaTouch.Ext.IComponent]] = js.native
    
    /** [Method] Adds a child Component at the given index
      * @param index Number The index to insert the Component at.
      * @param item Object The Component to insert.
      */
    var insert: js.UndefOr[
        js.Function2[/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Config Option] (Array/Object) */
    var items: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Object/String) */
    var layout: js.UndefOr[js.Any] = js.native
    
    /** [Method] Convenience method which calls setMasked with a value of true to show the mask
      * @param mask Object
      */
    var mask: js.UndefOr[js.Function1[/* mask */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Boolean/Object/Ext.Mask/Ext.LoadMask) */
    var masked: js.UndefOr[js.Any] = js.native
    
    /** [Method] Retrieves all descendant components which match the passed selector
      * @param selector String Selector complying to an Ext.ComponentQuery selector.
      * @returns Array Ext.Component's which matched the selector.
      */
    var query: js.UndefOr[js.Function1[/* selector */ js.UndefOr[java.lang.String], Array]] = js.native
    
    /** [Method] Removes an item from this Container optionally destroying it
      * @param item Object The item to remove.
      * @param destroy Boolean Calls the Component's destroy method if true.
      * @returns Ext.Component this
      */
    var remove: js.UndefOr[
        js.Function2[
          /* item */ js.UndefOr[js.Any], 
          /* destroy */ js.UndefOr[Boolean], 
          typings.senchaTouch.Ext.IComponent
        ]
      ] = js.native
    
    /** [Method] Removes all items currently in the Container optionally destroying them all
      * @param destroy Boolean If true, destroys each removed Component.
      * @param everything Boolean If true, completely remove all items including docked / centered and floating items.
      * @returns Ext.Component this
      */
    var removeAll: js.UndefOr[
        js.Function2[
          /* destroy */ js.UndefOr[Boolean], 
          /* everything */ js.UndefOr[Boolean], 
          typings.senchaTouch.Ext.IComponent
        ]
      ] = js.native
    
    /** [Method] Removes the Component at the specified index  myContainer removeAt 0 removes the first item
      * @param index Number The index of the Component to remove.
      * @returns Ext.Container this
      */
    var removeAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
    
    /** [Method] Removes a docked item from this Container
      * @param item Object The item to remove.
      * @param destroy Boolean Calls the Component's destroy method if true.
      * @returns Ext.Component this
      */
    var removeDocked: js.UndefOr[
        js.Function2[
          /* item */ js.UndefOr[js.Any], 
          /* destroy */ js.UndefOr[Boolean], 
          typings.senchaTouch.Ext.IComponent
        ]
      ] = js.native
    
    /** [Method] Removes an inner Component at the specified index  myContainer removeInnerAt 0 removes the first item of the in
      * @param index Number The index of the Component to remove.
      * @returns Ext.Container this
      */
    var removeInnerAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], this.type]] = js.native
    
    /** [Config Option] (Boolean/String/Object) */
    var scrollable: js.UndefOr[js.Any] = js.native
    
    /** [Method] Sets the value of activeItem
      * @param activeItem Object/String/Number The new value.
      */
    var setActiveItem: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of autoDestroy
      * @param autoDestroy Boolean The new value.
      */
    var setAutoDestroy: js.UndefOr[js.Function1[/* autoDestroy */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of control
      * @param control Object The new value.
      */
    var setControl: js.UndefOr[js.Function1[/* control */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of defaultType
      * @param defaultType String The new value.
      */
    var setDefaultType: js.UndefOr[js.Function1[/* defaultType */ js.UndefOr[java.lang.String], Unit]] = js.native
    
    /** [Method] Sets the value of defaults
      * @param defaults Object The new value.
      */
    var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of hideOnMaskTap
      * @param hideOnMaskTap Boolean The new value.
      */
    var setHideOnMaskTap: js.UndefOr[js.Function1[/* hideOnMaskTap */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of items
      * @param items Array/Object The new value.
      */
    var setItems: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of layout
      * @param layout Object/String The new value.
      */
    var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of masked
      * @param masked Boolean/Object/Ext.Mask/Ext.LoadMask The new value.
      */
    var setMasked: js.UndefOr[js.Function1[/* masked */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of modal
      * @param modal Boolean The new value.
      */
    var setModal: js.UndefOr[js.Function1[/* modal */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of scrollable
      * @param scrollable Boolean/String/Object The new value.
      * @returns Ext.scroll.View The scroll view.
      */
    @JSName("setScrollable")
    var setScrollable_IContainer: js.UndefOr[js.Function1[/* scrollable */ js.UndefOr[js.Any], IView]] = js.native
    
    /** [Method] Shows this component optionally using an animation
      * @returns Ext.Component
      */
    @JSName("show")
    var show_IContainer: js.UndefOr[js.Function0[typings.senchaTouch.Ext.IComponent]] = js.native
    
    /** [Method] Convenience method which calls setMasked with a value of false to hide the mask */
    var unmask: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IContainer {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.lib.IContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.lib.IContainer]
    }
    
    @scala.inline
    implicit class IContainerMutableBuilder[Self <: typings.senchaTouch.Ext.lib.IContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveItem(value: js.Any): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveItemUndefined: Self = StObject.set(x, "activeItem", js.undefined)
      
      @scala.inline
      def setAdd(value: /* newItems */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.IComponent): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddAll(value: /* items */ js.UndefOr[Array] => Array): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddAllUndefined: Self = StObject.set(x, "addAll", js.undefined)
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setAnimateActiveItem(value: (/* activeItem */ js.UndefOr[js.Any], /* animation */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "animateActiveItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimateActiveItemUndefined: Self = StObject.set(x, "animateActiveItem", js.undefined)
      
      @scala.inline
      def setApplyMasked(value: /* masked */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "applyMasked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyMaskedUndefined: Self = StObject.set(x, "applyMasked", js.undefined)
      
      @scala.inline
      def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      @scala.inline
      def setCardSwitchAnimation(value: js.Any): Self = StObject.set(x, "cardSwitchAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardSwitchAnimationUndefined: Self = StObject.set(x, "cardSwitchAnimation", js.undefined)
      
      @scala.inline
      def setChild(value: /* selector */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.IComponent): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      @scala.inline
      def setControl(value: js.Any): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      @scala.inline
      def setDefaultType(value: java.lang.String): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
      
      @scala.inline
      def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setDown(value: /* selector */ js.UndefOr[java.lang.String] => typings.senchaTouch.Ext.IComponent): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setGetActiveItem(value: () => _): Self = StObject.set(x, "getActiveItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetActiveItemUndefined: Self = StObject.set(x, "getActiveItem", js.undefined)
      
      @scala.inline
      def setGetAt(value: /* index */ js.UndefOr[Double] => typings.senchaTouch.Ext.IComponent): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAtUndefined: Self = StObject.set(x, "getAt", js.undefined)
      
      @scala.inline
      def setGetAutoDestroy(value: () => Boolean): Self = StObject.set(x, "getAutoDestroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAutoDestroyUndefined: Self = StObject.set(x, "getAutoDestroy", js.undefined)
      
      @scala.inline
      def setGetComponent(value: /* component */ js.UndefOr[js.Any] => typings.senchaTouch.Ext.IComponent): Self = StObject.set(x, "getComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetComponentUndefined: Self = StObject.set(x, "getComponent", js.undefined)
      
      @scala.inline
      def setGetControl(value: () => _): Self = StObject.set(x, "getControl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetControlUndefined: Self = StObject.set(x, "getControl", js.undefined)
      
      @scala.inline
      def setGetDefaultType(value: () => java.lang.String): Self = StObject.set(x, "getDefaultType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultTypeUndefined: Self = StObject.set(x, "getDefaultType", js.undefined)
      
      @scala.inline
      def setGetDefaults(value: () => _): Self = StObject.set(x, "getDefaults", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDefaultsUndefined: Self = StObject.set(x, "getDefaults", js.undefined)
      
      @scala.inline
      def setGetDockedComponent(value: /* component */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getDockedComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDockedComponentUndefined: Self = StObject.set(x, "getDockedComponent", js.undefined)
      
      @scala.inline
      def setGetDockedItems(value: () => Array): Self = StObject.set(x, "getDockedItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDockedItemsUndefined: Self = StObject.set(x, "getDockedItems", js.undefined)
      
      @scala.inline
      def setGetHideOnMaskTap(value: () => Boolean): Self = StObject.set(x, "getHideOnMaskTap", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHideOnMaskTapUndefined: Self = StObject.set(x, "getHideOnMaskTap", js.undefined)
      
      @scala.inline
      def setGetInnerItems(value: () => Array): Self = StObject.set(x, "getInnerItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInnerItemsUndefined: Self = StObject.set(x, "getInnerItems", js.undefined)
      
      @scala.inline
      def setGetItems(value: () => _): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItemsUndefined: Self = StObject.set(x, "getItems", js.undefined)
      
      @scala.inline
      def setGetMasked(value: () => _): Self = StObject.set(x, "getMasked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaskedUndefined: Self = StObject.set(x, "getMasked", js.undefined)
      
      @scala.inline
      def setGetModal(value: () => Boolean): Self = StObject.set(x, "getModal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetModalUndefined: Self = StObject.set(x, "getModal", js.undefined)
      
      @scala.inline
      def setGetScrollable(value: () => IView): Self = StObject.set(x, "getScrollable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetScrollableUndefined: Self = StObject.set(x, "getScrollable", js.undefined)
      
      @scala.inline
      def setHide(value: () => typings.senchaTouch.Ext.IComponent): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      @scala.inline
      def setInsert(value: (/* index */ js.UndefOr[Double], /* item */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      @scala.inline
      def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setLayout(value: js.Any): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMask(value: /* mask */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "mask", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMasked(value: js.Any): Self = StObject.set(x, "masked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskedUndefined: Self = StObject.set(x, "masked", js.undefined)
      
      @scala.inline
      def setQuery(value: /* selector */ js.UndefOr[java.lang.String] => Array): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRemove(
        value: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.IComponent
      ): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveAll(
        value: (/* destroy */ js.UndefOr[Boolean], /* everything */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.IComponent
      ): Self = StObject.set(x, "removeAll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
      
      @scala.inline
      def setRemoveAt(value: /* index */ js.UndefOr[Double] => typings.senchaTouch.Ext.lib.IContainer): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAtUndefined: Self = StObject.set(x, "removeAt", js.undefined)
      
      @scala.inline
      def setRemoveDocked(
        value: (/* item */ js.UndefOr[js.Any], /* destroy */ js.UndefOr[Boolean]) => typings.senchaTouch.Ext.IComponent
      ): Self = StObject.set(x, "removeDocked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveDockedUndefined: Self = StObject.set(x, "removeDocked", js.undefined)
      
      @scala.inline
      def setRemoveInnerAt(value: /* index */ js.UndefOr[Double] => typings.senchaTouch.Ext.lib.IContainer): Self = StObject.set(x, "removeInnerAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveInnerAtUndefined: Self = StObject.set(x, "removeInnerAt", js.undefined)
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setScrollable(value: js.Any): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      @scala.inline
      def setSetActiveItem(value: /* activeItem */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setActiveItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetActiveItemUndefined: Self = StObject.set(x, "setActiveItem", js.undefined)
      
      @scala.inline
      def setSetAutoDestroy(value: /* autoDestroy */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setAutoDestroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAutoDestroyUndefined: Self = StObject.set(x, "setAutoDestroy", js.undefined)
      
      @scala.inline
      def setSetControl(value: /* control */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setControl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetControlUndefined: Self = StObject.set(x, "setControl", js.undefined)
      
      @scala.inline
      def setSetDefaultType(value: /* defaultType */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setDefaultType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDefaultTypeUndefined: Self = StObject.set(x, "setDefaultType", js.undefined)
      
      @scala.inline
      def setSetDefaults(value: /* defaults */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDefaultsUndefined: Self = StObject.set(x, "setDefaults", js.undefined)
      
      @scala.inline
      def setSetHideOnMaskTap(value: /* hideOnMaskTap */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setHideOnMaskTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHideOnMaskTapUndefined: Self = StObject.set(x, "setHideOnMaskTap", js.undefined)
      
      @scala.inline
      def setSetItems(value: /* items */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItemsUndefined: Self = StObject.set(x, "setItems", js.undefined)
      
      @scala.inline
      def setSetLayout(value: /* layout */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLayoutUndefined: Self = StObject.set(x, "setLayout", js.undefined)
      
      @scala.inline
      def setSetMasked(value: /* masked */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setMasked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMaskedUndefined: Self = StObject.set(x, "setMasked", js.undefined)
      
      @scala.inline
      def setSetModal(value: /* modal */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setModal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetModalUndefined: Self = StObject.set(x, "setModal", js.undefined)
      
      @scala.inline
      def setSetScrollable(value: /* scrollable */ js.UndefOr[js.Any] => IView): Self = StObject.set(x, "setScrollable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetScrollableUndefined: Self = StObject.set(x, "setScrollable", js.undefined)
      
      @scala.inline
      def setShow(value: () => typings.senchaTouch.Ext.IComponent): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setUnmask(value: () => Unit): Self = StObject.set(x, "unmask", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUnmaskUndefined: Self = StObject.set(x, "unmask", js.undefined)
    }
  }
  
  @js.native
  trait IPanel
    extends typings.senchaTouch.Ext.IContainer {
    
    /** [Config Option] (Number/Boolean/String) */
    var bodyBorder: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number/Boolean/String) */
    var bodyMargin: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number/Boolean/String) */
    var bodyPadding: js.UndefOr[js.Any] = js.native
    
    /** [Method] Returns the value of bodyBorder
      * @returns Number/Boolean/String
      */
    var getBodyBorder: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of bodyMargin
      * @returns Number/Boolean/String
      */
    var getBodyMargin: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of bodyPadding
      * @returns Number/Boolean/String
      */
    var getBodyPadding: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Sets the value of bodyBorder
      * @param bodyBorder Number/Boolean/String The new value.
      */
    var setBodyBorder: js.UndefOr[js.Function1[/* bodyBorder */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of bodyMargin
      * @param bodyMargin Number/Boolean/String The new value.
      */
    var setBodyMargin: js.UndefOr[js.Function1[/* bodyMargin */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of bodyPadding
      * @param bodyPadding Number/Boolean/String The new value.
      */
    var setBodyPadding: js.UndefOr[js.Function1[/* bodyPadding */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IPanel {
    
    @scala.inline
    def apply(): typings.senchaTouch.Ext.lib.IPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.senchaTouch.Ext.lib.IPanel]
    }
    
    @scala.inline
    implicit class IPanelMutableBuilder[Self <: typings.senchaTouch.Ext.lib.IPanel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBodyBorder(value: js.Any): Self = StObject.set(x, "bodyBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyBorderUndefined: Self = StObject.set(x, "bodyBorder", js.undefined)
      
      @scala.inline
      def setBodyMargin(value: js.Any): Self = StObject.set(x, "bodyMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyMarginUndefined: Self = StObject.set(x, "bodyMargin", js.undefined)
      
      @scala.inline
      def setBodyPadding(value: js.Any): Self = StObject.set(x, "bodyPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyPaddingUndefined: Self = StObject.set(x, "bodyPadding", js.undefined)
      
      @scala.inline
      def setGetBodyBorder(value: () => _): Self = StObject.set(x, "getBodyBorder", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBodyBorderUndefined: Self = StObject.set(x, "getBodyBorder", js.undefined)
      
      @scala.inline
      def setGetBodyMargin(value: () => _): Self = StObject.set(x, "getBodyMargin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBodyMarginUndefined: Self = StObject.set(x, "getBodyMargin", js.undefined)
      
      @scala.inline
      def setGetBodyPadding(value: () => _): Self = StObject.set(x, "getBodyPadding", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBodyPaddingUndefined: Self = StObject.set(x, "getBodyPadding", js.undefined)
      
      @scala.inline
      def setSetBodyBorder(value: /* bodyBorder */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBodyBorder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBodyBorderUndefined: Self = StObject.set(x, "setBodyBorder", js.undefined)
      
      @scala.inline
      def setSetBodyMargin(value: /* bodyMargin */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBodyMargin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBodyMarginUndefined: Self = StObject.set(x, "setBodyMargin", js.undefined)
      
      @scala.inline
      def setSetBodyPadding(value: /* bodyPadding */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBodyPadding", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetBodyPaddingUndefined: Self = StObject.set(x, "setBodyPadding", js.undefined)
    }
  }
}
