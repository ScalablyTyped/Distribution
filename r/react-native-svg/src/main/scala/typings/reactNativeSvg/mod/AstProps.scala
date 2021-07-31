package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AstProps
  extends StObject
     with SvgProps {
  
  var ast: JsxAST | Null
  
  var `override`: js.UndefOr[SvgProps] = js.undefined
}
object AstProps {
  
  @scala.inline
  def apply(): AstProps = {
    val __obj = js.Dynamic.literal(ast = null)
    __obj.asInstanceOf[AstProps]
  }
  
  @scala.inline
  implicit class AstPropsMutableBuilder[Self <: AstProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: JsxAST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstNull: Self = StObject.set(x, "ast", null)
    
    @scala.inline
    def setOverride(value: SvgProps): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
  }
}
