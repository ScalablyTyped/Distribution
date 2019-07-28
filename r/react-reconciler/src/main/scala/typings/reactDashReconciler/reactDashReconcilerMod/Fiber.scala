package typings.reactDashReconciler.reactDashReconcilerMod

import typings.reactDashReconciler.Anon_StringRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactFiber
// A Fiber is work on a Component that needs to be done or was done. There can
// be more than one per component.
trait Fiber extends js.Object {
  // Conceptual aliases
  // workInProgress : Fiber ->  alternate The alternate used for reuse happens
  // to be the same as work in progress.
  // __DEV__ only
  var _debugID: js.UndefOr[Double] = js.undefined
  var _debugIsCurrentlyTiming: js.UndefOr[Boolean] = js.undefined
  var _debugOwner: js.UndefOr[Fiber | Null] = js.undefined
  var _debugSource: js.UndefOr[Source | Null] = js.undefined
  // Time spent rendering this Fiber and its descendants for the current update.
  // This tells us how well the tree makes use of sCU for memoization.
  // It is reset to 0 each time we render and only updated when we don't bailout.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var actualDuration: js.UndefOr[Double] = js.undefined
  // If the Fiber is currently active in the "render" phase,
  // This marks the time at which the work began.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var actualStartTime: js.UndefOr[Double] = js.undefined
  // This is a pooled version of a Fiber. Every fiber that gets updated will
  // eventually have a pair. There are cases when we can clean up pairs to save
  // memory if we need to.
  var alternate: Fiber | Null
  // Singly Linked List Tree Structure.
  var child: Fiber | Null
  // This is used to quickly determine if a subtree has no pending changes.
  var childExpirationTime: ExpirationTime
  // Effect
  var effectTag: SideEffectTag
  // The value of element.type which is used to preserve the identity during
  // reconciliation of this child.
  var elementType: js.Any
  // Represents a time in the future by which this work should be completed.
  // Does not include work found in its subtree.
  var expirationTime: ExpirationTime
  // A linked-list of contexts that this fiber depends on
  var firstContextDependency: ContextDependency[_] | Null
  // The first and last fiber with side-effect within this subtree. This allows
  // us to reuse a slice of the linked list when we reuse the work done within
  // this fiber.
  var firstEffect: Fiber | Null
  var index: Double
  // Unique identifier of this child.
  var key: Null | String
  var lastEffect: Fiber | Null
   // This type will be more specific once we overload the tag.
  var memoizedProps: js.Any
  // The state used to create the output
  var memoizedState: js.Any
  // Bitfield that describes properties about the fiber and its subtree. E.g.
  // the ConcurrentMode flag indicates whether the subtree should be async-by-
  // default. When a fiber is created, it inherits the mode of its
  // parent. Additional flags can be set at creation time, but after that the
  // value should remain unchanged throughout the fiber's lifetime, particularly
  // before its child fibers are created.
  var mode: TypeOfMode
  // Singly linked list fast path to the next fiber with side-effects.
  var nextEffect: Fiber | Null
  // Input is the data coming into process this fiber. Arguments. Props.
  var pendingProps: js.Any
  // The ref last used to attach this node.
  // I'll avoid adding an owner field for prod and model that as functions.
  var ref: Null | ((js.Function1[/* handle */ js.Any, Unit]) with Anon_StringRef) | RefObject
  // Conceptual aliases
  // parent : Instance -> return The parent happens to be the same as the
  // return fiber since we've merged the fiber and instance.
  // Remaining fields belong to Fiber
  // The Fiber to return to after finishing processing this one.
  // This is effectively the parent, but there can be multiple parents (two)
  // so this is only the parent of the thing we're currently processing.
  // It is conceptually the same as the return address of a stack frame.
  var `return`: Fiber | Null
  // Duration of the most recent render time for this Fiber.
  // This value is not updated when we bailout for memoization purposes.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var selfBaseDuration: js.UndefOr[Double] = js.undefined
  var sibling: Fiber | Null
  // The local state associated with this fiber.
  var stateNode: js.Any
  // These first fields are conceptually members of an Instance. This used to
  // be split into a separate type and intersected with the other Fiber fields,
  // but until Flow fixes its intersection bugs, we've merged them into a
  // single type.
  // An Instance is shared between all versions of a component. We can easily
  // break this out into a separate object to avoid copying so much to the
  // alternate versions of the tree. We put this on a single object for now to
  // minimize the number of objects created during the initial render.
  // Tag identifying the type of fiber.
  var tag: WorkTag
  // Sum of base times for all descedents of this Fiber.
  // This value bubbles up during the "complete" phase.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var treeBaseDuration: js.UndefOr[Double] = js.undefined
  // The resolved function/class/ associated with this fiber.
  var `type`: js.Any
   // The props used to create the output.
  // A queue of state updates and callbacks.
  var updateQueue: UpdateQueue[_] | Null
}

object Fiber {
  @scala.inline
  def apply(
    childExpirationTime: ExpirationTime,
    effectTag: SideEffectTag,
    elementType: js.Any,
    expirationTime: ExpirationTime,
    index: Double,
    memoizedProps: js.Any,
    memoizedState: js.Any,
    mode: TypeOfMode,
    pendingProps: js.Any,
    stateNode: js.Any,
    tag: WorkTag,
    `type`: js.Any,
    _debugID: Int | Double = null,
    _debugIsCurrentlyTiming: js.UndefOr[Boolean] = js.undefined,
    _debugOwner: Fiber = null,
    _debugSource: Source = null,
    actualDuration: Int | Double = null,
    actualStartTime: Int | Double = null,
    alternate: Fiber = null,
    child: Fiber = null,
    firstContextDependency: ContextDependency[_] = null,
    firstEffect: Fiber = null,
    key: String = null,
    lastEffect: Fiber = null,
    nextEffect: Fiber = null,
    ref: ((js.Function1[/* handle */ js.Any, Unit]) with Anon_StringRef) | RefObject = null,
    `return`: Fiber = null,
    selfBaseDuration: Int | Double = null,
    sibling: Fiber = null,
    treeBaseDuration: Int | Double = null,
    updateQueue: UpdateQueue[_] = null
  ): Fiber = {
    val __obj = js.Dynamic.literal(childExpirationTime = childExpirationTime, effectTag = effectTag, elementType = elementType, expirationTime = expirationTime, index = index, memoizedProps = memoizedProps, memoizedState = memoizedState, mode = mode, pendingProps = pendingProps, stateNode = stateNode, tag = tag)
    __obj.updateDynamic("type")(`type`)
    if (_debugID != null) __obj.updateDynamic("_debugID")(_debugID.asInstanceOf[js.Any])
    if (!js.isUndefined(_debugIsCurrentlyTiming)) __obj.updateDynamic("_debugIsCurrentlyTiming")(_debugIsCurrentlyTiming)
    if (_debugOwner != null) __obj.updateDynamic("_debugOwner")(_debugOwner)
    if (_debugSource != null) __obj.updateDynamic("_debugSource")(_debugSource)
    if (actualDuration != null) __obj.updateDynamic("actualDuration")(actualDuration.asInstanceOf[js.Any])
    if (actualStartTime != null) __obj.updateDynamic("actualStartTime")(actualStartTime.asInstanceOf[js.Any])
    if (alternate != null) __obj.updateDynamic("alternate")(alternate)
    if (child != null) __obj.updateDynamic("child")(child)
    if (firstContextDependency != null) __obj.updateDynamic("firstContextDependency")(firstContextDependency)
    if (firstEffect != null) __obj.updateDynamic("firstEffect")(firstEffect)
    if (key != null) __obj.updateDynamic("key")(key)
    if (lastEffect != null) __obj.updateDynamic("lastEffect")(lastEffect)
    if (nextEffect != null) __obj.updateDynamic("nextEffect")(nextEffect)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (`return` != null) __obj.updateDynamic("return")(`return`)
    if (selfBaseDuration != null) __obj.updateDynamic("selfBaseDuration")(selfBaseDuration.asInstanceOf[js.Any])
    if (sibling != null) __obj.updateDynamic("sibling")(sibling)
    if (treeBaseDuration != null) __obj.updateDynamic("treeBaseDuration")(treeBaseDuration.asInstanceOf[js.Any])
    if (updateQueue != null) __obj.updateDynamic("updateQueue")(updateQueue)
    __obj.asInstanceOf[Fiber]
  }
}

