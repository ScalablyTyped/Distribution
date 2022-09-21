package typings.steno

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("steno", "Writer")
  @js.native
  open class Writer protected () extends StObject {
    def this(filename: String) = this()
    
    /* private */ var `private`: Any = js.native
    
    def write(data: String): js.Promise[Unit] = js.native
  }
}
