package typings.pulumiAws.getDomainMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainArgs extends js.Object {
  /**
    * Name of the domain.
    */
  val domainName: String = js.native
  /**
    * The tags assigned to the domain.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetDomainArgs {
  @scala.inline
  def apply(domainName: String): GetDomainArgs = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainArgs]
  }
  @scala.inline
  implicit class GetDomainArgsOps[Self <: GetDomainArgs] (val x: Self) extends AnyVal {
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

