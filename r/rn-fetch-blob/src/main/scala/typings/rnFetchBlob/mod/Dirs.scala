package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dirs extends StObject {
  
  var CacheDir: String
  
  var DCIMDir: String
  
  var DocumentDir: String
  
  var DownloadDir: String
  
  var MainBundleDir: String
  
  var MovieDir: String
  
  var MusicDir: String
  
  var PictureDir: String
  
  var SDCardDir: String
}
object Dirs {
  
  @scala.inline
  def apply(
    CacheDir: String,
    DCIMDir: String,
    DocumentDir: String,
    DownloadDir: String,
    MainBundleDir: String,
    MovieDir: String,
    MusicDir: String,
    PictureDir: String,
    SDCardDir: String
  ): Dirs = {
    val __obj = js.Dynamic.literal(CacheDir = CacheDir.asInstanceOf[js.Any], DCIMDir = DCIMDir.asInstanceOf[js.Any], DocumentDir = DocumentDir.asInstanceOf[js.Any], DownloadDir = DownloadDir.asInstanceOf[js.Any], MainBundleDir = MainBundleDir.asInstanceOf[js.Any], MovieDir = MovieDir.asInstanceOf[js.Any], MusicDir = MusicDir.asInstanceOf[js.Any], PictureDir = PictureDir.asInstanceOf[js.Any], SDCardDir = SDCardDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dirs]
  }
  
  @scala.inline
  implicit class DirsMutableBuilder[Self <: Dirs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheDir(value: String): Self = StObject.set(x, "CacheDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDCIMDir(value: String): Self = StObject.set(x, "DCIMDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDir(value: String): Self = StObject.set(x, "DocumentDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadDir(value: String): Self = StObject.set(x, "DownloadDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainBundleDir(value: String): Self = StObject.set(x, "MainBundleDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovieDir(value: String): Self = StObject.set(x, "MovieDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMusicDir(value: String): Self = StObject.set(x, "MusicDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureDir(value: String): Self = StObject.set(x, "PictureDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSDCardDir(value: String): Self = StObject.set(x, "SDCardDir", value.asInstanceOf[js.Any])
  }
}
