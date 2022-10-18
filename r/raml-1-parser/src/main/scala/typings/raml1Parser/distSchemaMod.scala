package typings.raml1Parser

import typings.raml1Parser.distParserLowLevelASTMod.ICompilationUnit
import typings.raml1Parser.distParserToolsSchemaModelGenApiMod.ModelToSchemaGenerator
import typings.raml1Parser.distParserToolsSchemaModelGenApiMod.SchemaToModelGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaMod {
  
  @JSImport("raml-1-parser/dist/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def completeReference(includePath: String, includeReference: IncludeReference, content: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("completeReference")(includePath.asInstanceOf[js.Any], includeReference.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def createModelToSchemaGenerator(): ModelToSchemaGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("createModelToSchemaGenerator")().asInstanceOf[ModelToSchemaGenerator]
  
  inline def createSchema(c: String, u: ICompilationUnit): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("createSchema")(c.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  inline def createSchemaModelGenerator(): SchemaToModelGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("createSchemaModelGenerator")().asInstanceOf[SchemaToModelGenerator]
  
  inline def dereference(schemaPath: String, jsonReference: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schemaPath.asInstanceOf[js.Any], jsonReference.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getIncludePath(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIncludePath")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIncludeReference(p: String): IncludeReference = ^.asInstanceOf[js.Dynamic].applyDynamic("getIncludeReference")(p.asInstanceOf[js.Any]).asInstanceOf[IncludeReference]
  
  inline def getJSONSchema(c: String, u: ICompilationUnit): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("getJSONSchema")(c.asInstanceOf[js.Any], u.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  inline def getXMLSchema(c: String): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("getXMLSchema")(c.asInstanceOf[js.Any]).asInstanceOf[Schema]
  
  trait IncludeReference extends StObject {
    
    def asString(): String
    
    def encodedName(): String
    
    def getFragments(): js.Array[String]
    
    def getIncludePath(): String
  }
  object IncludeReference {
    
    inline def apply(
      asString: () => String,
      encodedName: () => String,
      getFragments: () => js.Array[String],
      getIncludePath: () => String
    ): IncludeReference = {
      val __obj = js.Dynamic.literal(asString = js.Any.fromFunction0(asString), encodedName = js.Any.fromFunction0(encodedName), getFragments = js.Any.fromFunction0(getFragments), getIncludePath = js.Any.fromFunction0(getIncludePath))
      __obj.asInstanceOf[IncludeReference]
    }
    
    extension [Self <: IncludeReference](x: Self) {
      
      inline def setAsString(value: () => String): Self = StObject.set(x, "asString", js.Any.fromFunction0(value))
      
      inline def setEncodedName(value: () => String): Self = StObject.set(x, "encodedName", js.Any.fromFunction0(value))
      
      inline def setGetFragments(value: () => js.Array[String]): Self = StObject.set(x, "getFragments", js.Any.fromFunction0(value))
      
      inline def setGetIncludePath(value: () => String): Self = StObject.set(x, "getIncludePath", js.Any.fromFunction0(value))
    }
  }
  
  trait Schema extends StObject {
    
    def getType(): String
    
    def validate(content: String): Unit
    
    def validateObject(`object`: Any): Unit
  }
  object Schema {
    
    inline def apply(getType: () => String, validate: String => Unit, validateObject: Any => Unit): Schema = {
      val __obj = js.Dynamic.literal(getType = js.Any.fromFunction0(getType), validate = js.Any.fromFunction1(validate), validateObject = js.Any.fromFunction1(validateObject))
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setValidate(value: String => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateObject(value: Any => Unit): Self = StObject.set(x, "validateObject", js.Any.fromFunction1(value))
    }
  }
}
