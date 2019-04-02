package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shelljs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val cat: CatFunction = js.native
  val chmod: ChmodFunction = js.native
  val config: ShellConfig = js.native
  val cp: CopyFunction = js.native
  val dirs: DirsFunction = js.native
  val echo: EchoFunction = js.native
  val env: nodeLib.NodeJSNs.ProcessEnv = js.native
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
  def cd(): ShellString = js.native
  def cd(dir: java.lang.String): ShellString = js.native
  def error(): ShellString = js.native
  def exit(): scala.Nothing = js.native
  def exit(code: scala.Double): scala.Nothing = js.native
  def pwd(): ShellString = js.native
  def set(options: java.lang.String): scala.Unit = js.native
  def tempdir(): ShellString = js.native
  def test(option: TestOptions, path: java.lang.String): scala.Boolean = js.native
  def which(command: java.lang.String): ShellString = js.native
}

