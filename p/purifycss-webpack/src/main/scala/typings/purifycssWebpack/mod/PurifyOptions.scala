package typings.purifycssWebpack.mod

import typings.purifycssWebpack.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurifyOptions extends js.Object {
  var minimize: js.UndefOr[Boolean] = js.native
  var moduleExtensions: js.UndefOr[js.Array[String]] = js.native
  var paths: js.UndefOr[js.Object | js.Array[String]] = js.native
  var purifyOptions: js.UndefOr[Info] = js.native
  var styleExtensions: js.UndefOr[js.Array[String]] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PurifyOptions {
  @scala.inline
  def apply(): PurifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurifyOptions]
  }
  @scala.inline
  implicit class PurifyOptionsOps[Self <: PurifyOptions] (val x: Self) extends AnyVal {
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
    def setMinimize(value: Boolean): Self = this.set("minimize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimize: Self = this.set("minimize", js.undefined)
    @scala.inline
    def setModuleExtensionsVarargs(value: String*): Self = this.set("moduleExtensions", js.Array(value :_*))
    @scala.inline
    def setModuleExtensions(value: js.Array[String]): Self = this.set("moduleExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleExtensions: Self = this.set("moduleExtensions", js.undefined)
    @scala.inline
    def setPathsVarargs(value: String*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(value: js.Object | js.Array[String]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setPurifyOptions(value: Info): Self = this.set("purifyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurifyOptions: Self = this.set("purifyOptions", js.undefined)
    @scala.inline
    def setStyleExtensionsVarargs(value: String*): Self = this.set("styleExtensions", js.Array(value :_*))
    @scala.inline
    def setStyleExtensions(value: js.Array[String]): Self = this.set("styleExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleExtensions: Self = this.set("styleExtensions", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

