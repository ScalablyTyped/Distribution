package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sharp", "concurrency")
@js.native
object concurrency extends js.Object {
  /**
    * Gets or sets the number of threads libvips' should create to process each image.
    * The default value is the number of CPU cores. A value of 0 will reset to this default.
    * The maximum number of images that can be processed in parallel is limited by libuv's UV_THREADPOOL_SIZE environment variable.
    * @param concurrency The new concurrency value.
    * @returns The current concurrency value.
    */
  def apply(): Double = js.native
  def apply(concurrency: Double): Double = js.native
}

