package typings.rascal.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rascal.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Redelivery extends StObject {
  
  var counters: js.UndefOr[StringDictionary[Size]] = js.undefined
}
object Redelivery {
  
  inline def apply(): Redelivery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Redelivery] (val x: Self) extends AnyVal {
    
    inline def setCounters(value: StringDictionary[Size]): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    inline def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
  }
}
