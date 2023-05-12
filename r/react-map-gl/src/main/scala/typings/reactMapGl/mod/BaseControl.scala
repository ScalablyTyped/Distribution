package typings.reactMapGl.mod

import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-map-gl", "BaseControl")
@js.native
open class BaseControl[T /* <: BaseControlProps */, S /* <: Element */] protected ()
  extends PureComponent[T, js.Object, Any] {
  def this(props: T) = this()
  /**
    * @deprecated
    * @see https://legacy.reactjs.org/docs/legacy-context.html
    */
  def this(props: T, context: Any) = this()
  
  var _containerRef: RefObject[S] = js.native
  
  var _context: MapContextProps = js.native
}
