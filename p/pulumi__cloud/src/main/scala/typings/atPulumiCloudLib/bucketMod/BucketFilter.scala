package typings
package atPulumiCloudLib.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketFilter extends js.Object {
  var keyPrefix: js.UndefOr[java.lang.String] = js.undefined
  var keySuffix: js.UndefOr[java.lang.String] = js.undefined
}

object BucketFilter {
  @scala.inline
  def apply(keyPrefix: java.lang.String = null, keySuffix: java.lang.String = null): BucketFilter = {
    val __obj = js.Dynamic.literal()
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix)
    if (keySuffix != null) __obj.updateDynamic("keySuffix")(keySuffix)
    __obj.asInstanceOf[BucketFilter]
  }
}

