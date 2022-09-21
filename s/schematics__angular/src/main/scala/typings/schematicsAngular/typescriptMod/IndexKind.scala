package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "IndexKind")
@js.native
object IndexKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndexKind & Double] = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with IndexKind
  /* 1 */ val Number: typings.schematicsAngular.typescriptMod.IndexKind.Number & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with IndexKind
  /* 0 */ val String: typings.schematicsAngular.typescriptMod.IndexKind.String & Double = js.native
}
