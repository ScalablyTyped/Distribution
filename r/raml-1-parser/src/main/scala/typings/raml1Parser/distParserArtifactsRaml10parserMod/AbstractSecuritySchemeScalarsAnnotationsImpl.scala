package typings.raml1Parser.distParserArtifactsRaml10parserMod

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.AbstractSecuritySchemeScalarsAnnotations
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.AnnotationRef
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "AbstractSecuritySchemeScalarsAnnotationsImpl")
@js.native
open class AbstractSecuritySchemeScalarsAnnotationsImpl protected ()
  extends StObject
     with AbstractSecuritySchemeScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * AbstractSecurityScheme.description annotations
    **/
  /* CompleteClass */
  override def description(): js.Array[AnnotationRef] = js.native
  
  /**
    * AbstractSecurityScheme.displayName annotations
    **/
  /* CompleteClass */
  override def displayName(): js.Array[AnnotationRef] = js.native
  
  /* protected */ var node: IHighLevelNode = js.native
  
  /**
    * AbstractSecurityScheme.type annotations
    **/
  /* CompleteClass */
  override def `type`(): js.Array[AnnotationRef] = js.native
}
