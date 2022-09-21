package typings.rrdir

import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.Stats
import typings.picomatch.picomatchMod.PicomatchOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rrdir", JSImport.Namespace)
  @js.native
  val ^ : typings.rrdir.mod.rrdir = js.native
  
  trait Entry[T /* <: String | Buffer */] extends StObject {
    
    var directory: js.UndefOr[Boolean] = js.undefined
    
    var err: js.UndefOr[js.Error] = js.undefined
    
    var path: T
    
    var stats: js.UndefOr[Stats] = js.undefined
    
    var symlink: js.UndefOr[Boolean] = js.undefined
  }
  object Entry {
    
    inline def apply[T /* <: String | Buffer */](path: T): Entry[T] = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry[T]]
    }
    
    extension [Self <: Entry[?], T /* <: String | Buffer */](x: Self & Entry[T]) {
      
      inline def setDirectory(value: Boolean): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setPath(value: T): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setSymlink(value: Boolean): Self = StObject.set(x, "symlink", value.asInstanceOf[js.Any])
      
      inline def setSymlinkUndefined: Self = StObject.set(x, "symlink", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var followSymlinks: js.UndefOr[Boolean] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    var `match`: js.UndefOr[PicomatchOptions] = js.undefined
    
    var stats: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFollowSymlinks(value: Boolean): Self = StObject.set(x, "followSymlinks", value.asInstanceOf[js.Any])
      
      inline def setFollowSymlinksUndefined: Self = StObject.set(x, "followSymlinks", js.undefined)
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setMatch(value: PicomatchOptions): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setStats(value: Boolean): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type _To = typings.rrdir.mod.rrdir
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.rrdir.mod.rrdir = ^
  
  @js.native
  trait rrdir extends StObject {
    
    def apply(dir: String): AsyncIterable[Entry[String]] = js.native
    def apply(dir: String, options: Options): AsyncIterable[Entry[String]] = js.native
    def apply(dir: Buffer): AsyncIterable[Entry[Buffer]] = js.native
    def apply(dir: Buffer, options: Options): AsyncIterable[Entry[Buffer]] = js.native
    
    def async(dir: String): js.Promise[js.Array[Entry[String]]] = js.native
    def async(dir: String, options: Options): js.Promise[js.Array[Entry[String]]] = js.native
    def async(dir: Buffer): js.Promise[js.Array[Entry[Buffer]]] = js.native
    def async(dir: Buffer, options: Options): js.Promise[js.Array[Entry[Buffer]]] = js.native
    
    def sync(dir: String): js.Array[Entry[String]] = js.native
    def sync(dir: String, options: Options): js.Array[Entry[String]] = js.native
    def sync(dir: Buffer): js.Array[Entry[Buffer]] = js.native
    def sync(dir: Buffer, options: Options): js.Array[Entry[Buffer]] = js.native
  }
}
