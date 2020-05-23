package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about files and allows JavaScript in a web page to access their content. */
@js.native
trait File extends Blob {
  val lastModified: Double = js.native
  val name: java.lang.String = js.native
}

