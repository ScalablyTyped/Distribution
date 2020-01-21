package typings.protractorHttpMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMocks extends js.Object {
  var mocks: js.UndefOr[AnonDefault] = js.undefined
  var plugins: js.UndefOr[AnonDefaultReadonlyArray] = js.undefined
  /**
    * Path to protractor configuration file.
    * Default: protractor-conf.js
    */
  var protractorConfig: js.UndefOr[String] = js.undefined
  /**
    * Mocks directory where mock files are located.
    * Default: process.cwd()
    */
  var rootDirectory: js.UndefOr[String] = js.undefined
}

object AnonMocks {
  @scala.inline
  def apply(
    mocks: AnonDefault = null,
    plugins: AnonDefaultReadonlyArray = null,
    protractorConfig: String = null,
    rootDirectory: String = null
  ): AnonMocks = {
    val __obj = js.Dynamic.literal()
    if (mocks != null) __obj.updateDynamic("mocks")(mocks.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (protractorConfig != null) __obj.updateDynamic("protractorConfig")(protractorConfig.asInstanceOf[js.Any])
    if (rootDirectory != null) __obj.updateDynamic("rootDirectory")(rootDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMocks]
  }
}

