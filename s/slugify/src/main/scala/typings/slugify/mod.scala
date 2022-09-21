package typings.slugify

import org.scalablytyped.runtime.StringDictionary
import typings.slugify.anon.Locale
import typings.slugify.mod.slugify.ExtendArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(string: String): String = ^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(string: String, options: String): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def apply(string: String, options: Locale): String = (^.asInstanceOf[js.Dynamic].apply(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("slugify", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(args: ExtendArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object slugify {
    
    type ExtendArgs = StringDictionary[Any]
  }
}
