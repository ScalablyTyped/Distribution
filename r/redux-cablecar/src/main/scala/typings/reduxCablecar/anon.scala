package typings.reduxCablecar

import typings.redux.mod.AnyAction
import typings.redux.mod.Store
import typings.reduxCablecar.mod.CableCar
import typings.reduxCablecar.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Connect extends StObject {
    
    def connect(store: Store[js.Any, AnyAction], channel: String): CableCar = js.native
    def connect(store: Store[js.Any, AnyAction], channel: String, options: Options): CableCar = js.native
    
    def setProvider(actionCableProvider: String): Unit = js.native
  }
}
