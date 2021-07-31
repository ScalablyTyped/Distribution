package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.geoPositionGeoPositionMod.GeoPositionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withGeoPositionMod {
  
  @JSImport("react-fns/dist/GeoPosition/withGeoPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def withGeoPosition[Props](Component: ComponentType[Props & GeoPositionProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withGeoPosition")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
