package typings.raml1Parser.distParserArtifactsRaml10parserMod

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.AnnotationRef
import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.ResourceScalarsAnnotations
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ResourceScalarsAnnotationsImpl")
@js.native
open class ResourceScalarsAnnotationsImpl protected ()
  extends ResourceBaseScalarsAnnotationsImpl
     with ResourceScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * ResourceBase.description annotations
    **/
  /* CompleteClass */
  override def description(): js.Array[AnnotationRef] = js.native
  
  /**
    * Resource.displayName annotations
    **/
  /* CompleteClass */
  override def displayName(): js.Array[AnnotationRef] = js.native
  
  /**
    * ResourceBase.is annotations
    **/
  /* CompleteClass */
  override def is(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * ResourceBase.securedBy annotations
    **/
  /* CompleteClass */
  override def securedBy(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * ResourceBase.type annotations
    **/
  /* CompleteClass */
  override def `type`(): js.Array[AnnotationRef] = js.native
}
