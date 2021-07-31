package typings.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorConfig extends StObject {
  
  val maxRows: js.UndefOr[Double] = js.undefined
  
  val minRows: js.UndefOr[Double] = js.undefined
}
object EditorConfig {
  
  @scala.inline
  def apply(): EditorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorConfig]
  }
  
  @scala.inline
  implicit class EditorConfigMutableBuilder[Self <: EditorConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    @scala.inline
    def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
  }
}
