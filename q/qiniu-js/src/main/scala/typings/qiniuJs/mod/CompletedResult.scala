package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletedResult extends StObject {
  
  var avinfo: js.UndefOr[AvAudioInfo] = js.native
  
  var bucket: String = js.native
  
  var ext: String = js.native
  
  var imageInfo: js.UndefOr[AvImageInfo] = js.native
  
  var key: String = js.native
  
  var name: String = js.native
  
  var persistentid: String = js.native
  
  var sec: String = js.native
  
  var size: Double = js.native
}
object CompletedResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CompletedResultMutableBuilder[Self <: CompletedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvinfo(value: AvAudioInfo): Self = StObject.set(x, "avinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvinfoUndefined: Self = StObject.set(x, "avinfo", js.undefined)
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageInfo(value: AvImageInfo): Self = StObject.set(x, "imageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageInfoUndefined: Self = StObject.set(x, "imageInfo", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentid(value: String): Self = StObject.set(x, "persistentid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSec(value: String): Self = StObject.set(x, "sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
