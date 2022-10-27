package typings.prosemirrorMenu

import typings.prosemirrorMenu.anon.Class
import typings.prosemirrorMenu.anon.Content
import typings.prosemirrorMenu.anon.Dom
import typings.prosemirrorMenu.anon.Label
import typings.prosemirrorMenu.anon.PartialMenuItemSpecattrsA
import typings.prosemirrorMenu.anon.Update
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.EditorView
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  A drop-down menu, displayed as a label with a downwards-pointing
  triangle to the right of it.
  */
  @JSImport("prosemirror-menu", "Dropdown")
  @js.native
  open class Dropdown protected ()
    extends StObject
       with MenuElement {
    /**
      Create a dropdown wrapping the elements.
      */
    def this(content: js.Array[MenuElement]) = this()
    def this(content: MenuElement) = this()
    def this(content: js.Array[MenuElement], /**
      @internal
      */
    options: Class) = this()
    def this(content: MenuElement, /**
      @internal
      */
    options: Class) = this()
    
    /**
      Render the element for display in the menu. Must return a DOM
      element and a function that can be used to update the element to
      a new state. The `update` function must return false if the
      update hid the entire element.
      */
    /* CompleteClass */
    override def render(pm: EditorView): Dom = js.native
  }
  
  /**
  Represents a submenu wrapping a group of elements that start
  hidden and expand to the right when hovered over or tapped.
  */
  @JSImport("prosemirror-menu", "DropdownSubmenu")
  @js.native
  open class DropdownSubmenu protected ()
    extends StObject
       with MenuElement {
    /**
      Creates a submenu for the given group of menu elements. The
      following options are recognized:
      */
    def this(content: js.Array[MenuElement]) = this()
    def this(content: MenuElement) = this()
    def this(content: js.Array[MenuElement], /**
      @internal
      */
    options: Label) = this()
    def this(content: MenuElement, /**
      @internal
      */
    options: Label) = this()
    
    /**
      Render the element for display in the menu. Must return a DOM
      element and a function that can be used to update the element to
      a new state. The `update` function must return false if the
      update hid the entire element.
      */
    /* CompleteClass */
    override def render(pm: EditorView): Dom = js.native
  }
  
  /**
  An icon or label that, when clicked, executes a command.
  */
  @JSImport("prosemirror-menu", "MenuItem")
  @js.native
  open class MenuItem protected ()
    extends StObject
       with MenuElement {
    /**
      Create a menu item.
      */
    def this(/**
      The spec used to create this item.
      */
    spec: MenuItemSpec) = this()
    
    /**
      Render the element for display in the menu. Must return a DOM
      element and a function that can be used to update the element to
      a new state. The `update` function must return false if the
      update hid the entire element.
      */
    /* CompleteClass */
    override def render(pm: EditorView): Dom = js.native
    
    /**
      The spec used to create this item.
      */
    val spec: MenuItemSpec = js.native
  }
  
  /**
  Build a menu item for changing the type of the textblock around the
  selection to the given type. Provides `run`, `active`, and `select`
  properties. Others must be given in `options`. `options.attrs` may
  be an object to provide the attributes for the textblock node.
  */
  inline def blockTypeItem(nodeType: NodeType, options: PartialMenuItemSpecattrsA): MenuItem = (^.asInstanceOf[js.Dynamic].applyDynamic("blockTypeItem")(nodeType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MenuItem]
  
  /**
  Menu item for the `joinUp` command.
  */
  @JSImport("prosemirror-menu", "joinUpItem")
  @js.native
  val joinUpItem: MenuItem = js.native
  
  /**
  Menu item for the `lift` command.
  */
  @JSImport("prosemirror-menu", "liftItem")
  @js.native
  val liftItem: MenuItem = js.native
  
  /**
  A plugin that will place a menu bar above the editor. Note that
  this involves wrapping the editor in an additional `<div>`.
  */
  inline def menuBar(options: Content): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("menuBar")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  /**
  Menu item for the `redo` command.
  */
  @JSImport("prosemirror-menu", "redoItem")
  @js.native
  def redoItem: MenuItem = js.native
  inline def redoItem_=(x: MenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("redoItem")(x.asInstanceOf[js.Any])
  
  /**
  Render the given, possibly nested, array of menu elements into a
  document fragment, placing separators between them (and ensuring no
  superfluous separators appear when some of the groups turn out to
  be empty).
  */
  inline def renderGrouped(view: EditorView, content: js.Array[js.Array[MenuElement]]): Update = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGrouped")(view.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Update]
  
  /**
  Menu item for the `selectParentNode` command.
  */
  @JSImport("prosemirror-menu", "selectParentNodeItem")
  @js.native
  val selectParentNodeItem: MenuItem = js.native
  
  /**
  Menu item for the `undo` command.
  */
  @JSImport("prosemirror-menu", "undoItem")
  @js.native
  def undoItem: MenuItem = js.native
  inline def undoItem_=(x: MenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undoItem")(x.asInstanceOf[js.Any])
  
  /**
  Build a menu item for wrapping the selection in a given node type.
  Adds `run` and `select` properties to the ones present in
  `options`. `options.attrs` may be an object that provides
  attributes for the wrapping node.
  */
  inline def wrapItem(nodeType: NodeType, options: PartialMenuItemSpecattrsA): MenuItem = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapItem")(nodeType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MenuItem]
  
  /**
  Specifies an icon. May be either an SVG icon, in which case its
  `path` property should be an [SVG path
  spec](https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/d),
  and `width` and `height` should provide the viewbox in which that
  path exists. Alternatively, it may have a `text` property
  specifying a string of text that makes up the icon, with an
  optional `css` property giving additional CSS styling for the
  text. _Or_ it may contain `dom` property containing a DOM node.
  */
  /* Rewritten from type alias, can be one of: 
    - typings.prosemirrorMenu.anon.Height
    - typings.prosemirrorMenu.anon.Css
    - typings.prosemirrorMenu.anon.DomNode
  */
  trait IconSpec extends StObject
  object IconSpec {
    
    inline def Css(text: String): typings.prosemirrorMenu.anon.Css = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prosemirrorMenu.anon.Css]
    }
    
    inline def DomNode(dom: Node): typings.prosemirrorMenu.anon.DomNode = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prosemirrorMenu.anon.DomNode]
    }
    
    inline def Height(height: Double, path: String, width: Double): typings.prosemirrorMenu.anon.Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.prosemirrorMenu.anon.Height]
    }
  }
  
  /**
  The types defined in this module aren't the only thing you can
  display in your menu. Anything that conforms to this interface can
  be put into a menu structure.
  */
  trait MenuElement extends StObject {
    
    /**
      Render the element for display in the menu. Must return a DOM
      element and a function that can be used to update the element to
      a new state. The `update` function must return false if the
      update hid the entire element.
      */
    def render(pm: EditorView): Dom
  }
  object MenuElement {
    
    inline def apply(render: EditorView => Dom): MenuElement = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[MenuElement]
    }
    
    extension [Self <: MenuElement](x: Self) {
      
      inline def setRender(value: EditorView => Dom): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  /**
  The configuration object passed to the `MenuItem` constructor.
  */
  trait MenuItemSpec extends StObject {
    
    /**
      A predicate function to determine whether the item is 'active' (for
      example, the item for toggling the strong mark might be active then
      the cursor is in strong text).
      */
    var active: js.UndefOr[js.Function1[/* state */ EditorState, Boolean]] = js.undefined
    
    /**
      Optionally adds a CSS class to the item's DOM representation.
      */
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      Optionally adds a string of inline CSS to the item's DOM
      representation.
      */
    var css: js.UndefOr[String] = js.undefined
    
    /**
      Function that is used to determine if the item is enabled. If
      given and returning false, the item will be given a disabled
      styling.
      */
    var enable: js.UndefOr[js.Function1[/* state */ EditorState, Boolean]] = js.undefined
    
    /**
      Describes an icon to show for this item.
      */
    var icon: js.UndefOr[IconSpec] = js.undefined
    
    /**
      Makes the item show up as a text label. Mostly useful for items
      wrapped in a [drop-down](https://prosemirror.net/docs/ref/#menu.Dropdown) or similar menu. The object
      should have a `label` property providing the text to display.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      A function that renders the item. You must provide either this,
      [`icon`](https://prosemirror.net/docs/ref/#menu.MenuItemSpec.icon), or [`label`](https://prosemirror.net/docs/ref/#MenuItemSpec.label).
      */
    var render: js.UndefOr[js.Function1[/* view */ EditorView, HTMLElement]] = js.undefined
    
    /**
      The function to execute when the menu item is activated.
      */
    def run(
      state: EditorState,
      dispatch: js.Function1[/* tr */ Transaction, Unit],
      view: EditorView,
      event: Event
    ): Unit
    
    /**
      Optional function that is used to determine whether the item is
      appropriate at the moment. Deselected items will be hidden.
      */
    var select: js.UndefOr[js.Function1[/* state */ EditorState, Boolean]] = js.undefined
    
    /**
      Defines DOM title (mouseover) text for the item.
      */
    var title: js.UndefOr[String | (js.Function1[/* state */ EditorState, String])] = js.undefined
  }
  object MenuItemSpec {
    
    inline def apply(run: (EditorState, js.Function1[/* tr */ Transaction, Unit], EditorView, Event) => Unit): MenuItemSpec = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction4(run))
      __obj.asInstanceOf[MenuItemSpec]
    }
    
    extension [Self <: MenuItemSpec](x: Self) {
      
      inline def setActive(value: /* state */ EditorState => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction1(value))
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setEnable(value: /* state */ EditorState => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setIcon(value: IconSpec): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setRender(value: /* view */ EditorView => HTMLElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setRun(value: (EditorState, js.Function1[/* tr */ Transaction, Unit], EditorView, Event) => Unit): Self = StObject.set(x, "run", js.Any.fromFunction4(value))
      
      inline def setSelect(value: /* state */ EditorState => Boolean): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTitle(value: String | (js.Function1[/* state */ EditorState, String])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* state */ EditorState => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
