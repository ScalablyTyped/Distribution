package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeneratedIdentifierFlags extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "GeneratedIdentifierFlags")
@js.native
object GeneratedIdentifierFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeneratedIdentifierFlags & Double] = js.native
  
  @js.native
  sealed trait AllowNameSubstitution
    extends StObject
       with GeneratedIdentifierFlags
  /* 64 */ val AllowNameSubstitution: typings.schematicsAngular.typescriptMod.GeneratedIdentifierFlags.AllowNameSubstitution & Double = js.native
  
  @js.native
  sealed trait FileLevel
    extends StObject
       with GeneratedIdentifierFlags
  /* 32 */ val FileLevel: typings.schematicsAngular.typescriptMod.GeneratedIdentifierFlags.FileLevel & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with GeneratedIdentifierFlags
  /* 0 */ val None: typings.schematicsAngular.typescriptMod.GeneratedIdentifierFlags.None & Double = js.native
  
  @js.native
  sealed trait Optimistic
    extends StObject
       with GeneratedIdentifierFlags
  /* 16 */ val Optimistic: typings.schematicsAngular.typescriptMod.GeneratedIdentifierFlags.Optimistic & Double = js.native
  
  @js.native
  sealed trait ReservedInNestedScopes
    extends StObject
       with GeneratedIdentifierFlags
  /* 8 */ val ReservedInNestedScopes: typings.schematicsAngular.typescriptMod.GeneratedIdentifierFlags.ReservedInNestedScopes & Double = js.native
}
