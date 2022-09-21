package typings.snabbdom

import typings.snabbdom.moduleMod.Module
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributesMod {
  
  @JSImport("snabbdom/build/modules/attributes", "attributesModule")
  @js.native
  val attributesModule: Module = js.native
  
  type Attrs = Record[String, String | Double | Boolean]
}
