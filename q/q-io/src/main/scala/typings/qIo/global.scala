package typings.qIo

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.q.mod.Promise
import typings.qIo.QioFS.Stats
import typings.qIo.QioHTTP.Request
import typings.qIo.QioHTTP.Response
import typings.qIo.anon.TypeofQioFS
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  //TODO add support for q-io/http-apps
  //TODO add verified support for q-io/fs-mock
  //TODO fix Readers/Writers properly
  //TODO find solution for overloaded return types (QioFS.open/QioFS.read)
  //     for some ideas see https://typescript.codeplex.com/discussions/461587#post1105930
  object QioFS {
    
    @JSGlobal("QioFS.absolute")
    @js.native
    def absolute(path: String): String = js.native
    
    @JSGlobal("QioFS.append")
    @js.native
    def append(path: String, content: String): Promise[Unit] = js.native
    @JSGlobal("QioFS.append")
    @js.native
    def append(path: String, content: String, options: js.Any): Promise[Unit] = js.native
    @JSGlobal("QioFS.append")
    @js.native
    def append(path: String, content: Buffer): Promise[Unit] = js.native
    @JSGlobal("QioFS.append")
    @js.native
    def append(path: String, content: Buffer, options: js.Any): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.base")
    @js.native
    def base(path: String, extension: String): String = js.native
    
    @JSGlobal("QioFS.canonical")
    @js.native
    def canonical(path: String): Promise[String] = js.native
    
    @JSGlobal("QioFS.chmod")
    @js.native
    def chmod(path: String): Promise[Unit] = js.native
    @JSGlobal("QioFS.chmod")
    @js.native
    def chmod(path: String, mode: String): Promise[Unit] = js.native
    @JSGlobal("QioFS.chmod")
    @js.native
    def chmod(path: String, mode: Double): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.chown")
    @js.native
    def chown(path: String, uid: Double, gid: Double): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.contains")
    @js.native
    def contains(parent: String, child: String): Boolean = js.native
    
    @JSGlobal("QioFS.copy")
    @js.native
    def copy(source: String, target: String): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.copyTree")
    @js.native
    def copyTree(source: String, target: String): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.directory")
    @js.native
    def directory(path: String): String = js.native
    
    @JSGlobal("QioFS.exists")
    @js.native
    def exists(path: String): Promise[Boolean] = js.native
    
    @JSGlobal("QioFS.extension")
    @js.native
    def extension(path: String): String = js.native
    
    @JSGlobal("QioFS.isAbsolute")
    @js.native
    def isAbsolute(path: String): Boolean = js.native
    
    @JSGlobal("QioFS.isDirectory")
    @js.native
    def isDirectory(path: String): Promise[Boolean] = js.native
    
    @JSGlobal("QioFS.isFile")
    @js.native
    def isFile(path: String): Promise[Boolean] = js.native
    
    @JSGlobal("QioFS.isRelative")
    @js.native
    def isRelative(path: String): Boolean = js.native
    
    @JSGlobal("QioFS.isRoot")
    @js.native
    def isRoot(path: String): Boolean = js.native
    
    @JSGlobal("QioFS.isSymbolicLink")
    @js.native
    def isSymbolicLink(path: String): Promise[Boolean] = js.native
    
    @JSGlobal("QioFS.join")
    @js.native
    def join(paths: String*): String = js.native
    @JSGlobal("QioFS.join")
    @js.native
    def join(paths: js.Array[String]): String = js.native
    
    @JSGlobal("QioFS.lastAccessed")
    @js.native
    def lastAccessed(path: String): Promise[Date] = js.native
    
    @JSGlobal("QioFS.lastModified")
    @js.native
    def lastModified(path: String): Promise[Date] = js.native
    
    @JSGlobal("QioFS.link")
    @js.native
    def link(source: String, target: js.Any): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.list")
    @js.native
    def list(path: String): Promise[js.Array[String]] = js.native
    
    @JSGlobal("QioFS.listDirectoryTree")
    @js.native
    def listDirectoryTree(path: String): Promise[js.Array[String]] = js.native
    
    @JSGlobal("QioFS.listTree")
    @js.native
    def listTree(path: String): Promise[js.Array[String]] = js.native
    @JSGlobal("QioFS.listTree")
    @js.native
    def listTree(path: String, guard: js.Function2[/* path */ String, /* stat */ js.Any, Boolean]): Promise[js.Array[String]] = js.native
    
    @JSGlobal("QioFS.makeDirectory")
    @js.native
    def makeDirectory(path: String): Promise[Unit] = js.native
    @JSGlobal("QioFS.makeDirectory")
    @js.native
    def makeDirectory(path: String, mode: String): Promise[Unit] = js.native
    @JSGlobal("QioFS.makeDirectory")
    @js.native
    def makeDirectory(path: String, mode: Double): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.makeTree")
    @js.native
    def makeTree(path: String): Promise[Unit] = js.native
    @JSGlobal("QioFS.makeTree")
    @js.native
    def makeTree(path: String, mode: String): Promise[Unit] = js.native
    @JSGlobal("QioFS.makeTree")
    @js.native
    def makeTree(path: String, mode: Double): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.move")
    @js.native
    def move(source: String, target: String): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.normal")
    @js.native
    def normal(path: String*): String = js.native
    @JSGlobal("QioFS.normal")
    @js.native
    def normal(paths: js.Array[String]): String = js.native
    
    @JSGlobal("QioFS.open")
    @js.native
    def open(path: String): Promise[_] = js.native
    @JSGlobal("QioFS.open")
    @js.native
    def open(path: String, options: js.Any): Promise[_] = js.native
    
    @JSGlobal("QioFS.read")
    @js.native
    def read(path: String): Promise[_] = js.native
    @JSGlobal("QioFS.read")
    @js.native
    def read(path: String, options: js.Any): Promise[_] = js.native
    
    @JSGlobal("QioFS.readLink")
    @js.native
    def readLink(path: String): Promise[String] = js.native
    
    @JSGlobal("QioFS.relative")
    @js.native
    def relative(source: String, target: String): Promise[String] = js.native
    
    @JSGlobal("QioFS.relativeFromDirectory")
    @js.native
    def relativeFromDirectory(source: String, target: String): String = js.native
    
    @JSGlobal("QioFS.relativeFromFile")
    @js.native
    def relativeFromFile(source: String, target: String): String = js.native
    
    @JSGlobal("QioFS.remove")
    @js.native
    def remove(path: String): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.removeTree")
    @js.native
    def removeTree(path: String): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.rename")
    @js.native
    def rename(source: String, target: String): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.reroot")
    @js.native
    def reroot(path: String): TypeofQioFS = js.native
    
    @JSGlobal("QioFS.resolve")
    @js.native
    def resolve(path: String*): String = js.native
    @JSGlobal("QioFS.resolve")
    @js.native
    def resolve(paths: js.Array[String]): String = js.native
    
    @JSGlobal("QioFS.root")
    @js.native
    def root(path: String): String = js.native
    
    @JSGlobal("QioFS.split")
    @js.native
    def split(path: String): js.Array[String] = js.native
    
    @JSGlobal("QioFS.stat")
    @js.native
    def stat(path: String): Promise[Stats] = js.native
    
    @JSGlobal("QioFS.statFd")
    @js.native
    def statFd(fd: Double): Promise[Stats] = js.native
    
    @JSGlobal("QioFS.statLink")
    @js.native
    def statLink(path: String): Promise[Stats] = js.native
    
    @JSGlobal("QioFS.symbolicCopy")
    @js.native
    def symbolicCopy(source: String, target: String, `type`: String): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.symbolicLink")
    @js.native
    def symbolicLink(target: String, link: String, `type`: String): Promise[Unit] = js.native
    
    @JSGlobal("QioFS.toObject")
    @js.native
    def toObject(path: String): StringDictionary[Buffer] = js.native
    
    @JSGlobal("QioFS.write")
    @js.native
    def write(path: String, content: String): Promise[Unit] = js.native
    @JSGlobal("QioFS.write")
    @js.native
    def write(path: String, content: String, options: js.Any): Promise[Unit] = js.native
    @JSGlobal("QioFS.write")
    @js.native
    def write(path: String, content: Buffer): Promise[Unit] = js.native
    @JSGlobal("QioFS.write")
    @js.native
    def write(path: String, content: Buffer, options: js.Any): Promise[Unit] = js.native
  }
  
  object QioHTTP {
    
    @JSGlobal("QioHTTP.normalizeRequest")
    @js.native
    def normalizeRequest(request: Request): Request = js.native
    @JSGlobal("QioHTTP.normalizeRequest")
    @js.native
    def normalizeRequest(url: String): Request = js.native
    
    @JSGlobal("QioHTTP.normalizeResponse")
    @js.native
    def normalizeResponse(response: Response): Response = js.native
    
    @JSGlobal("QioHTTP.read")
    @js.native
    def read(request: Request): Promise[String] = js.native
    @JSGlobal("QioHTTP.read")
    @js.native
    def read(url: String): Promise[String] = js.native
    
    @JSGlobal("QioHTTP.request")
    @js.native
    def request(request: Request): Promise[Response] = js.native
    @JSGlobal("QioHTTP.request")
    @js.native
    def request(url: String): Promise[Response] = js.native
  }
}
