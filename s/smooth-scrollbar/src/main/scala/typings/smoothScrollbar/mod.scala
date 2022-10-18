package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollbarOptions
import typings.smoothScrollbar.anon.TypeofScrollbarPlugin
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smooth-scrollbar", JSImport.Default)
  @js.native
  open class default () extends Scrollbar
  /* static members */
  object default {
    
    @JSImport("smooth-scrollbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("smooth-scrollbar", "default.ScrollbarPlugin")
    @js.native
    def ScrollbarPlugin: TypeofScrollbarPlugin = js.native
    inline def ScrollbarPlugin_=(x: TypeofScrollbarPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScrollbarPlugin")(x.asInstanceOf[js.Any])
    
    /**
      * Attaches default style sheets to current document.
      * You don't need to call this method manually unless
      * you removed the default styles via `Scrollbar.detachStyle()`
      */
    inline def attachStyle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachStyle")().asInstanceOf[Unit]
    
    /**
      * Removes scrollbar on the given element
      */
    inline def destroy(elem: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Removes all scrollbar instances from current document
      */
    inline def destroyAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyAll")().asInstanceOf[Unit]
    
    /**
      * Removes default styles from current document.
      * Use this method when you want to use your own css for scrollbars.
      */
    inline def detachStyle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachStyle")().asInstanceOf[Unit]
    
    /**
      * Gets scrollbar on the given element.
      * If no scrollbar instance exsits, returns `undefined`
      *
      * @param elem The DOM element that you want to check.
      */
    inline def get(elem: HTMLElement): js.UndefOr[Scrollbar] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(elem.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Scrollbar]]
    
    /**
      * Returns an array that contains all scrollbar instances
      */
    inline def getAll(): js.Array[Scrollbar] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Array[Scrollbar]]
    
    /**
      * Check if there is a scrollbar on given element
      *
      * @param elem The DOM element that you want to check
      */
    inline def has(elem: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Initializes a scrollbar on the given element.
      *
      * @param elem The DOM element that you want to initialize scrollbar to
      * @param [options] Initial options
      */
    inline def init(elem: HTMLElement): Scrollbar = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(elem.asInstanceOf[js.Any]).asInstanceOf[Scrollbar]
    inline def init(elem: HTMLElement, options: PartialScrollbarOptions): Scrollbar = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(elem.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Scrollbar]
    
    /**
      * Automatically init scrollbar on all elements base on the selector `[data-scrollbar]`
      *
      * @param options Initial options
      */
    inline def initAll(): js.Array[Scrollbar] = ^.asInstanceOf[js.Dynamic].applyDynamic("initAll")().asInstanceOf[js.Array[Scrollbar]]
    inline def initAll(options: PartialScrollbarOptions): js.Array[Scrollbar] = ^.asInstanceOf[js.Dynamic].applyDynamic("initAll")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Scrollbar]]
    
    /**
      * Attaches plugins to scrollbars
      *
      * @param ...Plugins Scrollbar plugin classes
      */
    inline def use(Plugins: TypeofScrollbarPlugin*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(Plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    @JSImport("smooth-scrollbar", "default.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("smooth-scrollbar", "ScrollbarPlugin")
  @js.native
  open class ScrollbarPlugin protected ()
    extends typings.smoothScrollbar.pluginMod.ScrollbarPlugin {
    def this(scrollbar: Scrollbar) = this()
    def this(scrollbar: Scrollbar, options: Any) = this()
  }
  /* static members */
  object ScrollbarPlugin {
    
    @JSImport("smooth-scrollbar", "ScrollbarPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("smooth-scrollbar", "ScrollbarPlugin.defaultOptions")
    @js.native
    def defaultOptions: Any = js.native
    inline def defaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("smooth-scrollbar", "ScrollbarPlugin.pluginName")
    @js.native
    def pluginName: String = js.native
    inline def pluginName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(x.asInstanceOf[js.Any])
  }
  
  type SmoothScrollbar = Scrollbar
}
