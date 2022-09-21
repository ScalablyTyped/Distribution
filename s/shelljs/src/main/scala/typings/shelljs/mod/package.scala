package typings.shelljs.mod

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.shelljs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def cat: CatFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("cat").asInstanceOf[CatFunction]

inline def cd(): ShellString = ^.asInstanceOf[js.Dynamic].applyDynamic("cd")().asInstanceOf[ShellString]
inline def cd(dir: String): ShellString = ^.asInstanceOf[js.Dynamic].applyDynamic("cd")(dir.asInstanceOf[js.Any]).asInstanceOf[ShellString]

inline def chmod: ChmodFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("chmod").asInstanceOf[ChmodFunction]

inline def config: ShellConfig = ^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[ShellConfig]

inline def cp: CopyFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("cp").asInstanceOf[CopyFunction]

inline def dirs: DirsFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("dirs").asInstanceOf[DirsFunction]

inline def echo: EchoFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("echo").asInstanceOf[EchoFunction]

inline def env: ProcessEnv = ^.asInstanceOf[js.Dynamic].selectDynamic("env").asInstanceOf[ProcessEnv]

inline def error(): ShellString = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[ShellString]

inline def exec: ExecFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("exec").asInstanceOf[ExecFunction]

inline def exit(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")().asInstanceOf[scala.Nothing]
inline def exit(code: Double): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("exit")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]

inline def find: FindFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("find").asInstanceOf[FindFunction]

inline def grep: GrepFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("grep").asInstanceOf[GrepFunction]

inline def head: HeadFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("head").asInstanceOf[HeadFunction]

inline def ln: LinkFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("ln").asInstanceOf[LinkFunction]

inline def ls: ListFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("ls").asInstanceOf[ListFunction]

inline def mkdir: MkdirFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("mkdir").asInstanceOf[MkdirFunction]

inline def mv: MoveFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("mv").asInstanceOf[MoveFunction]

inline def popd: PopDirFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("popd").asInstanceOf[PopDirFunction]

inline def pushd: PushDirFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("pushd").asInstanceOf[PushDirFunction]

inline def pwd(): ShellString = ^.asInstanceOf[js.Dynamic].applyDynamic("pwd")().asInstanceOf[ShellString]

inline def rm: RemoveFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("rm").asInstanceOf[RemoveFunction]

inline def sed: SedFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("sed").asInstanceOf[SedFunction]

inline def set(options: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def sort: SortFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("sort").asInstanceOf[SortFunction]

inline def tail: TailFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("tail").asInstanceOf[TailFunction]

inline def tempdir(): ShellString = ^.asInstanceOf[js.Dynamic].applyDynamic("tempdir")().asInstanceOf[ShellString]

inline def test(option: TestOptions, path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(option.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def touch: TouchFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("touch").asInstanceOf[TouchFunction]

inline def uniq: UniqFunction = ^.asInstanceOf[js.Dynamic].selectDynamic("uniq").asInstanceOf[UniqFunction]

inline def which(command: String): ShellString | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("which")(command.asInstanceOf[js.Any]).asInstanceOf[ShellString | Null]

type ExecCallback = js.Function3[/* code */ Double, /* stdout */ String, /* stderr */ String, Any]
