package typings.restartHooks

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMergedRefsMod {
  
  @JSImport("@restart/hooks/cjs/useMergedRefs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create and returns a single callback ref composed from two other Refs.
    *
    * ```tsx
    * const Button = React.forwardRef((props, ref) => {
    *   const [element, attachRef] = useCallbackRef<HTMLButtonElement>();
    *   const mergedRef = useMergedRefs(ref, attachRef);
    *
    *   return <button ref={mergedRef} {...props}/>
    * })
    * ```
    *
    * @param refA A Callback or mutable Ref
    * @param refB A Callback or mutable Ref
    * @category refs
    */
  inline def default[T](): js.Function1[/* value */ T | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  inline def default[T](refA: Null, refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  inline def default[T](refA: Unit, refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  inline def default[T](refA: Ref[T]): js.Function1[/* value */ T | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(refA.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  inline def default[T](refA: Ref[T], refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  
  inline def mergeRefs[T](): js.Function1[/* value */ T | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")().asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  inline def mergeRefs[T](refA: Null, refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  inline def mergeRefs[T](refA: Unit, refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  inline def mergeRefs[T](refA: Ref[T]): js.Function1[/* value */ T | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refA.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  inline def mergeRefs[T](refA: Ref[T], refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refA.asInstanceOf[js.Any], refB.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ T | Null, Unit]]
  
  type CallbackRef[T] = js.Function1[/* ref */ T | Null, Unit]
  
  type Ref[T] = MutableRefObject[T] | CallbackRef[T]
}
