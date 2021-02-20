package typings.protobufjs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pbjsMod {
  
  @JSImport("protobufjs/cli/pbjs", "main")
  @js.native
  def main(args: js.Array[String]): js.UndefOr[Double] = js.native
  @JSImport("protobufjs/cli/pbjs", "main")
  @js.native
  def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = js.native
  
  type pbjsCallback = js.Function2[/* err */ Error | Null, /* output */ js.UndefOr[String], Unit]
}
