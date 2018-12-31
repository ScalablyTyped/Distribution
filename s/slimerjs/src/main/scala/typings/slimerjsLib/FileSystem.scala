package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystem extends js.Object {
  // Properties
  var separator: java.lang.String = js.native
  var workingDirectory: java.lang.String = js.native
  def absolute(path: java.lang.String): java.lang.String = js.native
  // Directory Functions
  def changeWorkingDirectory(path: java.lang.String): scala.Unit = js.native
  def copy(source: java.lang.String, destination: java.lang.String): scala.Unit = js.native
  def copyTree(source: java.lang.String, destination: java.lang.String): scala.Unit = js.native
  def exists(path: java.lang.String): scala.Boolean = js.native
  def isAbsolute(path: java.lang.String): scala.Boolean = js.native
  def isDirectory(path: java.lang.String): scala.Boolean = js.native
  def isExecutable(path: java.lang.String): scala.Boolean = js.native
  def isFile(path: java.lang.String): scala.Boolean = js.native
  def isLink(path: java.lang.String): scala.Boolean = js.native
  def isReadable(path: java.lang.String): scala.Boolean = js.native
  def isWritable(path: java.lang.String): scala.Boolean = js.native
  // Functions
  // Query Functions
  def list(path: java.lang.String): js.Array[java.lang.String] = js.native
  def makeDirectory(path: java.lang.String): scala.Unit = js.native
  def makeTree(path: java.lang.String): scala.Unit = js.native
  def move(source: java.lang.String, destination: java.lang.String): scala.Unit = js.native
  // File Functions
  // open(path: string, mode: string): IStream;
  // open(path: string, options: { mode: string; charset?: string; }): IStream;
  def open(path: java.lang.String, mode: java.lang.String): Stream = js.native
  def open(path: java.lang.String, mode: Anon_Charset): Stream = js.native
  def read(path: java.lang.String): java.lang.String = js.native
  def readLink(path: java.lang.String): java.lang.String = js.native
  def remove(path: java.lang.String): scala.Unit = js.native
  def removeDirectory(path: java.lang.String): scala.Unit = js.native
  def removeTree(path: java.lang.String): scala.Unit = js.native
  def size(path: java.lang.String): scala.Double = js.native
  def touch(path: java.lang.String): scala.Unit = js.native
  def write(path: java.lang.String, content: java.lang.String, mode: java.lang.String): scala.Unit = js.native
}

