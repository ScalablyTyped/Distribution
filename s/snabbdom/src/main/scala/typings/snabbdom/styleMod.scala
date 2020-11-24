package typings.snabbdom

import typings.snabbdom.anon.Delayed
import typings.snabbdom.moduleMod.Module
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("snabbdom/build/package/modules/style", JSImport.Namespace)
@js.native
object styleMod extends js.Object {
  
  val styleModule: Module = js.native
  
  type VNodeStyle = (Record[String, String]) with Delayed
}
