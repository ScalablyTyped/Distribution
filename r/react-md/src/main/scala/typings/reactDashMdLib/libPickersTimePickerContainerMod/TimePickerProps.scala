package typings
package reactDashMdLib.libPickersTimePickerContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimePickerProps
  extends reactDashMdLib.libPickersMod.BasePickerProps {
  var defaultTimeMode: js.UndefOr[
    reactDashMdLib.reactDashMdLibStrings.hour | reactDashMdLib.reactDashMdLibStrings.minute
  ] = js.undefined
  var defaultValue: js.UndefOr[stdLib.Date] = js.undefined
  var formatOptions: js.UndefOr[reactDashMdLib.libPickersMod.IntlTimeFormat] = js.undefined
  var hoverMode: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* formattedTime */ java.lang.String, 
      /* date */ stdLib.Date, 
      /* event */ reactLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
}

