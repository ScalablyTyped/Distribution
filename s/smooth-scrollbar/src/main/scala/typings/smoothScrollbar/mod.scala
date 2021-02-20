package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollbarOptions
import typings.smoothScrollbar.anon.TypeofScrollbarPlugin
import typings.smoothScrollbar.smoothScrollbarScrollbarMod.Scrollbar
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smooth-scrollbar", JSImport.Default)
  @js.native
  class default () extends Scrollbar
  /* static members */
  object default {
    
    @JSImport("smooth-scrollbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("smooth-scrollbar", "default.ScrollbarPlugin")
    @js.native
    def ScrollbarPlugin: TypeofScrollbarPlugin = js.native
    @scala.inline
    def ScrollbarPlugin_=(x: TypeofScrollbarPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScrollbarPlugin")(x.asInstanceOf[js.Any])
    
    /**
      * Attaches default style sheets to current document.
      * You don't need to call this method manually unless
      * you removed the default styles via `Scrollbar.detachStyle()`
      */
    @JSImport("smooth-scrollbar", "default.attachStyle")
    @js.native
    def attachStyle(): Unit = js.native
    
    /**
      * Removes scrollbar on the given element
      */
    @JSImport("smooth-scrollbar", "default.destroy")
    @js.native
    def destroy(elem: HTMLElement): Unit = js.native
    
    /**
      * Removes all scrollbar instances from current document
      */
    @JSImport("smooth-scrollbar", "default.destroyAll")
    @js.native
    def destroyAll(): Unit = js.native
    
    /**
      * Removes default styles from current document.
      * Use this method when you want to use your own css for scrollbars.
      */
    @JSImport("smooth-scrollbar", "default.detachStyle")
    @js.native
    def detachStyle(): Unit = js.native
    
    /**
      * Gets scrollbar on the given element.
      * If no scrollbar instance exsits, returns `undefined`
      *
      * @param elem The DOM element that you want to check.
      */
    @JSImport("smooth-scrollbar", "default.get")
    @js.native
    def get(elem: HTMLElement): js.UndefOr[Scrollbar] = js.native
    
    /**
      * Returns an array that contains all scrollbar instances
      */
    @JSImport("smooth-scrollbar", "default.getAll")
    @js.native
    def getAll(): js.Array[Scrollbar] = js.native
    
    /**
      * Check if there is a scrollbar on given element
      *
      * @param elem The DOM element that you want to check
      */
    @JSImport("smooth-scrollbar", "default.has")
    @js.native
    def has(elem: HTMLElement): Boolean = js.native
    
    /**
      * Initializes a scrollbar on the given element.
      *
      * @param elem The DOM element that you want to initialize scrollbar to
      * @param [options] Initial options
      */
    @JSImport("smooth-scrollbar", "default.init")
    @js.native
    def init(elem: HTMLElement): Scrollbar = js.native
    @JSImport("smooth-scrollbar", "default.init")
    @js.native
    def init(elem: HTMLElement, options: PartialScrollbarOptions): Scrollbar = js.native
    
    /**
      * Automatically init scrollbar on all elements base on the selector `[data-scrollbar]`
      *
      * @param options Initial options
      */
    @JSImport("smooth-scrollbar", "default.initAll")
    @js.native
    def initAll(): js.Array[Scrollbar] = js.native
    @JSImport("smooth-scrollbar", "default.initAll")
    @js.native
    def initAll(options: PartialScrollbarOptions): js.Array[Scrollbar] = js.native
    
    /**
      * Attaches plugins to scrollbars
      *
      * @param ...Plugins Scrollbar plugin classes
      */
    @JSImport("smooth-scrollbar", "default.use")
    @js.native
    def use(Plugins: TypeofScrollbarPlugin*): Unit = js.native
    
    @JSImport("smooth-scrollbar", "default.version")
    @js.native
    def version: String = js.native
    @scala.inline
    def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("smooth-scrollbar", "ScrollbarPlugin")
  @js.native
  class ScrollbarPlugin protected ()
    extends typings.smoothScrollbar.smoothScrollbarMod.ScrollbarPlugin {
    def this(scrollbar: Scrollbar) = this()
    def this(scrollbar: Scrollbar, options: js.Any) = this()
  }
  /* static members */
  object ScrollbarPlugin {
    
    @JSImport("smooth-scrollbar", "ScrollbarPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("smooth-scrollbar", "ScrollbarPlugin.defaultOptions")
    @js.native
    def defaultOptions: js.Any = js.native
    @scala.inline
    def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("smooth-scrollbar", "ScrollbarPlugin.pluginName")
    @js.native
    def pluginName: String = js.native
    @scala.inline
    def pluginName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(x.asInstanceOf[js.Any])
  }
  
  type SmoothScrollbar = Scrollbar
}
