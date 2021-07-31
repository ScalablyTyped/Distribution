package typings.snabbdom

import typings.snabbdom.moduleMod.Module
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasetMod {
  
  @JSImport("snabbdom/build/package/modules/dataset", "datasetModule")
  @js.native
  val datasetModule: Module = js.native
  
  type Dataset = Record[String, String]
}
