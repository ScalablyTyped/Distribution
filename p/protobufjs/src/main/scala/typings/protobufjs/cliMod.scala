package typings.protobufjs

import typings.protobufjs.pbjsMod.pbjsCallback
import typings.protobufjs.pbtsMod.pbtsCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  object pbjs {
    
    @JSImport("protobufjs/cli", "pbjs")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def main(args: js.Array[String]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
    @scala.inline
    def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  }
  
  object pbts {
    
    @JSImport("protobufjs/cli", "pbts")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def main(args: js.Array[String]): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
    @scala.inline
    def main(args: js.Array[String], callback: pbtsCallback): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  }
}
