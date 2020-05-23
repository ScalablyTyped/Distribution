package typings.shelljs.makeMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ProcessEnv
import typings.shelljs.mod.CatFunction
import typings.shelljs.mod.ChmodFunction
import typings.shelljs.mod.CopyFunction
import typings.shelljs.mod.DirsFunction
import typings.shelljs.mod.EchoFunction
import typings.shelljs.mod.ExecFunction
import typings.shelljs.mod.FindFunction
import typings.shelljs.mod.GrepFunction
import typings.shelljs.mod.HeadFunction
import typings.shelljs.mod.LinkFunction
import typings.shelljs.mod.ListFunction
import typings.shelljs.mod.MkdirFunction
import typings.shelljs.mod.MoveFunction
import typings.shelljs.mod.PopDirFunction
import typings.shelljs.mod.PushDirFunction
import typings.shelljs.mod.RemoveFunction
import typings.shelljs.mod.SedFunction
import typings.shelljs.mod.ShellConfig
import typings.shelljs.mod.ShellStringConstructor
import typings.shelljs.mod.SortFunction
import typings.shelljs.mod.TailFunction
import typings.shelljs.mod.TouchFunction
import typings.shelljs.mod.UniqFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  trait Target_ extends js.Object {
    var done: js.UndefOr[Boolean] = js.native
    var result: js.UndefOr[js.Any] = js.native
    def apply(args: js.Any*): Unit = js.native
  }
  
  val ShellString: ShellStringConstructor = js.native
  val cat: CatFunction = js.native
  val cd: js.Function1[/* dir */ js.UndefOr[String], typings.shelljs.mod.ShellString] = js.native
  val chmod: ChmodFunction = js.native
  val config: ShellConfig = js.native
  val cp: CopyFunction = js.native
  val dirs: DirsFunction = js.native
  val echo: EchoFunction = js.native
  val env: ProcessEnv = js.native
  val error: js.Function0[typings.shelljs.mod.ShellString] = js.native
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
  val pwd: js.Function0[typings.shelljs.mod.ShellString] = js.native
  val rm: RemoveFunction = js.native
  val sed: SedFunction = js.native
  val set: js.Function1[/* options */ String, Unit] = js.native
  val sort: SortFunction = js.native
  val tail: TailFunction = js.native
  val tempdir: js.Function0[typings.shelljs.mod.ShellString] = js.native
  val touch: TouchFunction = js.native
  val uniq: UniqFunction = js.native
  @js.native
  object target extends /* s */ StringDictionary[Target_] {
    var all: js.UndefOr[Target_] = js.native
  }
  
}

