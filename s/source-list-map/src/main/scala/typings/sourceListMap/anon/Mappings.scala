package typings.sourceListMap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mappings extends js.Object {
  var file: js.Any
  var mappings: String
  var sources: js.Array[String]
  var sourcesContent: js.Array[String]
  var version: Double
}

object Mappings {
  @scala.inline
  def apply(
    file: js.Any,
    mappings: String,
    sources: js.Array[String],
    sourcesContent: js.Array[String],
    version: Double
  ): Mappings = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mappings]
  }
}

