package typings.protractorHttpMock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mocks extends js.Object {
  var mocks: js.UndefOr[Default] = js.native
  var plugins: js.UndefOr[`0`] = js.native
  /**
    * Path to protractor configuration file.
    * Default: protractor-conf.js
    */
  var protractorConfig: js.UndefOr[String] = js.native
  /**
    * Mocks directory where mock files are located.
    * Default: process.cwd()
    */
  var rootDirectory: js.UndefOr[String] = js.native
}

object Mocks {
  @scala.inline
  def apply(): Mocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mocks]
  }
  @scala.inline
  implicit class MocksOps[Self <: Mocks] (val x: Self) extends AnyVal {
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
    def setMocks(value: Default): Self = this.set("mocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMocks: Self = this.set("mocks", js.undefined)
    @scala.inline
    def setPlugins(value: `0`): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setProtractorConfig(value: String): Self = this.set("protractorConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtractorConfig: Self = this.set("protractorConfig", js.undefined)
    @scala.inline
    def setRootDirectory(value: String): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDirectory: Self = this.set("rootDirectory", js.undefined)
  }
  
}

