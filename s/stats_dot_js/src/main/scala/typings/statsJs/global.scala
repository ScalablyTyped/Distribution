package typings.statsJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Stats ()
    extends typings.statsJs.Stats
  
  @js.native
  object Stats extends js.Object {
    @js.native
    class Panel protected ()
      extends typings.statsJs.Stats.Panel {
      def this(name: String, foregroundColor: String, backgroundColor: String) = this()
    }
    
  }
  
}

