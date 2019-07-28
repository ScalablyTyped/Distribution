package typings.randomDashJs

import typings.randomDashJs.randomDashJsMod.Engine
import typings.randomDashJs.randomDashJsMod.MT19937
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BrowserCrypto extends js.Object {
  @JSName("browserCrypto")
  var browserCrypto_Original: Engine = js.native
  @JSName("nativeMath")
  var nativeMath_Original: Engine = js.native
  def browserCrypto(): Double = js.native
  def mt19937(): MT19937 = js.native
  def nativeMath(): Double = js.native
}

