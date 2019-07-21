package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceGcs extends js.Object {
  // name of GCS bucket you want to ingest from
  var bucket: js.UndefOr[java.lang.String] = js.undefined
  // Prefix that selects keys to ingest.
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object SourceGcs {
  @scala.inline
  def apply(bucket: java.lang.String = null, prefix: java.lang.String = null): SourceGcs = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[SourceGcs]
  }
}

