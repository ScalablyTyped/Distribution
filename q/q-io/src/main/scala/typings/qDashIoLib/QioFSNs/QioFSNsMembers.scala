package typings
package qDashIoLib.QioFSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("QioFS")
@js.native
object QioFSNsMembers extends js.Object {
  def absolute(path: java.lang.String): java.lang.String = js.native
  def append(path: java.lang.String, content: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def append(path: java.lang.String, content: java.lang.String, options: js.Any): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def append(path: java.lang.String, content: nodeLib.Buffer): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def append(path: java.lang.String, content: nodeLib.Buffer, options: js.Any): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def base(path: java.lang.String, extension: java.lang.String): java.lang.String = js.native
  def canonical(path: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
  def chmod(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def chmod(path: java.lang.String, mode: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def chmod(path: java.lang.String, mode: scala.Double): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def contains(parent: java.lang.String, child: java.lang.String): scala.Boolean = js.native
  def copy(source: java.lang.String, target: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def copyTree(source: java.lang.String, target: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def directory(path: java.lang.String): java.lang.String = js.native
  def exists(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def extension(path: java.lang.String): java.lang.String = js.native
  def isAbsolute(path: java.lang.String): scala.Boolean = js.native
  def isDirectory(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def isFile(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def isRelative(path: java.lang.String): scala.Boolean = js.native
  def isRoot(path: java.lang.String): scala.Boolean = js.native
  def isSymbolicLink(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Boolean] = js.native
  def join(paths: java.lang.String*): java.lang.String = js.native
  def join(paths: js.Array[java.lang.String]): java.lang.String = js.native
  def lastAccessed(path: java.lang.String): qLib.qMod.QNs.Promise[stdLib.Date] = js.native
  def lastModified(path: java.lang.String): qLib.qMod.QNs.Promise[stdLib.Date] = js.native
  def link(source: java.lang.String, target: js.Any): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def list(path: java.lang.String): qLib.qMod.QNs.Promise[js.Array[java.lang.String]] = js.native
  def listDirectoryTree(path: java.lang.String): qLib.qMod.QNs.Promise[js.Array[java.lang.String]] = js.native
  def listTree(path: java.lang.String): qLib.qMod.QNs.Promise[js.Array[java.lang.String]] = js.native
  def listTree(
    path: java.lang.String,
    guard: js.Function2[/* path */ java.lang.String, /* stat */ js.Any, scala.Boolean]
  ): qLib.qMod.QNs.Promise[js.Array[java.lang.String]] = js.native
  def makeDirectory(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def makeDirectory(path: java.lang.String, mode: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def makeDirectory(path: java.lang.String, mode: scala.Double): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def makeTree(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def makeTree(path: java.lang.String, mode: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def makeTree(path: java.lang.String, mode: scala.Double): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def move(source: java.lang.String, target: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def normal(path: java.lang.String*): java.lang.String = js.native
  def normal(paths: js.Array[java.lang.String]): java.lang.String = js.native
  def open(path: java.lang.String): qLib.qMod.QNs.Promise[_] = js.native
  def open(path: java.lang.String, options: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def read(path: java.lang.String): qLib.qMod.QNs.Promise[_] = js.native
  def read(path: java.lang.String, options: js.Any): qLib.qMod.QNs.Promise[_] = js.native
  def readLink(path: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
  def relative(source: java.lang.String, target: java.lang.String): qLib.qMod.QNs.Promise[java.lang.String] = js.native
  def relativeFromDirectory(source: java.lang.String, target: java.lang.String): java.lang.String = js.native
  def relativeFromFile(source: java.lang.String, target: java.lang.String): java.lang.String = js.native
  def remove(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def removeTree(path: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def rename(source: java.lang.String, target: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def reroot(path: java.lang.String): js.Object = js.native
  def resolve(path: java.lang.String*): java.lang.String = js.native
  def resolve(paths: js.Array[java.lang.String]): java.lang.String = js.native
  def root(path: java.lang.String): java.lang.String = js.native
  def split(path: java.lang.String): js.Array[java.lang.String] = js.native
  def stat(path: java.lang.String): qLib.qMod.QNs.Promise[Stats] = js.native
  def statFd(fd: scala.Double): qLib.qMod.QNs.Promise[Stats] = js.native
  def statLink(path: java.lang.String): qLib.qMod.QNs.Promise[Stats] = js.native
  def symbolicCopy(source: java.lang.String, target: java.lang.String, `type`: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def symbolicLink(target: java.lang.String, link: java.lang.String, `type`: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def toObject(path: java.lang.String): org.scalablytyped.runtime.StringDictionary[nodeLib.Buffer] = js.native
  def write(path: java.lang.String, content: java.lang.String): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def write(path: java.lang.String, content: java.lang.String, options: js.Any): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def write(path: java.lang.String, content: nodeLib.Buffer): qLib.qMod.QNs.Promise[scala.Unit] = js.native
  def write(path: java.lang.String, content: nodeLib.Buffer, options: js.Any): qLib.qMod.QNs.Promise[scala.Unit] = js.native
}

