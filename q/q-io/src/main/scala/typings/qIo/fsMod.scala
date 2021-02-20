package typings.qIo

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.q.mod.Promise
import typings.qIo.QioFS.Stats
import typings.qIo.anon.TypeofQioFS
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("q-io/fs", "absolute")
  @js.native
  def absolute(path: String): String = js.native
  
  @JSImport("q-io/fs", "append")
  @js.native
  def append(path: String, content: String): Promise[Unit] = js.native
  @JSImport("q-io/fs", "append")
  @js.native
  def append(path: String, content: String, options: js.Any): Promise[Unit] = js.native
  @JSImport("q-io/fs", "append")
  @js.native
  def append(path: String, content: Buffer): Promise[Unit] = js.native
  @JSImport("q-io/fs", "append")
  @js.native
  def append(path: String, content: Buffer, options: js.Any): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "base")
  @js.native
  def base(path: String, extension: String): String = js.native
  
  @JSImport("q-io/fs", "canonical")
  @js.native
  def canonical(path: String): Promise[String] = js.native
  
  @JSImport("q-io/fs", "chmod")
  @js.native
  def chmod(path: String): Promise[Unit] = js.native
  @JSImport("q-io/fs", "chmod")
  @js.native
  def chmod(path: String, mode: String): Promise[Unit] = js.native
  @JSImport("q-io/fs", "chmod")
  @js.native
  def chmod(path: String, mode: Double): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "chown")
  @js.native
  def chown(path: String, uid: Double, gid: Double): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "contains")
  @js.native
  def contains(parent: String, child: String): Boolean = js.native
  
  @JSImport("q-io/fs", "copy")
  @js.native
  def copy(source: String, target: String): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "copyTree")
  @js.native
  def copyTree(source: String, target: String): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "directory")
  @js.native
  def directory(path: String): String = js.native
  
  @JSImport("q-io/fs", "exists")
  @js.native
  def exists(path: String): Promise[Boolean] = js.native
  
  @JSImport("q-io/fs", "extension")
  @js.native
  def extension(path: String): String = js.native
  
  @JSImport("q-io/fs", "isAbsolute")
  @js.native
  def isAbsolute(path: String): Boolean = js.native
  
  @JSImport("q-io/fs", "isDirectory")
  @js.native
  def isDirectory(path: String): Promise[Boolean] = js.native
  
  @JSImport("q-io/fs", "isFile")
  @js.native
  def isFile(path: String): Promise[Boolean] = js.native
  
  @JSImport("q-io/fs", "isRelative")
  @js.native
  def isRelative(path: String): Boolean = js.native
  
  @JSImport("q-io/fs", "isRoot")
  @js.native
  def isRoot(path: String): Boolean = js.native
  
  @JSImport("q-io/fs", "isSymbolicLink")
  @js.native
  def isSymbolicLink(path: String): Promise[Boolean] = js.native
  
  @JSImport("q-io/fs", "join")
  @js.native
  def join(paths: String*): String = js.native
  @JSImport("q-io/fs", "join")
  @js.native
  def join(paths: js.Array[String]): String = js.native
  
  @JSImport("q-io/fs", "lastAccessed")
  @js.native
  def lastAccessed(path: String): Promise[Date] = js.native
  
  @JSImport("q-io/fs", "lastModified")
  @js.native
  def lastModified(path: String): Promise[Date] = js.native
  
  @JSImport("q-io/fs", "link")
  @js.native
  def link(source: String, target: js.Any): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "list")
  @js.native
  def list(path: String): Promise[js.Array[String]] = js.native
  
  @JSImport("q-io/fs", "listDirectoryTree")
  @js.native
  def listDirectoryTree(path: String): Promise[js.Array[String]] = js.native
  
  @JSImport("q-io/fs", "listTree")
  @js.native
  def listTree(path: String): Promise[js.Array[String]] = js.native
  @JSImport("q-io/fs", "listTree")
  @js.native
  def listTree(path: String, guard: js.Function2[/* path */ String, /* stat */ js.Any, Boolean]): Promise[js.Array[String]] = js.native
  
  @JSImport("q-io/fs", "makeDirectory")
  @js.native
  def makeDirectory(path: String): Promise[Unit] = js.native
  @JSImport("q-io/fs", "makeDirectory")
  @js.native
  def makeDirectory(path: String, mode: String): Promise[Unit] = js.native
  @JSImport("q-io/fs", "makeDirectory")
  @js.native
  def makeDirectory(path: String, mode: Double): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "makeTree")
  @js.native
  def makeTree(path: String): Promise[Unit] = js.native
  @JSImport("q-io/fs", "makeTree")
  @js.native
  def makeTree(path: String, mode: String): Promise[Unit] = js.native
  @JSImport("q-io/fs", "makeTree")
  @js.native
  def makeTree(path: String, mode: Double): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "move")
  @js.native
  def move(source: String, target: String): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "normal")
  @js.native
  def normal(path: String*): String = js.native
  @JSImport("q-io/fs", "normal")
  @js.native
  def normal(paths: js.Array[String]): String = js.native
  
  @JSImport("q-io/fs", "open")
  @js.native
  def open(path: String): Promise[_] = js.native
  @JSImport("q-io/fs", "open")
  @js.native
  def open(path: String, options: js.Any): Promise[_] = js.native
  
  @JSImport("q-io/fs", "read")
  @js.native
  def read(path: String): Promise[_] = js.native
  @JSImport("q-io/fs", "read")
  @js.native
  def read(path: String, options: js.Any): Promise[_] = js.native
  
  @JSImport("q-io/fs", "readLink")
  @js.native
  def readLink(path: String): Promise[String] = js.native
  
  @JSImport("q-io/fs", "relative")
  @js.native
  def relative(source: String, target: String): Promise[String] = js.native
  
  @JSImport("q-io/fs", "relativeFromDirectory")
  @js.native
  def relativeFromDirectory(source: String, target: String): String = js.native
  
  @JSImport("q-io/fs", "relativeFromFile")
  @js.native
  def relativeFromFile(source: String, target: String): String = js.native
  
  @JSImport("q-io/fs", "remove")
  @js.native
  def remove(path: String): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "removeTree")
  @js.native
  def removeTree(path: String): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "rename")
  @js.native
  def rename(source: String, target: String): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "reroot")
  @js.native
  def reroot(path: String): TypeofQioFS = js.native
  
  @JSImport("q-io/fs", "resolve")
  @js.native
  def resolve(path: String*): String = js.native
  @JSImport("q-io/fs", "resolve")
  @js.native
  def resolve(paths: js.Array[String]): String = js.native
  
  @JSImport("q-io/fs", "root")
  @js.native
  def root(path: String): String = js.native
  
  @JSImport("q-io/fs", "split")
  @js.native
  def split(path: String): js.Array[String] = js.native
  
  @JSImport("q-io/fs", "stat")
  @js.native
  def stat(path: String): Promise[Stats] = js.native
  
  @JSImport("q-io/fs", "statFd")
  @js.native
  def statFd(fd: Double): Promise[Stats] = js.native
  
  @JSImport("q-io/fs", "statLink")
  @js.native
  def statLink(path: String): Promise[Stats] = js.native
  
  @JSImport("q-io/fs", "symbolicCopy")
  @js.native
  def symbolicCopy(source: String, target: String, `type`: String): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "symbolicLink")
  @js.native
  def symbolicLink(target: String, link: String, `type`: String): Promise[Unit] = js.native
  
  @JSImport("q-io/fs", "toObject")
  @js.native
  def toObject(path: String): StringDictionary[Buffer] = js.native
  
  @JSImport("q-io/fs", "write")
  @js.native
  def write(path: String, content: String): Promise[Unit] = js.native
  @JSImport("q-io/fs", "write")
  @js.native
  def write(path: String, content: String, options: js.Any): Promise[Unit] = js.native
  @JSImport("q-io/fs", "write")
  @js.native
  def write(path: String, content: Buffer): Promise[Unit] = js.native
  @JSImport("q-io/fs", "write")
  @js.native
  def write(path: String, content: Buffer, options: js.Any): Promise[Unit] = js.native
}
