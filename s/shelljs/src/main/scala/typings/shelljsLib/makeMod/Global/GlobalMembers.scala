package typings
package shelljsLib.makeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object GlobalMembers extends js.Object {
  val cat: js.Function1[
    /* repeated */ java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
  val cd: js.Function1[/* dir */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  val chmod: shelljsLib.Anon_OptionsMode = js.native
  val config: shelljsLib.shelljsMod.ShellConfig = js.native
  val cp: shelljsLib.Anon_OptionsSourceDest = js.native
  val dirs: shelljsLib.Anon_OptionsN = js.native
  val echo: shelljsLib.Anon_OptionsText = js.native
  val error: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val exec: shelljsLib.Anon_Command = js.native
  val exit: js.Function1[/* code */ scala.Double, scala.Unit] = js.native
  val find: js.Function1[
    /* repeated */ java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellArray
  ] = js.native
  val grep: shelljsLib.Anon_OptionsRegexfilter = js.native
  val head: shelljsLib.Anon_OptionsFilesHeadOptions = js.native
  val ln: shelljsLib.Anon_OptionsSource = js.native
  val ls: shelljsLib.Anon_OptionsPaths = js.native
  val mkdir: shelljsLib.Anon_OptionsDir = js.native
  val mv: shelljsLib.Anon_OptionsSourceDest = js.native
  val popd: shelljsLib.Anon_OptionsDirNString = js.native
  val pushd: shelljsLib.Anon_OptionsDirN = js.native
  val pwd: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val rm: shelljsLib.Anon_OptionsFilesString = js.native
  val sed: shelljsLib.Anon_Options = js.native
  val set: js.Function1[/* options */ java.lang.String, scala.Unit] = js.native
  val sort: shelljsLib.Anon_OptionsFilesStringArray = js.native
  val tail: shelljsLib.Anon_OptionsFilesTailOptions = js.native
  val target: shelljsLib.Anon_S = js.native
  val tempdir: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val touch: shelljsLib.Anon_OptionsFiles = js.native
  val uniq: shelljsLib.Anon_OptionsInput = js.native
}

