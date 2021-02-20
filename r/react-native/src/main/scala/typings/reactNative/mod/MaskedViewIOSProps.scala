package typings.reactNative.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedViewIOSProps extends ViewProps {
  
  var maskElement: ReactElement = js.native
}
object MaskedViewIOSProps {
  
  @scala.inline
  def apply(maskElement: ReactElement): MaskedViewIOSProps = {
    val __obj = js.Dynamic.literal(maskElement = maskElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedViewIOSProps]
  }
  
  @scala.inline
  implicit class MaskedViewIOSPropsMutableBuilder[Self <: MaskedViewIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaskElement(value: ReactElement): Self = StObject.set(x, "maskElement", value.asInstanceOf[js.Any])
  }
}
