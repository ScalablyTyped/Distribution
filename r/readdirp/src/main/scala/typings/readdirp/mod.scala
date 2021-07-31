package typings.readdirp

import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.fsMod.Dirent
import typings.node.fsMod.Stats
import typings.node.streamMod.Readable
import typings.readdirp.readdirpStrings.all
import typings.readdirp.readdirpStrings.directories
import typings.readdirp.readdirpStrings.files
import typings.readdirp.readdirpStrings.files_directories
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(root: String): ReaddirpStream = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[ReaddirpStream]
  @scala.inline
  def apply(root: String, options: ReaddirpOptions): ReaddirpStream = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReaddirpStream]
  
  @JSImport("readdirp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def promise(root: String): js.Promise[js.Array[EntryInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[EntryInfo]]]
  @scala.inline
  def promise(root: String, options: ReaddirpOptions): js.Promise[js.Array[EntryInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("promise")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[EntryInfo]]]
  
  trait EntryInfo extends StObject {
    
    var basename: String
    
    var dirent: js.UndefOr[Dirent] = js.undefined
    
    var fullPath: String
    
    var path: String
    
    var stats: js.UndefOr[Stats] = js.undefined
  }
  object EntryInfo {
    
    @scala.inline
    def apply(basename: String, fullPath: String, path: String): EntryInfo = {
      val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryInfo]
    }
    
    @scala.inline
    implicit class EntryInfoMutableBuilder[Self <: EntryInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirent(value: Dirent): Self = StObject.set(x, "dirent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirentUndefined: Self = StObject.set(x, "dirent", js.undefined)
      
      @scala.inline
      def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    }
  }
  
  trait ReaddirpOptions extends StObject {
    
    var alwaysStat: js.UndefOr[Boolean] = js.undefined
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var directoryFilter: js.UndefOr[String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])] = js.undefined
    
    var fileFilter: js.UndefOr[String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])] = js.undefined
    
    var lstat: js.UndefOr[Boolean] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[files | directories | files_directories | all] = js.undefined
  }
  object ReaddirpOptions {
    
    @scala.inline
    def apply(): ReaddirpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReaddirpOptions]
    }
    
    @scala.inline
    implicit class ReaddirpOptionsMutableBuilder[Self <: ReaddirpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysStat(value: Boolean): Self = StObject.set(x, "alwaysStat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysStatUndefined: Self = StObject.set(x, "alwaysStat", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setDirectoryFilter(value: String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])): Self = StObject.set(x, "directoryFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryFilterFunction1(value: /* entry */ EntryInfo => Boolean): Self = StObject.set(x, "directoryFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDirectoryFilterUndefined: Self = StObject.set(x, "directoryFilter", js.undefined)
      
      @scala.inline
      def setDirectoryFilterVarargs(value: String*): Self = StObject.set(x, "directoryFilter", js.Array(value :_*))
      
      @scala.inline
      def setFileFilter(value: String | js.Array[String] | (js.Function1[/* entry */ EntryInfo, Boolean])): Self = StObject.set(x, "fileFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileFilterFunction1(value: /* entry */ EntryInfo => Boolean): Self = StObject.set(x, "fileFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFileFilterUndefined: Self = StObject.set(x, "fileFilter", js.undefined)
      
      @scala.inline
      def setFileFilterVarargs(value: String*): Self = StObject.set(x, "fileFilter", js.Array(value :_*))
      
      @scala.inline
      def setLstat(value: Boolean): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setType(value: files | directories | files_directories | all): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ReaddirpStream
    extends Readable
       with AsyncIterable[EntryInfo] {
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
}
