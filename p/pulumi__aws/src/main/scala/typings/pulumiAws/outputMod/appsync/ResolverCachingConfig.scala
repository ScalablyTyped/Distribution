package typings.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverCachingConfig extends js.Object {
  /**
    * The list of caching key.
    */
  var cachingKeys: js.UndefOr[js.Array[String]] = js.native
  /**
    * The TTL in seconds.
    */
  var ttl: js.UndefOr[Double] = js.native
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
    def setCachingKeysVarargs(value: String*): Self = this.set("cachingKeys", js.Array(value :_*))
    @scala.inline
    def setCachingKeys(value: js.Array[String]): Self = this.set("cachingKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachingKeys: Self = this.set("cachingKeys", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

