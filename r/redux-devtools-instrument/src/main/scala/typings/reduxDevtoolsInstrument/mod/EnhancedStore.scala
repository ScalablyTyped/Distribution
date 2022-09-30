package typings.reduxDevtoolsInstrument.mod

import typings.redux.mod.Action
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedStore[S, A /* <: Action[Any] */, MonitorState]
  extends StObject
     with Store[S, A]
     with InstrumentExt[S, A, MonitorState]
