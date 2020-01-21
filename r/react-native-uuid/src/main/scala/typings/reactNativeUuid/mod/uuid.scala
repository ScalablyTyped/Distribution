package typings.reactNativeUuid.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uuid extends js.Object {
  def noConflict(): String = js.native
  def parse(id: String): ArrayBuffer = js.native
  def parse(id: String, buffer: ArrayBuffer): ArrayBuffer = js.native
  def parse(id: String, buffer: ArrayBuffer, offset: Double): ArrayBuffer = js.native
  def unparse(): String = js.native
  def unparse(buffer: ArrayBuffer): String = js.native
  def unparse(buffer: ArrayBuffer, offset: Double): String = js.native
  def v1(): String = js.native
  def v1(options: typings.reactNativeUuid.mod.v1): String = js.native
  def v1(options: typings.reactNativeUuid.mod.v1, buffer: ArrayBuffer): String = js.native
  def v1(options: typings.reactNativeUuid.mod.v1, buffer: ArrayBuffer, offset: Double): String = js.native
  def v4(): String = js.native
  def v4(options: typings.reactNativeUuid.mod.v4): String = js.native
  def v4(options: typings.reactNativeUuid.mod.v4, buffer: ArrayBuffer): String = js.native
  def v4(options: typings.reactNativeUuid.mod.v4, buffer: ArrayBuffer, offset: Double): String = js.native
}

