package typings.slate.slateMod

import typings.slate.slateStrings.remove_annotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "RemoveAnnotationOperation")
@js.native
class RemoveAnnotationOperation ()
  extends BaseOperation
     with Operation {
  var annotation: Annotation = js.native
  var data: Data = js.native
  @JSName("type")
  var type_RemoveAnnotationOperation: remove_annotation = js.native
}

