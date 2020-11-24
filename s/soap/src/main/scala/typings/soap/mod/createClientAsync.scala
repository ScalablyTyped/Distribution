package typings.soap.mod

import typings.soap.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap", "createClientAsync")
@js.native
object createClientAsync extends js.Object {
  
  def apply(url: String): js.Promise[typings.soap.clientMod.Client] = js.native
  def apply(url: String, options: js.UndefOr[scala.Nothing], endpoint: String): js.Promise[typings.soap.clientMod.Client] = js.native
  def apply(url: String, options: IOptions): js.Promise[typings.soap.clientMod.Client] = js.native
  def apply(url: String, options: IOptions, endpoint: String): js.Promise[typings.soap.clientMod.Client] = js.native
}
