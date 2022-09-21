package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.raml10parserapiMod.AnnotationRef
import typings.raml1Parser.raml10parserapiMod.ResourceTypeScalarsAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ResourceTypeScalarsAnnotationsImpl")
@js.native
open class ResourceTypeScalarsAnnotationsImpl protected ()
  extends ResourceBaseScalarsAnnotationsImpl
     with ResourceTypeScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * ResourceBase.description annotations
    **/
  /* CompleteClass */
  override def description(): js.Array[AnnotationRef] = js.native
  
  /**
    * ResourceType.displayName annotations
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
  
  /**
    * ResourceType.usage annotations
    **/
  /* CompleteClass */
  override def usage(): js.Array[AnnotationRef] = js.native
}
