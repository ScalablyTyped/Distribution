package typings.resourceDashLoader.miniDashSignalsMod

import typings.resourceDashLoader.miniDashSignalsMod.MiniSignal.MiniSignalBinding
import typings.resourceDashLoader.resourceDashLoaderNumbers.`false`
import typings.resourceDashLoader.resourceDashLoaderNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("MiniSignal")
@js.native
trait MiniSignal_[CbType] extends js.Object {
  var dispatch: CbType = js.native
  def add(fn: CbType): MiniSignalBinding = js.native
  def add(fn: CbType, thisArg: js.Any): MiniSignalBinding = js.native
  def detach(node: MiniSignalBinding): MiniSignal[CbType] = js.native
  def detachAll(): MiniSignal[CbType] = js.native
  def handlers(): js.Array[MiniSignalBinding] = js.native
  @JSName("handlers")
  def handlers_false(exists: `false`): js.Array[MiniSignalBinding] = js.native
  @JSName("handlers")
  def handlers_true(exists: `true`): Boolean = js.native
  def has(node: MiniSignalBinding): Boolean = js.native
  def once(fn: CbType): MiniSignalBinding = js.native
  def once(fn: CbType, thisArg: js.Any): MiniSignalBinding = js.native
}

