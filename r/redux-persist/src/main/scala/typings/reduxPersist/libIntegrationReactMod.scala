package typings.reduxPersist

import typings.react.mod.Component
import typings.reduxPersist.integrationReactMod.PersistGateProps
import typings.reduxPersist.integrationReactMod.PersistorGateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/integration/react", JSImport.Namespace)
@js.native
object libIntegrationReactMod extends js.Object {
  /**
    * Entry point of your react application to allow it persist a given store @see Persistor and its configuration.
    * @see Persistor
    * @see PersistGateProps
    * @see PersistGateState
    */
  @js.native
  class PersistGate ()
    extends Component[PersistGateProps, PersistorGateState, js.Any]
  
}

