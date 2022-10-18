package typings.prismjs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsIndexMod extends Shortcut {
  
  @JSImport("prismjs/components/index", JSImport.Namespace)
  @js.native
  val ^ : LoadLanguages = js.native
  
  @js.native
  trait LoadLanguages extends StObject {
    
    /**
      * Loads the given languages and adds them to the current Prism instance.
      *
      * If no languages are provided, _all_ Prism languages will be loaded.
      */
    def apply(): Unit = js.native
    def apply(languages: String): Unit = js.native
    def apply(languages: js.Array[String]): Unit = js.native
    
    /**
      * Set this to `true` to prevent all warning messages `loadLanguages` logs.
      *
      * @default false
      */
    var silent: Boolean = js.native
  }
  
  type _To = LoadLanguages
  
  /* This means you don't have to write `^`, but can instead just say `componentsIndexMod.foo` */
  override def _to: LoadLanguages = ^
}
