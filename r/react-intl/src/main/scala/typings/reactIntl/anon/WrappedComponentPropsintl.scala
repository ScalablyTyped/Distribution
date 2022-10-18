package typings.reactIntl.anon

import typings.reactIntl.libSrcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-intl.react-intl/lib/src/components/injectIntl.WrappedComponentProps<'intl'> */
trait WrappedComponentPropsintl extends StObject {
  
  var intl: IntlShape
}
object WrappedComponentPropsintl {
  
  inline def apply(intl: IntlShape): WrappedComponentPropsintl = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentPropsintl]
  }
  
  extension [Self <: WrappedComponentPropsintl](x: Self) {
    
    inline def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
  }
}
