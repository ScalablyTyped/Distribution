package typings.reactWidgets

import typings.reactWidgets.accessorsMod.TextAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("react-widgets/cjs/Filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object presets {
    
    @JSImport("react-widgets/cjs/Filter", "presets")
    @js.native
    val ^ : js.Any = js.native
    
    inline def contains(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def eq_(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def startsWith(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  inline def useFilteredData[TDataItem](data: js.Array[TDataItem], filterer: Filter[TDataItem]): js.Array[TDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFilteredData")(data.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any])).asInstanceOf[js.Array[TDataItem]]
  inline def useFilteredData[TDataItem](data: js.Array[TDataItem], filterer: Filter[TDataItem], searchTerm: String): js.Array[TDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFilteredData")(data.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any])).asInstanceOf[js.Array[TDataItem]]
  inline def useFilteredData[TDataItem](
    data: js.Array[TDataItem],
    filterer: Filter[TDataItem],
    searchTerm: String,
    textAccessor: TextAccessor
  ): js.Array[TDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFilteredData")(data.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any], textAccessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[TDataItem]]
  inline def useFilteredData[TDataItem](
    data: js.Array[TDataItem],
    filterer: Filter[TDataItem],
    searchTerm: Unit,
    textAccessor: TextAccessor
  ): js.Array[TDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFilteredData")(data.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any], textAccessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[TDataItem]]
  
  type Filter[TDataItem] = Boolean | FilterPreset | FilterFunction[TDataItem] | Null
  
  type FilterFunction[TDataItem] = js.Function3[/* item */ TDataItem, /* searchTerm */ String, /* idx */ js.UndefOr[Double], Boolean]
  
  /* keyof react-widgets.anon.Contains */ /* Rewritten from type alias, can be one of: 
    - typings.reactWidgets.reactWidgetsStrings.eq
    - typings.reactWidgets.reactWidgetsStrings.contains
    - typings.reactWidgets.reactWidgetsStrings.startsWith
  */
  trait FilterPreset extends StObject
}
