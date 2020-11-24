package typings.sentryTypes

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/types/dist/severity", JSImport.Namespace)
@js.native
object severityMod extends js.Object {
  
  @js.native
  sealed trait Severity extends js.Object
  @js.native
  object Severity extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Severity with String] = js.native
    
    /**
      * Converts a string-based level into a {@link Severity}.
      *
      * @param level string representation of Severity
      * @returns Severity
      */
    def fromString(level: String): Severity = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Critical extends Severity
    /* "critical" */ @js.native
    object Critical extends TopLevel[Critical with String]
    
    /** JSDoc */
    @js.native
    sealed trait Debug extends Severity
    /* "debug" */ @js.native
    object Debug extends TopLevel[Debug with String]
    
    /** JSDoc */
    @js.native
    sealed trait Error extends Severity
    /* "error" */ @js.native
    object Error extends TopLevel[Error with String]
    
    /** JSDoc */
    @js.native
    sealed trait Fatal extends Severity
    /* "fatal" */ @js.native
    object Fatal extends TopLevel[Fatal with String]
    
    /** JSDoc */
    @js.native
    sealed trait Info extends Severity
    /* "info" */ @js.native
    object Info extends TopLevel[Info with String]
    
    /** JSDoc */
    @js.native
    sealed trait Log extends Severity
    /* "log" */ @js.native
    object Log extends TopLevel[Log with String]
    
    /** JSDoc */
    @js.native
    sealed trait Warning extends Severity
    /* "warning" */ @js.native
    object Warning extends TopLevel[Warning with String]
  }
}
