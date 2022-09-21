package typings.socketioWildcard

import typings.socketIo.mod.Socket
import typings.socketIo.typedEventsMod.DefaultEventsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function2[
    /* socket */ (Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientSocket */ Any), 
    /* next */ js.UndefOr[js.Function1[/* err */ js.UndefOr[Any], Unit]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function2[
    /* socket */ (Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientSocket */ Any), 
    /* next */ js.UndefOr[js.Function1[/* err */ js.UndefOr[Any], Unit]], 
    Unit
  ]]
  inline def apply(emitterCtor: js.Object): js.Function2[
    /* socket */ (Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientSocket */ Any), 
    /* next */ js.UndefOr[js.Function1[/* err */ js.UndefOr[Any], Unit]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply(emitterCtor.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* socket */ (Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientSocket */ Any), 
    /* next */ js.UndefOr[js.Function1[/* err */ js.UndefOr[Any], Unit]], 
    Unit
  ]]
  
  @JSImport("socketio-wildcard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
