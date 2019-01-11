package typings
package shelljsLib.makeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  val cat: js.Function1[
    /* repeated */ java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
  val cd: js.Function1[/* dir */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  val chmod: shelljsLib.Anon_FileMode = js.native
  val config: shelljsLib.shelljsMod.ShellConfig = js.native
  val cp: shelljsLib.Anon_Dest = js.native
  val dirs: shelljsLib.Anon_C = js.native
  val echo: shelljsLib.Anon_OptionsText = js.native
  val error: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val exec: shelljsLib.Anon_Callback = js.native
  val exit: js.Function1[/* code */ scala.Double, scala.Unit] = js.native
  val find: js.Function1[
    /* repeated */ java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellArray
  ] = js.native
  val grep: shelljsLib.Anon_FilesOptions = js.native
  val head: shelljsLib.Anon_FilesOptionsArrayHeadOptions = js.native
  val ln: shelljsLib.Anon_DestOptions = js.native
  val ls: shelljsLib.Anon_Options = js.native
  val mkdir: shelljsLib.Anon_Dir = js.native
  val mv: shelljsLib.Anon_Dest = js.native
  val popd: shelljsLib.Anon_DirNOptions = js.native
  val pushd: shelljsLib.Anon_DirN = js.native
  val pwd: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val rm: shelljsLib.Anon_Files = js.native
  val sed: shelljsLib.Anon_File = js.native
  val set: js.Function1[/* options */ java.lang.String, scala.Unit] = js.native
  val sort: shelljsLib.Anon_FilesOptionsArrayShellString = js.native
  val tail: shelljsLib.Anon_FilesOptionsArrayShellStringString = js.native
  val target: shelljsLib.Anon_All = js.native
  val tempdir: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val touch: shelljsLib.Anon_FilesOptionsArray = js.native
  val uniq: shelljsLib.Anon_Input = js.native
}

