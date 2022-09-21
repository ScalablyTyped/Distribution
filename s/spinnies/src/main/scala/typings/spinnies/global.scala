package typings.spinnies

import typings.spinnies.anon.PartialOptions
import typings.spinnies.mod.Spinner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Spinnies {
    
    /**
      * A class that manages multiple CLI spinners.
      */
    @JSGlobal("Spinnies")
    @js.native
    open class ^ ()
      extends typings.spinnies.mod.^ {
      def this(options: PartialOptions) = this()
    }
    
    @JSGlobal("Spinnies.dashes")
    @js.native
    val dashes: Spinner = js.native
    
    @JSGlobal("Spinnies.dots")
    @js.native
    val dots: Spinner = js.native
  }
}
