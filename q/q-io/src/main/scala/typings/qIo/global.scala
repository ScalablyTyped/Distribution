package typings.qIo

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.q.mod.Promise
import typings.qIo.QioFS.Stats
import typings.qIo.QioHTTP.Request
import typings.qIo.QioHTTP.Response
import typings.qIo.anon.TypeofQioFS
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  //TODO add support for q-io/http-apps
  //TODO add verified support for q-io/fs-mock
  //TODO fix Readers/Writers properly
  //TODO find solution for overloaded return types (QioFS.open/QioFS.read)
  //     for some ideas see https://typescript.codeplex.com/discussions/461587#post1105930
  @js.native
  object QioFS extends js.Object {
    
    def absolute(path: String): String = js.native
    
    def append(path: String, content: String): Promise[Unit] = js.native
    def append(path: String, content: String, options: js.Any): Promise[Unit] = js.native
    def append(path: String, content: Buffer): Promise[Unit] = js.native
    def append(path: String, content: Buffer, options: js.Any): Promise[Unit] = js.native
    
    def base(path: String, extension: String): String = js.native
    
    def canonical(path: String): Promise[String] = js.native
    
    def chmod(path: String): Promise[Unit] = js.native
    def chmod(path: String, mode: String): Promise[Unit] = js.native
    def chmod(path: String, mode: Double): Promise[Unit] = js.native
    
    def chown(path: String, uid: Double, gid: Double): Promise[Unit] = js.native
    
    def contains(parent: String, child: String): Boolean = js.native
    
    def copy(source: String, target: String): Promise[Unit] = js.native
    
    def copyTree(source: String, target: String): Promise[Unit] = js.native
    
    def directory(path: String): String = js.native
    
    def exists(path: String): Promise[Boolean] = js.native
    
    def extension(path: String): String = js.native
    
    def isAbsolute(path: String): Boolean = js.native
    
    def isDirectory(path: String): Promise[Boolean] = js.native
    
    def isFile(path: String): Promise[Boolean] = js.native
    
    def isRelative(path: String): Boolean = js.native
    
    def isRoot(path: String): Boolean = js.native
    
    def isSymbolicLink(path: String): Promise[Boolean] = js.native
    
    def join(paths: String*): String = js.native
    def join(paths: js.Array[String]): String = js.native
    
    def lastAccessed(path: String): Promise[Date] = js.native
    
    def lastModified(path: String): Promise[Date] = js.native
    
    def link(source: String, target: js.Any): Promise[Unit] = js.native
    
    def list(path: String): Promise[js.Array[String]] = js.native
    
    def listDirectoryTree(path: String): Promise[js.Array[String]] = js.native
    
    def listTree(path: String): Promise[js.Array[String]] = js.native
    def listTree(path: String, guard: js.Function2[/* path */ String, /* stat */ js.Any, Boolean]): Promise[js.Array[String]] = js.native
    
    def makeDirectory(path: String): Promise[Unit] = js.native
    def makeDirectory(path: String, mode: String): Promise[Unit] = js.native
    def makeDirectory(path: String, mode: Double): Promise[Unit] = js.native
    
    def makeTree(path: String): Promise[Unit] = js.native
    def makeTree(path: String, mode: String): Promise[Unit] = js.native
    def makeTree(path: String, mode: Double): Promise[Unit] = js.native
    
    def move(source: String, target: String): Promise[Unit] = js.native
    
    def normal(path: String*): String = js.native
    def normal(paths: js.Array[String]): String = js.native
    
    def open(path: String): Promise[_] = js.native
    def open(path: String, options: js.Any): Promise[_] = js.native
    
    def read(path: String): Promise[_] = js.native
    def read(path: String, options: js.Any): Promise[_] = js.native
    
    def readLink(path: String): Promise[String] = js.native
    
    def relative(source: String, target: String): Promise[String] = js.native
    
    def relativeFromDirectory(source: String, target: String): String = js.native
    
    def relativeFromFile(source: String, target: String): String = js.native
    
    def remove(path: String): Promise[Unit] = js.native
    
    def removeTree(path: String): Promise[Unit] = js.native
    
    def rename(source: String, target: String): Promise[Unit] = js.native
    
    def reroot(path: String): TypeofQioFS = js.native
    
    def resolve(path: String*): String = js.native
    def resolve(paths: js.Array[String]): String = js.native
    
    def root(path: String): String = js.native
    
    def split(path: String): js.Array[String] = js.native
    
    def stat(path: String): Promise[Stats] = js.native
    
    def statFd(fd: Double): Promise[Stats] = js.native
    
    def statLink(path: String): Promise[Stats] = js.native
    
    def symbolicCopy(source: String, target: String, `type`: String): Promise[Unit] = js.native
    
    def symbolicLink(target: String, link: String, `type`: String): Promise[Unit] = js.native
    
    def toObject(path: String): StringDictionary[Buffer] = js.native
    
    def write(path: String, content: String): Promise[Unit] = js.native
    def write(path: String, content: String, options: js.Any): Promise[Unit] = js.native
    def write(path: String, content: Buffer): Promise[Unit] = js.native
    def write(path: String, content: Buffer, options: js.Any): Promise[Unit] = js.native
  }
  
  @js.native
  object QioHTTP extends js.Object {
    
    def normalizeRequest(request: Request): Request = js.native
    def normalizeRequest(url: String): Request = js.native
    
    def normalizeResponse(response: Response): Response = js.native
    
    def read(request: Request): Promise[String] = js.native
    def read(url: String): Promise[String] = js.native
    
    def request(request: Request): Promise[Response] = js.native
    def request(url: String): Promise[Response] = js.native
  }
}
