package typings.smoothDashScrollbar

import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollbarOptions
import typings.smoothDashScrollbar.scrollbarMod.Scrollbar
import typings.smoothDashScrollbar.smoothDashScrollbarMod.SmoothScrollbar
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar", JSImport.Namespace)
@js.native
object smoothDashScrollbarMod extends js.Object {
  @js.native
  class ScrollbarPlugin protected ()
    extends typings.smoothDashScrollbar.pluginMod.ScrollbarPlugin {
    def this(scrollbar: Scrollbar) = this()
    def this(scrollbar: Scrollbar, options: js.Any) = this()
  }
  
  @js.native
  class default () extends SmoothScrollbar
  
  /* static members */
  @js.native
  object ScrollbarPlugin extends js.Object {
    var defaultOptions: js.Any = js.native
    var pluginName: String = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var ScrollbarPlugin: TypeofClassScrollbarPlugin = js.native
    var version: String = js.native
    /**
      * Attaches default style sheets to current document.
      * You don't need to call this method manually unless
      * you removed the default styles via `Scrollbar.detachStyle()`
      */
    def attachStyle(): Unit = js.native
    /**
      * Removes scrollbar on the given element
      */
    def destroy(elem: HTMLElement): Unit = js.native
    /**
      * Removes all scrollbar instances from current document
      */
    def destroyAll(): Unit = js.native
    /**
      * Removes default styles from current document.
      * Use this method when you want to use your own css for scrollbars.
      */
    def detachStyle(): Unit = js.native
    /**
      * Gets scrollbar on the given element.
      * If no scrollbar instance exsits, returns `undefined`
      *
      * @param elem The DOM element that you want to check.
      */
    def get(elem: HTMLElement): js.UndefOr[Scrollbar] = js.native
    /**
      * Returns an array that contains all scrollbar instances
      */
    def getAll(): js.Array[Scrollbar] = js.native
    /**
      * Check if there is a scrollbar on given element
      *
      * @param elem The DOM element that you want to check
      */
    def has(elem: HTMLElement): Boolean = js.native
    /**
      * Initializes a scrollbar on the given element.
      *
      * @param elem The DOM element that you want to initialize scrollbar to
      * @param [options] Initial options
      */
    def init(elem: HTMLElement): Scrollbar = js.native
    def init(elem: HTMLElement, options: Partial[ScrollbarOptions]): Scrollbar = js.native
    /**
      * Automatically init scrollbar on all elements base on the selector `[data-scrollbar]`
      *
      * @param options Initial options
      */
    def initAll(): js.Array[Scrollbar] = js.native
    def initAll(options: Partial[ScrollbarOptions]): js.Array[Scrollbar] = js.native
    /**
      * Attaches plugins to scrollbars
      *
      * @param ...Plugins Scrollbar plugin classes
      */
    def use(Plugins: TypeofClassScrollbarPlugin*): Unit = js.native
  }
  
  type SmoothScrollbar = Scrollbar
}

