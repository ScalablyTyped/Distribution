package typings.raml1Parser.raml08parserapiMod

import typings.raml1Parser.highLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalSchema
  extends StObject
     with BasicNode {
  
  /**
    * Name of the global schema, used to refer on schema content
    **/
  def key(): String = js.native
  
  /**
    * Content of the schema
    **/
  def value(): SchemaString = js.native
}
