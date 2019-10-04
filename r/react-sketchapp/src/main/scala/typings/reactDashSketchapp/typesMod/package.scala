package typings.reactDashSketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Color = String | Double
  type LayerCreator = js.Function5[
    /* style */ ViewStyle, 
    /* layout */ LayoutInfo, 
    /* textStyle */ TextStyle, 
    /* props */ js.Any, 
    /* value */ js.UndefOr[String], 
    SketchLayer
  ]
  type MSColor = js.Any
  type MSGradient = js.Any
  type NSString = js.Any
  type SketchLayer = js.Any
  type SketchShadows = js.Array[SketchShadow]
  type SketchStyle = js.Any
  type TextNodes = js.Array[TextNode]
}
