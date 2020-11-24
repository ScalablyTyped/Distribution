package typings.s3rver.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3rverBucketConfig extends js.Object {
  
  var configs: js.Array[Buffer | String] = js.native
  
  var name: String = js.native
}
object S3rverBucketConfig {
  
  @scala.inline
  def apply(configs: js.Array[Buffer | String], name: String): S3rverBucketConfig = {
    val __obj = js.Dynamic.literal(configs = configs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3rverBucketConfig]
  }
  
  @scala.inline
  implicit class S3rverBucketConfigOps[Self <: S3rverBucketConfig] (val x: Self) extends AnyVal {
    
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
    def setConfigsVarargs(value: (Buffer | String)*): Self = this.set("configs", js.Array(value :_*))
    
    @scala.inline
    def setConfigs(value: js.Array[Buffer | String]): Self = this.set("configs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
