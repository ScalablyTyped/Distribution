package typings.redom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
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
  open class ListPool_ protected () extends StObject {
    def this(View: RedomComponentConstructor) = this()
    def this(View: RedomComponentConstructor, key: String) = this()
    def this(View: RedomComponentConstructor, key: String, initData: Any) = this()
    def this(View: RedomComponentConstructor, key: Unit, initData: Any) = this()
    
    def update(data: js.Array[Any]): Unit = js.native
    def update(data: js.Array[Any], context: Any): Unit = js.native
  }
  
  @JSImport("redom", "List")
  @js.native
  open class List_ protected ()
    extends StObject
       with RedomComponent {
    def this(parent: RedomQuery, View: RedomComponentCreator) = this()
    def this(parent: RedomQuery, View: RedomComponentCreator, key: String) = this()
    def this(parent: RedomQuery, View: RedomComponentCreator, key: String, initData: Any) = this()
    def this(parent: RedomQuery, View: RedomComponentCreator, key: Unit, initData: Any) = this()
    
    /* CompleteClass */
    var el: HTMLElement | SVGElement | RedomComponent = js.native
    @JSName("el")
    var el_List_ : HTMLElement | SVGElement = js.native
    
    @JSName("update")
    def update_MList_(data: js.Array[Any]): Unit = js.native
    @JSName("update")
    def update_MList_(data: js.Array[Any], context: Any): Unit = js.native
  }
  /* static members */
  object List_ {
    
    @JSImport("redom", "List")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(parent: RedomQuery, View: RedomComponentConstructor): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    inline def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    inline def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: Any): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    inline def extend(parent: RedomQuery, View: RedomComponentConstructor, key: Unit, initData: Any): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
  }
  
  @JSImport("redom", "Place")
  @js.native
  open class Place_ protected ()
    extends StObject
       with RedomComponent {
    def this(View: RedomComponentConstructor) = this()
    def this(View: RedomComponentConstructor, initData: Any) = this()
    
    /* CompleteClass */
    var el: HTMLElement | SVGElement | RedomComponent = js.native
    @JSName("el")
    var el_Place_ : HTMLElement | SVGElement = js.native
    
    @JSName("update")
    def update_MPlace_(visible: Boolean): Unit = js.native
    @JSName("update")
    def update_MPlace_(visible: Boolean, data: Any): Unit = js.native
  }
  
  @JSImport("redom", "Router")
  @js.native
  open class Router_ protected ()
    extends StObject
       with RedomComponent {
    def this(parent: RedomQuery, Views: RouterDictionary) = this()
    def this(parent: RedomQuery, Views: RouterDictionary, initData: Any) = this()
    
    /* CompleteClass */
    var el: HTMLElement | SVGElement | RedomComponent = js.native
    @JSName("el")
    var el_Router_ : HTMLElement | SVGElement = js.native
    
    @JSName("update")
    def update_MRouter_(route: String): Unit = js.native
    @JSName("update")
    def update_MRouter_(route: String, data: Any): Unit = js.native
  }
  
  inline def el(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("el")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[String]]
  inline def el(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = ^.asInstanceOf[js.Dynamic].applyDynamic("el")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[RedomComponentClass]]
  inline def el(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("el")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[Node]]
  inline def el[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = ^.asInstanceOf[js.Dynamic].applyDynamic("el")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[Q]]
  
  inline def h(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[String]]
  inline def h(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[RedomComponentClass]]
  inline def h(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[Node]]
  inline def h[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = ^.asInstanceOf[js.Dynamic].applyDynamic("h")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[Q]]
  
  inline def html(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[String]]
  inline def html(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[RedomComponentClass]]
  inline def html(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[Node]]
  inline def html[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RedomElementOfElQuery[Q]]
  
  object list {
    
    inline def apply(parent: RedomQuery, View: RedomComponentConstructor): List_ = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any])).asInstanceOf[List_]
    inline def apply(parent: RedomQuery, View: RedomComponentConstructor, key: String): List_ = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[List_]
    inline def apply(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: Any): List_ = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[List_]
    inline def apply(parent: RedomQuery, View: RedomComponentConstructor, key: Unit, initData: Any): List_ = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[List_]
    
    @JSImport("redom", "list")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(parent: RedomQuery, View: RedomComponentConstructor): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    inline def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    inline def extend(parent: RedomQuery, View: RedomComponentConstructor, key: String, initData: Any): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
    inline def extend(parent: RedomQuery, View: RedomComponentConstructor, key: Unit, initData: Any): RedomComponentConstructor = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(parent.asInstanceOf[js.Any], View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[RedomComponentConstructor]
  }
  
  inline def listPool(View: RedomComponentConstructor): ListPool_ = ^.asInstanceOf[js.Dynamic].applyDynamic("listPool")(View.asInstanceOf[js.Any]).asInstanceOf[ListPool_]
  inline def listPool(View: RedomComponentConstructor, key: String): ListPool_ = (^.asInstanceOf[js.Dynamic].applyDynamic("listPool")(View.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ListPool_]
  inline def listPool(View: RedomComponentConstructor, key: String, initData: Any): ListPool_ = (^.asInstanceOf[js.Dynamic].applyDynamic("listPool")(View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[ListPool_]
  inline def listPool(View: RedomComponentConstructor, key: Unit, initData: Any): ListPool_ = (^.asInstanceOf[js.Dynamic].applyDynamic("listPool")(View.asInstanceOf[js.Any], key.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[ListPool_]
  
  inline def mount(parent: RedomElement, child: RedomElement): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  inline def mount(parent: RedomElement, child: RedomElement, before: Unit, replace: Boolean): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], before.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  inline def mount(parent: RedomElement, child: RedomElement, before: RedomElement): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  inline def mount(parent: RedomElement, child: RedomElement, before: RedomElement, replace: Boolean): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("mount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], before.asInstanceOf[js.Any], replace.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  
  inline def place(View: RedomComponentConstructor): Place_ = ^.asInstanceOf[js.Dynamic].applyDynamic("place")(View.asInstanceOf[js.Any]).asInstanceOf[Place_]
  inline def place(View: RedomComponentConstructor, initData: Any): Place_ = (^.asInstanceOf[js.Dynamic].applyDynamic("place")(View.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[Place_]
  
  inline def router(parent: RedomQuery, Views: RouterDictionary): Router_ = (^.asInstanceOf[js.Dynamic].applyDynamic("router")(parent.asInstanceOf[js.Any], Views.asInstanceOf[js.Any])).asInstanceOf[Router_]
  inline def router(parent: RedomQuery, Views: RouterDictionary, initData: Any): Router_ = (^.asInstanceOf[js.Dynamic].applyDynamic("router")(parent.asInstanceOf[js.Any], Views.asInstanceOf[js.Any], initData.asInstanceOf[js.Any])).asInstanceOf[Router_]
  
  inline def s(query: RedomQuery, args: RedomQueryArgument*): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("s")(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SVGElement]
  
  inline def setAttr(view: RedomElement, arg1: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAttr(view: RedomElement, arg1: String, arg2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAttr(view: RedomElement, arg1: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setAttr(view: RedomElement, arg1: js.Object, arg2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAttr")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setChildren(parent: RedomElement, children: js.Array[RedomElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setChildren")(parent.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setStyle(view: RedomElement, arg1: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setStyle(view: RedomElement, arg1: String, arg2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setStyle(view: RedomElement, arg1: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setStyle(view: RedomElement, arg1: js.Object, arg2: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(view.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object svg {
    
    inline def apply(query: RedomQuery, args: RedomQueryArgument*): SVGElement = ^.asInstanceOf[js.Dynamic].apply(List(query.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SVGElement]
    
    @JSImport("redom", "svg")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(query: RedomQuery): RedomComponentConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(query.asInstanceOf[js.Any]).asInstanceOf[RedomComponentConstructor]
  }
  
  inline def text(str: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(str.asInstanceOf[js.Any]).asInstanceOf[Text]
  
  inline def unmount(parent: RedomElement, child: RedomElement): RedomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[RedomElement]
  
  type HTMLElementOfStringLiteral[Q /* <: String */] = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 62 */ Any
  
  trait RedomComponent extends StObject {
    
    var el: HTMLElement | SVGElement | RedomComponent
    
    var onmount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onremount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onunmount: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var update: js.UndefOr[
        js.Function4[/* item */ Any, /* index */ Double, /* data */ Any, /* context */ js.UndefOr[Any], Unit]
      ] = js.undefined
  }
  object RedomComponent {
    
    inline def apply(el: HTMLElement | SVGElement | RedomComponent): RedomComponent = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedomComponent]
    }
    
    extension [Self <: RedomComponent](x: Self) {
      
      inline def setEl(value: HTMLElement | SVGElement | RedomComponent): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setOnmount(value: () => Unit): Self = StObject.set(x, "onmount", js.Any.fromFunction0(value))
      
      inline def setOnmountUndefined: Self = StObject.set(x, "onmount", js.undefined)
      
      inline def setOnremount(value: () => Unit): Self = StObject.set(x, "onremount", js.Any.fromFunction0(value))
      
      inline def setOnremountUndefined: Self = StObject.set(x, "onremount", js.undefined)
      
      inline def setOnunmount(value: () => Unit): Self = StObject.set(x, "onunmount", js.Any.fromFunction0(value))
      
      inline def setOnunmountUndefined: Self = StObject.set(x, "onunmount", js.undefined)
      
      inline def setUpdate(value: (/* item */ Any, /* index */ Double, /* data */ Any, /* context */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
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
  
  type RedomQueryArgumentValue = RedomElement | String | Double | StringDictionary[Any] | RedomMiddleware
  
  type RouterDictionary = StringDictionary[RedomComponentConstructor]
}
