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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redom", "ListPool")
  @js.native
  class ListPool_ protected () extends StObject {
    def this(View: RedomComponentConstructor) = this()
    def this(View: RedomComponentConstructor, key: String) = this()
    def this(View: RedomComponentConstructor, key: String, initData: js.Any) = this()
    def this(View: RedomComponentConstructor, key: Unit, initData: js.Any) = this()
    
    def update(data: js.Array[js.Any]): Unit = js.native
    def update(data: js.Array[js.Any], context: js.Any): Unit = js.native
  }
  
  @JSImport("redom", "List")
  @js.native
  class List_ protected ()
    extends StObject
       with RedomComponent {
    def this(parent: RedomQuery, View: RedomComponentCreator) = this()
    def this(parent: RedomQuery, View: RedomComponentCreator, key: String) = this()
    def this(parent: RedomQuery, View: RedomComponentCreator, key: String, initData: js.Any) = this()
    def this(parent: RedomQuery, View: RedomComponentCreator, key: Unit, initData: js.Any) = this()
    
    /* CompleteClass */
    var el: HTMLElement | SVGElement | RedomComponent = js.native
    @JSName("el")
    var el_List_ : HTMLElement | SVGElement = js.native
    
    @JSName("update")
    def update_MList_(data: js.Array[js.Any]): Unit = js.native
    @JSName("update")
    def update_MList_(data: js.Array[js.Any], context: js.Any): Unit = js.native
  }
  /* static members */
  object List_ {
    
    @JSImport("redom", "List")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def extend(parent: RedomQuery, View: RedomComponentConstructor): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    @scala.inline
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    @scala.inline
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    @scala.inline
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: Unit, initData: js.Any): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
  }
  
  @JSImport("redom", "Place")
  @js.native
  class Place_ protected ()
    extends StObject
       with RedomComponent {
    def this(View: RedomComponentConstructor) = this()
    def this(View: RedomComponentConstructor, initData: js.Any) = this()
    
    /* CompleteClass */
    var el: HTMLElement | SVGElement | RedomComponent = js.native
    @JSName("el")
    var el_Place_ : HTMLElement | SVGElement = js.native
    
    @JSName("update")
    def update_MPlace_(visible: Boolean): Unit = js.native
    @JSName("update")
    def update_MPlace_(visible: Boolean, data: js.Any): Unit = js.native
  }
  
  @JSImport("redom", "Router")
  @js.native
  class Router_ protected ()
    extends StObject
       with RedomComponent {
    def this(parent: RedomQuery, Views: RouterDictionary) = this()
    def this(parent: RedomQuery, Views: RouterDictionary, initData: js.Any) = this()
    
    /* CompleteClass */
    var el: HTMLElement | SVGElement | RedomComponent = js.native
    @JSName("el")
    var el_Router_ : HTMLElement | SVGElement = js.native
    
    @JSName("update")
    def update_MRouter_(route: String): Unit = js.native
    @JSName("update")
    def update_MRouter_(route: String, data: js.Any): Unit = js.native
  }
  
  @scala.inline
  def el(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("el")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[String]]
  @scala.inline
  def el(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = (^.asInstanceOf[js.Dynamic].applyDynamic("el")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[RedomComponentClass]]
  @scala.inline
  def el(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("el")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[Node]]
  @scala.inline
  def el[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = (^.asInstanceOf[js.Dynamic].applyDynamic("el")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[Q]]
  
  @scala.inline
  def h(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[String]]
  @scala.inline
  def h(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[RedomComponentClass]]
  @scala.inline
  def h(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[Node]]
  @scala.inline
  def h[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[Q]]
  
  @scala.inline
  def html(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[String]]
  @scala.inline
  def html(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[RedomComponentClass]]
  @scala.inline
  def html(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[Node]]
  @scala.inline
  def html[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[RedomElementOfElQuery[Q]]
  
  object list {
    
    @scala.inline
    def apply(parent: RedomQuery, View: RedomComponentConstructor): List_ = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any])).asInstanceOf[List_]
    @scala.inline
    def apply(parent: RedomQuery, View: RedomComponentConstructor, key: String): List_ = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[List_]
    @scala.inline
    def apply(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): List_ = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[List_]
    @scala.inline
    def apply(parent: RedomQuery, View: RedomComponentConstructor, key: Unit, initData: js.Any): List_ = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[List_]
    
    @JSImport("redom", "list")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def extend(parent: RedomQuery, View: RedomComponentConstructor): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    @scala.inline
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    @scala.inline
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: js.Any): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    @scala.inline
    def extend(parent: RedomQuery, View: RedomComponentConstructor, key: Unit, initData: js.Any): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
  }
  
  @scala.inline
  def listPool(View: RedomComponentConstructor): ListPool_ = ^.asInstanceOf[js.Dynamic].applyDynamic("listPool")(View.asInstanceOf[js.Any]).asInstanceOf[ListPool_]
  @scala.inline
  def listPool(View: RedomComponentConstructor, key: String): ListPool_ = (^.asInstanceOf[js.Dynamic].applyDynamic("listPool")(View.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ListPool_]
  @scala.inline
  def listPool(View: RedomComponentConstructor, key: String, initData: js.Any): ListPool_ = (^.asInstanceOf[js.Dynamic].applyDynamic("listPool")(View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[ListPool_]
  @scala.inline
  def listPool(View: RedomComponentConstructor, key: Unit, initData: js.Any): ListPool_ = (^.asInstanceOf[js.Dynamic].applyDynamic("listPool")(View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[ListPool_]
  
  @scala.inline
  def mount(parent: RedomElement, child: RedomElement): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  @scala.inline
  def mount(parent: RedomElement, child: RedomElement, before: Unit, replace: Boolean): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], before.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  @scala.inline
  def mount(parent: RedomElement, child: RedomElement, before: RedomElement): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  @scala.inline
  def mount(parent: RedomElement, child: RedomElement, before: RedomElement, replace: Boolean): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], before.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  
  @scala.inline
  def place(View: RedomComponentConstructor): Place_ = ^.asInstanceOf[js.Dynamic].applyDynamic("place")(View.asInstanceOf[js.Any]).asInstanceOf[Place_]
  @scala.inline
  def place(View: RedomComponentConstructor, initData: js.Any): Place_ = (^.asInstanceOf[js.Dynamic].applyDynamic("place")(View.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[Place_]
  
  @scala.inline
  def router(parent: RedomQuery, Views: RouterDictionary): Router_ = (^.asInstanceOf[js.Dynamic].applyDynamic("router")(parent.asInstanceOf[js.Any], Views.asInstanceOf[js.Any])).asInstanceOf[Router_]
  @scala.inline
  def router(parent: RedomQuery, Views: RouterDictionary, initData: js.Any): Router_ = (^.asInstanceOf[js.Dynamic].applyDynamic("router")(parent.asInstanceOf[js.Any], Views.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[Router_]
  
  @scala.inline
  def s(query: RedomQuery, args: RedomQueryArgument*): SVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("s")(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SVGElement]
  
  @scala.inline
  def setAttr(view: RedomElement, arg1: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttr(view: RedomElement, arg1: String, arg2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttr(view: RedomElement, arg1: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setAttr(view: RedomElement, arg1: js.Object, arg2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setChildren(parent: RedomElement, children: js.Array[RedomElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setChildren")(parent.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setStyle(view: RedomElement, arg1: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setStyle(view: RedomElement, arg1: String, arg2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setStyle(view: RedomElement, arg1: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def setStyle(view: RedomElement, arg1: js.Object, arg2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object svg {
    
    @scala.inline
    def apply(query: RedomQuery, args: RedomQueryArgument*): SVGElement = (^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[SVGElement]
    
    @JSImport("redom", "svg")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def extend(query: RedomQuery): RedomComponentConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(query.asInstanceOf[js.Any]).asInstanceOf[RedomComponentConstructor]
  }
  
  @scala.inline
  def text(str: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(str.asInstanceOf[js.Any]).asInstanceOf[Text]
  
  @scala.inline
  def unmount(parent: RedomElement, child: RedomElement): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  
  type HTMLElementOfStringLiteral[Q /* <: String */] = HTMLElement | SVGElement | HTMLStyleElement | HTMLTableHeaderCellElement | HTMLTableSectionElement | HTMLTableCellElement | HTMLTableRowElement | HTMLTableElement | HTMLHeadingElement | HTMLButtonElement | HTMLOptionElement | HTMLSelectElement | HTMLTextAreaElement | HTMLLabelElement | HTMLInputElement | HTMLFormElement | HTMLOListElement | HTMLLIElement | HTMLUListElement | HTMLIFrameElement | HTMLImageElement | HTMLBRElement | HTMLHRElement | HTMLParagraphElement | HTMLPreElement | HTMLSpanElement | HTMLAnchorElement | HTMLDivElement
  
  trait RedomComponent extends StObject {
    
    var el: HTMLElement | SVGElement | RedomComponent
    
    var onmount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onremount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onunmount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var update: js.UndefOr[
        js.Function4[
          /* item */ js.Any, 
          /* index */ Double, 
          /* data */ js.Any, 
          /* context */ js.UndefOr[js.Any], 
          Unit
        ]
      ] = js.undefined
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
  trait RedomComponentClass
    extends StObject
       with Instantiable0[RedomComponent]
  
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
