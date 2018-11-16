package typings
package slimerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FsModule extends js.Object {
  var separator: java.lang.String
  var workingDirectory: java.lang.String
  def absolute(path: java.lang.String): java.lang.String
  def base(path: java.lang.String): java.lang.String
  def basename(path: java.lang.String): java.lang.String
  def changeWorkingDirectory(path: java.lang.String): scala.Unit
  def copy(source: java.lang.String, target: java.lang.String): scala.Unit
  def copyTree(source: java.lang.String, target: java.lang.String): scala.Unit
  def directory(path: java.lang.String): java.lang.String
  def dirname(path: java.lang.String): java.lang.String
  def exists(path: java.lang.String): scala.Boolean
  def extension(path: java.lang.String, withoutdot: scala.Boolean): java.lang.String
  def isAbsolute(path: java.lang.String): scala.Boolean
  def isDirectory(path: java.lang.String): scala.Boolean
  def isExecutable(path: java.lang.String): scala.Boolean
  def isFile(path: java.lang.String): scala.Boolean
  def isLink(path: java.lang.String): scala.Boolean
  def isReadable(path: java.lang.String): scala.Boolean
  def isWritable(path: java.lang.String): scala.Boolean
  // last argument should be the filename
  def join(basepath: java.lang.String, dirname: java.lang.String, args: java.lang.String*): java.lang.String
  def lastModified(path: java.lang.String): stdLib.Date
  def list(path: java.lang.String): js.Array[java.lang.String]
  def makeDirectory(path: java.lang.String): scala.Unit
  def makeTree(path: java.lang.String): scala.Unit
  def mkpath(path: java.lang.String): scala.Unit
  def move(source: java.lang.String, target: java.lang.String): scala.Unit
  def open(filename: java.lang.String, opts: Opts): scala.Unit
  def read(path: java.lang.String, mode: java.lang.String): java.lang.String
  def readLink(path: java.lang.String): java.lang.String
  def remove(path: java.lang.String): scala.Unit
  def removeDirectory(path: java.lang.String): scala.Unit
  def removeTree(path: java.lang.String): scala.Unit
  def rename(path: java.lang.String, newname: java.lang.String): scala.Unit
  def rmdir(path: java.lang.String): scala.Unit
  def size(path: java.lang.String): scala.Double
  def split(path: java.lang.String): js.Array[java.lang.String]
  def touch(path: java.lang.String, date: stdLib.Date): scala.Unit
  /*
        Mode is a string that can contain character which describes a characteristic of the returned stream.
        If the string contains "r", the file is opened in read-only mode.
        "w" opens the file in write-only mode.
        "b" opens the file in binary mode. If "b" is not present, the file is
            opened in text mode, and its contents are assumed to be UTF-8.
        "a" means to open as "append" mode: the file is open in write-only mode and all written character are append to the file
      */
  def write(path: java.lang.String, content: js.Any, mode: java.lang.String): scala.Unit
}

