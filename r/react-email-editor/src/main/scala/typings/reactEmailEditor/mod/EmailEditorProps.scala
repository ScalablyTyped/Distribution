package typings.reactEmailEditor.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailEditorProps extends StObject {
  
  val appearance: js.UndefOr[AppearanceConfig] = js.native
  
  val minHeight: js.UndefOr[Double] = js.native
  
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  val options: js.UndefOr[UnlayerOptions] = js.native
  
  val projectId: js.UndefOr[Double] = js.native
  
  val style: js.UndefOr[CSSProperties] = js.native
  
  val tools: js.UndefOr[ToolsConfig] = js.native
}
object EmailEditorProps {
  
  @scala.inline
  def apply(): EmailEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailEditorProps]
  }
  
  @scala.inline
  implicit class EmailEditorPropsMutableBuilder[Self <: EmailEditorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppearance(value: AppearanceConfig): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOptions(value: UnlayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setProjectId(value: Double): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTools(value: ToolsConfig): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
  }
}
