package typings
package randomDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BrowserCrypto extends js.Object {
  @JSName("browserCrypto")
  var browserCrypto_Original: randomDashJsLib.randomDashJsMod.Engine = js.native
  @JSName("nativeMath")
  var nativeMath_Original: randomDashJsLib.randomDashJsMod.Engine = js.native
  def browserCrypto(): scala.Double = js.native
  def mt19937(): randomDashJsLib.randomDashJsMod.MT19937 = js.native
  def nativeMath(): scala.Double = js.native
}

