package typings.raml1Parser.raml08parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trait
  extends StObject
     with MethodBase {
  
  /**
    * An alternate, human-friendly name for the trait
    **/
  def displayName(): String = js.native
  
  /**
    * Name of the trait
    **/
  def name(): String = js.native
  
  /**
    * Returns object representation of parametrized properties of the trait
    **/
  def parametrizedProperties(): TypeInstance = js.native
  
  /**
    * Instructions on how and when the trait should be used.
    **/
  def usage(): String = js.native
}
