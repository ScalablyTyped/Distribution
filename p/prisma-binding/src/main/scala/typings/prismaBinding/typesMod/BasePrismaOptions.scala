package typings.prismaBinding.typesMod

import typings.graphqlBinding.distTypesMod.FragmentReplacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePrismaOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var disableCache: js.UndefOr[Boolean] = js.native
  var endpoint: js.UndefOr[String] = js.native
  var fragmentReplacements: js.UndefOr[js.Array[FragmentReplacement]] = js.native
  var secret: js.UndefOr[String] = js.native
}

object BasePrismaOptions {
  @scala.inline
  def apply(): BasePrismaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasePrismaOptions]
  }
  @scala.inline
  implicit class BasePrismaOptionsOps[Self <: BasePrismaOptions] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDisableCache(value: Boolean): Self = this.set("disableCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableCache: Self = this.set("disableCache", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setFragmentReplacementsVarargs(value: FragmentReplacement*): Self = this.set("fragmentReplacements", js.Array(value :_*))
    @scala.inline
    def setFragmentReplacements(value: js.Array[FragmentReplacement]): Self = this.set("fragmentReplacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentReplacements: Self = this.set("fragmentReplacements", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
  
}

