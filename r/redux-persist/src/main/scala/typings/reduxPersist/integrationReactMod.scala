package typings.reduxPersist

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reduxPersist.esTypesMod.Persistor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationReactMod {
  
  /**
    * Entry point of your react application to allow it persist a given store @see Persistor and its configuration.
    * @see Persistor
    * @see PersistGateProps
    * @see PersistGateState
    */
  @JSImport("redux-persist/integration/react", "PersistGate")
  @js.native
  open class PersistGate protected () extends PureComponent[PersistGateProps, PersistorGateState, Any] {
    def this(props: PersistGateProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: PersistGateProps, context: Any) = this()
  }
  
  /** @see PersistGate */
  trait PersistGateProps extends StObject {
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* bootstrapped */ Boolean, ReactNode])] = js.undefined
    
    var loading: js.UndefOr[ReactNode] = js.undefined
    
    var onBeforeLift: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
    
    var persistor: Persistor
  }
  object PersistGateProps {
    
    inline def apply(persistor: Persistor): PersistGateProps = {
      val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistGateProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistGateProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* bootstrapped */ Boolean, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* bootstrapped */ Boolean => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setLoading(value: ReactNode): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnBeforeLift(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onBeforeLift", js.Any.fromFunction0(value))
      
      inline def setOnBeforeLiftUndefined: Self = StObject.set(x, "onBeforeLift", js.undefined)
      
      inline def setPersistor(value: Persistor): Self = StObject.set(x, "persistor", value.asInstanceOf[js.Any])
    }
  }
  
  /** @see PersistGate */
  trait PersistorGateState extends StObject {
    
    var bootstrapped: Boolean
  }
  object PersistorGateState {
    
    inline def apply(bootstrapped: Boolean): PersistorGateState = {
      val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistorGateState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistorGateState] (val x: Self) extends AnyVal {
      
      inline def setBootstrapped(value: Boolean): Self = StObject.set(x, "bootstrapped", value.asInstanceOf[js.Any])
    }
  }
}
