package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExampleSpec
  extends StObject
     with Annotable {
  
  /**
    * A longer, human-friendly description of the example
    **/
  def description(): MarkdownString = js.native
  
  /**
    * An alternate, human-friendly name for the example
    **/
  def displayName(): String = js.native
  
  /**
    * Example identifier, if specified
    **/
  def name(): String = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): ExampleSpecScalarsAnnotations = js.native
  
  /**
    * By default, examples are validated against any type declaration. Set this to false to allow examples that need not validate.
    **/
  def strict(): Boolean = js.native
  
  /**
    * Returns object representation of example, if possible
    **/
  def structuredValue(): TypeInstance = js.native
  
  /**
    * String representation of example
    **/
  def value(): Any = js.native
}
