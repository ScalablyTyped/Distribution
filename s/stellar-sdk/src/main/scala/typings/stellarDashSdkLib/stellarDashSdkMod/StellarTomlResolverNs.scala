package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "StellarTomlResolver")
@js.native
object StellarTomlResolverNs extends js.Object {
  
  trait StellarTomlResolveOptions extends js.Object {
    var allowHttp: js.UndefOr[scala.Boolean] = js.undefined
    var timeout: js.UndefOr[scala.Double] = js.undefined
  }
  
  def resolve(domain: java.lang.String): js.Promise[ScalablyTyped.runtime.StringDictionary[_]] = js.native
  def resolve(domain: java.lang.String, options: StellarTomlResolveOptions): js.Promise[ScalablyTyped.runtime.StringDictionary[_]] = js.native
}

