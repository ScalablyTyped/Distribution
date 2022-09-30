package typings.reactRedux

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSyncExternalStoreMod {
  
  @JSImport("react-redux/es/utils/useSyncExternalStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def notInitialized(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("notInitialized")().asInstanceOf[scala.Nothing]
  
  @js.native
  trait uSES extends StObject {
    
    def apply[Snapshot](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot]
    ): Snapshot = js.native
    def apply[Snapshot](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: js.Function0[Snapshot]
    ): Snapshot = js.native
  }
  
  @js.native
  trait uSESWS extends StObject {
    
    def apply[Snapshot, Selection](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: js.Function0[Snapshot],
      selector: js.Function1[/* snapshot */ Snapshot, Selection]
    ): Selection = js.native
    def apply[Snapshot, Selection](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: js.Function0[Snapshot],
      selector: js.Function1[/* snapshot */ Snapshot, Selection],
      isEqual: js.Function2[/* a */ Selection, /* b */ Selection, Boolean]
    ): Selection = js.native
    def apply[Snapshot, Selection](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: Null,
      selector: js.Function1[/* snapshot */ Snapshot, Selection]
    ): Selection = js.native
    def apply[Snapshot, Selection](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: Null,
      selector: js.Function1[/* snapshot */ Snapshot, Selection],
      isEqual: js.Function2[/* a */ Selection, /* b */ Selection, Boolean]
    ): Selection = js.native
    def apply[Snapshot, Selection](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: Unit,
      selector: js.Function1[/* snapshot */ Snapshot, Selection]
    ): Selection = js.native
    def apply[Snapshot, Selection](
      subscribe: js.Function1[/* onStoreChange */ js.Function0[Unit], js.Function0[Unit]],
      getSnapshot: js.Function0[Snapshot],
      getServerSnapshot: Unit,
      selector: js.Function1[/* snapshot */ Snapshot, Selection],
      isEqual: js.Function2[/* a */ Selection, /* b */ Selection, Boolean]
    ): Selection = js.native
  }
}
