package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletedResult extends StObject {
  
  var avinfo: js.UndefOr[AvAudioInfo] = js.undefined
  
  var bucket: String
  
  var ext: String
  
  var imageInfo: js.UndefOr[AvImageInfo] = js.undefined
  
  var key: String
  
  var name: String
  
  var persistentid: String
  
  var sec: String
  
  var size: Double
}
object CompletedResult {
  
  inline def apply(
    bucket: String,
    ext: String,
    key: String,
    name: String,
    persistentid: String,
    sec: String,
    size: Double
  ): CompletedResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], persistentid = persistentid.asInstanceOf[js.Any], sec = sec.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedResult]
  }
  
  extension [Self <: CompletedResult](x: Self) {
    
    inline def setAvinfo(value: AvAudioInfo): Self = StObject.set(x, "avinfo", value.asInstanceOf[js.Any])
    
    inline def setAvinfoUndefined: Self = StObject.set(x, "avinfo", js.undefined)
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setImageInfo(value: AvImageInfo): Self = StObject.set(x, "imageInfo", value.asInstanceOf[js.Any])
    
    inline def setImageInfoUndefined: Self = StObject.set(x, "imageInfo", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPersistentid(value: String): Self = StObject.set(x, "persistentid", value.asInstanceOf[js.Any])
    
    inline def setSec(value: String): Self = StObject.set(x, "sec", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
