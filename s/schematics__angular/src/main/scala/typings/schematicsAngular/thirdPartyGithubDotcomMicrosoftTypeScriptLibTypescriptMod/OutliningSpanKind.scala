package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OutliningSpanKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "OutliningSpanKind")
@js.native
object OutliningSpanKind extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[OutliningSpanKind & java.lang.String] = js.native
  
  /** Declarations and expressions */
  @js.native
  sealed trait Code
    extends StObject
       with OutliningSpanKind
  /* "code" */ val Code: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OutliningSpanKind.Code & java.lang.String = js.native
  
  /** Single or multi-line comments */
  @js.native
  sealed trait Comment
    extends StObject
       with OutliningSpanKind
  /* "comment" */ val Comment: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OutliningSpanKind.Comment & java.lang.String = js.native
  
  /** Contiguous blocks of import declarations */
  @js.native
  sealed trait Imports
    extends StObject
       with OutliningSpanKind
  /* "imports" */ val Imports: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OutliningSpanKind.Imports & java.lang.String = js.native
  
  /** Sections marked by '// #region' and '// #endregion' comments */
  @js.native
  sealed trait Region
    extends StObject
       with OutliningSpanKind
  /* "region" */ val Region: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.OutliningSpanKind.Region & java.lang.String = js.native
}
