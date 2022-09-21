package typings.raml1Parser.raml08parserapiMod

import typings.raml1Parser.highLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameter
  extends StObject
     with BasicNode {
  
  /**
    * The default attribute specifies the default value to use for the property if the property is omitted or its value is not specified. This SHOULD NOT be interpreted as a requirement for the client to send the default attribute's value if there is no other value to send. Instead, the default attribute's value is the value the server uses if the client does not send a value.
    **/
  def default(): Any = js.native
  
  /**
    * The description attribute describes the intended use or meaning of the $self. This value MAY be formatted using Markdown.
    **/
  def description(): MarkdownString = js.native
  
  /**
    * An alternate, human-friendly name for the parameter
    **/
  def displayName(): String = js.native
  
  /**
    * (Optional) The example attribute shows an example value for the property. This can be used, e.g., by documentation generators to generate sample values for the property.
    **/
  def example(): Any = js.native
  
  /**
    * Location of the parameter (can not be edited by user)
    **/
  def location(): ParameterLocation = js.native
  
  /**
    * name of the parameter
    **/
  def name(): String = js.native
  
  /**
    * For parameters defined inside traits and resource types returns object representation of parametrized properties
    **/
  def parametrizedProperties(): TypeInstance = js.native
  
  /**
    * The repeat attribute specifies that the parameter can be repeated. If the parameter can be used multiple times, the repeat parameter value MUST be set to 'true'. Otherwise, the default value is 'false' and the parameter may not be repeated.
    **/
  def repeat(): Boolean = js.native
  
  /**
    * Set to true if parameter is required
    **/
  def required(): Boolean = js.native
  
  /**
    * The type attribute specifies the primitive type of the parameter's resolved value. API clients MUST return/throw an error if the parameter's resolved value does not match the specified type. If type is not specified, it defaults to string.
    **/
  def `type`(): String = js.native
}
