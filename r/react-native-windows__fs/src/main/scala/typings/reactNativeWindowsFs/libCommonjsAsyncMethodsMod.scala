package typings.reactNativeWindowsFs

import org.scalablytyped.runtime.Shortcut
import typings.node.fsMod.PathLike
import typings.reactNativeWindowsFs.anon.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonjsAsyncMethodsMod extends Shortcut {
  
  @JSImport("@react-native-windows/fs/lib-commonjs/asyncMethods", JSImport.Default)
  @js.native
  val default: AsyncMethods = js.native
  
  @js.native
  trait AsyncMethods
    extends StObject
       with PromisifedMethods
       with ExtraMethods
  
  @js.native
  trait ExtraMethods extends StObject {
    
    /**
      * Asynchronously tests whether or not the given path exists within the
      * file-system.
      * @param path A path to a file or directory.
      */
    def exists(path: PathLike): js.Promise[Boolean] = js.native
    
    def readJsonFile[T](path: Double): js.Promise[T] = js.native
    def readJsonFile[T](path: Double, options: Encoding): js.Promise[T] = js.native
    /**
      * Asynchronously reads the contents of a file, then parses it as JSON.
      *
      * By default the parsed JSON file is assumed to be a JSON object, with no
      * assumptions made about content (`Record<string, unknown`). If the type is
      * known at call-time, it can be passed to this function to alter the return
      * type.This type is not validated to be correct at runtime.
      *
      * E.g. `await fs.readJsonFile<Document>(documentPath)`;
      *
      * @param path A path to a file.
      * @param options Optional set of options
      * @param options.encoding The encoding of the JSON file (defaults to utf-8)
      * @param options.flag File access flags
      */
    def readJsonFile[T](path: PathLike): js.Promise[T] = js.native
    def readJsonFile[T](path: PathLike, options: Encoding): js.Promise[T] = js.native
  }
  
  trait PromisifedMethods extends StObject {
    
    var access: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.access.__promisify__ */ Any
    
    var appendFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.appendFile.__promisify__ */ Any
    
    var chmod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any
    
    var chown: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any
    
    var copyFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.copyFile.__promisify__ */ Any
    
    var lchmod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchmod.__promisify__ */ Any
    
    var lchown: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchown.__promisify__ */ Any
    
    var link: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.link.__promisify__ */ Any
    
    var lstat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lstat.__promisify__ */ Any
    
    var mkdir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any
    
    var mkdtemp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdtemp.__promisify__ */ Any
    
    var open: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ Any
    
    var opendir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.opendir.__promisify__ */ Any
    
    var readFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ Any
    
    var readdir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readdir.__promisify__ */ Any
    
    var readlink: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readlink.__promisify__ */ Any
    
    var realpath: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any
    
    var rename: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ Any
    
    var rmdir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rmdir.__promisify__ */ Any
    
    var stat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any
    
    var symlink: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.symlink.__promisify__ */ Any
    
    var truncate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.truncate.__promisify__ */ Any
    
    var unlink: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any
    
    var utimes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.utimes.__promisify__ */ Any
    
    var writeFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.writeFile.__promisify__ */ Any
  }
  object PromisifedMethods {
    
    inline def apply(
      access: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.access.__promisify__ */ Any,
      appendFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.appendFile.__promisify__ */ Any,
      chmod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any,
      chown: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any,
      copyFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.copyFile.__promisify__ */ Any,
      lchmod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchmod.__promisify__ */ Any,
      lchown: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchown.__promisify__ */ Any,
      link: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.link.__promisify__ */ Any,
      lstat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lstat.__promisify__ */ Any,
      mkdir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any,
      mkdtemp: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdtemp.__promisify__ */ Any,
      open: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ Any,
      opendir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.opendir.__promisify__ */ Any,
      readFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ Any,
      readdir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readdir.__promisify__ */ Any,
      readlink: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readlink.__promisify__ */ Any,
      realpath: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any,
      rename: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ Any,
      rmdir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rmdir.__promisify__ */ Any,
      stat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any,
      symlink: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.symlink.__promisify__ */ Any,
      truncate: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.truncate.__promisify__ */ Any,
      unlink: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any,
      utimes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.utimes.__promisify__ */ Any,
      writeFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.writeFile.__promisify__ */ Any
    ): PromisifedMethods = {
      val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any], appendFile = appendFile.asInstanceOf[js.Any], chmod = chmod.asInstanceOf[js.Any], chown = chown.asInstanceOf[js.Any], copyFile = copyFile.asInstanceOf[js.Any], lchmod = lchmod.asInstanceOf[js.Any], lchown = lchown.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], lstat = lstat.asInstanceOf[js.Any], mkdir = mkdir.asInstanceOf[js.Any], mkdtemp = mkdtemp.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], opendir = opendir.asInstanceOf[js.Any], readFile = readFile.asInstanceOf[js.Any], readdir = readdir.asInstanceOf[js.Any], readlink = readlink.asInstanceOf[js.Any], realpath = realpath.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any], rmdir = rmdir.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], symlink = symlink.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any], unlink = unlink.asInstanceOf[js.Any], utimes = utimes.asInstanceOf[js.Any], writeFile = writeFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromisifedMethods]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromisifedMethods] (val x: Self) extends AnyVal {
      
      inline def setAccess(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.access.__promisify__ */ Any
      ): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
      
      inline def setAppendFile(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.appendFile.__promisify__ */ Any
      ): Self = StObject.set(x, "appendFile", value.asInstanceOf[js.Any])
      
      inline def setChmod(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any
      ): Self = StObject.set(x, "chmod", value.asInstanceOf[js.Any])
      
      inline def setChown(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any
      ): Self = StObject.set(x, "chown", value.asInstanceOf[js.Any])
      
      inline def setCopyFile(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.copyFile.__promisify__ */ Any
      ): Self = StObject.set(x, "copyFile", value.asInstanceOf[js.Any])
      
      inline def setLchmod(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchmod.__promisify__ */ Any
      ): Self = StObject.set(x, "lchmod", value.asInstanceOf[js.Any])
      
      inline def setLchown(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchown.__promisify__ */ Any
      ): Self = StObject.set(x, "lchown", value.asInstanceOf[js.Any])
      
      inline def setLink(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.link.__promisify__ */ Any
      ): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLstat(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lstat.__promisify__ */ Any
      ): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      inline def setMkdir(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any
      ): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
      
      inline def setMkdtemp(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdtemp.__promisify__ */ Any
      ): Self = StObject.set(x, "mkdtemp", value.asInstanceOf[js.Any])
      
      inline def setOpen(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ Any
      ): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpendir(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.opendir.__promisify__ */ Any
      ): Self = StObject.set(x, "opendir", value.asInstanceOf[js.Any])
      
      inline def setReadFile(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ Any
      ): Self = StObject.set(x, "readFile", value.asInstanceOf[js.Any])
      
      inline def setReaddir(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readdir.__promisify__ */ Any
      ): Self = StObject.set(x, "readdir", value.asInstanceOf[js.Any])
      
      inline def setReadlink(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readlink.__promisify__ */ Any
      ): Self = StObject.set(x, "readlink", value.asInstanceOf[js.Any])
      
      inline def setRealpath(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any
      ): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRename(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ Any
      ): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
      
      inline def setRmdir(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rmdir.__promisify__ */ Any
      ): Self = StObject.set(x, "rmdir", value.asInstanceOf[js.Any])
      
      inline def setStat(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any
      ): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setSymlink(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.symlink.__promisify__ */ Any
      ): Self = StObject.set(x, "symlink", value.asInstanceOf[js.Any])
      
      inline def setTruncate(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.truncate.__promisify__ */ Any
      ): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setUnlink(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any
      ): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
      
      inline def setUtimes(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.utimes.__promisify__ */ Any
      ): Self = StObject.set(x, "utimes", value.asInstanceOf[js.Any])
      
      inline def setWriteFile(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.writeFile.__promisify__ */ Any
      ): Self = StObject.set(x, "writeFile", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = AsyncMethods
  
  /* This means you don't have to write `default`, but can instead just say `libCommonjsAsyncMethodsMod.foo` */
  override def _to: AsyncMethods = default
}
