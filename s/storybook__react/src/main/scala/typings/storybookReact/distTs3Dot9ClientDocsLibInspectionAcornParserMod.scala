package typings.storybookReact

import typings.storybookReact.distTs3Dot9ClientDocsLibInspectionTypesMod.InspectionInferedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientDocsLibInspectionAcornParserMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib/inspection/acornParser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(value: String): ParsingResult[InspectionInferedType] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[ParsingResult[InspectionInferedType]]
  
  trait ParsingResult[T] extends StObject {
    
    var ast: Any
    
    var inferredType: T
  }
  object ParsingResult {
    
    inline def apply[T](ast: Any, inferredType: T): ParsingResult[T] = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], inferredType = inferredType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsingResult[T]]
    }
    
    extension [Self <: ParsingResult[?], T](x: Self & ParsingResult[T]) {
      
      inline def setAst(value: Any): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setInferredType(value: T): Self = StObject.set(x, "inferredType", value.asInstanceOf[js.Any])
    }
  }
}
