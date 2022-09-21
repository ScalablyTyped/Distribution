package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Library
  extends StObject
     with LibraryBase {
  
  /**
    * Equivalent Library which contains all its dependencies
    **/
  def expand(): Library = js.native
  
  /**
    * Namespace which the library is imported under
    **/
  def name(): String = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): LibraryScalarsAnnotations = js.native
  
  /**
    * contains description of why library exist
    **/
  def usage(): String = js.native
}
