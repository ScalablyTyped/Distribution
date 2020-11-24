package typings.raven.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raven", "config")
@js.native
object config extends js.Object {
  
  def apply(): Client = js.native
  def apply(dsn: js.UndefOr[scala.Nothing], options: ConstructorOptions): Client = js.native
  def apply(dsn: String): Client = js.native
  def apply(dsn: String, options: ConstructorOptions): Client = js.native
  def apply(options: ConstructorOptions): Client = js.native
}
