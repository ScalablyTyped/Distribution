package typings.reactEmailEditor.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailEditorProps extends StObject {
  
  val appearance: js.UndefOr[AppearanceConfig] = js.undefined
  
  val editorId: js.UndefOr[String] = js.undefined
  
  val minHeight: js.UndefOr[Double | String] = js.undefined
  
  /** @deprecated Use **onReady** instead */
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val options: js.UndefOr[UnlayerOptions] = js.undefined
  
  val projectId: js.UndefOr[Double] = js.undefined
  
  val scriptUrl: js.UndefOr[String] = js.undefined
  
  val style: js.UndefOr[CSSProperties] = js.undefined
  
  val tools: js.UndefOr[ToolsConfig] = js.undefined
}
object EmailEditorProps {
  
  inline def apply(): EmailEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailEditorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailEditorProps] (val x: Self) extends AnyVal {
    
    inline def setAppearance(value: AppearanceConfig): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    inline def setEditorId(value: String): Self = StObject.set(x, "editorId", value.asInstanceOf[js.Any])
    
    inline def setEditorIdUndefined: Self = StObject.set(x, "editorId", js.undefined)
    
    inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOptions(value: UnlayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setScriptUrl(value: String): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
    
    inline def setScriptUrlUndefined: Self = StObject.set(x, "scriptUrl", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTools(value: ToolsConfig): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
  }
}
