package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RAMLVersion extends StObject
@JSImport("raml-1-parser/dist/parser/highLevelAST", "RAMLVersion")
@js.native
object RAMLVersion extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RAMLVersion & Double] = js.native
  
  @js.native
  sealed trait RAML08
    extends StObject
       with RAMLVersion
  /* 1 */ val RAML08: typings.raml1Parser.distParserHighLevelASTMod.RAMLVersion.RAML08 & Double = js.native
  
  @js.native
  sealed trait RAML10
    extends StObject
       with RAMLVersion
  /* 0 */ val RAML10: typings.raml1Parser.distParserHighLevelASTMod.RAMLVersion.RAML10 & Double = js.native
}
