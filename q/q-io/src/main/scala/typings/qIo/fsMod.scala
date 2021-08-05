package typings.qIo

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.q.mod.Promise
import typings.qIo.QioFS.Stats
import typings.qIo.anon.TypeofQioFS
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("q-io/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def absolute(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def append(path: String, content: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  inline def append(path: String, content: String, options: js.Any): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  inline def append(path: String, content: Buffer): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  inline def append(path: String, content: Buffer, options: js.Any): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("append")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def base(path: String, `extension`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base")(path.asInstanceOf[js.Any], `extension`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def canonical(path: String): Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("canonical")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[String]]
  
  inline def chmod(path: String): Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Unit]]
  inline def chmod(path: String, mode: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  inline def chmod(path: String, mode: Double): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def chown(path: String, uid: Double, gid: Double): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def contains(parent: String, child: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def copy(source: String, target: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def copyTree(source: String, target: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyTree")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def directory(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("directory")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def exists(path: String): Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Boolean]]
  
  inline def `extension`(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extension")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAbsolute(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDirectory(path: String): Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectory")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Boolean]]
  
  inline def isFile(path: String): Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Boolean]]
  
  inline def isRelative(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRelative")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRoot(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRoot")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSymbolicLink(path: String): Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolicLink")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Boolean]]
  
  inline def join(paths: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def join(paths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lastAccessed(path: String): Promise[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastAccessed")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Date]]
  
  inline def lastModified(path: String): Promise[Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastModified")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Date]]
  
  inline def link(source: String, target: js.Any): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def list(path: String): Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Array[String]]]
  
  inline def listDirectoryTree(path: String): Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listDirectoryTree")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Array[String]]]
  
  inline def listTree(path: String): Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTree")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Array[String]]]
  inline def listTree(path: String, guard: js.Function2[/* path */ String, /* stat */ js.Any, Boolean]): Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listTree")(path.asInstanceOf[js.Any], guard.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Array[String]]]
  
  inline def makeDirectory(path: String): Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectory")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Unit]]
  inline def makeDirectory(path: String, mode: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectory")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  inline def makeDirectory(path: String, mode: Double): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeDirectory")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def makeTree(path: String): Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTree")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Unit]]
  inline def makeTree(path: String, mode: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTree")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  inline def makeTree(path: String, mode: Double): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTree")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def move(source: String, target: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def normal(path: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normal")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def normal(paths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normal")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def open(path: String): Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Any]]
  inline def open(path: String, options: js.Any): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
  
  inline def read(path: String): Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[js.Any]]
  inline def read(path: String, options: js.Any): Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[js.Any]]
  
  inline def readLink(path: String): Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readLink")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[String]]
  
  inline def relative(source: String, target: String): Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Promise[String]]
  
  inline def relativeFromDirectory(source: String, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeFromDirectory")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def relativeFromFile(source: String, target: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeFromFile")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def remove(path: String): Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Unit]]
  
  inline def removeTree(path: String): Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTree")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Unit]]
  
  inline def rename(source: String, target: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def reroot(path: String): TypeofQioFS = ^.asInstanceOf[js.Dynamic].applyDynamic("reroot")(path.asInstanceOf[js.Any]).asInstanceOf[TypeofQioFS]
  
  inline def resolve(path: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def resolve(paths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def root(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("root")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def split(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stat(path: String): Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Stats]]
  
  inline def statFd(fd: Double): Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("statFd")(fd.asInstanceOf[js.Any]).asInstanceOf[Promise[Stats]]
  
  inline def statLink(path: String): Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("statLink")(path.asInstanceOf[js.Any]).asInstanceOf[Promise[Stats]]
  
  inline def symbolicCopy(source: String, target: String, `type`: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolicCopy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def symbolicLink(target: String, link: String, `type`: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symbolicLink")(target.asInstanceOf[js.Any], link.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  
  inline def toObject(path: String): StringDictionary[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(path.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Buffer]]
  
  inline def write(path: String, content: String): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  inline def write(path: String, content: String, options: js.Any): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  inline def write(path: String, content: Buffer): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  inline def write(path: String, content: Buffer, options: js.Any): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(path.asInstanceOf[js.Any], content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
}
