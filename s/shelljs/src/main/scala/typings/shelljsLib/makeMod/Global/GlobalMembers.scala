package typings
package shelljsLib.makeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object GlobalMembers extends js.Object {
  val cat: js.Function1[
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
  val cd: js.Function1[/* dir */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  val chmod: js.Function3[
    /* options */ java.lang.String, 
    /* mode */ java.lang.String, 
    /* file */ java.lang.String, 
    scala.Unit
  ] = js.native
  val config: shelljsLib.shelljsMod.ShellConfig = js.native
  val cp: js.Function3[
    /* options */ java.lang.String, 
    /* source */ java.lang.String | js.Array[java.lang.String], 
    /* dest */ java.lang.String, 
    scala.Unit
  ] = js.native
  val dirs: js.Function1[/* options */ java.lang.String, js.Any] = js.native
  val echo: js.Function2[
    /* options */ java.lang.String, 
    /* repeated */java.lang.String, 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
  val error: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val exec: js.Function2[
    /* command */ java.lang.String, 
    /* callback */ shelljsLib.shelljsMod.ExecCallback, 
    nodeLib.childUnderscoreProcessMod.ChildProcess
  ] = js.native
  val exit: js.Function1[/* code */ scala.Double, scala.Unit] = js.native
  val find: js.Function1[
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellArray
  ] = js.native
  val grep: js.Function3[
    /* options */ java.lang.String, 
    /* regex_filter */ java.lang.String | stdLib.RegExp, 
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
  val head: js.Function2[
    /* options */ shelljsLib.shelljsMod.HeadOptions, 
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
  val ln: js.Function3[
    /* options */ java.lang.String, 
    /* source */ java.lang.String, 
    /* dest */ java.lang.String, 
    scala.Unit
  ] = js.native
  val ls: js.Function2[
    /* options */ java.lang.String, 
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellArray
  ] = js.native
  val mkdir: js.Function2[
    /* options */ java.lang.String, 
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    scala.Unit
  ] = js.native
  val mv: js.Function3[
    /* options */ java.lang.String, 
    /* source */ java.lang.String | js.Array[java.lang.String], 
    /* dest */ java.lang.String, 
    scala.Unit
  ] = js.native
  val popd: js.Function2[
    /* options */ java.lang.String, 
    /* dir */ java.lang.String, 
    shelljsLib.shelljsMod.ShellArray
  ] = js.native
  val pushd: js.Function2[
    /* options */ java.lang.String, 
    /* dir */ java.lang.String, 
    shelljsLib.shelljsMod.ShellArray
  ] = js.native
  val pwd: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val rm: js.Function2[
    /* options */ java.lang.String, 
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    scala.Unit
  ] = js.native
  val sed: js.Function4[
    /* options */ java.lang.String, 
    /* searchRegex */ java.lang.String | stdLib.RegExp, 
    /* replacement */ java.lang.String, 
    /* file */ java.lang.String, 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
  val set: js.Function1[/* options */ java.lang.String, scala.Unit] = js.native
  val sort: js.Function2[
    /* options */ java.lang.String, 
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
  val tail: js.Function2[
    /* options */ shelljsLib.shelljsMod.TailOptions, 
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
  val target: shelljsLib.Anon_S = js.native
  val tempdir: js.Function0[shelljsLib.shelljsMod.ShellString] = js.native
  val touch: js.Function2[
    /* options */ shelljsLib.shelljsMod.TouchOptionsArray, 
    /* repeated */java.lang.String | js.Array[java.lang.String], 
    scala.Unit
  ] = js.native
  val uniq: js.Function3[
    /* options */ java.lang.String, 
    /* input */ java.lang.String, 
    /* output */ js.UndefOr[java.lang.String], 
    shelljsLib.shelljsMod.ShellString
  ] = js.native
}

