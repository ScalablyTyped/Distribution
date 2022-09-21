package typings.raml1Parser

import typings.raml1Parser.anon.Boolean
import typings.raml1Parser.raml10parserapiMod.ObjectTypeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servergenMod {
  
  @JSImport("raml-1-parser/dist/parser/tools/servergen/servergen", "ServerGenerator")
  @js.native
  open class ServerGenerator protected () extends StObject {
    def this(templateDir: String) = this()
    
    def copy(targetDir: String): Unit = js.native
    
    def copyfile(source: String, dest: String): Unit = js.native
    
    def generate(targetDir: String, `type`: ObjectTypeDeclaration): Unit = js.native
    
    def generateImports(name: String): String = js.native
    
    def generateMain(targetDir: String, `type`: ObjectTypeDeclaration): Unit = js.native
    
    def generateModel(targetDir: String, `type`: ObjectTypeDeclaration): Unit = js.native
    
    def generateRoutes(name: String): String = js.native
    
    def generateSchema(`type`: ObjectTypeDeclaration): Any = js.native
    
    def render(source: String, context: Any): String = js.native
    
    def renderFile(source: String, dest: String, context: Any): Unit = js.native
    
    /* private */ var templateDir: Any = js.native
  }
  /* static members */
  object ServerGenerator {
    
    @JSImport("raml-1-parser/dist/parser/tools/servergen/servergen", "ServerGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("raml-1-parser/dist/parser/tools/servergen/servergen", "ServerGenerator.Files")
    @js.native
    def Files: js.Array[String] = js.native
    inline def Files_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Files")(x.asInstanceOf[js.Any])
    
    @JSImport("raml-1-parser/dist/parser/tools/servergen/servergen", "ServerGenerator.TypeMap")
    @js.native
    def TypeMap: Boolean = js.native
    inline def TypeMap_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeMap")(x.asInstanceOf[js.Any])
  }
}
