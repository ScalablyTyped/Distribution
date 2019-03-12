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

object FsModule {
  @scala.inline
  def apply(
    absolute: java.lang.String => java.lang.String,
    base: java.lang.String => java.lang.String,
    basename: java.lang.String => java.lang.String,
    changeWorkingDirectory: java.lang.String => scala.Unit,
    copy: (java.lang.String, java.lang.String) => scala.Unit,
    copyTree: (java.lang.String, java.lang.String) => scala.Unit,
    directory: java.lang.String => java.lang.String,
    dirname: java.lang.String => java.lang.String,
    exists: java.lang.String => scala.Boolean,
    extension: (java.lang.String, scala.Boolean) => java.lang.String,
    isAbsolute: java.lang.String => scala.Boolean,
    isDirectory: java.lang.String => scala.Boolean,
    isExecutable: java.lang.String => scala.Boolean,
    isFile: java.lang.String => scala.Boolean,
    isLink: java.lang.String => scala.Boolean,
    isReadable: java.lang.String => scala.Boolean,
    isWritable: java.lang.String => scala.Boolean,
    join: (java.lang.String, java.lang.String, /* repeated */ java.lang.String) => java.lang.String,
    lastModified: java.lang.String => stdLib.Date,
    list: java.lang.String => js.Array[java.lang.String],
    makeDirectory: java.lang.String => scala.Unit,
    makeTree: java.lang.String => scala.Unit,
    mkpath: java.lang.String => scala.Unit,
    move: (java.lang.String, java.lang.String) => scala.Unit,
    open: (java.lang.String, Opts) => scala.Unit,
    read: (java.lang.String, java.lang.String) => java.lang.String,
    readLink: java.lang.String => java.lang.String,
    remove: java.lang.String => scala.Unit,
    removeDirectory: java.lang.String => scala.Unit,
    removeTree: java.lang.String => scala.Unit,
    rename: (java.lang.String, java.lang.String) => scala.Unit,
    rmdir: java.lang.String => scala.Unit,
    separator: java.lang.String,
    size: java.lang.String => scala.Double,
    split: java.lang.String => js.Array[java.lang.String],
    touch: (java.lang.String, stdLib.Date) => scala.Unit,
    workingDirectory: java.lang.String,
    write: (java.lang.String, js.Any, java.lang.String) => scala.Unit
  ): FsModule = {
    val __obj = js.Dynamic.literal(absolute = js.Any.fromFunction1(absolute), base = js.Any.fromFunction1(base), basename = js.Any.fromFunction1(basename), changeWorkingDirectory = js.Any.fromFunction1(changeWorkingDirectory), copy = js.Any.fromFunction2(copy), copyTree = js.Any.fromFunction2(copyTree), directory = js.Any.fromFunction1(directory), dirname = js.Any.fromFunction1(dirname), exists = js.Any.fromFunction1(exists), extension = js.Any.fromFunction2(extension), isAbsolute = js.Any.fromFunction1(isAbsolute), isDirectory = js.Any.fromFunction1(isDirectory), isExecutable = js.Any.fromFunction1(isExecutable), isFile = js.Any.fromFunction1(isFile), isLink = js.Any.fromFunction1(isLink), isReadable = js.Any.fromFunction1(isReadable), isWritable = js.Any.fromFunction1(isWritable), join = js.Any.fromFunction3(join), lastModified = js.Any.fromFunction1(lastModified), list = js.Any.fromFunction1(list), makeDirectory = js.Any.fromFunction1(makeDirectory), makeTree = js.Any.fromFunction1(makeTree), mkpath = js.Any.fromFunction1(mkpath), move = js.Any.fromFunction2(move), open = js.Any.fromFunction2(open), read = js.Any.fromFunction2(read), readLink = js.Any.fromFunction1(readLink), remove = js.Any.fromFunction1(remove), removeDirectory = js.Any.fromFunction1(removeDirectory), removeTree = js.Any.fromFunction1(removeTree), rename = js.Any.fromFunction2(rename), rmdir = js.Any.fromFunction1(rmdir), separator = separator, size = js.Any.fromFunction1(size), split = js.Any.fromFunction1(split), touch = js.Any.fromFunction2(touch), workingDirectory = workingDirectory, write = js.Any.fromFunction3(write))
  
    __obj.asInstanceOf[FsModule]
  }
}

