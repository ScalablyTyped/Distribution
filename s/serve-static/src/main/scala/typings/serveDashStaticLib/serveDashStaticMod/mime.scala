package typings
package serveDashStaticLib.serveDashStaticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serve-static", "mime")
@js.native
object mime extends js.Object {
  def define(mimes: mimeLib.mimeMod.TypeMap): scala.Unit = js.native
  def define(mimes: mimeLib.mimeMod.TypeMap, force: scala.Boolean): scala.Unit = js.native
  def getExtension(mime: java.lang.String): java.lang.String | scala.Null = js.native
  def getType(path: java.lang.String): java.lang.String | scala.Null = js.native
}

