package typings.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def cat: typings.shelljs.mod.CatFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("cat").asInstanceOf[typings.shelljs.mod.CatFunction]

inline def cd(): typings.shelljs.mod.ShellString = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cd")().asInstanceOf[typings.shelljs.mod.ShellString]
inline def cd(dir: java.lang.String): typings.shelljs.mod.ShellString = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cd")(dir.asInstanceOf[js.Any]).asInstanceOf[typings.shelljs.mod.ShellString]

inline def chmod: typings.shelljs.mod.ChmodFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("chmod").asInstanceOf[typings.shelljs.mod.ChmodFunction]

inline def config: typings.shelljs.mod.ShellConfig = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[typings.shelljs.mod.ShellConfig]

inline def cp: typings.shelljs.mod.CopyFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("cp").asInstanceOf[typings.shelljs.mod.CopyFunction]

inline def dirs: typings.shelljs.mod.DirsFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("dirs").asInstanceOf[typings.shelljs.mod.DirsFunction]

inline def echo: typings.shelljs.mod.EchoFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("echo").asInstanceOf[typings.shelljs.mod.EchoFunction]

inline def env: typings.node.processMod.global.NodeJS.ProcessEnv = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("env").asInstanceOf[typings.node.processMod.global.NodeJS.ProcessEnv]

inline def error(): typings.shelljs.mod.ShellString = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.shelljs.mod.ShellString]

inline def exec: typings.shelljs.mod.ExecFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("exec").asInstanceOf[typings.shelljs.mod.ExecFunction]

inline def exit(): scala.Nothing = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[scala.Nothing]
inline def exit(code: scala.Double): scala.Nothing = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("exit")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]

inline def find: typings.shelljs.mod.FindFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("find").asInstanceOf[typings.shelljs.mod.FindFunction]

inline def grep: typings.shelljs.mod.GrepFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("grep").asInstanceOf[typings.shelljs.mod.GrepFunction]

inline def head: typings.shelljs.mod.HeadFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("head").asInstanceOf[typings.shelljs.mod.HeadFunction]

inline def ln: typings.shelljs.mod.LinkFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ln").asInstanceOf[typings.shelljs.mod.LinkFunction]

inline def ls: typings.shelljs.mod.ListFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ls").asInstanceOf[typings.shelljs.mod.ListFunction]

inline def mkdir: typings.shelljs.mod.MkdirFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mkdir").asInstanceOf[typings.shelljs.mod.MkdirFunction]

inline def mv: typings.shelljs.mod.MoveFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mv").asInstanceOf[typings.shelljs.mod.MoveFunction]

inline def popd: typings.shelljs.mod.PopDirFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("popd").asInstanceOf[typings.shelljs.mod.PopDirFunction]

inline def pushd: typings.shelljs.mod.PushDirFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("pushd").asInstanceOf[typings.shelljs.mod.PushDirFunction]

inline def pwd(): typings.shelljs.mod.ShellString = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pwd")().asInstanceOf[typings.shelljs.mod.ShellString]

inline def rm: typings.shelljs.mod.RemoveFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("rm").asInstanceOf[typings.shelljs.mod.RemoveFunction]

inline def sed: typings.shelljs.mod.SedFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("sed").asInstanceOf[typings.shelljs.mod.SedFunction]

inline def set(options: java.lang.String): scala.Unit = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("set")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def sort: typings.shelljs.mod.SortFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("sort").asInstanceOf[typings.shelljs.mod.SortFunction]

inline def tail: typings.shelljs.mod.TailFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("tail").asInstanceOf[typings.shelljs.mod.TailFunction]

inline def tempdir(): typings.shelljs.mod.ShellString = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tempdir")().asInstanceOf[typings.shelljs.mod.ShellString]

inline def test(option: typings.shelljs.mod.TestOptions, path: java.lang.String): scala.Boolean = (typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("test")(option.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

inline def touch: typings.shelljs.mod.TouchFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("touch").asInstanceOf[typings.shelljs.mod.TouchFunction]

inline def uniq: typings.shelljs.mod.UniqFunction = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("uniq").asInstanceOf[typings.shelljs.mod.UniqFunction]

inline def which(command: java.lang.String): typings.shelljs.mod.ShellString = typings.shelljs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("which")(command.asInstanceOf[js.Any]).asInstanceOf[typings.shelljs.mod.ShellString]

type ExecCallback = js.Function3[
/* code */ scala.Double, 
/* stdout */ java.lang.String, 
/* stderr */ java.lang.String, 
js.Any]
