package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceType
  extends StObject
     with ResourceBase {
  
  /**
    * The displayName attribute specifies the resource type display name. It is a friendly name used only for  display or documentation purposes. If displayName is not specified, it defaults to the element's key (the name of the property itself).
    **/
  def displayName(): String = js.native
  
  /**
    * Name of the resource type
    **/
  def name(): String = js.native
  
  /**
    * Returns object representation of parametrized properties of the resource type
    **/
  def parametrizedProperties(): TypeInstance = js.native
  
  /**
    * Instructions on how and when the resource type should be used.
    **/
  def usage(): String = js.native
}
