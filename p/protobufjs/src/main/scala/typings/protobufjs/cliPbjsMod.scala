package typings.protobufjs

import typings.protobufjs.cliPbjsMod.pbjsCallback
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/cli/pbjs", JSImport.Namespace)
@js.native
object cliPbjsMod extends js.Object {
  def main(args: js.Array[String]): js.UndefOr[Double] = js.native
  def main(args: js.Array[String], callback: pbjsCallback): js.UndefOr[Double] = js.native
  type pbjsCallback = js.Function2[/* err */ Error | Null, /* output */ js.UndefOr[String], Unit]
}

