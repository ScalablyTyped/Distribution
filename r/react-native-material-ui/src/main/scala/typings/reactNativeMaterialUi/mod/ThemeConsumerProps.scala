package typings.reactNativeMaterialUi.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeConsumerProps extends StObject {
  
  def children(props: ThemeProps): ReactElement
}
object ThemeConsumerProps {
  
  @scala.inline
  def apply(children: ThemeProps => ReactElement): ThemeConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ThemeConsumerProps]
  }
  
  @scala.inline
  implicit class ThemeConsumerPropsMutableBuilder[Self <: ThemeConsumerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ThemeProps => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
