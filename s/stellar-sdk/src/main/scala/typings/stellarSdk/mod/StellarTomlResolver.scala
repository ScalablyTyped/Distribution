package typings.stellarSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.stellarSdk.stellarTomlResolverMod.StellarTomlResolver.StellarTomlResolveOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "StellarTomlResolver")
@js.native
class StellarTomlResolver ()
  extends typings.stellarSdk.stellarTomlResolverMod.StellarTomlResolver
/* static members */
object StellarTomlResolver {
  
  @JSImport("stellar-sdk", "StellarTomlResolver.resolve")
  @js.native
  def resolve(domain: String): js.Promise[StringDictionary[_]] = js.native
  @JSImport("stellar-sdk", "StellarTomlResolver.resolve")
  @js.native
  def resolve(domain: String, opts: StellarTomlResolveOptions): js.Promise[StringDictionary[_]] = js.native
}
