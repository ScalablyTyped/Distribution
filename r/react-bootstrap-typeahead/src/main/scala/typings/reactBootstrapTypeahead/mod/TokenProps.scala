package typings.reactBootstrapTypeahead.mod

import typings.react.mod.HTMLProps
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenProps
  extends StObject
     with HTMLProps[div] {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object TokenProps {
  
  @scala.inline
  def apply(): TokenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenProps]
  }
  
  @scala.inline
  implicit class TokenPropsMutableBuilder[Self <: TokenProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setOnRemove(value: () => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
  }
}
