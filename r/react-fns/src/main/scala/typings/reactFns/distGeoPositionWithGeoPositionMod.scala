package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.distGeoPositionGeoPositionMod.GeoPositionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGeoPositionWithGeoPositionMod {
  
  @JSImport("react-fns/dist/GeoPosition/withGeoPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withGeoPosition[Props](Component: ComponentType[Props & GeoPositionProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withGeoPosition")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
