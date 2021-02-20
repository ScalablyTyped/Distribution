package typings.reactVirtualized.mod

import typings.reactVirtualized.anon.Arialabel
import typings.reactVirtualized.anon.CellGroupRenderer
import typings.reactVirtualized.esCollectionMod.CollectionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-virtualized", "Collection")
@js.native
class Collection protected ()
  extends typings.reactVirtualized.esCollectionMod.Collection {
  def this(props: CollectionProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: CollectionProps, context: js.Any) = this()
}
/* static members */
object Collection {
  
  @JSImport("react-virtualized", "Collection")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-virtualized", "Collection.defaultProps")
  @js.native
  def defaultProps: CellGroupRenderer = js.native
  @scala.inline
  def defaultProps_=(x: CellGroupRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("react-virtualized", "Collection.propTypes")
  @js.native
  def propTypes: Arialabel = js.native
  @scala.inline
  def propTypes_=(x: Arialabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
