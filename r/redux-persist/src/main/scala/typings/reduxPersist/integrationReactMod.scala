package typings.reduxPersist

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reduxPersist.typesMod.Persistor
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
  class PersistGate protected ()
    extends PureComponent[PersistGateProps, PersistorGateState, js.Any] {
    def this(props: PersistGateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PersistGateProps, context: js.Any) = this()
  }
  
  /** @see PersistGate */
  trait PersistGateProps extends StObject {
    
    var children: js.UndefOr[ReactNode | (js.Function1[/* bootstrapped */ Boolean, ReactNode])] = js.undefined
    
    var loading: js.UndefOr[ReactNode] = js.undefined
    
    var onBeforeLift: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
    
    var persistor: Persistor
  }
  object PersistGateProps {
    
    @scala.inline
    def apply(persistor: Persistor): PersistGateProps = {
      val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistGateProps]
    }
    
    @scala.inline
    implicit class PersistGatePropsMutableBuilder[Self <: PersistGateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode | (js.Function1[/* bootstrapped */ Boolean, ReactNode])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* bootstrapped */ Boolean => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLoading(value: ReactNode): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnBeforeLift(value: () => Unit | js.Promise[Unit]): Self = StObject.set(x, "onBeforeLift", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBeforeLiftUndefined: Self = StObject.set(x, "onBeforeLift", js.undefined)
      
      @scala.inline
      def setPersistor(value: Persistor): Self = StObject.set(x, "persistor", value.asInstanceOf[js.Any])
    }
  }
  
  /** @see PersistGate */
  trait PersistorGateState extends StObject {
    
    var bootstrapped: Boolean
  }
  object PersistorGateState {
    
    @scala.inline
    def apply(bootstrapped: Boolean): PersistorGateState = {
      val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistorGateState]
    }
    
    @scala.inline
    implicit class PersistorGateStateMutableBuilder[Self <: PersistorGateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrapped(value: Boolean): Self = StObject.set(x, "bootstrapped", value.asInstanceOf[js.Any])
    }
  }
}
