package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceGcs extends js.Object {
  // name of GCS bucket you want to ingest from
  var bucket: js.UndefOr[String] = js.undefined
  // Prefix that selects keys to ingest.
  var prefix: js.UndefOr[String] = js.undefined
}

object SourceGcs {
  @scala.inline
  def apply(bucket: String = null, prefix: String = null): SourceGcs = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceGcs]
  }
}

