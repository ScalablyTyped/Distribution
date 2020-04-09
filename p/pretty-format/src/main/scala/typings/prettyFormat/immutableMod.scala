package typings.prettyFormat

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.NewPlugin
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import typings.prettyFormat.typesMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/Immutable", JSImport.Namespace)
@js.native
object immutableMod extends js.Object {
  val default: NewPlugin = js.native
  val serialize: js.Function6[
    /* val */ js.Any, 
    /* config */ Config, 
    /* indentation */ String, 
    /* depth */ Double, 
    /* refs */ Refs, 
    /* printer */ Printer, 
    String
  ] = js.native
  val test: Test = js.native
}

