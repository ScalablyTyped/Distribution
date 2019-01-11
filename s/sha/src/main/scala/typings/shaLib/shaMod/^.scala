package typings
package shaLib.shaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check[R](fileName: java.lang.String, expected: java.lang.String, cb: shaLib.shaMod.CheckCallback[R]): scala.Unit | R = js.native
  def check[R](
    fileName: java.lang.String,
    expected: java.lang.String,
    options: shaLib.shaMod.ShaOptions,
    cb: shaLib.shaMod.CheckCallback[R]
  ): scala.Unit | R = js.native
  def checkSync(fileName: java.lang.String, expected: java.lang.String): scala.Unit = js.native
  def checkSync(fileName: java.lang.String, expected: java.lang.String, options: shaLib.shaMod.ShaOptions): scala.Unit = js.native
  def get(fileName: java.lang.String, cb: shaLib.shaMod.GetCallback): scala.Unit = js.native
  def get(fileName: java.lang.String, options: shaLib.shaMod.ShaOptions, cb: shaLib.shaMod.GetCallback): scala.Unit = js.native
  def getSync(fileName: java.lang.String): java.lang.String = js.native
  def getSync(fileName: java.lang.String, options: shaLib.shaMod.ShaOptions): java.lang.String = js.native
  def stream(expected: java.lang.String): nodeLib.streamMod.Transform = js.native
  def stream(expected: java.lang.String, options: shaLib.shaMod.ShaOptions): nodeLib.streamMod.Transform = js.native
}

