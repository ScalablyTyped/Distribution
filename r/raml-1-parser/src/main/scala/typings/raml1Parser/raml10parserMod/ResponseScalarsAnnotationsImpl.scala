package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.raml10parserapiMod.AnnotationRef
import typings.raml1Parser.raml10parserapiMod.ResponseScalarsAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ResponseScalarsAnnotationsImpl")
@js.native
open class ResponseScalarsAnnotationsImpl protected ()
  extends StObject
     with ResponseScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * Response.description annotations
    **/
  /* CompleteClass */
  override def description(): js.Array[AnnotationRef] = js.native
  
  /* protected */ var node: IHighLevelNode = js.native
}
