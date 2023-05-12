package typings.radixUiReactComposeRefs

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@radix-ui/react-compose-refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeRefs[T](refs: PossibleRef[T]*): js.Function1[/* node */ T, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* node */ T, Unit]]
  
  inline def useComposedRefs[T](refs: PossibleRef[T]*): js.Function1[/* node */ T, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useComposedRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* node */ T, Unit]]
  
  type PossibleRef[T] = js.UndefOr[Ref[T]]
}
