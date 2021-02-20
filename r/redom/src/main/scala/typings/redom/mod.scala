package typings.redom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLAnchorElement
import typings.std.HTMLBRElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import typings.std.HTMLHRElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLLabelElement
import typings.std.HTMLOListElement
import typings.std.HTMLOptionElement
import typings.std.HTMLParagraphElement
import typings.std.HTMLPreElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSpanElement
import typings.std.HTMLStyleElement
import typings.std.HTMLTableCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTextAreaElement
import typings.std.HTMLUListElement
import typings.std.InstanceType
import typings.std.Node
import typings.std.ReturnType
import typings.std.SVGElement
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redom", "ListPool")
  @js.native
  class ListPool_ protected () extends StObject {
    def this(View: RedomComponentConstructor) = this()
    def this(View: RedomComponentConstructor, key: String) = this()
    def this(View: RedomComponentConstructor, key: js.UndefOr[scala.Nothing], initData: js.Any) = this()
    def this(View: RedomComponentConstructor, key: String, initData: js.Any) = this()
    
    def update(data: js.Array[_]): Unit = js.native
    def update(data: js.Array[_], context: js.Any): Unit = js.native
  }
  
  @JSImport("redom", "List")
  @js.native
  class List_ protected () extends RedomComponent {
    def this(parent: RedomQuery, View: RedomComponentCreator) = this()
    def this(parent: RedomQuery, View: RedomComponentCreator, key: String) = this()
    def this(parent: RedomQuery, View: RedomComponentCreator, key: js.UndefOr[scala.Nothing], initData: js.Any) = this()
    def this(parent: RedomQuery, View: RedomComponentCreator, key: String, initData: js.Any) = this()
    
    @JSName("el")
    var el_List_ : HTMLElement | SVGElement = js.native
    
    @JSName("update")
    def update_MList_(data: js.Array[_]): Unit = js.native
    @JSName("update")
    def update_MList_(data: js.Array[_], context: js.Any): Unit = js.native
  }
  /* static members */
  object List_ {
    
    @JSImport("redom", "List.extend")
    @js.native
    def extend(parent: RedomQuery, View: RedomComponentConstructor): RedomComponentConstructor = js.native
    @JSImport("redom", "List.extend")
    @js.native
    def extend(
      parent: RedomQuery,
      View: RedomComponentConstructor,
      key: js.UndefOr[scala.Nothing],
      initData: js.Any
    ): RedomComponentConstructor = js.native
    @JSImport("redom", "List.extend")
    @js.native
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = js.native
    @JSImport("redom", "List.extend")
    @js.native
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): RedomComponentConstructor = js.native
  }
  
  @JSImport("redom", "Place")
  @js.native
  class Place_ protected () extends RedomComponent {
    def this(View: RedomComponentConstructor) = this()
    def this(View: RedomComponentConstructor, initData: js.Any) = this()
    
    @JSName("el")
    var el_Place_ : HTMLElement | SVGElement = js.native
    
    @JSName("update")
    def update_MPlace_(visible: Boolean): Unit = js.native
    @JSName("update")
    def update_MPlace_(visible: Boolean, data: js.Any): Unit = js.native
  }
  
  @JSImport("redom", "Router")
  @js.native
  class Router_ protected () extends RedomComponent {
    def this(parent: RedomQuery, Views: RouterDictionary) = this()
    def this(parent: RedomQuery, Views: RouterDictionary, initData: js.Any) = this()
    
    @JSName("el")
    var el_Router_ : HTMLElement | SVGElement = js.native
    
    @JSName("update")
    def update_MRouter_(route: String): Unit = js.native
    @JSName("update")
    def update_MRouter_(route: String, data: js.Any): Unit = js.native
  }
  
  @JSImport("redom", "el")
  @js.native
  def el(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = js.native
  @JSImport("redom", "el")
  @js.native
  def el(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = js.native
  @JSImport("redom", "el")
  @js.native
  def el(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = js.native
  @JSImport("redom", "el")
  @js.native
  def el[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = js.native
  
  @JSImport("redom", "h")
  @js.native
  def h(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = js.native
  @JSImport("redom", "h")
  @js.native
  def h(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = js.native
  @JSImport("redom", "h")
  @js.native
  def h(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = js.native
  @JSImport("redom", "h")
  @js.native
  def h[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = js.native
  
  @JSImport("redom", "html")
  @js.native
  def html(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = js.native
  @JSImport("redom", "html")
  @js.native
  def html(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = js.native
  @JSImport("redom", "html")
  @js.native
  def html(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = js.native
  @JSImport("redom", "html")
  @js.native
  def html[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = js.native
  
  object list {
    
    @JSImport("redom", "list")
    @js.native
    def apply(parent: RedomQuery, View: RedomComponentConstructor): List_ = js.native
    @JSImport("redom", "list")
    @js.native
    def apply(
      parent: RedomQuery,
      View: RedomComponentConstructor,
      key: js.UndefOr[scala.Nothing],
      initData: js.Any
    ): List_ = js.native
    @JSImport("redom", "list")
    @js.native
    def apply(parent: RedomQuery, View: RedomComponentConstructor, key: String): List_ = js.native
    @JSImport("redom", "list")
    @js.native
    def apply(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): List_ = js.native
    
    @JSImport("redom", "list.extend")
    @js.native
    def extend(parent: RedomQuery, View: RedomComponentConstructor): RedomComponentConstructor = js.native
    @JSImport("redom", "list.extend")
    @js.native
    def extend(
      parent: RedomQuery,
      View: RedomComponentConstructor,
      key: js.UndefOr[scala.Nothing],
      initData: js.Any
    ): RedomComponentConstructor = js.native
    @JSImport("redom", "list.extend")
    @js.native
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = js.native
    @JSImport("redom", "list.extend")
    @js.native
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): RedomComponentConstructor = js.native
  }
  
  @JSImport("redom", "listPool")
  @js.native
  def listPool(View: RedomComponentConstructor): ListPool_ = js.native
  @JSImport("redom", "listPool")
  @js.native
  def listPool(View: RedomComponentConstructor, key: js.UndefOr[scala.Nothing], initData: js.Any): ListPool_ = js.native
  @JSImport("redom", "listPool")
  @js.native
  def listPool(View: RedomComponentConstructor, key: String): ListPool_ = js.native
  @JSImport("redom", "listPool")
  @js.native
  def listPool(View: RedomComponentConstructor, key: String, initData: js.Any): ListPool_ = js.native
  
  @JSImport("redom", "mount")
  @js.native
  def mount(parent: RedomElement, child: RedomElement): RedomElement = js.native
  @JSImport("redom", "mount")
  @js.native
  def mount(parent: RedomElement, child: RedomElement, before: js.UndefOr[RedomElement], replace: Boolean): RedomElement = js.native
  @JSImport("redom", "mount")
  @js.native
  def mount(parent: RedomElement, child: RedomElement, before: RedomElement): RedomElement = js.native
  
  @JSImport("redom", "place")
  @js.native
  def place(View: RedomComponentConstructor): Place_ = js.native
  @JSImport("redom", "place")
  @js.native
  def place(View: RedomComponentConstructor, initData: js.Any): Place_ = js.native
  
  @JSImport("redom", "router")
  @js.native
  def router(parent: RedomQuery, Views: RouterDictionary): Router_ = js.native
  @JSImport("redom", "router")
  @js.native
  def router(parent: RedomQuery, Views: RouterDictionary, initData: js.Any): Router_ = js.native
  
  @JSImport("redom", "s")
  @js.native
  def s(query: RedomQuery, args: RedomQueryArgument*): SVGElement = js.native
  
  @JSImport("redom", "setAttr")
  @js.native
  def setAttr(view: RedomElement, arg1: String): Unit = js.native
  @JSImport("redom", "setAttr")
  @js.native
  def setAttr(view: RedomElement, arg1: String, arg2: String): Unit = js.native
  @JSImport("redom", "setAttr")
  @js.native
  def setAttr(view: RedomElement, arg1: js.Object): Unit = js.native
  @JSImport("redom", "setAttr")
  @js.native
  def setAttr(view: RedomElement, arg1: js.Object, arg2: String): Unit = js.native
  
  @JSImport("redom", "setChildren")
  @js.native
  def setChildren(parent: RedomElement, children: js.Array[RedomElement]): Unit = js.native
  
  @JSImport("redom", "setStyle")
  @js.native
  def setStyle(view: RedomElement, arg1: String): Unit = js.native
  @JSImport("redom", "setStyle")
  @js.native
  def setStyle(view: RedomElement, arg1: String, arg2: String): Unit = js.native
  @JSImport("redom", "setStyle")
  @js.native
  def setStyle(view: RedomElement, arg1: js.Object): Unit = js.native
  @JSImport("redom", "setStyle")
  @js.native
  def setStyle(view: RedomElement, arg1: js.Object, arg2: String): Unit = js.native
  
  object svg {
    
    @JSImport("redom", "svg")
    @js.native
    def apply(query: RedomQuery, args: RedomQueryArgument*): SVGElement = js.native
    
    @JSImport("redom", "svg.extend")
    @js.native
    def extend(query: RedomQuery): RedomComponentConstructor = js.native
  }
  
  @JSImport("redom", "text")
  @js.native
  def text(str: String): Text = js.native
  
  @JSImport("redom", "unmount")
  @js.native
  def unmount(parent: RedomElement, child: RedomElement): RedomElement = js.native
  
  type HTMLElementOfStringLiteral[Q /* <: String */] = HTMLElement | SVGElement | HTMLStyleElement | HTMLTableHeaderCellElement | HTMLTableSectionElement | HTMLTableCellElement | HTMLTableRowElement | HTMLTableElement | HTMLHeadingElement | HTMLButtonElement | HTMLOptionElement | HTMLSelectElement | HTMLTextAreaElement | HTMLLabelElement | HTMLInputElement | HTMLFormElement | HTMLOListElement | HTMLLIElement | HTMLUListElement | HTMLIFrameElement | HTMLImageElement | HTMLBRElement | HTMLHRElement | HTMLParagraphElement | HTMLPreElement | HTMLSpanElement | HTMLAnchorElement | HTMLDivElement
  
  @js.native
  trait RedomComponent extends StObject {
    
    var el: HTMLElement | SVGElement | RedomComponent = js.native
    
    var onmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onremount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onunmount: js.UndefOr[js.Function0[Unit]] = js.native
    
    var update: js.UndefOr[
        js.Function4[
          /* item */ js.Any, 
          /* index */ Double, 
          /* data */ js.Any, 
          /* context */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.native
  }
  object RedomComponent {
    
    @scala.inline
    def apply(el: HTMLElement | SVGElement | RedomComponent): RedomComponent = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedomComponent]
    }
    
    @scala.inline
    implicit class RedomComponentMutableBuilder[Self <: RedomComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: HTMLElement | SVGElement | RedomComponent): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnmount(value: () => Unit): Self = StObject.set(x, "onmount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnmountUndefined: Self = StObject.set(x, "onmount", js.undefined)
      
      @scala.inline
      def setOnremount(value: () => Unit): Self = StObject.set(x, "onremount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnremountUndefined: Self = StObject.set(x, "onremount", js.undefined)
      
      @scala.inline
      def setOnunmount(value: () => Unit): Self = StObject.set(x, "onunmount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnunmountUndefined: Self = StObject.set(x, "onunmount", js.undefined)
      
      @scala.inline
      def setUpdate(
        value: (/* item */ js.Any, /* index */ Double, /* data */ js.Any, /* context */ js.UndefOr[js.Any]) => Unit
      ): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait RedomComponentClass extends Instantiable0[RedomComponent]
  
  type RedomComponentConstructor = RedomComponentClass
  
  type RedomComponentCreator = RedomComponentConstructor | RedomComponentFactoryFunction
  
  type RedomComponentFactoryFunction = js.Function0[RedomComponent]
  
  type RedomElQuery = String | Node | RedomComponentCreator
  
  type RedomElement = Node | RedomComponent
  
  type RedomElementOfElQuery[Q /* <: RedomElQuery */] = HTMLElementOfStringLiteral[Q] | ReturnType[Q] | InstanceType[Q] | Q
  
  type RedomMiddleware = js.Function1[/* el */ HTMLElement | SVGElement, Unit]
  
  type RedomQuery = String | RedomElement
  
  type RedomQueryArgument = RedomQueryArgumentValue | js.Array[RedomQueryArgumentValue]
  
  type RedomQueryArgumentValue = RedomElement | String | Double | StringDictionary[js.Any] | RedomMiddleware
  
  type RouterDictionary = StringDictionary[RedomComponentConstructor]
}
