package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlState extends StObject {
  
  var ast: JsxAST | Null = js.native
}
object XmlState {
  
  @scala.inline
  def apply(): XmlState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlState]
  }
  
  @scala.inline
  implicit class XmlStateMutableBuilder[Self <: XmlState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: JsxAST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstNull: Self = StObject.set(x, "ast", null)
  }
}
