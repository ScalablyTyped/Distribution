package typings.relayRuntime.relayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralReaderSelector extends ReaderSelector {
  
  val kind: String = js.native
  
  val selectors: js.Array[SingularReaderSelector] = js.native
}
object PluralReaderSelector {
  
  @scala.inline
  def apply(kind: String, selectors: js.Array[SingularReaderSelector]): PluralReaderSelector = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralReaderSelector]
  }
  
  @scala.inline
  implicit class PluralReaderSelectorMutableBuilder[Self <: PluralReaderSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectors(value: js.Array[SingularReaderSelector]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsVarargs(value: SingularReaderSelector*): Self = StObject.set(x, "selectors", js.Array(value :_*))
  }
}
