package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResult extends StObject {
  
  var descrLink: String
  
  var fileName: String
  
  var fileSize: Double
  
  var fileUrl: String
  
  var nbLeechers: Double
  
  var nbSeeders: Double
  
  var siteUrl: String
}
object SearchResult {
  
  inline def apply(
    descrLink: String,
    fileName: String,
    fileSize: Double,
    fileUrl: String,
    nbLeechers: Double,
    nbSeeders: Double,
    siteUrl: String
  ): SearchResult = {
    val __obj = js.Dynamic.literal(descrLink = descrLink.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fileUrl = fileUrl.asInstanceOf[js.Any], nbLeechers = nbLeechers.asInstanceOf[js.Any], nbSeeders = nbSeeders.asInstanceOf[js.Any], siteUrl = siteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  extension [Self <: SearchResult](x: Self) {
    
    inline def setDescrLink(value: String): Self = StObject.set(x, "descrLink", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setFileUrl(value: String): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
    
    inline def setNbLeechers(value: Double): Self = StObject.set(x, "nbLeechers", value.asInstanceOf[js.Any])
    
    inline def setNbSeeders(value: Double): Self = StObject.set(x, "nbSeeders", value.asInstanceOf[js.Any])
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
  }
}
