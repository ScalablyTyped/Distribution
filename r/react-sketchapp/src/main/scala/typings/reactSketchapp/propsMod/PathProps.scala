package typings.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathProps
  extends FillProps
     with StrokeProps
     with ClipProps
     with TransformProps
     with DefinationProps

object PathProps {
  @scala.inline
  def apply(): PathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathProps]
  }
}

