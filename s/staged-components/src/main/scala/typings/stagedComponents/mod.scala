package typings.stagedComponents

import typings.react.mod.FC
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("staged-components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def staged[P](stage: StageRenderRoot[P]): FC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("staged")(stage.asInstanceOf[js.Any]).asInstanceOf[FC[P]]
  inline def staged[P, R](stage: StageRenderRootWithRef[P, R]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("staged")(stage.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @js.native
  trait StageRender extends StObject {
    
    def apply(): StageRender | ReactElement | Null = js.native
  }
  
  type StageRenderRoot[P] = js.Function1[/* props */ PropsWithChildren[P], StageRender | ReactElement | Null]
  
  type StageRenderRootWithRef[P, R] = js.Function2[
    /* props */ PropsWithChildren[P], 
    /* ref */ Ref[R], 
    StageRender | ReactElement | Null
  ]
}
