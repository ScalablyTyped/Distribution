package typings.prosemirrorMenu

import typings.prosemirrorMenu.mod.IconSpec
import typings.prosemirrorMenu.mod.MenuElement
import typings.prosemirrorModel.mod.Attrs
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.EditorView
import typings.std.DocumentFragment
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Class extends StObject {
    
    /**
      When given, adds an extra CSS class to the menu control.
      */
    var `class`: js.UndefOr[String] = js.undefined
    
    /**
      When given, adds an extra set of CSS styles to the menu control.
      */
    var css: js.UndefOr[String] = js.undefined
    
    /**
      The label to show on the drop-down control.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      Sets the
      [`title`](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/title)
      attribute given to the menu control.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object Class {
    
    inline def apply(): Class = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Class]
    }
    
    extension [Self <: Class](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Content extends StObject {
    
    /**
      Provides the content of the menu, as a nested array to be
      passed to `renderGrouped`.
      */
    var content: js.Array[js.Array[MenuElement]]
    
    /**
      Determines whether the menu floats, i.e. whether it sticks to
      the top of the viewport when the editor is partially scrolled
      out of view.
      */
    var floating: js.UndefOr[Boolean] = js.undefined
  }
  object Content {
    
    inline def apply(content: js.Array[js.Array[MenuElement]]): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: js.Array[js.Array[MenuElement]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: js.Array[MenuElement]*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
    }
  }
  
  trait Css
    extends StObject
       with IconSpec {
    
    var css: js.UndefOr[String] = js.undefined
    
    var text: String
  }
  object Css {
    
    inline def apply(text: String): Css = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Css]
    }
    
    extension [Self <: Css](x: Self) {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dom extends StObject {
    
    var dom: HTMLElement
    
    def update(state: EditorState): Boolean
  }
  object Dom {
    
    inline def apply(dom: HTMLElement, update: EditorState => Boolean): Dom = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Dom]
    }
    
    extension [Self <: Dom](x: Self) {
      
      inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: EditorState => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait DomNode
    extends StObject
       with IconSpec {
    
    var dom: Node
  }
  object DomNode {
    
    inline def apply(dom: Node): DomNode = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomNode]
    }
    
    extension [Self <: DomNode](x: Self) {
      
      inline def setDom(value: Node): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height
    extends StObject
       with IconSpec {
    
    var height: Double
    
    var path: String
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, path: String, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    /**
      The label to show on the submenu.
      */
    var label: js.UndefOr[String] = js.undefined
  }
  object Label {
    
    inline def apply(): Label = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  /* Inlined std.Partial<prosemirror-menu.prosemirror-menu.MenuItemSpec> & {  attrs :prosemirror-model.prosemirror-model.Attrs | null | undefined} */
  trait PartialMenuItemSpecattrsA extends StObject {
    
    var active: js.UndefOr[js.Function1[/* state */ EditorState, Boolean]] = js.undefined
    
    var attrs: js.UndefOr[Attrs | Null] = js.undefined
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var css: js.UndefOr[String] = js.undefined
    
    var enable: js.UndefOr[js.Function1[/* state */ EditorState, Boolean]] = js.undefined
    
    var icon: js.UndefOr[IconSpec] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[js.Function1[/* view */ EditorView, HTMLElement]] = js.undefined
    
    var run: js.UndefOr[
        js.Function4[
          /* state */ EditorState, 
          /* dispatch */ js.Function1[/* tr */ Transaction, Unit], 
          /* view */ EditorView, 
          /* event */ Event, 
          Unit
        ]
      ] = js.undefined
    
    var select: js.UndefOr[js.Function1[/* state */ EditorState, Boolean]] = js.undefined
    
    var title: js.UndefOr[String | (js.Function1[/* state */ EditorState, String])] = js.undefined
  }
  object PartialMenuItemSpecattrsA {
    
    inline def apply(): PartialMenuItemSpecattrsA = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMenuItemSpecattrsA]
    }
    
    extension [Self <: PartialMenuItemSpecattrsA](x: Self) {
      
      inline def setActive(value: /* state */ EditorState => Boolean): Self = StObject.set(x, "active", js.Any.fromFunction1(value))
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAttrs(value: Attrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsNull: Self = StObject.set(x, "attrs", null)
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
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
      
      inline def setRun(
        value: (/* state */ EditorState, /* dispatch */ js.Function1[/* tr */ Transaction, Unit], /* view */ EditorView, /* event */ Event) => Unit
      ): Self = StObject.set(x, "run", js.Any.fromFunction4(value))
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      inline def setSelect(value: /* state */ EditorState => Boolean): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setTitle(value: String | (js.Function1[/* state */ EditorState, String])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* state */ EditorState => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Update extends StObject {
    
    var dom: DocumentFragment
    
    def update(state: EditorState): Boolean
  }
  object Update {
    
    inline def apply(dom: DocumentFragment, update: EditorState => Boolean): Update = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Update]
    }
    
    extension [Self <: Update](x: Self) {
      
      inline def setDom(value: DocumentFragment): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: EditorState => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
