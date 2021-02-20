package typings.protobufjs

import typings.protobufjs.pbjsMod.pbjsCallback
import typings.protobufjs.pbtsMod.pbtsCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  object pbjs {
    
    @JSImport("protobufjs/cli", "pbjs.main")
    @js.native
    def main(args: js.Array[String]): js.UndefOr[Double] = js.native
    @JSImport("protobufjs/cli", "pbjs.main")
    @js.native
    def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = js.native
  }
  
  object pbts {
    
    @JSImport("protobufjs/cli", "pbts.main")
    @js.native
    def main(args: js.Array[String]): js.UndefOr[Double] = js.native
    @JSImport("protobufjs/cli", "pbts.main")
    @js.native
    def main(args: js.Array[String], callback: pbtsCallback): js.UndefOr[Double] = js.native
  }
}
