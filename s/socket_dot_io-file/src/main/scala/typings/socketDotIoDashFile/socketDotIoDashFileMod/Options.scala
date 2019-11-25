package typings.socketDotIoDashFile.socketDotIoDashFileMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var accepts: js.UndefOr[js.Array[String]] = js.undefined
  var chunkSize: js.UndefOr[Double] = js.undefined
  var maxFileSize: js.UndefOr[Double] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var rename: js.UndefOr[js.Function2[/* fileName */ String, /* fileInfo */ FileInfo, String]] = js.undefined
  var resume: js.UndefOr[Boolean] = js.undefined
  var transmissionDelay: js.UndefOr[Double] = js.undefined
  var uploadDir: String | StringDictionary[String]
}

object Options {
  @scala.inline
  def apply(
    uploadDir: String | StringDictionary[String],
    accepts: js.Array[String] = null,
    chunkSize: Int | Double = null,
    maxFileSize: Int | Double = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    rename: (/* fileName */ String, /* fileInfo */ FileInfo) => String = null,
    resume: js.UndefOr[Boolean] = js.undefined,
    transmissionDelay: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(uploadDir = uploadDir.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (maxFileSize != null) __obj.updateDynamic("maxFileSize")(maxFileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (rename != null) __obj.updateDynamic("rename")(js.Any.fromFunction2(rename))
    if (!js.isUndefined(resume)) __obj.updateDynamic("resume")(resume.asInstanceOf[js.Any])
    if (transmissionDelay != null) __obj.updateDynamic("transmissionDelay")(transmissionDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

