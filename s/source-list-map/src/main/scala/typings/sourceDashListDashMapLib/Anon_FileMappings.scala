package typings
package sourceDashListDashMapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FileMappings extends js.Object {
  var file: js.Any
  var mappings: java.lang.String
  var sources: js.Array[java.lang.String]
  var sourcesContent: js.Array[java.lang.String]
  var version: scala.Double
}

object Anon_FileMappings {
  @scala.inline
  def apply(
    file: js.Any,
    mappings: java.lang.String,
    sources: js.Array[java.lang.String],
    sourcesContent: js.Array[java.lang.String],
    version: scala.Double
  ): Anon_FileMappings = {
    val __obj = js.Dynamic.literal(file = file, mappings = mappings, sources = sources, sourcesContent = sourcesContent, version = version)
  
    __obj.asInstanceOf[Anon_FileMappings]
  }
}

