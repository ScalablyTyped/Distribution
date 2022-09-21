package typings.reactVirtualized.esGridMod

import typings.reactVirtualized.anon.Ariareadonly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized/dist/es/Grid", JSImport.Default)
@js.native
open class default protected () extends Grid {
  def this(props: GridProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: GridProps, context: Any) = this()
}
/* static members */
object default {
  
  @JSImport("react-virtualized/dist/es/Grid", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized/dist/es/Grid", "default.defaultProps")
  @js.native
  def defaultProps: Ariareadonly = js.native
  inline def defaultProps_=(x: Ariareadonly): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
