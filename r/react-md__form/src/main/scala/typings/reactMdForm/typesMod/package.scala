package typings.reactMdForm.typesMod

import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type RangeSliderDefaultValue = RangeSliderValue | js.Function0[RangeSliderValue]

type RangeSliderValue = js.Tuple2[Double, Double]

type SliderDefaultValue = SliderValue | js.Function0[SliderValue]

type SliderDragEvent = MouseEvent | TouchEvent | (typings.react.mod.MouseEvent[Element, NativeMouseEvent]) | typings.react.mod.TouchEvent[Element]

/* Rewritten from type alias, can be one of: 
  - typings.reactMdForm.reactMdFormStrings.mouse
  - typings.reactMdForm.reactMdFormStrings.touch
  - scala.Null
*/
type SliderDraggingBy = _SliderDraggingBy | Null

type SliderThumbIndex = ThumbIndex | Null

type SliderValue = Double
