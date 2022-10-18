package typings.snabbdom

import typings.snabbdom.anon.Delayed
import typings.snabbdom.buildModulesModuleMod.Module
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildModulesStyleMod {
  
  @JSImport("snabbdom/build/modules/style", "styleModule")
  @js.native
  val styleModule: Module = js.native
  
  type VNodeStyle = (Record[String, String]) & Delayed
}
