package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralReaderSelector
  extends StObject
     with ReaderSelector {
  
  val kind: String
  
  val selectors: js.Array[SingularReaderSelector]
}
object PluralReaderSelector {
  
  inline def apply(kind: String, selectors: js.Array[SingularReaderSelector]): PluralReaderSelector = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralReaderSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluralReaderSelector] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSelectors(value: js.Array[SingularReaderSelector]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsVarargs(value: SingularReaderSelector*): Self = StObject.set(x, "selectors", js.Array(value*))
  }
}
