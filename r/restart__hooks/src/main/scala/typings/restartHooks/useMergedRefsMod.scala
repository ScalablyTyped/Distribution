package typings.restartHooks

import typings.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@restart/hooks/cjs/useMergedRefs", JSImport.Namespace)
@js.native
object useMergedRefsMod extends js.Object {
  
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
  def default[T](): js.Function1[/* value */ T | Null, Unit] = js.native
  def default[T](refA: js.UndefOr[Ref[T]], refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = js.native
  def default[T](refA: Null, refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = js.native
  def default[T](refA: Ref[T]): js.Function1[/* value */ T | Null, Unit] = js.native
  
  def mergeRefs[T](): js.Function1[/* value */ T | Null, Unit] = js.native
  def mergeRefs[T](refA: js.UndefOr[Ref[T]], refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = js.native
  def mergeRefs[T](refA: Null, refB: Ref[T]): js.Function1[/* value */ T | Null, Unit] = js.native
  def mergeRefs[T](refA: Ref[T]): js.Function1[/* value */ T | Null, Unit] = js.native
  
  type CallbackRef[T] = js.Function1[/* ref */ T | Null, Unit]
  
  type Ref[T] = MutableRefObject[T] | CallbackRef[T]
}
