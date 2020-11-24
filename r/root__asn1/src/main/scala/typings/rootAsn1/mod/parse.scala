package typings.rootAsn1.mod

import typings.rootAsn1.anon.Der
import typings.rootAsn1.anon.DerJson
import typings.rootAsn1.anon.JsonVerbose
import typings.rootAsn1.anon.Verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@root/asn1", "parse")
@js.native
object parse extends js.Object {
  
  def apply(opts: Der): ArrJson = js.native
  def apply(opts: DerJson): ElementHex = js.native
  def apply(opts: JsonVerbose): ElementBuffer = js.native
  def apply(opts: Verbose): ArrBuffer = js.native
}
