package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SignatureKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "SignatureKind")
@js.native
object SignatureKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SignatureKind & Double] = js.native
  
  @js.native
  sealed trait Call
    extends StObject
       with SignatureKind
  /* 0 */ val Call: typings.schematicsAngular.typescriptMod.SignatureKind.Call & Double = js.native
  
  @js.native
  sealed trait Construct
    extends StObject
       with SignatureKind
  /* 1 */ val Construct: typings.schematicsAngular.typescriptMod.SignatureKind.Construct & Double = js.native
}
