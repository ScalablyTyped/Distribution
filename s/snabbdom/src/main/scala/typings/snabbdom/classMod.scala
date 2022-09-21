package typings.snabbdom

import typings.snabbdom.moduleMod.Module
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classMod {
  
  @JSImport("snabbdom/build/modules/class", "classModule")
  @js.native
  val classModule: Module = js.native
  
  type Classes = Record[String, Boolean]
}
