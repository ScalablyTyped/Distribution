package typings
package shelljsLib.makeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  val ShellString: shelljsLib.shelljsMod.ShellStringConstructor = js.native
  val cat: shelljsLib.shelljsMod.CatFunction = js.native
  val cd: js.Function1[/* dir */ js.UndefOr[java.lang.String], shelljsLib.shelljsMod.ShellString] = js.native
  val chmod: shelljsLib.shelljsMod.ChmodFunction = js.native
  val config: shelljsLib.shelljsMod.ShellConfig = js.native
  val cp: shelljsLib.shelljsMod.CopyFunction = js.native
  val dirs: shelljsLib.shelljsMod.DirsFunction = js.native
  val echo: shelljsLib.shelljsMod.EchoFunction = js.native
  val env: nodeLib.NodeJSNs.ProcessEnv = js.native
  val error: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val exec: shelljsLib.shelljsMod.ExecFunction = js.native
  val exit: js.Function1[/* code */ js.UndefOr[scala.Double], scala.Nothing] = js.native
  val find: shelljsLib.shelljsMod.FindFunction = js.native
  val grep: shelljsLib.shelljsMod.GrepFunction = js.native
  val head: shelljsLib.shelljsMod.HeadFunction = js.native
  val ln: shelljsLib.shelljsMod.LinkFunction = js.native
  val ls: shelljsLib.shelljsMod.ListFunction = js.native
  val mkdir: shelljsLib.shelljsMod.MkdirFunction = js.native
  val mv: shelljsLib.shelljsMod.MoveFunction = js.native
  val popd: shelljsLib.shelljsMod.PopDirFunction = js.native
  val pushd: shelljsLib.shelljsMod.PushDirFunction = js.native
  val pwd: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val rm: shelljsLib.shelljsMod.RemoveFunction = js.native
  val sed: shelljsLib.shelljsMod.SedFunction = js.native
  val set: js.Function1[/* options */ java.lang.String, scala.Unit] = js.native
  val sort: shelljsLib.shelljsMod.SortFunction = js.native
  val tail: shelljsLib.shelljsMod.TailFunction = js.native
  val tempdir: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val touch: shelljsLib.shelljsMod.TouchFunction = js.native
  val uniq: shelljsLib.shelljsMod.UniqFunction = js.native
}

