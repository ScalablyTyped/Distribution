package typings.scratchEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReporterScope extends StObject
/** Indicate the scope for a reporter's value. */
@JSGlobal("ReporterScope")
@js.native
object ReporterScope extends StObject {
  
  /** This reporter's value is global and does not depend on context. */
  @js.native
  sealed trait GLOBAL
    extends StObject
       with ReporterScope
  
  /**
    * This reporter's value is specific to a particular target/sprite.
    * Another target may have a different value or may not even have a value.
    */
  @js.native
  sealed trait TARGET
    extends StObject
       with ReporterScope
}
