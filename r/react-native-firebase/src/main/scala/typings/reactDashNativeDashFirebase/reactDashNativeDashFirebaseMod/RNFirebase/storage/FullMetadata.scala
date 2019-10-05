package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage

import typings.std.Partial
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullMetadata extends SettableMetadata {
  var bucket: String
  var fullPath: String
  var generation: String
  var md5Hash: js.UndefOr[String | Null] = js.undefined
  var metageneration: String
  var name: String
  var size: Double
  var timeCreated: String
  var updated: String
}

object FullMetadata {
  @scala.inline
  def apply(
    bucket: String,
    fullPath: String,
    generation: String,
    metageneration: String,
    name: String,
    size: Double,
    timeCreated: String,
    updated: String,
    cacheControl: String = null,
    contentDisposition: String = null,
    contentEncoding: String = null,
    contentLanguage: String = null,
    contentType: String = null,
    customMetadata: Partial[Record[String, String]] = null,
    md5Hash: String = null
  ): FullMetadata = {
    val __obj = js.Dynamic.literal(bucket = bucket, fullPath = fullPath, generation = generation, metageneration = metageneration, name = name, size = size, timeCreated = timeCreated, updated = updated)
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition)
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (customMetadata != null) __obj.updateDynamic("customMetadata")(customMetadata)
    if (md5Hash != null) __obj.updateDynamic("md5Hash")(md5Hash)
    __obj.asInstanceOf[FullMetadata]
  }
}

