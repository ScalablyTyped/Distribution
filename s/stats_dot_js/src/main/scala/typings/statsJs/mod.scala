package typings.statsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stats.js", JSImport.Namespace)
  @js.native
  class ^ () extends Stats
  
  @JSImport("stats.js", "Panel")
  @js.native
  class Panel protected ()
    extends typings.statsJs.Stats.Panel {
    def this(name: String, foregroundColor: String, backgroundColor: String) = this()
  }
}
