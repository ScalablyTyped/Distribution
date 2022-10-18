package typings.raml1Parser.distParserArtifactsRaml10parserMod

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.AnnotationRef
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.DocumentationItemScalarsAnnotations
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "DocumentationItemScalarsAnnotationsImpl")
@js.native
open class DocumentationItemScalarsAnnotationsImpl protected ()
  extends StObject
     with DocumentationItemScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * DocumentationItem.content annotations
    **/
  /* CompleteClass */
  override def content(): js.Array[AnnotationRef] = js.native
  
  /* protected */ var node: IHighLevelNode = js.native
  
  /**
    * DocumentationItem.title annotations
    **/
  /* CompleteClass */
  override def title(): js.Array[AnnotationRef] = js.native
}
