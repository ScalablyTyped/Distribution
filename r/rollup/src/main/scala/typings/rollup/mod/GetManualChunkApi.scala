package typings.rollup.mod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetManualChunkApi extends js.Object {
  @JSName("getModuleInfo")
  var getModuleInfo_Original: GetModuleInfo = js.native
  def getModuleIds(): IterableIterator[String] = js.native
  def getModuleInfo(moduleId: String): ModuleInfo = js.native
}

