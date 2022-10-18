package typings.raml1Parser.distParserArtifactsRaml10parserMod

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.AnnotationRef
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.UsesDeclarationScalarsAnnotations
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "UsesDeclarationScalarsAnnotationsImpl")
@js.native
open class UsesDeclarationScalarsAnnotationsImpl protected ()
  extends StObject
     with UsesDeclarationScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /* protected */ var node: IHighLevelNode = js.native
  
  /**
    * UsesDeclaration.value annotations
    **/
  /* CompleteClass */
  override def value(): js.Array[AnnotationRef] = js.native
}
