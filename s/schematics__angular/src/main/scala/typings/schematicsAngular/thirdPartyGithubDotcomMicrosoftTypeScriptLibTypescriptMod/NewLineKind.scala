package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NewLineKind extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "NewLineKind")
@js.native
object NewLineKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NewLineKind & Double] = js.native
  
  @js.native
  sealed trait CarriageReturnLineFeed
    extends StObject
       with NewLineKind
  /* 0 */ val CarriageReturnLineFeed: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.NewLineKind.CarriageReturnLineFeed & Double = js.native
  
  @js.native
  sealed trait LineFeed
    extends StObject
       with NewLineKind
  /* 1 */ val LineFeed: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.NewLineKind.LineFeed & Double = js.native
}
