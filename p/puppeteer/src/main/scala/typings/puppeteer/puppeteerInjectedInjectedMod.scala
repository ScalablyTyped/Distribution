package typings.puppeteer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.puppeteer.injectedTextContentMod.TextContent
import typings.puppeteer.utilDeferredPromiseMod.DeferredPromise
import typings.puppeteer.utilDeferredPromiseMod.DeferredPromiseOptions
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object puppeteerInjectedInjectedMod {
  
  /**
    * @internal
    */
  /**
    * @internal
    */
  /* Inlined std.Readonly<{  createDeferredPromise :{None <T>(opts : puppeteer.puppeteer/lib/esm/puppeteer/util/DeferredPromise.DeferredPromiseOptions | undefined): puppeteer.puppeteer/lib/esm/puppeteer/util/DeferredPromise.DeferredPromise<T>}, createTextContent (root : std.Node): puppeteer.puppeteer/lib/esm/puppeteer/injected/TextContent.TextContent,   IntervalPoller :new <T>(fn : (): std.Promise</ * import warning: RewrittenClass.unapply cls was tparam T * / any>, ms : number): puppeteer.puppeteer/lib/esm/puppeteer/injected/Poller.IntervalPoller<T>, isSuitableNodeForTextMatching (node : std.Node): boolean,   MutationPoller :new <T>(fn : (): std.Promise</ * import warning: RewrittenClass.unapply cls was tparam T * / any>, root : std.Node): puppeteer.puppeteer/lib/esm/puppeteer/injected/Poller.MutationPoller<T>,   RAFPoller :new <T>(fn : (): std.Promise</ * import warning: RewrittenClass.unapply cls was tparam T * / any>): puppeteer.puppeteer/lib/esm/puppeteer/injected/Poller.RAFPoller<T>, pierceQuerySelector (root : std.Node, selector : string): std.Element | null, pierceQuerySelectorAll (element : std.Node, selector : string): std.Array<std.Element>, xpathQuerySelector (root : std.Node, selector : string): std.Node | null, xpathQuerySelectorAll (root : std.Node, selector : string): std.Array<std.Node>, textQuerySelector (root : std.Node, selector : string): std.Element | null, textQuerySelectorAll (root : std.Node, selector : string): std.Array<std.Element>, createFunction (functionValue : string): (args : ...unknown): unknown, checkVisibility (node : std.Node | null, visible : boolean | undefined): boolean | std.Node}> */
  object default {
    
    @JSImport("puppeteer/lib/esm/puppeteer/injected/injected", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("puppeteer/lib/esm/puppeteer/injected/injected", "default.IntervalPoller")
    @js.native
    open class IntervalPoller[T] protected ()
      extends typings.puppeteer.injectedPollerMod.IntervalPoller[T] {
      def this(
        fn: js.Function0[js.Promise[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]],
        ms: Double
      ) = this()
    }
    @JSImport("puppeteer/lib/esm/puppeteer/injected/injected", "default.IntervalPoller")
    @js.native
    val IntervalPoller: Instantiable2[
        /* fn */ js.Function0[js.Promise[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
        /* ms */ Double, 
        typings.puppeteer.injectedPollerMod.IntervalPoller[js.Object]
      ] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("puppeteer/lib/esm/puppeteer/injected/injected", "default.MutationPoller")
    @js.native
    open class MutationPoller[T] protected ()
      extends typings.puppeteer.injectedPollerMod.MutationPoller[T] {
      def this(
        fn: js.Function0[js.Promise[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]],
        root: Node
      ) = this()
    }
    @JSImport("puppeteer/lib/esm/puppeteer/injected/injected", "default.MutationPoller")
    @js.native
    val MutationPoller: Instantiable2[
        /* fn */ js.Function0[js.Promise[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
        /* root */ Node, 
        typings.puppeteer.injectedPollerMod.MutationPoller[js.Object]
      ] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("puppeteer/lib/esm/puppeteer/injected/injected", "default.RAFPoller")
    @js.native
    open class RAFPoller[T] protected ()
      extends typings.puppeteer.injectedPollerMod.RAFPoller[T] {
      def this(fn: js.Function0[js.Promise[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]]) = this()
    }
    @JSImport("puppeteer/lib/esm/puppeteer/injected/injected", "default.RAFPoller")
    @js.native
    val RAFPoller: Instantiable1[
        /* fn */ js.Function0[js.Promise[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
        typings.puppeteer.injectedPollerMod.RAFPoller[js.Object]
      ] = js.native
    
    inline def checkVisibility(): Boolean | Node = ^.asInstanceOf[js.Dynamic].applyDynamic("checkVisibility")().asInstanceOf[Boolean | Node]
    inline def checkVisibility(node: Null, visible: Boolean): Boolean | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("checkVisibility")(node.asInstanceOf[js.Any], visible.asInstanceOf[js.Any])).asInstanceOf[Boolean | Node]
    inline def checkVisibility(node: Node): Boolean | Node = ^.asInstanceOf[js.Dynamic].applyDynamic("checkVisibility")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean | Node]
    inline def checkVisibility(node: Node, visible: Boolean): Boolean | Node = (^.asInstanceOf[js.Dynamic].applyDynamic("checkVisibility")(node.asInstanceOf[js.Any], visible.asInstanceOf[js.Any])).asInstanceOf[Boolean | Node]
    
    inline def createDeferredPromise[T](): DeferredPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredPromise")().asInstanceOf[DeferredPromise[T]]
    inline def createDeferredPromise[T](opts: DeferredPromiseOptions): DeferredPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredPromise")(opts.asInstanceOf[js.Any]).asInstanceOf[DeferredPromise[T]]
    
    inline def createFunction(functionValue: String): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFunction")(functionValue.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
    
    inline def createTextContent(root: Node): TextContent = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextContent")(root.asInstanceOf[js.Any]).asInstanceOf[TextContent]
    
    inline def isSuitableNodeForTextMatching(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuitableNodeForTextMatching")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def pierceQuerySelector(root: Node, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pierceQuerySelector")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def pierceQuerySelectorAll(element: Node, selector: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("pierceQuerySelectorAll")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def textQuerySelector(root: Node, selector: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("textQuerySelector")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def textQuerySelectorAll(root: Node, selector: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("textQuerySelectorAll")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def xpathQuerySelector(root: Node, selector: String): Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("xpathQuerySelector")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Node | Null]
    
    inline def xpathQuerySelectorAll(root: Node, selector: String): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("xpathQuerySelectorAll")(root.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  }
  
  /**
    * @internal
    */
  /* Inlined std.Readonly<{  createDeferredPromise :typeof createDeferredPromise, createTextContent (root : std.Node): puppeteer.puppeteer/lib/esm/puppeteer/injected/TextContent.TextContent,   IntervalPoller :typeof IntervalPoller, isSuitableNodeForTextMatching (node : std.Node): boolean,   MutationPoller :typeof MutationPoller,   RAFPoller :typeof RAFPoller, pierceQuerySelector (root : std.Node, selector : string): std.Element | null, pierceQuerySelectorAll (element : std.Node, selector : string): std.Array<std.Element>, xpathQuerySelector (root : std.Node, selector : string): std.Node | null, xpathQuerySelectorAll (root : std.Node, selector : string): std.Array<std.Node>, textQuerySelector (root : std.Node, selector : string): std.Element | null, textQuerySelectorAll (root : std.Node, selector : string): std.Array<std.Element>, createFunction (functionValue : string): (args : ...unknown): unknown, checkVisibility (node : std.Node | null, visible : boolean | undefined): boolean | std.Node}> */
  @js.native
  trait PuppeteerUtil extends StObject {
    
    def checkVisibility(): Boolean | Node = js.native
    def checkVisibility(node: Null, visible: Boolean): Boolean | Node = js.native
    def checkVisibility(node: Node): Boolean | Node = js.native
    def checkVisibility(node: Node, visible: Boolean): Boolean | Node = js.native
    
    def createFunction(functionValue: String): js.Function1[/* repeated */ Any, Any] = js.native
    
    def createTextContent(root: Node): TextContent = js.native
    
    def isSuitableNodeForTextMatching(node: Node): Boolean = js.native
    
    def pierceQuerySelector(root: Node, selector: String): Element | Null = js.native
    
    def pierceQuerySelectorAll(element: Node, selector: String): js.Array[Element] = js.native
    
    def textQuerySelector(root: Node, selector: String): Element | Null = js.native
    
    def textQuerySelectorAll(root: Node, selector: String): js.Array[Element] = js.native
    
    def xpathQuerySelector(root: Node, selector: String): Node | Null = js.native
    
    def xpathQuerySelectorAll(root: Node, selector: String): js.Array[Node] = js.native
  }
}
