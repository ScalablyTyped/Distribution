package typings.riotGamesApi.RiotGamesAPI.LolStatus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shard extends js.Object {
  var hostname: String = js.native
  var locales: js.Array[String] = js.native
  var name: String = js.native
  var region_tag: String = js.native
  var slug: String = js.native
}

object Shard {
  @scala.inline
  def apply(hostname: String, locales: js.Array[String], name: String, region_tag: String, slug: String): Shard = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region_tag = region_tag.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
  @scala.inline
  implicit class ShardOps[Self <: Shard] (val x: Self) extends AnyVal {
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
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion_tag(value: String): Self = this.set("region_tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
  }
  
}

