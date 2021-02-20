package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForwardRefRenderFunction[T, P] extends StObject {
  
  def apply(props: PropsWithChildren[P], ref: ForwardedRef[T]): ReactElement | Null = js.native
  
  // explicit rejected with `never` required due to
  // https://github.com/microsoft/TypeScript/issues/36826
  /**
    * defaultProps are not supported on render functions
    */
  var defaultProps: js.UndefOr[scala.Nothing] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * propTypes are not supported on render functions
    */
  var propTypes: js.UndefOr[scala.Nothing] = js.native
}
