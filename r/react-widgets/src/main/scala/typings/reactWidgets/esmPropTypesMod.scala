package typings.reactWidgets

import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.ReactComponentLike
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPropTypesMod {
  
  @JSImport("react-widgets/esm/PropTypes", "accessor")
  @js.native
  val accessor: Requireable[String | (js.Function1[/* repeated */ Any, Any])] = js.native
  
  /* Inlined prop-types.prop-types.Validator<boolean> & {  acceptsArray :prop-types.prop-types.Validator<any>} */
  object disabled {
    
    inline def apply(
      props: StringDictionary[Any],
      propName: String,
      componentName: String,
      location: String,
      propFullName: String
    ): js.Error | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any], location.asInstanceOf[js.Any], propFullName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
    
    @JSImport("react-widgets/esm/PropTypes", "disabled")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-widgets/esm/PropTypes", "disabled.acceptsArray")
    @js.native
    def acceptsArray: Validator[Any] = js.native
    inline def acceptsArray_=(x: Validator[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acceptsArray")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-widgets/esm/PropTypes", "elementType")
  @js.native
  val elementType: Requireable[ReactComponentLike] = js.native
  
  @JSImport("react-widgets/esm/PropTypes", "message")
  @js.native
  val message: Requireable[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray] = js.native
}
