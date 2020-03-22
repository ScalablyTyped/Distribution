package typings.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object monthBodyMod {
  type MonthCellRender[DateType] = js.Function2[
    /* currentDate */ DateType, 
    /* locale */ typings.rcPicker.interfaceMod.Locale, 
    typings.react.mod.ReactNode
  ]
}
