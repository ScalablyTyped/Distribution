package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InlayHintKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "InlayHintKind")
@js.native
object InlayHintKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[InlayHintKind & java.lang.String] = js.native
  
  @js.native
  sealed trait Enum
    extends StObject
       with InlayHintKind
  /* "Enum" */ val Enum: typings.schematicsAngular.typescriptMod.InlayHintKind.Enum & java.lang.String = js.native
  
  @js.native
  sealed trait Parameter
    extends StObject
       with InlayHintKind
  /* "Parameter" */ val Parameter: typings.schematicsAngular.typescriptMod.InlayHintKind.Parameter & java.lang.String = js.native
  
  @js.native
  sealed trait Type
    extends StObject
       with InlayHintKind
  /* "Type" */ val Type: typings.schematicsAngular.typescriptMod.InlayHintKind.Type & java.lang.String = js.native
}
