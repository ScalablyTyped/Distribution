package typings.prosemirrorMenu

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorMenu.anon.Content
import typings.prosemirrorMenu.anon.Dom
import typings.prosemirrorMenu.anon.DomUpdate
import typings.prosemirrorMenu.anon.Update
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.EditorView
import typings.std.Event
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-menu", "Dropdown")
  @js.native
  class Dropdown[S /* <: Schema[_, _] */] protected () extends StObject {
    /**
      * Create a dropdown wrapping the elements. Options may include
      * the following properties:
      *
      * **`label`**`: string`
      * : The label to show on the drop-down control.
      *
      * **`title`**`: string`
      * : Sets the
      * [`title`](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/title)
      * attribute given to the menu control.
      *
      * **`class`**`: string`
      * : When given, adds an extra CSS class to the menu control.
      *
      * **`css`**`: string`
      * : When given, adds an extra set of CSS styles to the menu control.
      */
    def this(content: js.Array[MenuElement[S]]) = this()
    def this(content: js.Array[MenuElement[S]], options: StringDictionary[js.Any]) = this()
    
    /**
      * Render the dropdown menu and sub-items.
      */
    def render(view: EditorView[S]): Update[S] = js.native
  }
  
  @JSImport("prosemirror-menu", "DropdownSubmenu")
  @js.native
  class DropdownSubmenu[S /* <: Schema[_, _] */] protected () extends StObject {
    /**
      * Creates a submenu for the given group of menu elements. The
      * following options are recognized:
      *
      * **`label`**`: string`
      * : The label to show on the submenu.
      */
    def this(content: js.Array[MenuElement[S]]) = this()
    def this(content: js.Array[MenuElement[S]], options: StringDictionary[js.Any]) = this()
    
    /**
      * Renders the submenu.
      */
    def render(view: EditorView[S]): Dom[S] = js.native
  }
  
  @JSImport("prosemirror-menu", "MenuItem")
  @js.native
  class MenuItem[S /* <: Schema[_, _] */] protected () extends StObject {
    def this(spec: MenuItemSpec[S]) = this()
    
    /**
      * Renders the icon according to its [display
      * spec](#menu.MenuItemSpec.display), and adds an event handler which
      * executes the command when the representation is clicked.
      */
    def render(view: EditorView[S]): Dom[S] = js.native
    
    /**
      * The spec used to create the menu item.
      */
    var spec: MenuItemSpec[S] = js.native
  }
  
  @JSImport("prosemirror-menu", "blockTypeItem")
  @js.native
  def blockTypeItem[S /* <: Schema[_, _] */](nodeType: NodeType[S], options: StringDictionary[js.Any]): MenuItem[S] = js.native
  
  @JSImport("prosemirror-menu", "joinUpItem")
  @js.native
  def joinUpItem: MenuItem[js.Any] = js.native
  @scala.inline
  def joinUpItem_=(x: MenuItem[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("joinUpItem")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-menu", "liftItem")
  @js.native
  def liftItem: MenuItem[js.Any] = js.native
  @scala.inline
  def liftItem_=(x: MenuItem[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("liftItem")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-menu", "menuBar")
  @js.native
  def menuBar[S /* <: Schema[_, _] */](options: Content[S]): Plugin[S, _] = js.native
  
  @JSImport("prosemirror-menu", "redoItem")
  @js.native
  def redoItem(p: StringDictionary[js.Any]): MenuItem[_] = js.native
  
  @JSImport("prosemirror-menu", "renderGrouped")
  @js.native
  def renderGrouped[S /* <: Schema[_, _] */](view: EditorView[S], content: js.Array[MenuElement[S] | js.Array[MenuElement[S]]]): DomUpdate[S] = js.native
  
  @JSImport("prosemirror-menu", "selectParentNodeItem")
  @js.native
  def selectParentNodeItem: MenuItem[js.Any] = js.native
  @scala.inline
  def selectParentNodeItem_=(x: MenuItem[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectParentNodeItem")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-menu", "undoItem")
  @js.native
  def undoItem(p: StringDictionary[js.Any]): MenuItem[_] = js.native
  
  @JSImport("prosemirror-menu", "wrapItem")
  @js.native
  def wrapItem[S /* <: Schema[_, _] */](nodeType: NodeType[S], options: StringDictionary[js.Any]): MenuItem[S] = js.native
  
  @js.native
  trait MenuElement[S /* <: Schema[_, _] */] extends StObject {
    
    /**
      * Render the element for display in the menu. Must return a DOM
      * element and a function that can be used to update the element to
      * a new state. The `update` function will return false if the
      * update hid the entire element.
      */
    def render(pm: EditorView[S]): Dom[S] = js.native
  }
  object MenuElement {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](render: EditorView[S] => Dom[S]): MenuElement[S] = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[MenuElement[S]]
    }
    
    @scala.inline
    implicit class MenuElementMutableBuilder[Self <: MenuElement[_], S /* <: Schema[_, _] */] (val x: Self with MenuElement[S]) extends AnyVal {
      
      @scala.inline
      def setRender(value: EditorView[S] => Dom[S]): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MenuItemSpec[S /* <: Schema[_, _] */] extends StObject {
    
    /**
      * A predicate function to determine whether the item is 'active' (for
      * example, the item for toggling the strong mark might be active then
      * the cursor is in strong text).
      */
    var active: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.native
    
    /**
      * Optionally adds a CSS class to the item's DOM representation.
      */
    var `class`: js.UndefOr[String] = js.native
    
    /**
      * Optionally adds a string of inline CSS to the item's DOM
      * representation.
      */
    var css: js.UndefOr[String] = js.native
    
    /**
      * Function that is used to determine if the item is enabled. If
      * given and returning false, the item will be given a disabled
      * styling.
      */
    var enable: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.native
    
    /**
      * Describes an icon to show for this item. The object may specify
      * an SVG icon, in which case its `path` property should be an [SVG
      * path
      * spec](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/d),
      * and `width` and `height` should provide the viewbox in which that
      * path exists. Alternatively, it may have a `text` property
      * specifying a string of text that makes up the icon, with an
      * optional `css` property giving additional CSS styling for the
      * text. _Or_ it may contain `dom` property containing a DOM node.
      */
    var icon: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
    
    /**
      * Makes the item show up as a text label. Mostly useful for items
      * wrapped in a [drop-down](#menu.Dropdown) or similar menu. The object
      * should have a `label` property providing the text to display.
      */
    var label: js.UndefOr[String | Null] = js.native
    
    /**
      * A function that renders the item. You must provide either this,
      * [`icon`](#menu.MenuItemSpec.icon), or [`label`](#MenuItemSpec.label).
      */
    var render: js.UndefOr[(js.Function1[/* p */ EditorView[S], Node]) | Null] = js.native
    
    /**
      * The function to execute when the menu item is activated.
      */
    def run(p1: EditorState[S], p2: js.Function1[/* p */ Transaction[S], Unit], p3: EditorView[S], p4: Event): Unit = js.native
    
    /**
      * Optional function that is used to determine whether the item is
      * appropriate at the moment. Deselected items will be hidden.
      */
    var select: js.UndefOr[(js.Function1[/* p */ EditorState[S], Boolean]) | Null] = js.native
    
    /**
      * Defines DOM title (mouseover) text for the item.
      */
    var title: js.UndefOr[String | (js.Function1[/* p */ EditorState[S], String]) | Null] = js.native
  }
  object MenuItemSpec {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](run: (EditorState[S], js.Function1[/* p */ Transaction[S], Unit], EditorView[S], Event) => Unit): MenuItemSpec[S] = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction4(run))
      __obj.asInstanceOf[MenuItemSpec[S]]
    }
    
    @scala.inline
    implicit class MenuItemSpecMutableBuilder[Self <: MenuItemSpec[_], S /* <: Schema[_, _] */] (val x: Self with MenuItemSpec[S]) extends AnyVal {
      
      @scala.inline
      def setActive(value: /* p */ EditorState[S] => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActiveNull: Self = StObject.set(x, "active", null)
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      @scala.inline
      def setEnable(value: /* p */ EditorState[S] => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnableNull: Self = StObject.set(x, "enable", null)
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setIcon(value: StringDictionary[js.Any]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelNull: Self = StObject.set(x, "label", null)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRender(value: /* p */ EditorView[S] => Node): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderNull: Self = StObject.set(x, "render", null)
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setRun(value: (EditorState[S], js.Function1[/* p */ Transaction[S], Unit], EditorView[S], Event) => Unit): Self = StObject.set(x, "run", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSelect(value: /* p */ EditorState[S] => Boolean): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectNull: Self = StObject.set(x, "select", null)
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setTitle(value: String | (js.Function1[/* p */ EditorState[S], String])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction1(value: /* p */ EditorState[S] => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
