package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomSource extends js.Object {
  def getRandomValues(array: Int16Array): Int16Array = js.native
  def getRandomValues(array: Int32Array): Int32Array = js.native
  def getRandomValues(array: Int8Array): Int8Array = js.native
  def getRandomValues(array: Uint16Array): Uint16Array = js.native
  def getRandomValues(array: Uint32Array): Uint32Array = js.native
  def getRandomValues(array: Uint8Array): Uint8Array = js.native
  def getRandomValues(array: Uint8ClampedArray): Uint8ClampedArray = js.native
}

