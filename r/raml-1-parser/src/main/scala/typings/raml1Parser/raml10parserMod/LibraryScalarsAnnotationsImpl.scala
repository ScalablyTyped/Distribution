package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.raml10parserapiMod.AnnotationRef
import typings.raml1Parser.raml10parserapiMod.LibraryScalarsAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "LibraryScalarsAnnotationsImpl")
@js.native
open class LibraryScalarsAnnotationsImpl protected ()
  extends StObject
     with LibraryScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /* protected */ var node: IHighLevelNode = js.native
  
  /**
    * Library.usage annotations
    **/
  /* CompleteClass */
  override def usage(): js.Array[AnnotationRef] = js.native
}
