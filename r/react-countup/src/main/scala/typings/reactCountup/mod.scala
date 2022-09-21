package typings.reactCountup

import typings.react.mod.FC
import typings.reactCountup.countUpMod.CountUpProps
import typings.reactCountup.typesMod.CountUpApi
import typings.reactCountup.useCountUpMod.useCountUpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-countup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-countup", JSImport.Default)
  @js.native
  val default: FC[CountUpProps] = js.native
  
  inline def useCountUp(props: useCountUpProps): CountUpApi = ^.asInstanceOf[js.Dynamic].applyDynamic("useCountUp")(props.asInstanceOf[js.Any]).asInstanceOf[CountUpApi]
}
