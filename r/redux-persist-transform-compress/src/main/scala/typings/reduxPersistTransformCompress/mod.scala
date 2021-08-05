package typings.reduxPersistTransformCompress

import typings.reduxPersist.typesMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-persist-transform-compress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State, Raw](): Transform[State, Raw, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Transform[State, Raw, js.Any, js.Any]]
  inline def default[State, Raw](
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PersistorConfig */ js.Any
  ): Transform[State, Raw, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Transform[State, Raw, js.Any, js.Any]]
}
