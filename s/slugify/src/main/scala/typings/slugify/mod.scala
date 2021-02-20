package typings.slugify

import org.scalablytyped.runtime.StringDictionary
import typings.slugify.anon.Locale
import typings.slugify.mod.slugify.ExtendArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("slugify", JSImport.Default)
    @js.native
    def apply(string: String): String = js.native
    @JSImport("slugify", JSImport.Default)
    @js.native
    def apply(string: String, options: String): String = js.native
    @JSImport("slugify", JSImport.Default)
    @js.native
    def apply(string: String, options: Locale): String = js.native
    
    @JSImport("slugify", "default.extend")
    @js.native
    def extend(args: ExtendArgs): Unit = js.native
  }
  
  object slugify {
    
    type ExtendArgs = StringDictionary[js.Any]
  }
}
