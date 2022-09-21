package typings.recoil.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RecoilLoadable {
  
  @JSImport("recoil", "RecoilLoadable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all[Inputs /* <: StringDictionary[Any] */](inputs: Inputs): Loadable[UnwrapLoadables[Inputs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(inputs.asInstanceOf[js.Any]).asInstanceOf[Loadable[UnwrapLoadables[Inputs]]]
  
  /**
    * Factory to make a Loadable which is resolved when all of the Loadables provided
    * to it are resolved or any one has an error.  The value is an array of the values
    * of all of the provided Loadables.  This is comparable to Promise.all() for Loadables.
    * Similar to Promise.all(), inputs may be Loadables, Promises, or literal values.
    */
  inline def all_Inputs_ArrayUnionAnyLoadableAny[Inputs /* <: js.Array[Any | Loadable[Any]] */](inputs: Inputs): Loadable[UnwrapLoadables[Inputs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(inputs.asInstanceOf[js.Any]).asInstanceOf[Loadable[UnwrapLoadables[Inputs]]]
  
  /**
    * Factory to make a Loadable object in an error state.
    */
  inline def error(x: Any): ErrorLoadable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(x.asInstanceOf[js.Any]).asInstanceOf[ErrorLoadable[Any]]
  
  /**
    * Returns true if the provided parameter is a Loadable type.
    */
  inline def isLoadable(x: Any): /* is recoil.recoil.Loadable<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoadable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is recoil.recoil.Loadable<any> */ Boolean]
  
  /**
    * Factory to make a loading Loadable which never resolves.
    */
  inline def loading(): LoadingLoadable[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")().asInstanceOf[LoadingLoadable[Any]]
  
  /**
    * Factory to make a Loadable object.  If a Promise is provided the Loadable will
    * be in a 'loading' state until the Promise is either resolved or rejected.
    */
  inline def of[T](x: T): Loadable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(x.asInstanceOf[js.Any]).asInstanceOf[Loadable[T]]
  inline def of[T](x: js.Promise[T]): Loadable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(x.asInstanceOf[js.Any]).asInstanceOf[Loadable[T]]
  inline def of[T](x: Loadable[T]): Loadable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(x.asInstanceOf[js.Any]).asInstanceOf[Loadable[T]]
}
