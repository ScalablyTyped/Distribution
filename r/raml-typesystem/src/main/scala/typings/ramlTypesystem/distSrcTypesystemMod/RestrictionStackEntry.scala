package typings.ramlTypesystem.distSrcTypesystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "RestrictionStackEntry")
@js.native
open class RestrictionStackEntry protected () extends StObject {
  def this(_previous: RestrictionStackEntry, _restriction: Constraint, id: String) = this()
  
  /* private */ var _previous: Any = js.native
  
  /* private */ var _restriction: Any = js.native
  
  def getRestriction(): Constraint = js.native
  
  /* private */ var id: Any = js.native
  
  def pop(): RestrictionStackEntry = js.native
  
  def push(r: Constraint): RestrictionStackEntry = js.native
}
