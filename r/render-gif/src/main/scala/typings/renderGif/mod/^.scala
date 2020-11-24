package typings.renderGif.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("render-gif", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Render a gif and provide frames to draw.
  @param data The gif data. Can be anything array-like such as a Buffer, Array or Uint8Array.
  @param callback The callback to provide each rendered frame to.
  @param options Options.
  @example
  ```
  const fs = require("fs");
  const logUpdate = require("log-update");
  const renderGif = require("render-gif");
  renderGif(fs.readFileSync("unicorn.gif"), logUpdate);
  ```
  */
  def apply(
    data: ArrayLike[Double],
    callback: js.Function1[/* data */ ArrayLike[Double], Unit],
    options: Options
  ): ReturnValue = js.native
}
