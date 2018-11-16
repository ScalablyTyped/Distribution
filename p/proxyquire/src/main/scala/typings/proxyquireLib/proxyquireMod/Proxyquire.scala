package typings
package proxyquireLib.proxyquireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxyquire extends js.Object {
  def apply(request: java.lang.String, stubs: js.Any): js.Any = js.native
  def callThru(): Proxyquire = js.native
  def load(request: java.lang.String, stubs: js.Any): js.Any = js.native
  @JSName("load")
  def load_TT[T](request: java.lang.String, stubs: js.Any): T = js.native
  def noCallThru(): Proxyquire = js.native
  def noPreserveCache(): Proxyquire = js.native
  def preserveCache(): Proxyquire = js.native
}

