package typings.resumablejs

import typings.resumablejs.Resumable.ConfigurationHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Resumable extends js.Object {
    
    @js.native
    class Resumable protected ()
      extends typings.resumablejs.Resumable.Resumable {
      def this(options: ConfigurationHash) = this()
    }
    
    @js.native
    class ResumableChunk ()
      extends typings.resumablejs.Resumable.ResumableChunk
  }
}
