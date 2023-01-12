package typings.reactNativeMaps.anon

import typings.reactNative.mod.Animated.AnimatedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMapView extends StObject {
  
  /* static member */
  var Animated: AnimatedComponent[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof MapView */ js.Any
  ]
}
object TypeofMapView {
  
  inline def apply(
    Animated: AnimatedComponent[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof MapView */ js.Any
    ]
  ): TypeofMapView = {
    val __obj = js.Dynamic.literal(Animated = Animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMapView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMapView] (val x: Self) extends AnyVal {
    
    inline def setAnimated(
      value: AnimatedComponent[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof MapView */ js.Any
        ]
    ): Self = StObject.set(x, "Animated", value.asInstanceOf[js.Any])
  }
}
