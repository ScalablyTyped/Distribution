package typings.stellarDashSdk.stellarDashSdkMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server.AssetsCallBuilder")
@js.native
abstract class AssetsCallBuilder () extends CallBuilder[AssetRecord] {
  def forCode(value: String): this.type = js.native
  def forIssuer(value: String): this.type = js.native
}

