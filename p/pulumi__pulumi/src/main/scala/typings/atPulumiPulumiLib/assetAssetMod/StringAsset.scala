package typings
package atPulumiPulumiLib.assetAssetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset/asset", "StringAsset")
@js.native
class StringAsset protected () extends Asset {
  def this(text: java.lang.String) = this()
  def this(text: stdLib.Promise[java.lang.String]) = this()
  /**
       * The string contents.
       */
  val text: stdLib.Promise[java.lang.String] = js.native
}

