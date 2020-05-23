package typings.saxes.mod

import typings.saxes.saxesStrings.`1Dot0`
import typings.saxes.saxesStrings.`1Dot1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLVersionOptions extends js.Object {
  /**
    * The default XML version to use. If unspecified, and there is no XML
    * encoding declaration, the default version is "1.0".
    */
  var defaultXMLVersion: js.UndefOr[`1Dot0` | `1Dot1`] = js.undefined
  /**
    * A flag indicating whether to force the XML version used for parsing to the
    * value of ``defaultXMLVersion``. When this flag is ``true``,
    * ``defaultXMLVersion`` must be specified. If unspecified, the default value
    * of this flag is ``false``.
    */
  var forceXMLVersion: js.UndefOr[Boolean] = js.undefined
}

object XMLVersionOptions {
  @scala.inline
  def apply(defaultXMLVersion: `1Dot0` | `1Dot1` = null, forceXMLVersion: js.UndefOr[Boolean] = js.undefined): XMLVersionOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultXMLVersion != null) __obj.updateDynamic("defaultXMLVersion")(defaultXMLVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(forceXMLVersion)) __obj.updateDynamic("forceXMLVersion")(forceXMLVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLVersionOptions]
  }
}

