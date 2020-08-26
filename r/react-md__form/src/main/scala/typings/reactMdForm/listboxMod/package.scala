package typings.reactMdForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listboxMod {
  type ListboxChangeEventHandler = js.Function3[
    /* nextValue */ java.lang.String, 
    /* option */ typings.reactMdForm.utilsMod.ListboxOption, 
    /* listbox */ typings.reactMdForm.listboxMod.ListboxChangeEventData, 
    scala.Unit
  ]
}
