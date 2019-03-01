package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chunk extends js.Object {
  var chunk: js.Any
  var encoding: java.lang.String
}

object Anon_Chunk {
  @scala.inline
  def apply(chunk: js.Any, encoding: java.lang.String): Anon_Chunk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chunk")(chunk)
    __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_Chunk]
  }
}

