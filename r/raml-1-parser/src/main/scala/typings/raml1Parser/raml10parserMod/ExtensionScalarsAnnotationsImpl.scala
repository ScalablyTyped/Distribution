package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.raml10parserapiMod.AnnotationRef
import typings.raml1Parser.raml10parserapiMod.ExtensionScalarsAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ExtensionScalarsAnnotationsImpl")
@js.native
open class ExtensionScalarsAnnotationsImpl protected ()
  extends ApiScalarsAnnotationsImpl
     with ExtensionScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * Api.baseUri annotations
    **/
  /* CompleteClass */
  override def baseUri(): js.Array[AnnotationRef] = js.native
  
  /**
    * Api.description annotations
    **/
  /* CompleteClass */
  override def description(): js.Array[AnnotationRef] = js.native
  
  /**
    * Extension.extends annotations
    **/
  /* CompleteClass */
  override def `extends`(): js.Array[AnnotationRef] = js.native
  
  /**
    * Api.mediaType annotations
    **/
  /* CompleteClass */
  override def mediaType(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * Api.protocols annotations
    **/
  /* CompleteClass */
  override def protocols(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * Api.securedBy annotations
    **/
  /* CompleteClass */
  override def securedBy(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * Api.title annotations
    **/
  /* CompleteClass */
  override def title(): js.Array[AnnotationRef] = js.native
  
  /**
    * Extension.usage annotations
    **/
  /* CompleteClass */
  override def usage(): js.Array[AnnotationRef] = js.native
  
  /**
    * Api.version annotations
    **/
  /* CompleteClass */
  override def version(): js.Array[AnnotationRef] = js.native
}
