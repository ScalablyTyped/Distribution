package typings.slug

import typings.slug.anon.Pretty
import typings.slug.mod.CharMap_
import typings.slug.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object slug {
    
    inline def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(string: String, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(string: String, replacement: String): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("slug")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("slug.charmap")
    @js.native
    val charmap: CharMap_ = js.native
    
    object defaults {
      
      @JSGlobal("slug.defaults")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("slug.defaults.charmap")
      @js.native
      def charmap: CharMap_ = js.native
      inline def charmap_=(x: CharMap_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("charmap")(x.asInstanceOf[js.Any])
      
      @JSGlobal("slug.defaults.mode")
      @js.native
      def mode: String = js.native
      inline def mode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
      
      @JSGlobal("slug.defaults.modes")
      @js.native
      def modes: Pretty = js.native
      inline def modes_=(x: Pretty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])
      
      @JSGlobal("slug.defaults.multicharmap")
      @js.native
      def multicharmap: CharMap_ = js.native
      inline def multicharmap_=(x: CharMap_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multicharmap")(x.asInstanceOf[js.Any])
    }
    
    inline def extend(entry: CharMap_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(entry.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("slug.multicharmap")
    @js.native
    val multicharmap: CharMap_ = js.native
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
}
