package typings.scroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cancel = js.Function0[scala.Unit]
  
  type Scroll = js.Function4[
    /* el */ typings.std.HTMLElement, 
    /* to */ scala.Double, 
    /* opts */ js.UndefOr[typings.scroll.mod.ScrollOptions | typings.scroll.mod.ScrollCallback], 
    /* cb */ js.UndefOr[typings.scroll.mod.ScrollCallback], 
    typings.scroll.mod.Cancel
  ]
  
  type ScrollCallback = js.Function2[/* error */ typings.scroll.mod.ScrollError, /* value */ scala.Double, scala.Unit]
  
  type ScrollError = typings.std.Error | scala.Null
}
