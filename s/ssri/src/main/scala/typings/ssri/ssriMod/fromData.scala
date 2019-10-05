package typings.ssri.ssriMod

import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.ssri.Anon_Algorithms
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromData")
@js.native
object fromData extends js.Object {
  def apply(data: String): IntegrityMap = js.native
  def apply(data: String, opts: Anon_Algorithms): IntegrityMap = js.native
  def apply(data: Buffer): IntegrityMap = js.native
  def apply(data: Buffer, opts: Anon_Algorithms): IntegrityMap = js.native
  def apply(data: TypedArray): IntegrityMap = js.native
  def apply(data: TypedArray, opts: Anon_Algorithms): IntegrityMap = js.native
  def apply(data: DataView): IntegrityMap = js.native
  def apply(data: DataView, opts: Anon_Algorithms): IntegrityMap = js.native
}

