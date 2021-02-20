package typings.snabbdom

import typings.snabbdom.anon.Delayed
import typings.snabbdom.moduleMod.Module
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  @JSImport("snabbdom/build/package/modules/style", "styleModule")
  @js.native
  val styleModule: Module = js.native
  
  type VNodeStyle = (Record[String, String]) with Delayed
}
