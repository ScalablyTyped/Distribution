package typings.stellarSdk.mod

import typings.stellarSdk.federationServerMod.FederationServer.Options
import typings.stellarSdk.federationServerMod.FederationServer.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "FederationServer")
@js.native
class FederationServer protected ()
  extends typings.stellarSdk.federationServerMod.FederationServer {
  def this(serverURL: String, domain: String) = this()
  def this(serverURL: String, domain: String, opts: Options) = this()
}
/* static members */
object FederationServer {
  
  @JSImport("stellar-sdk", "FederationServer.createForDomain")
  @js.native
  def createForDomain(domain: String): js.Promise[typings.stellarSdk.federationServerMod.FederationServer] = js.native
  @JSImport("stellar-sdk", "FederationServer.createForDomain")
  @js.native
  def createForDomain(domain: String, opts: Options): js.Promise[typings.stellarSdk.federationServerMod.FederationServer] = js.native
  
  @JSImport("stellar-sdk", "FederationServer.resolve")
  @js.native
  def resolve(value: String): js.Promise[Record] = js.native
  @JSImport("stellar-sdk", "FederationServer.resolve")
  @js.native
  def resolve(value: String, opts: Options): js.Promise[Record] = js.native
}
