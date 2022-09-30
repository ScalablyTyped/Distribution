package typings.reactBlessed

import typings.blessed.mod.Widgets.BlessedElement
import typings.blessed.mod.Widgets.Border
import typings.blessed.mod.Widgets.Events.IKeyEventArg
import typings.blessed.mod.Widgets.Events.IMouseEventArg
import typings.blessed.mod.Widgets.Node
import typings.blessed.mod.Widgets.NodeEventType
import typings.blessed.mod.Widgets.NodeGenericEventType
import typings.blessed.mod.Widgets.NodeMouseEventType
import typings.blessed.mod.Widgets.NodeScreenEventType
import typings.blessed.mod.Widgets.Padding
import typings.blessed.mod.Widgets.Position
import typings.blessed.mod.Widgets.Screen
import typings.blessed.mod.Widgets.Types.TPosition
import typings.blessed.mod.Widgets.Types.TTopLeft
import typings.react.mod.ReactNode
import typings.reactBlessed.mod.ElementStyle
import typings.reactBlessed.mod.ListStyle
import typings.reactBlessed.mod.ProgressBarStyle
import typings.reactBlessed.reactBlessedStrings.`inline-block`
import typings.reactBlessed.reactBlessedStrings.`inline`
import typings.reactBlessed.reactBlessedStrings.bg
import typings.reactBlessed.reactBlessedStrings.bottom
import typings.reactBlessed.reactBlessedStrings.center
import typings.reactBlessed.reactBlessedStrings.complete
import typings.reactBlessed.reactBlessedStrings.grid
import typings.reactBlessed.reactBlessedStrings.keypress
import typings.reactBlessed.reactBlessedStrings.left
import typings.reactBlessed.reactBlessedStrings.line
import typings.reactBlessed.reactBlessedStrings.middle
import typings.reactBlessed.reactBlessedStrings.reset
import typings.reactBlessed.reactBlessedStrings.right
import typings.reactBlessed.reactBlessedStrings.scroll
import typings.reactBlessed.reactBlessedStrings.top
import typings.reactBlessed.reactBlessedStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bg extends StObject {
    
    var bg: js.UndefOr[String] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
  }
  object Bg {
    
    inline def apply(): Bg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bg]
    }
    
    extension [Self <: Bg](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[ElementStyle] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setStyle(value: ElementStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Class[K] extends StObject {
    
    var `class`: js.UndefOr[K | js.Array[K]] = js.undefined
  }
  object Class {
    
    inline def apply[K](): Class[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Class[K]]
    }
    
    extension [Self <: Class[?], K](x: Self & Class[K]) {
      
      inline def setClass(value: K | js.Array[K]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setClassVarargs(value: K*): Self = StObject.set(x, "class", js.Array(value*))
    }
  }
  
  trait Fg extends StObject {
    
    var bg: js.UndefOr[String] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
    
    var track: js.UndefOr[Bg] = js.undefined
  }
  object Fg {
    
    inline def apply(): Fg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fg]
    }
    
    extension [Self <: Fg](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setTrack(value: Bg): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def apply(event: reset | complete, callback: js.Function0[Unit]): this.type = js.native
    def apply(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def apply(event: String, listener: js.Function2[/* ch */ Any, /* key */ IKeyEventArg, Unit]): this.type = js.native
    def apply(event: NodeEventType, callback: js.Function1[/* arg */ this.type, Unit]): this.type = js.native
    def apply(event: NodeGenericEventType, callback: js.Function0[Unit]): this.type = js.native
    def apply(event: NodeMouseEventType, callback: js.Function1[/* arg */ IMouseEventArg, Unit]): this.type = js.native
    def apply(event: NodeScreenEventType, callback: js.Function1[/* arg */ Screen, Unit]): this.type = js.native
    def apply(event: keypress, callback: js.Function2[/* ch */ String, /* key */ IKeyEventArg, Unit]): this.type = js.native
    def apply(event: scroll, callback: js.Function0[Unit]): this.type = js.native
    def apply(event: warning, callback: js.Function1[/* text */ String, Unit]): this.type = js.native
  }
  
  /* Inlined std.Partial<blessed.blessed.Widgets.LayoutOptions> */
  trait PartialLayoutOptions extends StObject {
    
    var align: js.UndefOr[left | center | right] = js.undefined
    
    var bg: js.UndefOr[String] = js.undefined
    
    var bold: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[Border | line | bg] = js.undefined
    
    var bottom: js.UndefOr[TPosition] = js.undefined
    
    var ch: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[js.Array[Node]] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var fg: js.UndefOr[String] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var focused: js.UndefOr[BlessedElement] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var hoverText: js.UndefOr[String] = js.undefined
    
    var input: js.UndefOr[Boolean] = js.undefined
    
    var keyable: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[`inline` | `inline-block` | grid] = js.undefined
    
    var left: js.UndefOr[TTopLeft] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var padding: js.UndefOr[Double | Padding] = js.undefined
    
    var parent: js.UndefOr[Node] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var renderer: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var right: js.UndefOr[TPosition] = js.undefined
    
    var screen: js.UndefOr[Screen] = js.undefined
    
    var scrollable: js.UndefOr[Boolean] = js.undefined
    
    var shadow: js.UndefOr[Boolean] = js.undefined
    
    var shrink: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
    
    var tags: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[TTopLeft] = js.undefined
    
    var underline: js.UndefOr[String] = js.undefined
    
    var valign: js.UndefOr[top | middle | bottom] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object PartialLayoutOptions {
    
    inline def apply(): PartialLayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLayoutOptions]
    }
    
    extension [Self <: PartialLayoutOptions](x: Self) {
      
      inline def setAlign(value: left | center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      inline def setBorder(value: Border | line | bg): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBottom(value: TPosition): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCh(value: String): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
      
      inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setFocused(value: BlessedElement): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHoverText(value: String): Self = StObject.set(x, "hoverText", value.asInstanceOf[js.Any])
      
      inline def setHoverTextUndefined: Self = StObject.set(x, "hoverText", js.undefined)
      
      inline def setInput(value: Boolean): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setKeyable(value: Boolean): Self = StObject.set(x, "keyable", value.asInstanceOf[js.Any])
      
      inline def setKeyableUndefined: Self = StObject.set(x, "keyable", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLayout(value: `inline` | `inline-block` | grid): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLeft(value: TTopLeft): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPadding(value: Double | Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRenderer(value: () => Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction0(value))
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setRight(value: TPosition): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
      
      inline def setScrollable(value: Boolean): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
      
      inline def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
      
      inline def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setShrink(value: Boolean): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
      
      inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTags(value: Boolean): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTop(value: TTopLeft): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
      
      inline def setValign(value: top | middle | bottom): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
      
      inline def setValignUndefined: Self = StObject.set(x, "valign", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Selected extends StObject {
    
    var selected: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[ListStyle] = js.undefined
  }
  object Selected {
    
    inline def apply(): Selected = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selected]
    }
    
    extension [Self <: Selected](x: Self) {
      
      inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStyle(value: ListStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[ProgressBarStyle] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: ProgressBarStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
