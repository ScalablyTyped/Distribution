package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FsModule extends StObject {
  
  def absolute(path: String): String
  
  def base(path: String): String
  
  def basename(path: String): String
  
  def changeWorkingDirectory(path: String): Unit
  
  def copy(source: String, target: String): Unit
  
  def copyTree(source: String, target: String): Unit
  
  def directory(path: String): String
  
  def dirname(path: String): String
  
  def exists(path: String): Boolean
  
  def `extension`(path: String, withoutdot: Boolean): String
  
  def isAbsolute(path: String): Boolean
  
  def isDirectory(path: String): Boolean
  
  def isExecutable(path: String): Boolean
  
  def isFile(path: String): Boolean
  
  def isLink(path: String): Boolean
  
  def isReadable(path: String): Boolean
  
  def isWritable(path: String): Boolean
  
  // last argument should be the filename
  def join(basepath: String, dirname: String, args: String*): String
  
  def lastModified(path: String): js.Date
  
  def list(path: String): js.Array[String]
  
  def makeDirectory(path: String): Unit
  
  def makeTree(path: String): Unit
  
  def mkpath(path: String): Unit
  
  def move(source: String, target: String): Unit
  
  def open(filename: String, opts: Opts): Unit
  
  def read(path: String, mode: String): String
  
  def readLink(path: String): String
  
  def remove(path: String): Unit
  
  def removeDirectory(path: String): Unit
  
  def removeTree(path: String): Unit
  
  def rename(path: String, newname: String): Unit
  
  def rmdir(path: String): Unit
  
  var separator: String
  
  def size(path: String): Double
  
  def split(path: String): js.Array[String]
  
  def touch(path: String, date: js.Date): Unit
  
  var workingDirectory: String
  
  /*
    Mode is a string that can contain character which describes a characteristic of the returned stream.
    If the string contains "r", the file is opened in read-only mode.
    "w" opens the file in write-only mode.
    "b" opens the file in binary mode. If "b" is not present, the file is
    opened in text mode, and its contents are assumed to be UTF-8.
    "a" means to open as "append" mode: the file is open in write-only mode and all written character are append to the file
    */
  def write(path: String, content: Any, mode: String): Unit
}
object FsModule {
  
  inline def apply(
    absolute: String => String,
    base: String => String,
    basename: String => String,
    changeWorkingDirectory: String => Unit,
    copy: (String, String) => Unit,
    copyTree: (String, String) => Unit,
    directory: String => String,
    dirname: String => String,
    exists: String => Boolean,
    `extension`: (String, Boolean) => String,
    isAbsolute: String => Boolean,
    isDirectory: String => Boolean,
    isExecutable: String => Boolean,
    isFile: String => Boolean,
    isLink: String => Boolean,
    isReadable: String => Boolean,
    isWritable: String => Boolean,
    join: (String, String, /* repeated */ String) => String,
    lastModified: String => js.Date,
    list: String => js.Array[String],
    makeDirectory: String => Unit,
    makeTree: String => Unit,
    mkpath: String => Unit,
    move: (String, String) => Unit,
    open: (String, Opts) => Unit,
    read: (String, String) => String,
    readLink: String => String,
    remove: String => Unit,
    removeDirectory: String => Unit,
    removeTree: String => Unit,
    rename: (String, String) => Unit,
    rmdir: String => Unit,
    separator: String,
    size: String => Double,
    split: String => js.Array[String],
    touch: (String, js.Date) => Unit,
    workingDirectory: String,
    write: (String, Any, String) => Unit
  ): FsModule = {
    val __obj = js.Dynamic.literal(absolute = js.Any.fromFunction1(absolute), base = js.Any.fromFunction1(base), basename = js.Any.fromFunction1(basename), changeWorkingDirectory = js.Any.fromFunction1(changeWorkingDirectory), copy = js.Any.fromFunction2(copy), copyTree = js.Any.fromFunction2(copyTree), directory = js.Any.fromFunction1(directory), dirname = js.Any.fromFunction1(dirname), exists = js.Any.fromFunction1(exists), isAbsolute = js.Any.fromFunction1(isAbsolute), isDirectory = js.Any.fromFunction1(isDirectory), isExecutable = js.Any.fromFunction1(isExecutable), isFile = js.Any.fromFunction1(isFile), isLink = js.Any.fromFunction1(isLink), isReadable = js.Any.fromFunction1(isReadable), isWritable = js.Any.fromFunction1(isWritable), join = js.Any.fromFunction3(join), lastModified = js.Any.fromFunction1(lastModified), list = js.Any.fromFunction1(list), makeDirectory = js.Any.fromFunction1(makeDirectory), makeTree = js.Any.fromFunction1(makeTree), mkpath = js.Any.fromFunction1(mkpath), move = js.Any.fromFunction2(move), open = js.Any.fromFunction2(open), read = js.Any.fromFunction2(read), readLink = js.Any.fromFunction1(readLink), remove = js.Any.fromFunction1(remove), removeDirectory = js.Any.fromFunction1(removeDirectory), removeTree = js.Any.fromFunction1(removeTree), rename = js.Any.fromFunction2(rename), rmdir = js.Any.fromFunction1(rmdir), separator = separator.asInstanceOf[js.Any], size = js.Any.fromFunction1(size), split = js.Any.fromFunction1(split), touch = js.Any.fromFunction2(touch), workingDirectory = workingDirectory.asInstanceOf[js.Any], write = js.Any.fromFunction3(write))
    __obj.updateDynamic("extension")(js.Any.fromFunction2(`extension`))
    __obj.asInstanceOf[FsModule]
  }
  
  extension [Self <: FsModule](x: Self) {
    
    inline def setAbsolute(value: String => String): Self = StObject.set(x, "absolute", js.Any.fromFunction1(value))
    
    inline def setBase(value: String => String): Self = StObject.set(x, "base", js.Any.fromFunction1(value))
    
    inline def setBasename(value: String => String): Self = StObject.set(x, "basename", js.Any.fromFunction1(value))
    
    inline def setChangeWorkingDirectory(value: String => Unit): Self = StObject.set(x, "changeWorkingDirectory", js.Any.fromFunction1(value))
    
    inline def setCopy(value: (String, String) => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
    
    inline def setCopyTree(value: (String, String) => Unit): Self = StObject.set(x, "copyTree", js.Any.fromFunction2(value))
    
    inline def setDirectory(value: String => String): Self = StObject.set(x, "directory", js.Any.fromFunction1(value))
    
    inline def setDirname(value: String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
    
    inline def setExists(value: String => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction1(value))
    
    inline def setExtension(value: (String, Boolean) => String): Self = StObject.set(x, "extension", js.Any.fromFunction2(value))
    
    inline def setIsAbsolute(value: String => Boolean): Self = StObject.set(x, "isAbsolute", js.Any.fromFunction1(value))
    
    inline def setIsDirectory(value: String => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction1(value))
    
    inline def setIsExecutable(value: String => Boolean): Self = StObject.set(x, "isExecutable", js.Any.fromFunction1(value))
    
    inline def setIsFile(value: String => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction1(value))
    
    inline def setIsLink(value: String => Boolean): Self = StObject.set(x, "isLink", js.Any.fromFunction1(value))
    
    inline def setIsReadable(value: String => Boolean): Self = StObject.set(x, "isReadable", js.Any.fromFunction1(value))
    
    inline def setIsWritable(value: String => Boolean): Self = StObject.set(x, "isWritable", js.Any.fromFunction1(value))
    
    inline def setJoin(value: (String, String, /* repeated */ String) => String): Self = StObject.set(x, "join", js.Any.fromFunction3(value))
    
    inline def setLastModified(value: String => js.Date): Self = StObject.set(x, "lastModified", js.Any.fromFunction1(value))
    
    inline def setList(value: String => js.Array[String]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    
    inline def setMakeDirectory(value: String => Unit): Self = StObject.set(x, "makeDirectory", js.Any.fromFunction1(value))
    
    inline def setMakeTree(value: String => Unit): Self = StObject.set(x, "makeTree", js.Any.fromFunction1(value))
    
    inline def setMkpath(value: String => Unit): Self = StObject.set(x, "mkpath", js.Any.fromFunction1(value))
    
    inline def setMove(value: (String, String) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
    
    inline def setOpen(value: (String, Opts) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
    
    inline def setRead(value: (String, String) => String): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
    
    inline def setReadLink(value: String => String): Self = StObject.set(x, "readLink", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveDirectory(value: String => Unit): Self = StObject.set(x, "removeDirectory", js.Any.fromFunction1(value))
    
    inline def setRemoveTree(value: String => Unit): Self = StObject.set(x, "removeTree", js.Any.fromFunction1(value))
    
    inline def setRename(value: (String, String) => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction2(value))
    
    inline def setRmdir(value: String => Unit): Self = StObject.set(x, "rmdir", js.Any.fromFunction1(value))
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
    
    inline def setSplit(value: String => js.Array[String]): Self = StObject.set(x, "split", js.Any.fromFunction1(value))
    
    inline def setTouch(value: (String, js.Date) => Unit): Self = StObject.set(x, "touch", js.Any.fromFunction2(value))
    
    inline def setWorkingDirectory(value: String): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: (String, Any, String) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction3(value))
  }
}
