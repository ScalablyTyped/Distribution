package typings.ssri.mod

import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.ssri.AnonAlgorithms
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromData")
@js.native
object fromData extends js.Object {
  def apply(data: String): IntegrityMap = js.native
  def apply(data: String, opts: AnonAlgorithms): IntegrityMap = js.native
  def apply(data: Buffer): IntegrityMap = js.native
  def apply(data: Buffer, opts: AnonAlgorithms): IntegrityMap = js.native
  def apply(data: TypedArray): IntegrityMap = js.native
  def apply(data: TypedArray, opts: AnonAlgorithms): IntegrityMap = js.native
  def apply(data: DataView): IntegrityMap = js.native
  def apply(data: DataView, opts: AnonAlgorithms): IntegrityMap = js.native
}

