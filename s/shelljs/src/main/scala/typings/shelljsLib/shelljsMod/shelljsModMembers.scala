package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shelljs", JSImport.Namespace)
@js.native
object shelljsModMembers extends js.Object {
  val config: ShellConfig = js.native
  def cat(files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def cd(): scala.Unit = js.native
  def cd(dir: java.lang.String): scala.Unit = js.native
  def chmod(mode: java.lang.String, file: java.lang.String): scala.Unit = js.native
  def chmod(octalMode: scala.Double, file: java.lang.String): scala.Unit = js.native
  def chmod(options: java.lang.String, mode: java.lang.String, file: java.lang.String): scala.Unit = js.native
  def chmod(options: java.lang.String, octalMode: scala.Double, file: java.lang.String): scala.Unit = js.native
  def cp(options: java.lang.String, source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def cp(options: java.lang.String, source: js.Array[java.lang.String], dest: java.lang.String): scala.Unit = js.native
  def cp(source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def cp(source: js.Array[java.lang.String], dest: java.lang.String): scala.Unit = js.native
  def dirs(options: java.lang.String): js.Any = js.native
  @JSName("dirs")
  def `dirs_+N`(options: shelljsLib.shelljsLibStrings.`+N`): ShellString = js.native
  @JSName("dirs")
  def `dirs_-N`(options: shelljsLib.shelljsLibStrings.`-N`): ShellString = js.native
  @JSName("dirs")
  def `dirs_-c`(options: shelljsLib.shelljsLibStrings.`-c`): ShellArray = js.native
  def echo(options: java.lang.String, text: java.lang.String*): ShellString = js.native
  def echo(text: java.lang.String*): ShellString = js.native
  def error(): ShellString = js.native
  def exec(command: java.lang.String): ExecOutputReturnValue = js.native
  def exec(command: java.lang.String, callback: ExecCallback): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(command: java.lang.String, options: ExecOptions): ExecOutputReturnValue | nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(command: java.lang.String, options: ExecOptions, callback: ExecCallback): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exit(code: scala.Double): scala.Unit = js.native
  def find(path: (java.lang.String | js.Array[java.lang.String])*): ShellArray = js.native
  def grep(
    options: java.lang.String,
    regex_filter: java.lang.String,
    files: (java.lang.String | js.Array[java.lang.String])*
  ): ShellString = js.native
  def grep(
    options: java.lang.String,
    regex_filter: stdLib.RegExp,
    files: (java.lang.String | js.Array[java.lang.String])*
  ): ShellString = js.native
  def grep(regex_filter: java.lang.String, files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def grep(regex_filter: stdLib.RegExp, files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def head(files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def head(options: HeadOptions, files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def ln(options: java.lang.String, source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def ln(source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def ls(options: java.lang.String, paths: (java.lang.String | js.Array[java.lang.String])*): ShellArray = js.native
  def ls(paths: (java.lang.String | js.Array[java.lang.String])*): ShellArray = js.native
  def mkdir(dir: (java.lang.String | js.Array[java.lang.String])*): scala.Unit = js.native
  def mkdir(options: java.lang.String, dir: (java.lang.String | js.Array[java.lang.String])*): scala.Unit = js.native
  def mv(options: java.lang.String, source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def mv(options: java.lang.String, source: js.Array[java.lang.String], dest: java.lang.String): scala.Unit = js.native
  def mv(source: java.lang.String, dest: java.lang.String): scala.Unit = js.native
  def mv(source: js.Array[java.lang.String], dest: java.lang.String): scala.Unit = js.native
  def popd(): ShellArray = js.native
  def popd(dir: java.lang.String): ShellArray = js.native
  def popd(options: java.lang.String, dir: java.lang.String): ShellArray = js.native
  @JSName("popd")
  def `popd_+N`(dir: shelljsLib.shelljsLibStrings.`+N`): ShellArray = js.native
  @JSName("popd")
  def `popd_+N`(options: java.lang.String, dir: shelljsLib.shelljsLibStrings.`+N`): ShellArray = js.native
  @JSName("popd")
  def `popd_-N`(dir: shelljsLib.shelljsLibStrings.`-N`): ShellArray = js.native
  @JSName("popd")
  def `popd_-N`(options: java.lang.String, dir: shelljsLib.shelljsLibStrings.`-N`): ShellArray = js.native
  def pushd(dir: java.lang.String): ShellArray = js.native
  def pushd(options: java.lang.String, dir: java.lang.String): ShellArray = js.native
  @JSName("pushd")
  def `pushd_+N`(dir: shelljsLib.shelljsLibStrings.`+N`): ShellArray = js.native
  @JSName("pushd")
  def `pushd_+N`(options: java.lang.String, dir: shelljsLib.shelljsLibStrings.`+N`): ShellArray = js.native
  @JSName("pushd")
  def `pushd_-N`(dir: shelljsLib.shelljsLibStrings.`-N`): ShellArray = js.native
  @JSName("pushd")
  def `pushd_-N`(options: java.lang.String, dir: shelljsLib.shelljsLibStrings.`-N`): ShellArray = js.native
  def pwd(): ShellString = js.native
  def rm(files: (java.lang.String | js.Array[java.lang.String])*): scala.Unit = js.native
  def rm(options: java.lang.String, files: (java.lang.String | js.Array[java.lang.String])*): scala.Unit = js.native
  def sed(
    options: java.lang.String,
    searchRegex: java.lang.String,
    replacement: java.lang.String,
    file: java.lang.String
  ): ShellString = js.native
  def sed(
    options: java.lang.String,
    searchRegex: stdLib.RegExp,
    replacement: java.lang.String,
    file: java.lang.String
  ): ShellString = js.native
  def sed(searchRegex: java.lang.String, replacement: java.lang.String, file: java.lang.String): ShellString = js.native
  def sed(searchRegex: stdLib.RegExp, replacement: java.lang.String, file: java.lang.String): ShellString = js.native
  def set(options: java.lang.String): scala.Unit = js.native
  def sort(files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def sort(options: java.lang.String, files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def tail(files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def tail(options: TailOptions, files: (java.lang.String | js.Array[java.lang.String])*): ShellString = js.native
  def tempdir(): ShellString = js.native
  def test(option: TestOptions, path: java.lang.String): scala.Boolean = js.native
  def touch(files: java.lang.String*): scala.Unit = js.native
  def touch(files: js.Array[java.lang.String]): scala.Unit = js.native
  def touch(options: TouchOptionsArray, files: (java.lang.String | js.Array[java.lang.String])*): scala.Unit = js.native
  def touch(options: TouchOptionsLiteral, files: (java.lang.String | js.Array[java.lang.String])*): scala.Unit = js.native
  def uniq(input: java.lang.String): ShellString = js.native
  def uniq(input: java.lang.String, output: java.lang.String): ShellString = js.native
  def uniq(options: java.lang.String, input: java.lang.String, output: java.lang.String): ShellString = js.native
  def which(command: java.lang.String): ShellString = js.native
}

