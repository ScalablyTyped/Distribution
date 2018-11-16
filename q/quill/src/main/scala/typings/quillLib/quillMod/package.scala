package typings
package quillLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object quillMod {
  type DeltaOperation = quillLib.Anon_Insert with OptionalAttributes
  type EditorChangeHandler = (js.Function4[
    quillLib.quillLibStrings.`text-change`, 
    /* delta */ js.Any, 
    /* oldContents */ js.Any, 
    /* source */ Sources, 
    js.Any
  ]) | (js.Function4[
    quillLib.quillLibStrings.`selection-change`, 
    /* range */ RangeStatic, 
    /* oldRange */ RangeStatic, 
    /* source */ Sources, 
    js.Any
  ])
  type SelectionChangeHandler = js.Function3[/* range */ RangeStatic, /* oldRange */ RangeStatic, /* source */ Sources, js.Any]
  type Sources = quillLib.quillLibStrings.api | quillLib.quillLibStrings.user | quillLib.quillLibStrings.silent
  type TextChangeHandler = js.Function3[/* delta */ js.Any, /* oldContents */ js.Any, /* source */ Sources, js.Any]
}
