package typings.sass

import typings.sass.typesLoggerSourceSpanMod.SourceSpan
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExceptionMod {
  
  @JSImport("sass/types/exception", "Exception")
  @js.native
  /* private */ open class Exception ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * A textual description of what went wrong.
      *
      * Unlike [[message]], this does *not* include representations of [[span]] or
      * [[sassStack]].
      */
    val sassMessage: String = js.native
    
    /**
      * A human-friendly representation of the Sass stack trace at the point of
      * error.
      */
    val sassStack: String = js.native
    
    /** The location the error occurred in the Sass file that triggered it. */
    val span: SourceSpan = js.native
  }
}
