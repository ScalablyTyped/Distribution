package typings.reactIntl.anon

import typings.reactIntl.typesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-intl.react-intl/lib/src/components/injectIntl.WrappedComponentProps<'intl'> */
@js.native
trait WrappedComponentPropsintl extends StObject {
  
  var intl: IntlShape = js.native
}
object WrappedComponentPropsintl {
  
  @scala.inline
  def apply(intl: IntlShape): WrappedComponentPropsintl = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentPropsintl]
  }
  
  @scala.inline
  implicit class WrappedComponentPropsintlMutableBuilder[Self <: WrappedComponentPropsintl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
  }
}
