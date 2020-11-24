package typings.soap.mod

import typings.soap.typesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap", "createClient")
@js.native
object createClient extends js.Object {
  
  def apply(url: String, callback: CreateClientCallback): Unit = js.native
  def apply(url: String, callback: CreateClientCallback, endpoint: String): Unit = js.native
  def apply(url: String, options: IOptions, callback: CreateClientCallback): Unit = js.native
  def apply(url: String, options: IOptions, callback: CreateClientCallback, endpoint: String): Unit = js.native
}
