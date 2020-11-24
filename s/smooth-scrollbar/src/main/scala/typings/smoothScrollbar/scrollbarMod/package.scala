package typings.smoothScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object scrollbarMod {
  
  type AddTransformableMomentumCallback = js.ThisFunction1[
    /* this */ typings.smoothScrollbar.scrollbarMod.Scrollbar, 
    /* willScroll */ scala.Boolean, 
    scala.Unit
  ]
  
  type ScrollListener = js.ThisFunction1[
    /* this */ typings.smoothScrollbar.scrollbarMod.Scrollbar, 
    /* status */ typings.smoothScrollbar.scrollbarMod.ScrollStatus, 
    scala.Unit
  ]
}
