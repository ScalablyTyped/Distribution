package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overlay
  extends StObject
     with Api {
  
  /**
    * Location of a valid RAML API definition (or overlay or extension), the overlay is applied to.
    **/
  def `extends`(): String = js.native
  
  /**
    * contains description of why overlay exist
    **/
  def usage(): String = js.native
}
