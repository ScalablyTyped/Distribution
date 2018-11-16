package typings
package sparkDashMd5Lib.sparkDashMd5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparkMD5 extends js.Object {
  def append(str: java.lang.String): SparkMD5 = js.native
  def appendBinary(contents: java.lang.String): SparkMD5 = js.native
  def destroy(): scala.Unit = js.native
  def end(): java.lang.String = js.native
  def end(raw: scala.Boolean): java.lang.String = js.native
  def getState(): State = js.native
  def reset(): SparkMD5 = js.native
  def setState(state: State): State = js.native
}

