package typings
package sntpLib.sntpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sntp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def now(): scala.Double = js.native
  def offset(): js.Promise[scala.Double] = js.native
  def start(): js.Promise[scala.Unit] = js.native
  def start(options: Options): js.Promise[scala.Unit] = js.native
  def stop(): scala.Unit = js.native
  def time(): js.Promise[TimeOptions] = js.native
  def time(options: Options): js.Promise[TimeOptions] = js.native
}

