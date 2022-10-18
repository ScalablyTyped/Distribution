package typings.raml1Parser.mod

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.ObjectTypeDeclaration
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.TypeDeclaration
import typings.raml1Parser.distParserHighLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parser {
  
  object modify {
    
    @JSImport("raml-1-parser", "parser.modify")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addChild(parent: BasicNode, child: BasicNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addChild")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createObjectTypeDeclaration(typeName: String): ObjectTypeDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectTypeDeclaration")(typeName.asInstanceOf[js.Any]).asInstanceOf[ObjectTypeDeclaration]
    
    inline def createTypeDeclaration(typeName: String): TypeDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeDeclaration")(typeName.asInstanceOf[js.Any]).asInstanceOf[TypeDeclaration]
    
    inline def setTypeDeclarationExample(`type`: TypeDeclaration, example: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeDeclarationExample")(`type`.asInstanceOf[js.Any], example.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setTypeDeclarationSchema(`type`: TypeDeclaration, schema: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTypeDeclarationSchema")(`type`.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
