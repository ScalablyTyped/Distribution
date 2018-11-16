package typings
package readdirDashEnhancedLib.readdirDashEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", "async")
@js.native
object asyncNs extends js.Object {
  def stat(root: java.lang.String): stdLib.Promise[js.Array[readdirDashEnhancedLib.readdirDashEnhancedMod.reNs.Entry]] = js.native
  def stat(root: java.lang.String, callback: readdirDashEnhancedLib.readdirDashEnhancedMod.reNs.CallbackEntry): scala.Unit = js.native
  def stat(root: java.lang.String, options: readdirDashEnhancedLib.readdirDashEnhancedMod.reNs.Options): stdLib.Promise[js.Array[readdirDashEnhancedLib.readdirDashEnhancedMod.reNs.Entry]] = js.native
  def stat(
    root: java.lang.String,
    options: readdirDashEnhancedLib.readdirDashEnhancedMod.reNs.Options,
    callback: readdirDashEnhancedLib.readdirDashEnhancedMod.reNs.CallbackEntry
  ): scala.Unit = js.native
}

