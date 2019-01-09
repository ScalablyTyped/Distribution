package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamDashChainLib {
  type Stream = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Readable */ js.Any
  type StreamItem = Stream | TransformFunction
  type TransformFunction = js.Function2[/* chunk */ js.Any, /* encoding */ js.UndefOr[java.lang.String], js.Any]
}
