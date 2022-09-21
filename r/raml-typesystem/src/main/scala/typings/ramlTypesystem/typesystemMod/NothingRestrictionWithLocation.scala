package typings.ramlTypesystem.typesystemMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "NothingRestrictionWithLocation")
@js.native
open class NothingRestrictionWithLocation protected () extends NothingRestriction {
  def this(_entry: RestrictionStackEntry, _message: String, _another: Constraint) = this()
  
  /* private */ var _another: Any = js.native
  
  /* private */ var _entry: Any = js.native
  
  /* private */ var _message: Any = js.native
  
  def another(): Constraint = js.native
  
  def getMessage(): String = js.native
  
  def getStack(): RestrictionStackEntry = js.native
}
