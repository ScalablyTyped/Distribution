package typings.reactNative.anon

import typings.reactNative.mod.SectionListData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Section[ItemT, SectionT] extends StObject {
  
  var section: SectionListData[ItemT, SectionT]
}
object Section {
  
  inline def apply[ItemT, SectionT](section: SectionListData[ItemT, SectionT]): Section[ItemT, SectionT] = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[Section[ItemT, SectionT]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Section[?, ?], ItemT, SectionT] (val x: Self & (Section[ItemT, SectionT])) extends AnyVal {
    
    inline def setSection(value: SectionListData[ItemT, SectionT]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
  }
}
