package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotable
  extends StObject
     with BasicNode {
  
  /**
    * Most of RAML model elements may have attached annotations decribing additional meta data about this element
    **/
  def annotations(): js.Array[AnnotationRef] = js.native
}
