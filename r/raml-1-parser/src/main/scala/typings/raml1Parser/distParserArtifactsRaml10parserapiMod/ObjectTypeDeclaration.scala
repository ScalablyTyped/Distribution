package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeDeclaration
  extends StObject
     with TypeDeclaration {
  
  /**
    * A Boolean that indicates if an object instance has additional properties.
    **/
  def additionalProperties(): Boolean = js.native
  
  /**
    * Type property name to be used as discriminator, or boolean
    **/
  def discriminator(): String = js.native
  
  /**
    * The value of discriminator for the type.
    **/
  def discriminatorValue(): String = js.native
  
  def `enum`(): js.Array[Any] = js.native
  
  /**
    * The maximum number of properties allowed for instances of this type.
    **/
  def maxProperties(): Double = js.native
  
  /**
    * The minimum number of properties allowed for instances of this type.
    **/
  def minProperties(): Double = js.native
  
  /**
    * The properties that instances of this type may or must have.
    **/
  def properties(): js.Array[TypeDeclaration] = js.native
}
