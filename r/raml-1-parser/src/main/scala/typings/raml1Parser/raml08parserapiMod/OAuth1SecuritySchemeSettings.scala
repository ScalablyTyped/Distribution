package typings.raml1Parser.raml08parserapiMod

import typings.raml1Parser.highLevelASTMod.BasicNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth1SecuritySchemeSettings
  extends StObject
     with BasicNode {
  
  /**
    * The URI of the Resource Owner Authorization endpoint as defined in RFC5849 Section 2.2
    **/
  def authorizationUri(): FixedUri = js.native
  
  /**
    * The URI of the Temporary Credential Request endpoint as defined in RFC5849 Section 2.1
    **/
  def requestTokenUri(): FixedUri = js.native
  
  /**
    * The URI of the Token Request endpoint as defined in RFC5849 Section 2.3
    **/
  def tokenCredentialsUri(): FixedUri = js.native
}
