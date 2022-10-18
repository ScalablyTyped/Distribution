package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsesDeclaration
  extends StObject
     with Annotable {
  
  /**
    * Returns the root node of the AST, uses statement refers.
    **/
  def ast(): Library = js.native
  
  /**
    * Name prefix (without dot) used to refer imported declarations
    **/
  def key(): String = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): UsesDeclarationScalarsAnnotations = js.native
  
  /**
    * Content of the schema
    **/
  def value(): String = js.native
}
