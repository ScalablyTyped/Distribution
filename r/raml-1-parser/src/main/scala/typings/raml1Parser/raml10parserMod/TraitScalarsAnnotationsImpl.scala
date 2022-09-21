package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.raml10parserapiMod.AnnotationRef
import typings.raml1Parser.raml10parserapiMod.TraitScalarsAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "TraitScalarsAnnotationsImpl")
@js.native
open class TraitScalarsAnnotationsImpl protected ()
  extends MethodBaseScalarsAnnotationsImpl
     with TraitScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * MethodBase.description annotations
    **/
  /* CompleteClass */
  override def description(): js.Array[AnnotationRef] = js.native
  
  /**
    * MethodBase.displayName annotations
    **/
  /* CompleteClass */
  override def displayName(): js.Array[AnnotationRef] = js.native
  
  /**
    * MethodBase.is annotations
    **/
  /* CompleteClass */
  override def is(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * MethodBase.protocols annotations
    **/
  /* CompleteClass */
  override def protocols(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * MethodBase.securedBy annotations
    **/
  /* CompleteClass */
  override def securedBy(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * Trait.usage annotations
    **/
  /* CompleteClass */
  override def usage(): js.Array[AnnotationRef] = js.native
}
