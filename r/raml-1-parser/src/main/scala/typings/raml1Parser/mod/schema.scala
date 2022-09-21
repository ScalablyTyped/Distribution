package typings.raml1Parser.mod

import typings.raml1Parser.lowLevelASTMod.ICompilationUnit
import typings.raml1Parser.schemaMod.IncludeReference
import typings.raml1Parser.schemaMod.Schema
import typings.raml1Parser.schemaModelGenApiMod.ModelToSchemaGenerator
import typings.raml1Parser.schemaModelGenApiMod.SchemaToModelGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schema {
  
  @JSImport("raml-1-parser", "schema")
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
}
