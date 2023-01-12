package typings.semanticUiSticky

import typings.semanticUiSticky.SemanticUI.Sticky
import typings.semanticUiSticky.SemanticUI.StickySettings
import typings.semanticUiSticky.semanticUiStickyStrings.destroy
import typings.semanticUiSticky.semanticUiStickyStrings.refresh
import typings.semanticUiSticky.semanticUiStickyStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def sticky(): JQuery
  def sticky(settings: StickySettings): JQuery
  @JSName("sticky")
  var sticky_Original: Sticky
  @JSName("sticky")
  def sticky_destroy(behavior: destroy): JQuery
  /**
    * recalculates offsets
    */
  @JSName("sticky")
  def sticky_refresh(behavior: refresh): JQuery
  @JSName("sticky")
  def sticky_setting(behavior: setting, value: StickySettings): JQuery
  @JSName("sticky")
  def sticky_setting[K /* <: /* keyof semantic-ui-sticky.SemanticUI.StickySettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("sticky")
  def sticky_setting[K /* <: /* keyof semantic-ui-sticky.SemanticUI.StickySettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-sticky.SemanticUI.StickySettings._Impl[K] */ js.Any
}
object JQuery {
  
  inline def apply(sticky: Sticky): JQuery = {
    val __obj = js.Dynamic.literal(sticky = sticky.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setSticky(value: Sticky): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
  }
}
