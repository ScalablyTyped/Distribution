package typings.sass.anon

import typings.sass.typesValueListMod.ListSeparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brackets extends StObject {
  
  var brackets: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[ListSeparator] = js.undefined
}
object Brackets {
  
  inline def apply(): Brackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brackets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brackets] (val x: Self) extends AnyVal {
    
    inline def setBrackets(value: Boolean): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
    
    inline def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
    
    inline def setSeparator(value: ListSeparator): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorNull: Self = StObject.set(x, "separator", null)
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
