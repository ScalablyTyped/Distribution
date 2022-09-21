package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsMod {
  
  @JSImport("pusher-js/types/src/runtimes/isomorphic/transports/transports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pusher-js/types/src/runtimes/isomorphic/transports/transports", JSImport.Default)
  @js.native
  def default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransportsTable */ Any = js.native
  inline def default_=(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransportsTable */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @JSImport("pusher-js/types/src/runtimes/isomorphic/transports/transports", "pollingConfiguration")
  @js.native
  def pollingConfiguration: Any = js.native
  inline def pollingConfiguration_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pollingConfiguration")(x.asInstanceOf[js.Any])
  
  @JSImport("pusher-js/types/src/runtimes/isomorphic/transports/transports", "streamingConfiguration")
  @js.native
  def streamingConfiguration: Any = js.native
  inline def streamingConfiguration_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("streamingConfiguration")(x.asInstanceOf[js.Any])
}
