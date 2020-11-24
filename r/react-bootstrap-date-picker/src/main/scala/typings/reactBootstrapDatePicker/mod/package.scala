package typings.reactBootstrapDatePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ChangeCallback = js.Function2[/* value */ java.lang.String, /* formattedValue */ java.lang.String, scala.Unit]
  
  type DatePicker = typings.react.mod.ComponentClass[
    typings.reactBootstrapDatePicker.mod.DatePickerProps, 
    typings.react.mod.ComponentState
  ]
}
