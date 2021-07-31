package typings.snabbdom

import typings.snabbdom.moduleMod.Module
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsMod {
  
  @JSImport("snabbdom/build/package/modules/props", "propsModule")
  @js.native
  val propsModule: Module = js.native
  
  type Props = Record[String, js.Any]
}
