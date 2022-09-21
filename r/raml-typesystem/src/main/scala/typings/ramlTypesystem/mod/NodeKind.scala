package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeKind extends StObject
@JSImport("raml-typesystem", "NodeKind")
@js.native
object NodeKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeKind & Double] = js.native
  
  @js.native
  sealed trait ARRAY
    extends StObject
       with NodeKind
  /* 1 */ val ARRAY: typings.ramlTypesystem.mod.NodeKind.ARRAY & Double = js.native
  
  @js.native
  sealed trait MAP
    extends StObject
       with NodeKind
  /* 2 */ val MAP: typings.ramlTypesystem.mod.NodeKind.MAP & Double = js.native
  
  @js.native
  sealed trait SCALAR
    extends StObject
       with NodeKind
  /* 0 */ val SCALAR: typings.ramlTypesystem.mod.NodeKind.SCALAR & Double = js.native
}
