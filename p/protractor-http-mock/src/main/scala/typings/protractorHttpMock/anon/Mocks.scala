package typings.protractorHttpMock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mocks extends js.Object {
  var mocks: js.UndefOr[Default] = js.undefined
  var plugins: js.UndefOr[DefaultReadonlyArray] = js.undefined
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

object Mocks {
  @scala.inline
  def apply(
    mocks: Default = null,
    plugins: DefaultReadonlyArray = null,
    protractorConfig: String = null,
    rootDirectory: String = null
  ): Mocks = {
    val __obj = js.Dynamic.literal()
    if (mocks != null) __obj.updateDynamic("mocks")(mocks.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (protractorConfig != null) __obj.updateDynamic("protractorConfig")(protractorConfig.asInstanceOf[js.Any])
    if (rootDirectory != null) __obj.updateDynamic("rootDirectory")(rootDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mocks]
  }
}

