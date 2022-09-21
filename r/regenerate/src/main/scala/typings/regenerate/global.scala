package typings.regenerate

import typings.regenerate.mod.RegenerateArgValueOrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object regenerate {
    
    /**
      * The main Regenerate constructor. Calling this function creates a new set that gets a chainable API.
      *
      * Any arguments passed to `regenerate()` will be added to the set right away.
      *
      * Both code points (numbers) and symbols (strings consisting of a single Unicode symbol)
      * are accepted, as well as arrays containing values of these types.
      *
      * It’s also possible to pass in a Regenerate instance.
      * Doing so adds all code points in that instance to the new set.
      */
    inline def apply(values: RegenerateArgValueOrArray*): typings.regenerate.mod.regenerate = ^.asInstanceOf[js.Dynamic].apply(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.regenerate.mod.regenerate]
    
    @JSGlobal("regenerate")
    @js.native
    open class ^ protected ()
      extends typings.regenerate.mod.^ {
      def this(values: RegenerateArgValueOrArray*) = this()
    }
    
    @JSGlobal("regenerate")
    @js.native
    val ^ : js.Any = js.native
    
    /** A string representing the semantic version number. */
    /* static member */
    @JSGlobal("regenerate.version")
    @js.native
    val version: String = js.native
  }
}
