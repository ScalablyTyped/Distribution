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
  def start(options: sntpLib.sntpMod.Options): js.Promise[scala.Unit] = js.native
  def stop(): scala.Unit = js.native
  def time(): js.Promise[sntpLib.sntpMod.TimeOptions] = js.native
  def time(options: sntpLib.sntpMod.Options): js.Promise[sntpLib.sntpMod.TimeOptions] = js.native
}

