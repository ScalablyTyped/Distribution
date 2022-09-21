package typings.ramlTypesystem.typesystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "RestrictionsConflict")
@js.native
open class RestrictionsConflict protected () extends Status {
  def this(_conflicting: Constraint, _stack: RestrictionStackEntry, source: Any) = this()
  
  /* protected */ var _conflicting: Constraint = js.native
  
  /* protected */ var _stack: RestrictionStackEntry = js.native
  
  /* private */ var computeMessage: Any = js.native
  
  def getConflictDescription(): String = js.native
  
  def getConflicting(): Constraint = js.native
  
  def getStack(): RestrictionStackEntry = js.native
  
  def toRestriction(): NothingRestrictionWithLocation = js.native
}
