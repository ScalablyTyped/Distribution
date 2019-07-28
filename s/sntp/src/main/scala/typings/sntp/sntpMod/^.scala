package typings.sntp.sntpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sntp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def now(): Double = js.native
  def offset(): js.Promise[Double] = js.native
  def start(): js.Promise[Unit] = js.native
  def start(options: Options): js.Promise[Unit] = js.native
  def stop(): Unit = js.native
  def time(): js.Promise[TimeOptions] = js.native
  def time(options: Options): js.Promise[TimeOptions] = js.native
}

