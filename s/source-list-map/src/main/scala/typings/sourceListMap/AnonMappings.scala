package typings.sourceListMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMappings extends js.Object {
  var file: js.Any
  var mappings: String
  var sources: js.Array[String]
  var sourcesContent: js.Array[String]
  var version: Double
}

object AnonMappings {
  @scala.inline
  def apply(
    file: js.Any,
    mappings: String,
    sources: js.Array[String],
    sourcesContent: js.Array[String],
    version: Double
  ): AnonMappings = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMappings]
  }
}

