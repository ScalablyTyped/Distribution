package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserAstDotcoreTypeBuilderMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/typeBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertType(
    root: IHighLevelNode,
    t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ramlTypes.IParsedType */ Any
  ): ITypeDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("convertType")(root.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[ITypeDefinition]
  
  inline def typeFromNode(node: IHighLevelNode): ITypeDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("typeFromNode")(node.asInstanceOf[js.Any]).asInstanceOf[ITypeDefinition]
  
  trait TemplateApplication extends StObject {
    
    var attr: IAttribute
    
    var tp: ITypeDefinition
  }
  object TemplateApplication {
    
    inline def apply(attr: IAttribute, tp: ITypeDefinition): TemplateApplication = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], tp = tp.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateApplication]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateApplication] (val x: Self) extends AnyVal {
      
      inline def setAttr(value: IAttribute): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      inline def setTp(value: ITypeDefinition): Self = StObject.set(x, "tp", value.asInstanceOf[js.Any])
    }
  }
  
  type TemplateData = StringDictionary[js.Array[TemplateApplication]]
}
