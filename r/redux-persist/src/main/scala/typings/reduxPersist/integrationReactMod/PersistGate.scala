package typings.reduxPersist.integrationReactMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entry point of your react application to allow it persist a given store @see Persistor and its configuration.
  * @see Persistor
  * @see PersistGateProps
  * @see PersistGateState
  */
@JSImport("redux-persist/integration/react", "PersistGate")
@js.native
class PersistGate ()
  extends Component[PersistGateProps, PersistorGateState, js.Any]

