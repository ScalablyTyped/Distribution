package typings.slate.slateMod

import typings.slate.slateStrings.set_annotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "SetAnnotationOperation")
@js.native
class SetAnnotationOperation ()
  extends BaseOperation
     with Operation {
  var data: Data = js.native
  var newProperties: AnnotationProperties = js.native
  var properties: AnnotationProperties = js.native
  @JSName("type")
  var type_SetAnnotationOperation: set_annotation = js.native
}

