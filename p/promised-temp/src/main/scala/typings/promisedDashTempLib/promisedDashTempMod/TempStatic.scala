package typings
package promisedDashTempLib.promisedDashTempMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempStatic extends js.Object {
  var dir: java.lang.String = js.native
  def cleanup(): js.Promise[scala.Boolean | tempLib.tempMod.tempNs.Stats] = js.native
  def createWriteStream(): js.Promise[nodeLib.fsMod.WriteStream] = js.native
  def createWriteStream(affixes: java.lang.String): js.Promise[nodeLib.fsMod.WriteStream] = js.native
  def createWriteStream(affixes: tempLib.tempMod.tempNs.AffixOptions): js.Promise[nodeLib.fsMod.WriteStream] = js.native
  def mkdir(): js.Promise[java.lang.String] = js.native
  def mkdir(affixes: java.lang.String): js.Promise[java.lang.String] = js.native
  def mkdir(affixes: tempLib.tempMod.tempNs.AffixOptions): js.Promise[java.lang.String] = js.native
  def open(): js.Promise[tempLib.tempMod.tempNs.OpenFile] = js.native
  def open(affixes: java.lang.String): js.Promise[tempLib.tempMod.tempNs.OpenFile] = js.native
  def open(affixes: tempLib.tempMod.tempNs.AffixOptions): js.Promise[tempLib.tempMod.tempNs.OpenFile] = js.native
  def path(): java.lang.String = js.native
  def path(affixes: java.lang.String): java.lang.String = js.native
  def path(affixes: java.lang.String, defaultPrefix: java.lang.String): java.lang.String = js.native
  def path(affixes: tempLib.tempMod.tempNs.AffixOptions): java.lang.String = js.native
  def path(affixes: tempLib.tempMod.tempNs.AffixOptions, defaultPrefix: java.lang.String): java.lang.String = js.native
  def track(): TempStatic = js.native
  def track(value: scala.Boolean): TempStatic = js.native
}

