package typings.snykJavaCallGraphBuilder.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var CALL_GRAPH_GENERATOR_CHECKSUM: String
  var CALL_GRAPH_GENERATOR_URL: String
}

object Config {
  @scala.inline
  def apply(CALL_GRAPH_GENERATOR_CHECKSUM: String, CALL_GRAPH_GENERATOR_URL: String): Config = {
    val __obj = js.Dynamic.literal(CALL_GRAPH_GENERATOR_CHECKSUM = CALL_GRAPH_GENERATOR_CHECKSUM.asInstanceOf[js.Any], CALL_GRAPH_GENERATOR_URL = CALL_GRAPH_GENERATOR_URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

