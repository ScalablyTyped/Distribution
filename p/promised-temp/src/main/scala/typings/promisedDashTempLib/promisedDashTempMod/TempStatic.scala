package typings
package promisedDashTempLib.promisedDashTempMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempStatic extends js.Object {
  var dir: java.lang.String = js.native
  def cleanup(): js.Promise[scala.Boolean | Stats] = js.native
  def createWriteStream(): js.Promise[nodeLib.fsMod.WriteStream] = js.native
  def createWriteStream(affixes: java.lang.String): js.Promise[nodeLib.fsMod.WriteStream] = js.native
  def createWriteStream(affixes: AffixOptions): js.Promise[nodeLib.fsMod.WriteStream] = js.native
  def mkdir(): js.Promise[java.lang.String] = js.native
  def mkdir(affixes: java.lang.String): js.Promise[java.lang.String] = js.native
  def mkdir(affixes: AffixOptions): js.Promise[java.lang.String] = js.native
  def open(): js.Promise[OpenFile] = js.native
  def open(affixes: java.lang.String): js.Promise[OpenFile] = js.native
  def open(affixes: AffixOptions): js.Promise[OpenFile] = js.native
  def path(): java.lang.String = js.native
  def path(affixes: java.lang.String): java.lang.String = js.native
  def path(affixes: java.lang.String, defaultPrefix: java.lang.String): java.lang.String = js.native
  def path(affixes: AffixOptions): java.lang.String = js.native
  def path(affixes: AffixOptions, defaultPrefix: java.lang.String): java.lang.String = js.native
  def track(): TempStatic = js.native
  def track(value: scala.Boolean): TempStatic = js.native
}

