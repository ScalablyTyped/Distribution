package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HighlightSpanKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "HighlightSpanKind")
@js.native
object HighlightSpanKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[HighlightSpanKind & java.lang.String] = js.native
  
  @js.native
  sealed trait definition
    extends StObject
       with HighlightSpanKind
  /* "definition" */ val definition: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.HighlightSpanKind.definition & java.lang.String = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with HighlightSpanKind
  /* "none" */ val none: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.HighlightSpanKind.none & java.lang.String = js.native
  
  @js.native
  sealed trait reference
    extends StObject
       with HighlightSpanKind
  /* "reference" */ val reference: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.HighlightSpanKind.reference & java.lang.String = js.native
  
  @js.native
  sealed trait writtenReference
    extends StObject
       with HighlightSpanKind
  /* "writtenReference" */ val writtenReference: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.HighlightSpanKind.writtenReference & java.lang.String = js.native
}
