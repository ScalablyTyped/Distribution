package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stretchy extends StObject {
  
  /**
    * Whether the component should stretch to fill the available space. Defaults to true.
    *
    * Excluded on:
    * - Tabs
    * - Grid children
    * - Combobox/RadioButton Items
    * - MenuBar
    */
  var stretchy: js.UndefOr[Boolean] = js.undefined
}
object Stretchy {
  
  inline def apply(): Stretchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stretchy]
  }
  
  extension [Self <: Stretchy](x: Self) {
    
    inline def setStretchy(value: Boolean): Self = StObject.set(x, "stretchy", value.asInstanceOf[js.Any])
    
    inline def setStretchyUndefined: Self = StObject.set(x, "stretchy", js.undefined)
  }
}
