package typings.reactDashSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchContext extends js.Object {
  var document: SketchDocument
}

object SketchContext {
  @scala.inline
  def apply(document: SketchDocument): SketchContext = {
    val __obj = js.Dynamic.literal(document = document)
  
    __obj.asInstanceOf[SketchContext]
  }
}

