package typings.protobufjs

import typings.protobufjs.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnnotation extends js.Object {
  var Annotation: Type
}

object AnonAnnotation {
  @scala.inline
  def apply(Annotation: Type): AnonAnnotation = {
    val __obj = js.Dynamic.literal(Annotation = Annotation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnnotation]
  }
}

