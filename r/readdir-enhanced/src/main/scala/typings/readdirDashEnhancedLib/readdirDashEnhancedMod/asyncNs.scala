package typings
package readdirDashEnhancedLib.readdirDashEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced", "async")
@js.native
object asyncNs extends js.Object {
  def stat(root: java.lang.String): js.Promise[js.Array[readdirDashEnhancedLib.readdirDashEnhancedMod.Entry]] = js.native
  def stat(root: java.lang.String, callback: readdirDashEnhancedLib.readdirDashEnhancedMod.CallbackEntry): scala.Unit = js.native
  def stat(root: java.lang.String, options: readdirDashEnhancedLib.readdirDashEnhancedMod.Options): js.Promise[js.Array[readdirDashEnhancedLib.readdirDashEnhancedMod.Entry]] = js.native
  def stat(
    root: java.lang.String,
    options: readdirDashEnhancedLib.readdirDashEnhancedMod.Options,
    callback: readdirDashEnhancedLib.readdirDashEnhancedMod.CallbackEntry
  ): scala.Unit = js.native
}

