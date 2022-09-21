package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EndOfLineState extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "EndOfLineState")
@js.native
object EndOfLineState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EndOfLineState & Double] = js.native
  
  @js.native
  sealed trait InDoubleQuoteStringLiteral
    extends StObject
       with EndOfLineState
  /* 3 */ val InDoubleQuoteStringLiteral: typings.schematicsAngular.typescriptMod.EndOfLineState.InDoubleQuoteStringLiteral & Double = js.native
  
  @js.native
  sealed trait InMultiLineCommentTrivia
    extends StObject
       with EndOfLineState
  /* 1 */ val InMultiLineCommentTrivia: typings.schematicsAngular.typescriptMod.EndOfLineState.InMultiLineCommentTrivia & Double = js.native
  
  @js.native
  sealed trait InSingleQuoteStringLiteral
    extends StObject
       with EndOfLineState
  /* 2 */ val InSingleQuoteStringLiteral: typings.schematicsAngular.typescriptMod.EndOfLineState.InSingleQuoteStringLiteral & Double = js.native
  
  @js.native
  sealed trait InTemplateHeadOrNoSubstitutionTemplate
    extends StObject
       with EndOfLineState
  /* 4 */ val InTemplateHeadOrNoSubstitutionTemplate: typings.schematicsAngular.typescriptMod.EndOfLineState.InTemplateHeadOrNoSubstitutionTemplate & Double = js.native
  
  @js.native
  sealed trait InTemplateMiddleOrTail
    extends StObject
       with EndOfLineState
  /* 5 */ val InTemplateMiddleOrTail: typings.schematicsAngular.typescriptMod.EndOfLineState.InTemplateMiddleOrTail & Double = js.native
  
  @js.native
  sealed trait InTemplateSubstitutionPosition
    extends StObject
       with EndOfLineState
  /* 6 */ val InTemplateSubstitutionPosition: typings.schematicsAngular.typescriptMod.EndOfLineState.InTemplateSubstitutionPosition & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EndOfLineState
  /* 0 */ val None: typings.schematicsAngular.typescriptMod.EndOfLineState.None & Double = js.native
}
