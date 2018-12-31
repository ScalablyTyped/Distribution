package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupOutput extends js.Object {
  // when supported in TypeScript (https://github.com/Microsoft/TypeScript/pull/24897):
  // output: [OutputChunk, ...(OutputChunk | OutputAsset)[]];
  var output: js.Array[OutputChunk | OutputAsset]
}

