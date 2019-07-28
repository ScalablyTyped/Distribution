package typings.stellarDashSdk.stellarDashSdkMod

import org.scalablytyped.runtime.StringDictionary
import typings.stellarDashSdk.stellarDashSdkMod.StellarTomlResolverNs.StellarTomlResolveOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "StellarTomlResolver")
@js.native
object StellarTomlResolverNs extends js.Object {
  trait StellarTomlResolveOptions extends js.Object {
    var allowHttp: js.UndefOr[Boolean] = js.undefined
    var timeout: js.UndefOr[Double] = js.undefined
  }
  
  def resolve(domain: String): js.Promise[StringDictionary[_]] = js.native
  def resolve(domain: String, options: StellarTomlResolveOptions): js.Promise[StringDictionary[_]] = js.native
}

