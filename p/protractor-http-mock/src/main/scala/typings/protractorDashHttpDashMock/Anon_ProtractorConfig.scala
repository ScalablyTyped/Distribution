package typings.protractorDashHttpDashMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProtractorConfig extends js.Object {
  /**
    * Path to protractor configuration file.
    * Default: protractor.conf
    */
  var protractorConfig: js.UndefOr[String] = js.undefined
  /**
    * Mocks directory where mock files are located.
    * Default: process.cwd()
    */
  var rootDirectory: js.UndefOr[String] = js.undefined
}

object Anon_ProtractorConfig {
  @scala.inline
  def apply(protractorConfig: String = null, rootDirectory: String = null): Anon_ProtractorConfig = {
    val __obj = js.Dynamic.literal()
    if (protractorConfig != null) __obj.updateDynamic("protractorConfig")(protractorConfig)
    if (rootDirectory != null) __obj.updateDynamic("rootDirectory")(rootDirectory)
    __obj.asInstanceOf[Anon_ProtractorConfig]
  }
}

