package typings.sass.sassMod

import typings.node.Buffer
import typings.sass.Anon_Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  /**
    * The compiled CSS.
    *
    * Write this to a file, or serve it out as needed.
    */
  var css: Buffer
  /**
    * The source map.
    */
  var map: js.UndefOr[Buffer] = js.undefined
  var stats: Anon_Duration
}

object Result {
  @scala.inline
  def apply(css: Buffer, stats: Anon_Duration, map: Buffer = null): Result = {
    val __obj = js.Dynamic.literal(css = css, stats = stats)
    if (map != null) __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[Result]
  }
}

