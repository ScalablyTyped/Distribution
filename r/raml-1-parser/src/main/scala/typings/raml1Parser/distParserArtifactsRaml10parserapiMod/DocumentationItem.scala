package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationItem
  extends StObject
     with Annotable {
  
  /**
    * Content of documentation section
    **/
  def content(): MarkdownString = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): DocumentationItemScalarsAnnotations = js.native
  
  /**
    * Title of documentation section
    **/
  def title(): String = js.native
}
