package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.KeyMapper
import typings.reactVirtualized.esMasonryMod.MasonryProps
import typings.reactVirtualized.esMasonryMod.MasonryState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "Masonry")
@js.native
class Masonry protected ()
  extends typings.reactVirtualized.esMasonryMod.Masonry {
  def this(props: MasonryProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: MasonryProps, context: js.Any) = this()
}
/* static members */
object Masonry {
  
  @JSImport("react-virtualized", "Masonry")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "Masonry.defaultProps")
  @js.native
  def defaultProps: KeyMapper = js.native
  inline def defaultProps_=(x: KeyMapper): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(nextProps: MasonryProps, prevState: MasonryState): MasonryState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[MasonryState | Null]
}
