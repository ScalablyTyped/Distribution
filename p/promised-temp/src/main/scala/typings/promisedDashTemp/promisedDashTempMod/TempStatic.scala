package typings.promisedDashTemp.promisedDashTempMod

import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempStatic extends js.Object {
  var dir: String = js.native
  def cleanup(): js.Promise[Boolean | typings.temp.tempMod.Stats] = js.native
  def createWriteStream(): js.Promise[WriteStream] = js.native
  def createWriteStream(affixes: String): js.Promise[WriteStream] = js.native
  def createWriteStream(affixes: typings.temp.tempMod.AffixOptions): js.Promise[WriteStream] = js.native
  def mkdir(): js.Promise[String] = js.native
  def mkdir(affixes: String): js.Promise[String] = js.native
  def mkdir(affixes: typings.temp.tempMod.AffixOptions): js.Promise[String] = js.native
  def open(): js.Promise[typings.temp.tempMod.OpenFile] = js.native
  def open(affixes: String): js.Promise[typings.temp.tempMod.OpenFile] = js.native
  def open(affixes: typings.temp.tempMod.AffixOptions): js.Promise[typings.temp.tempMod.OpenFile] = js.native
  def path(): String = js.native
  def path(affixes: String): String = js.native
  def path(affixes: String, defaultPrefix: String): String = js.native
  def path(affixes: typings.temp.tempMod.AffixOptions): String = js.native
  def path(affixes: typings.temp.tempMod.AffixOptions, defaultPrefix: String): String = js.native
  def track(): TempStatic = js.native
  def track(value: Boolean): TempStatic = js.native
}

