package typings.shelljs.makeMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ProcessEnv
import typings.shelljs.makeMod.Global.Target
import typings.shelljs.shelljsMod.CatFunction
import typings.shelljs.shelljsMod.ChmodFunction
import typings.shelljs.shelljsMod.CopyFunction
import typings.shelljs.shelljsMod.DirsFunction
import typings.shelljs.shelljsMod.EchoFunction
import typings.shelljs.shelljsMod.ExecFunction
import typings.shelljs.shelljsMod.FindFunction
import typings.shelljs.shelljsMod.GrepFunction
import typings.shelljs.shelljsMod.HeadFunction
import typings.shelljs.shelljsMod.LinkFunction
import typings.shelljs.shelljsMod.ListFunction
import typings.shelljs.shelljsMod.MkdirFunction
import typings.shelljs.shelljsMod.MoveFunction
import typings.shelljs.shelljsMod.PopDirFunction
import typings.shelljs.shelljsMod.PushDirFunction
import typings.shelljs.shelljsMod.RemoveFunction
import typings.shelljs.shelljsMod.SedFunction
import typings.shelljs.shelljsMod.ShellConfig
import typings.shelljs.shelljsMod.ShellStringConstructor
import typings.shelljs.shelljsMod.SortFunction
import typings.shelljs.shelljsMod.TailFunction
import typings.shelljs.shelljsMod.TouchFunction
import typings.shelljs.shelljsMod.UniqFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  trait Target extends js.Object {
    var done: js.UndefOr[Boolean] = js.native
    var result: js.UndefOr[js.Any] = js.native
    def apply(args: js.Any*): Unit = js.native
  }
  
  val ShellString: ShellStringConstructor = js.native
  val cat: CatFunction = js.native
  val cd: js.Function1[/* dir */ js.UndefOr[String], typings.shelljs.shelljsMod.ShellString] = js.native
  val chmod: ChmodFunction = js.native
  val config: ShellConfig = js.native
  val cp: CopyFunction = js.native
  val dirs: DirsFunction = js.native
  val echo: EchoFunction = js.native
  val env: ProcessEnv = js.native
  val error: js.Function0[typings.shelljs.shelljsMod.ShellString] = js.native
  val exec: ExecFunction = js.native
  val exit: js.Function1[/* code */ js.UndefOr[Double], scala.Nothing] = js.native
  val find: FindFunction = js.native
  val grep: GrepFunction = js.native
  val head: HeadFunction = js.native
  val ln: LinkFunction = js.native
  val ls: ListFunction = js.native
  val mkdir: MkdirFunction = js.native
  val mv: MoveFunction = js.native
  val popd: PopDirFunction = js.native
  val pushd: PushDirFunction = js.native
  val pwd: js.Function0[typings.shelljs.shelljsMod.ShellString] = js.native
  val rm: RemoveFunction = js.native
  val sed: SedFunction = js.native
  val set: js.Function1[/* options */ String, Unit] = js.native
  val sort: SortFunction = js.native
  val tail: TailFunction = js.native
  val tempdir: js.Function0[typings.shelljs.shelljsMod.ShellString] = js.native
  val touch: TouchFunction = js.native
  val uniq: UniqFunction = js.native
  @js.native
  object target extends /* s */ StringDictionary[Target] {
    var all: js.UndefOr[Target] = js.native
  }
  
}

