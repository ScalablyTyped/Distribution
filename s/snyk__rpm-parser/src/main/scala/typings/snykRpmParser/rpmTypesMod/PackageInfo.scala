package typings.snykRpmParser.rpmTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageInfo extends js.Object {
  var arch: js.UndefOr[String] = js.undefined
  var epoch: js.UndefOr[Double] = js.undefined
  var name: String
  var release: String
  var size: Double
  var version: String
}

object PackageInfo {
  @scala.inline
  def apply(
    name: String,
    release: String,
    size: Double,
    version: String,
    arch: String = null,
    epoch: js.UndefOr[Double] = js.undefined
  ): PackageInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (!js.isUndefined(epoch)) __obj.updateDynamic("epoch")(epoch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInfo]
  }
}

