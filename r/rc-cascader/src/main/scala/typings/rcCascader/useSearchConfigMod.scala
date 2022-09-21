package typings.rcCascader

import typings.rcCascader.cascaderMod.DefaultOptionType
import typings.rcCascader.cascaderMod.ShowSearchType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSearchConfigMod {
  
  @JSImport("rc-cascader/es/hooks/useSearchConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[Boolean, ShowSearchType[DefaultOptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Boolean, ShowSearchType[DefaultOptionType]]]
  inline def default(showSearch: js.UndefOr[Boolean | ShowSearchType[DefaultOptionType]]): js.Tuple2[Boolean, ShowSearchType[DefaultOptionType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(showSearch.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, ShowSearchType[DefaultOptionType]]]
}
