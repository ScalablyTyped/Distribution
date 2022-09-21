package typings.reactNavigationCore.typesMod

import typings.reactNavigationCore.anon.Navigation
import typings.reactNavigationCore.anon.NavigationNavigationHelpersCommon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeScreenProps[A /* <: Navigation */, B /* <: NavigationNavigationHelpersCommon */] extends StObject {
  
  var navigation: CompositeNavigationProp[
    /* import warning: importer.ImportType#apply Failed type conversion: A['navigation'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: B['navigation'] */ js.Any
  ]
  
  var route: /* import warning: importer.ImportType#apply Failed type conversion: A['route'] */ js.Any
}
object CompositeScreenProps {
  
  inline def apply[A /* <: Navigation */, B /* <: NavigationNavigationHelpersCommon */](
    navigation: CompositeNavigationProp[
      /* import warning: importer.ImportType#apply Failed type conversion: A['navigation'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: B['navigation'] */ js.Any
    ],
    route: /* import warning: importer.ImportType#apply Failed type conversion: A['route'] */ js.Any
  ): CompositeScreenProps[A, B] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeScreenProps[A, B]]
  }
  
  extension [Self <: CompositeScreenProps[?, ?], A /* <: Navigation */, B /* <: NavigationNavigationHelpersCommon */](x: Self & (CompositeScreenProps[A, B])) {
    
    inline def setNavigation(
      value: CompositeNavigationProp[
          /* import warning: importer.ImportType#apply Failed type conversion: A['navigation'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: B['navigation'] */ js.Any
        ]
    ): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: /* import warning: importer.ImportType#apply Failed type conversion: A['route'] */ js.Any): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
