package typings.snykGoParser.parserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepManifest extends js.Object {
  var ignored: js.Array[String]
}

object DepManifest {
  @scala.inline
  def apply(ignored: js.Array[String]): DepManifest = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepManifest]
  }
}

