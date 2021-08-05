package typings.reactFns

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoistStaticsMod {
  
  @JSImport("react-fns/dist/hoistStatics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hoistNonReactStatics[P](
    targetComponent: ComponentClass[P, ComponentState],
    sourceComponent: ComponentClass[js.Any, ComponentState]
  ): ComponentClass[P, ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("hoistNonReactStatics")(targetComponent.asInstanceOf[js.Any], sourceComponent.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[P, ComponentState]]
  inline def hoistNonReactStatics[P](
    targetComponent: ComponentClass[P, ComponentState],
    sourceComponent: ComponentClass[js.Any, ComponentState],
    blacklist: StringDictionary[Boolean]
  ): ComponentClass[P, ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("hoistNonReactStatics")(targetComponent.asInstanceOf[js.Any], sourceComponent.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[P, ComponentState]]
  
  inline def isEmptyChildren(children: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
