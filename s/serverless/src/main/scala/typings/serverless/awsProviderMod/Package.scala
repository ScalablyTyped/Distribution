package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Package extends js.Object {
  var artifact: js.UndefOr[String] = js.native
  var exclude: js.UndefOr[js.Array[String]] = js.native
  var excludeDevDependencies: js.UndefOr[Boolean] = js.native
  var include: js.UndefOr[js.Array[String]] = js.native
  var individually: js.UndefOr[Boolean] = js.native
}

object Package {
  @scala.inline
  def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
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
    def setArtifact(value: String): Self = this.set("artifact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifact: Self = this.set("artifact", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExcludeDevDependencies(value: Boolean): Self = this.set("excludeDevDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeDevDependencies: Self = this.set("excludeDevDependencies", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    @scala.inline
    def setIndividually(value: Boolean): Self = this.set("individually", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndividually: Self = this.set("individually", js.undefined)
  }
  
}

