package typings.simplebar

import typings.simplebar.mod.Options
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object SimpleBar {
    
    @JSGlobal("SimpleBar")
    @js.native
    open class ^ protected ()
      extends typings.simplebar.mod.^ {
      def this(element: HTMLElement) = this()
      def this(element: HTMLElement, options: Options) = this()
    }
    
    @JSGlobal("SimpleBar")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* Inlined std.Pick<std.WeakMap<std.HTMLElement, simplebar.simplebar.SimpleBar>, 'get' | 'has'> */
    object instances {
      
      @JSGlobal("SimpleBar.instances")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("SimpleBar.instances.get")
      @js.native
      def get: js.Function1[/* key */ HTMLElement, js.UndefOr[typings.simplebar.mod.SimpleBar]] = js.native
      inline def get(key: HTMLElement): js.UndefOr[typings.simplebar.mod.SimpleBar] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.simplebar.mod.SimpleBar]]
      inline def get_=(x: js.Function1[/* key */ HTMLElement, js.UndefOr[typings.simplebar.mod.SimpleBar]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
      
      @JSGlobal("SimpleBar.instances.has")
      @js.native
      def has: js.Function1[/* key */ HTMLElement, Boolean] = js.native
      inline def has(key: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def has_=(x: js.Function1[/* key */ HTMLElement, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("has")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def removeObserver(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeObserver")().asInstanceOf[Unit]
  }
}
