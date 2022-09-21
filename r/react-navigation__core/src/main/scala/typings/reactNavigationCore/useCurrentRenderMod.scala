package typings.reactNavigationCore

import typings.reactNavigationCore.typesMod.Descriptor
import typings.reactNavigationCore.typesMod.Keyof
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.reactNavigationCore.typesMod.RouteProp
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCurrentRenderMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useCurrentRender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasStateNavigationDescriptors: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStateNavigationDescriptors.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var descriptors: Record[
        String, 
        Descriptor[
          js.Object, 
          NavigationProp[
            ParamListBase, 
            Keyof[ParamListBase], 
            Unit, 
            NavigationState[ParamListBase], 
            js.Object, 
            js.Object
          ], 
          RouteProp[ParamListBase, Keyof[ParamListBase]]
        ]
      ]
    
    var navigation: NavigationHelpers[ParamListBase, js.Object]
    
    var state: NavigationState[ParamListBase]
  }
  object Options {
    
    inline def apply(
      descriptors: Record[
          String, 
          Descriptor[
            js.Object, 
            NavigationProp[
              ParamListBase, 
              Keyof[ParamListBase], 
              Unit, 
              NavigationState[ParamListBase], 
              js.Object, 
              js.Object
            ], 
            RouteProp[ParamListBase, Keyof[ParamListBase]]
          ]
        ],
      navigation: NavigationHelpers[ParamListBase, js.Object],
      state: NavigationState[ParamListBase]
    ): Options = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDescriptors(
        value: Record[
              String, 
              Descriptor[
                js.Object, 
                NavigationProp[
                  ParamListBase, 
                  Keyof[ParamListBase], 
                  Unit, 
                  NavigationState[ParamListBase], 
                  js.Object, 
                  js.Object
                ], 
                RouteProp[ParamListBase, Keyof[ParamListBase]]
              ]
            ]
      ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: NavigationHelpers[ParamListBase, js.Object]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setState(value: NavigationState[ParamListBase]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
