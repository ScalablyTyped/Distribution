package typings.resolvePackagePath

import org.scalablytyped.runtime.StringDictionary
import typings.resolvePackagePath.anon.Delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("resolve-package-path/lib/cache", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Delete {
    
    /* CompleteClass */
    var _store: StringDictionary[String] = js.native
    
    /* CompleteClass */
    override def delete(key: String): Unit = js.native
    
    /* CompleteClass */
    override def get(key: String): String = js.native
    
    /* CompleteClass */
    override def has(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def set(key: String, value: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override val size: Double = js.native
  }
}
