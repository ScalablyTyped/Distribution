package typings.raml1Parser.distParserArtifactsRaml08parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationItem
  extends StObject
     with BasicNode {
  
  /**
    * Content of documentation section
    **/
  def content(): MarkdownString = js.native
  
  /**
    * title of documentation section
    **/
  def title(): String = js.native
}
