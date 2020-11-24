package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletedResult extends js.Object {
  
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
  implicit class CompletedResultOps[Self <: CompletedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt(value: String): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentid(value: String): Self = this.set("persistentid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSec(value: String): Self = this.set("sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvinfo(value: AvAudioInfo): Self = this.set("avinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvinfo: Self = this.set("avinfo", js.undefined)
    
    @scala.inline
    def setImageInfo(value: AvImageInfo): Self = this.set("imageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageInfo: Self = this.set("imageInfo", js.undefined)
  }
}
