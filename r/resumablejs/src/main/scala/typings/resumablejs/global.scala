package typings.resumablejs

import typings.resumablejs.Resumable.ConfigurationHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Resumable {
    
    @JSGlobal("Resumable.Resumable")
    @js.native
    class Resumable protected ()
      extends StObject
         with typings.resumablejs.Resumable.Resumable {
      def this(options: ConfigurationHash) = this()
    }
    
    @JSGlobal("Resumable.ResumableChunk")
    @js.native
    class ResumableChunk ()
      extends StObject
         with typings.resumablejs.Resumable.ResumableChunk
  }
}
