package typings.shpjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object shpjsMod {
  import typings.node.Buffer
  import typings.shpjs.Anon_Buffer
  import typings.std.ArrayBuffer

  // All toBuffer() compatible buffers.
  type ShpJSBuffer = Buffer | ArrayBuffer | Anon_Buffer
}
