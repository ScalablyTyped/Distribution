package typings.psNode.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ps-node", "lookup")
@js.native
object lookup extends js.Object {
  
  def apply(query: Query, cb: js.Function2[/* err */ Error, /* list */ js.Array[Program], Unit]): Unit = js.native
}
