package typings
package sparkDashMd5Lib.sparkDashMd5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spark-md5", "ArrayBuffer")
@js.native
class ArrayBuffer () extends js.Object {
  def append(str: ArrayBufferCopy): ArrayBuffer = js.native
  def destroy(): scala.Unit = js.native
  def end(): java.lang.String = js.native
  def end(raw: scala.Boolean): java.lang.String = js.native
  def getState(): State = js.native
  def reset(): ArrayBuffer = js.native
  def setState(state: State): State = js.native
}

/* static members */
@JSImport("spark-md5", "ArrayBuffer")
@js.native
object ArrayBuffer extends js.Object {
  def hash(arr: sparkDashMd5Lib.sparkDashMd5Mod.ArrayBufferCopy): java.lang.String = js.native
  def hash(arr: sparkDashMd5Lib.sparkDashMd5Mod.ArrayBufferCopy, raw: scala.Boolean): java.lang.String = js.native
}

