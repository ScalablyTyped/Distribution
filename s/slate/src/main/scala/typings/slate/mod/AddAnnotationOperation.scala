package typings.slate.mod

import typings.slate.slateStrings.add_annotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "AddAnnotationOperation")
@js.native
class AddAnnotationOperation ()
  extends BaseOperation
     with Operation {
  var annotation: Annotation = js.native
  var data: Data = js.native
  @JSName("type")
  var type_AddAnnotationOperation: add_annotation = js.native
}

