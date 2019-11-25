package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof prettier.prettier.RequiredOptions ]:? prettier.prettier.RequiredOptions[P]} */ trait CursorOptions extends js.Object {
  /**
    * Specify where the cursor is.
    */
  var cursorOffset: Double
}

object CursorOptions {
  @scala.inline
  def apply(cursorOffset: Double): CursorOptions = {
    val __obj = js.Dynamic.literal(cursorOffset = cursorOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CursorOptions]
  }
}

