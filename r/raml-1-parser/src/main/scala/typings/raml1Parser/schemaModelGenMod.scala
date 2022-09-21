package typings.raml1Parser

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.raml10parserMod.ArrayTypeDeclarationImpl
import typings.raml1Parser.raml10parserMod.TypeDeclarationImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaModelGenMod {
  
  @JSImport("raml-1-parser/dist/parser/tools/schemaModelGen", "ModelToSchemaGenerator")
  @js.native
  open class ModelToSchemaGenerator () extends StObject {
    
    def allTypes(node: IHighLevelNode): js.Object = js.native
    
    def generateProperties(node: IHighLevelNode): Any = js.native
    
    def generateProperty(node: IHighLevelNode, optional: Boolean): Any = js.native
    
    def generateSchema(node: IHighLevelNode): Any = js.native
    
    def generateType(`type`: IHighLevelNode): Any = js.native
    
    def generateTypeExp(`type`: String, types: Any): Any = js.native
    
    def isSimpleType(name: Any): Boolean = js.native
    
    def makeUnion(typelist: Any, types: Any): js.Array[Any] = js.native
    
    def resolveType(node: IHighLevelNode, name: String): Any = js.native
  }
  
  @JSImport("raml-1-parser/dist/parser/tools/schemaModelGen", "SchemaToModelGenerator")
  @js.native
  open class SchemaToModelGenerator ()
    extends StObject
       with typings.raml1Parser.schemaModelGenApiMod.SchemaToModelGenerator {
    
    def generateItemsTo(a: ArrayTypeDeclarationImpl, obj: Any): Unit = js.native
    
    def generateObj(e: Any, lev: Double): String = js.native
    
    def generateObjTo(`type`: TypeDeclarationImpl, e: Any): Unit = js.native
    
    def generateText(schema: String): String = js.native
    
    def makeType(name: String, `type`: String): TypeDeclarationImpl = js.native
    
    def makeTypeField(name: String, p: Any): TypeDeclarationImpl = js.native
  }
}
