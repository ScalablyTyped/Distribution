package typings.statsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Stats")
  @js.native
  class Stats ()
    extends typings.statsJs.Stats
  object Stats {
    
    @JSGlobal("Stats.Panel")
    @js.native
    class Panel protected ()
      extends typings.statsJs.Stats.Panel {
      def this(name: String, foregroundColor: String, backgroundColor: String) = this()
    }
  }
}
