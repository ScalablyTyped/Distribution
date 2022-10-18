package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TokenClass extends StObject
@JSImport("@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript", "TokenClass")
@js.native
object TokenClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TokenClass & Double] = js.native
  
  @js.native
  sealed trait BigIntLiteral
    extends StObject
       with TokenClass
  /* 7 */ val BigIntLiteral: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.BigIntLiteral & Double = js.native
  
  @js.native
  sealed trait Comment
    extends StObject
       with TokenClass
  /* 3 */ val Comment: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.Comment & Double = js.native
  
  @js.native
  sealed trait Identifier
    extends StObject
       with TokenClass
  /* 5 */ val Identifier: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.Identifier & Double = js.native
  
  @js.native
  sealed trait Keyword
    extends StObject
       with TokenClass
  /* 1 */ val Keyword: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.Keyword & Double = js.native
  
  @js.native
  sealed trait NumberLiteral
    extends StObject
       with TokenClass
  /* 6 */ val NumberLiteral: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.NumberLiteral & Double = js.native
  
  @js.native
  sealed trait Operator
    extends StObject
       with TokenClass
  /* 2 */ val Operator: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.Operator & Double = js.native
  
  @js.native
  sealed trait Punctuation
    extends StObject
       with TokenClass
  /* 0 */ val Punctuation: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.Punctuation & Double = js.native
  
  @js.native
  sealed trait RegExpLiteral
    extends StObject
       with TokenClass
  /* 9 */ val RegExpLiteral: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.RegExpLiteral & Double = js.native
  
  @js.native
  sealed trait StringLiteral
    extends StObject
       with TokenClass
  /* 8 */ val StringLiteral: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.StringLiteral & Double = js.native
  
  @js.native
  sealed trait Whitespace
    extends StObject
       with TokenClass
  /* 4 */ val Whitespace: typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.TokenClass.Whitespace & Double = js.native
}
