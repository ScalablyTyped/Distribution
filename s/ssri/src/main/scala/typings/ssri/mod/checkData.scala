package typings.ssri.mod

import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.ssri.anon.Error
import typings.ssri.ssriBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "checkData")
@js.native
object checkData extends js.Object {
  def apply(data: String, sri: String): Hash | `false` = js.native
  def apply(data: String, sri: String, opts: Error): Hash | `false` = js.native
  def apply(data: String, sri: HashLike): Hash | `false` = js.native
  def apply(data: String, sri: HashLike, opts: Error): Hash | `false` = js.native
  def apply(data: String, sri: IntegrityLike): Hash | `false` = js.native
  def apply(data: String, sri: IntegrityLike, opts: Error): Hash | `false` = js.native
  def apply(data: Buffer, sri: String): Hash | `false` = js.native
  def apply(data: Buffer, sri: String, opts: Error): Hash | `false` = js.native
  def apply(data: Buffer, sri: HashLike): Hash | `false` = js.native
  def apply(data: Buffer, sri: HashLike, opts: Error): Hash | `false` = js.native
  def apply(data: Buffer, sri: IntegrityLike): Hash | `false` = js.native
  def apply(data: Buffer, sri: IntegrityLike, opts: Error): Hash | `false` = js.native
  def apply(data: TypedArray, sri: String): Hash | `false` = js.native
  def apply(data: TypedArray, sri: String, opts: Error): Hash | `false` = js.native
  def apply(data: TypedArray, sri: HashLike): Hash | `false` = js.native
  def apply(data: TypedArray, sri: HashLike, opts: Error): Hash | `false` = js.native
  def apply(data: TypedArray, sri: IntegrityLike): Hash | `false` = js.native
  def apply(data: TypedArray, sri: IntegrityLike, opts: Error): Hash | `false` = js.native
}

