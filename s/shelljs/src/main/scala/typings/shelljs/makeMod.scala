package typings.shelljs

import typings.node.processMod.global.NodeJS.ProcessEnv
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeMod {
  
  object global {
    
    /* was `typeof shelljs.ShellString` */
    @JSGlobal("ShellString")
    @js.native
    val ShellString: ShellStringConstructor = js.native
    
    /* was `typeof shelljs.cat` */
    @JSGlobal("cat")
    @js.native
    val cat: CatFunction = js.native
    
    /* was `typeof shelljs.cd` */
    @JSGlobal("cd")
    @js.native
    def cd(): typings.shelljs.mod.ShellString = js.native
    @JSGlobal("cd")
    @js.native
    def cd(dir: String): typings.shelljs.mod.ShellString = js.native
    
    /* was `typeof shelljs.chmod` */
    @JSGlobal("chmod")
    @js.native
    val chmod: ChmodFunction = js.native
    
    /* was `typeof shelljs.config` */
    @JSGlobal("config")
    @js.native
    val config: ShellConfig = js.native
    
    /* was `typeof shelljs.cp` */
    @JSGlobal("cp")
    @js.native
    val cp: CopyFunction = js.native
    
    /* was `typeof shelljs.dirs` */
    @JSGlobal("dirs")
    @js.native
    val dirs: DirsFunction = js.native
    
    /* was `typeof shelljs.echo` */
    @JSGlobal("echo")
    @js.native
    val echo: EchoFunction = js.native
    
    /* was `typeof shelljs.env` */
    @JSGlobal("env")
    @js.native
    val env: ProcessEnv = js.native
    
    /* was `typeof shelljs.error` */
    @JSGlobal("error")
    @js.native
    def error(): typings.shelljs.mod.ShellString = js.native
    
    /* was `typeof shelljs.exec` */
    @JSGlobal("exec")
    @js.native
    val exec: ExecFunction = js.native
    
    /* was `typeof shelljs.exit` */
    @JSGlobal("exit")
    @js.native
    def exit(): scala.Nothing = js.native
    @JSGlobal("exit")
    @js.native
    def exit(code: Double): scala.Nothing = js.native
    
    /* was `typeof shelljs.find` */
    @JSGlobal("find")
    @js.native
    val find: FindFunction = js.native
    
    /* was `typeof shelljs.grep` */
    @JSGlobal("grep")
    @js.native
    val grep: GrepFunction = js.native
    
    /* was `typeof shelljs.head` */
    @JSGlobal("head")
    @js.native
    val head: HeadFunction = js.native
    
    /* was `typeof shelljs.ln` */
    @JSGlobal("ln")
    @js.native
    val ln: LinkFunction = js.native
    
    /* was `typeof shelljs.ls` */
    @JSGlobal("ls")
    @js.native
    val ls: ListFunction = js.native
    
    /* was `typeof shelljs.mkdir` */
    @JSGlobal("mkdir")
    @js.native
    val mkdir: MkdirFunction = js.native
    
    /* was `typeof shelljs.mv` */
    @JSGlobal("mv")
    @js.native
    val mv: MoveFunction = js.native
    
    /* was `typeof shelljs.popd` */
    @JSGlobal("popd")
    @js.native
    val popd: PopDirFunction = js.native
    
    /* was `typeof shelljs.pushd` */
    @JSGlobal("pushd")
    @js.native
    val pushd: PushDirFunction = js.native
    
    /* was `typeof shelljs.pwd` */
    @JSGlobal("pwd")
    @js.native
    def pwd(): typings.shelljs.mod.ShellString = js.native
    
    /* was `typeof shelljs.rm` */
    @JSGlobal("rm")
    @js.native
    val rm: RemoveFunction = js.native
    
    /* was `typeof shelljs.sed` */
    @JSGlobal("sed")
    @js.native
    val sed: SedFunction = js.native
    
    /* was `typeof shelljs.set` */
    @JSGlobal("set")
    @js.native
    def set(options: String): Unit = js.native
    
    /* was `typeof shelljs.sort` */
    @JSGlobal("sort")
    @js.native
    val sort: SortFunction = js.native
    
    /* was `typeof shelljs.tail` */
    @JSGlobal("tail")
    @js.native
    val tail: TailFunction = js.native
    
    object target {
      
      @JSGlobal("target")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("target.all")
      @js.native
      def all: js.UndefOr[Target_] = js.native
      @scala.inline
      def all_=(x: js.UndefOr[Target_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    }
    
    /* was `typeof shelljs.tempdir` */
    @JSGlobal("tempdir")
    @js.native
    def tempdir(): typings.shelljs.mod.ShellString = js.native
    
    /* was `typeof shelljs.touch` */
    @JSGlobal("touch")
    @js.native
    val touch: TouchFunction = js.native
    
    /* was `typeof shelljs.uniq` */
    @JSGlobal("uniq")
    @js.native
    val uniq: UniqFunction = js.native
    
    @js.native
    trait Target_ extends StObject {
      
      def apply(args: js.Any*): Unit = js.native
      
      var done: js.UndefOr[Boolean] = js.native
      
      var result: js.UndefOr[js.Any] = js.native
    }
  }
}
