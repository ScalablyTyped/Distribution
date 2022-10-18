package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension
  extends StObject
     with Api {
  
  /**
    * Location of a valid RAML API definition (or overlay or extension), the extension is applied to
    **/
  def `extends`(): String = js.native
  
  /**
    * contains description of why extension exist
    **/
  def usage(): String = js.native
}
