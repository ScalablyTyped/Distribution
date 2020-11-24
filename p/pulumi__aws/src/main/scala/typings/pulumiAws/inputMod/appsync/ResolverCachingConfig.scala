package typings.pulumiAws.inputMod.appsync

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverCachingConfig extends js.Object {
  
  /**
    * The list of caching key.
    */
  var cachingKeys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The TTL in seconds.
    */
  var ttl: js.UndefOr[Input[Double]] = js.native
}
object ResolverCachingConfig {
  
  @scala.inline
  def apply(): ResolverCachingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverCachingConfig]
  }
  
  @scala.inline
  implicit class ResolverCachingConfigOps[Self <: ResolverCachingConfig] (val x: Self) extends AnyVal {
    
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
    def setCachingKeysVarargs(value: Input[String]*): Self = this.set("cachingKeys", js.Array(value :_*))
    
    @scala.inline
    def setCachingKeys(value: Input[js.Array[Input[String]]]): Self = this.set("cachingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachingKeys: Self = this.set("cachingKeys", js.undefined)
    
    @scala.inline
    def setTtl(value: Input[Double]): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
