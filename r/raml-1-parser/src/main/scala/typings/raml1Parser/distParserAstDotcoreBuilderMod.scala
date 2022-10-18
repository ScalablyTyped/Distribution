package typings.raml1Parser

import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserHighLevelASTMod.INodeBuilder
import typings.raml1Parser.distParserHighLevelASTMod.IParseResult
import typings.raml1Parser.distParserHighLevelASTMod.ITypeDefinition
import typings.raml1Parser.distParserLowLevelASTMod.ILowLevelASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserAstDotcoreBuilderMod {
  
  @JSImport("raml-1-parser/dist/parser/ast.core/builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser/dist/parser/ast.core/builder", "BasicNodeBuilder")
  @js.native
  open class BasicNodeBuilder ()
    extends StObject
       with INodeBuilder {
    
    /* private */ var isTypeDeclarationShortcut: Any = js.native
    
    /* CompleteClass */
    override def process(node: IHighLevelNode, childrenToAdopt: js.Array[ILowLevelASTNode]): js.Array[IParseResult] = js.native
    
    /* private */ var processChildren: Any = js.native
    
    var shouldDescriminate: Boolean = js.native
  }
  
  inline def doDescrimination(node: IHighLevelNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("doDescrimination")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def mapType(
    pt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify def.rt.tsInterfaces.IParsedType */ Any
  ): js.Array[ITypeDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapType")(pt.asInstanceOf[js.Any]).asInstanceOf[js.Array[ITypeDefinition]]
  inline def mapType(
    pt: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify def.rt.tsInterfaces.IParsedType */ Any,
    universe: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify def.rt.nominalInterfaces.IUniverse */ Any
  ): js.Array[ITypeDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapType")(pt.asInstanceOf[js.Any], universe.asInstanceOf[js.Any])).asInstanceOf[js.Array[ITypeDefinition]]
}
