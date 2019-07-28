package typings.shelljs.shelljsMod

import typings.node.NodeJSNs.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shelljs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ShellString: ShellStringConstructor = js.native
  val cat: CatFunction = js.native
  val chmod: ChmodFunction = js.native
  val config: ShellConfig = js.native
  val cp: CopyFunction = js.native
  val dirs: DirsFunction = js.native
  val echo: EchoFunction = js.native
  val env: ProcessEnv = js.native
  val exec: ExecFunction = js.native
  val find: FindFunction = js.native
  val grep: GrepFunction = js.native
  val head: HeadFunction = js.native
  val ln: LinkFunction = js.native
  val ls: ListFunction = js.native
  val mkdir: MkdirFunction = js.native
  val mv: MoveFunction = js.native
  val popd: PopDirFunction = js.native
  val pushd: PushDirFunction = js.native
  val rm: RemoveFunction = js.native
  val sed: SedFunction = js.native
  val sort: SortFunction = js.native
  val tail: TailFunction = js.native
  val touch: TouchFunction = js.native
  val uniq: UniqFunction = js.native
  def cd(): typings.shelljs.shelljsMod.ShellString = js.native
  def cd(dir: String): typings.shelljs.shelljsMod.ShellString = js.native
  def error(): typings.shelljs.shelljsMod.ShellString = js.native
  def exit(): scala.Nothing = js.native
  def exit(code: Double): scala.Nothing = js.native
  def pwd(): typings.shelljs.shelljsMod.ShellString = js.native
  def set(options: String): Unit = js.native
  def tempdir(): typings.shelljs.shelljsMod.ShellString = js.native
  def test(option: TestOptions, path: String): Boolean = js.native
  def which(command: String): typings.shelljs.shelljsMod.ShellString = js.native
}

