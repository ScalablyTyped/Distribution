package typings.reactReconciler.mod

import typings.reactReconciler.anon.StringRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fiber extends StObject {
  
  // Used to verify that the order of hooks does not change between renders.
  var _debugHookTypes: js.UndefOr[js.Array[HookType] | Null] = js.undefined
  
  // Conceptual aliases
  // workInProgress : Fiber ->  alternate The alternate used for reuse happens
  // to be the same as work in progress.
  // __DEV__ only
  var _debugID: js.UndefOr[Double] = js.undefined
  
  var _debugIsCurrentlyTiming: js.UndefOr[Boolean] = js.undefined
  
  var _debugNeedsRemount: js.UndefOr[Boolean] = js.undefined
  
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
  
  var childLanes: Lanes
  
  var deletions: js.Array[Fiber] | Null
  
  // Dependencies (contexts, events) for this fiber, if it has any
  var dependencies: Dependencies | Null
  
  // The value of element.type which is used to preserve the identity during
  // reconciliation of this child.
  var elementType: Any
  
  // The first and last fiber with side-effect within this subtree. This allows
  // us to reuse a slice of the linked list when we reuse the work done within
  // this fiber.
  var firstEffect: Fiber | Null
  
  // Effect
  var flags: Flags
  
  var index: Double
  
  // Unique identifier of this child.
  var key: Null | String
  
  var lanes: Lanes
  
  var lastEffect: Fiber | Null
  
  // This type will be more specific once we overload the tag.
  var memoizedProps: Any
  
  // The state used to create the output
  var memoizedState: Any
  
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
  var pendingProps: Any
  
  // The ref last used to attach this node.
  // I'll avoid adding an owner field for prod and model that as functions.
  var ref: Null | ((js.Function1[/* handle */ Any, Unit]) & StringRef) | RefObject
  
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
  var stateNode: Any
  
  var subtreeFlags: Flags
  
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
  
  // Sum of base times for all descendants of this Fiber.
  // This value bubbles up during the "complete" phase.
  // This field is only set when the enableProfilerTimer flag is enabled.
  var treeBaseDuration: js.UndefOr[Double] = js.undefined
  
  // The resolved function/class/ associated with this fiber.
  var `type`: Any
  
  // The props used to create the output.
  // A queue of state updates and callbacks.
  var updateQueue: Any
}
object Fiber {
  
  inline def apply(
    childLanes: Lanes,
    elementType: Any,
    flags: Flags,
    index: Double,
    lanes: Lanes,
    memoizedProps: Any,
    memoizedState: Any,
    mode: TypeOfMode,
    pendingProps: Any,
    stateNode: Any,
    subtreeFlags: Flags,
    tag: WorkTag,
    `type`: Any,
    updateQueue: Any
  ): Fiber = {
    val __obj = js.Dynamic.literal(childLanes = childLanes.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], memoizedProps = memoizedProps.asInstanceOf[js.Any], memoizedState = memoizedState.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pendingProps = pendingProps.asInstanceOf[js.Any], stateNode = stateNode.asInstanceOf[js.Any], subtreeFlags = subtreeFlags.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], updateQueue = updateQueue.asInstanceOf[js.Any], alternate = null, child = null, deletions = null, dependencies = null, firstEffect = null, key = null, lastEffect = null, nextEffect = null, ref = null, sibling = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("return")(null)
    __obj.asInstanceOf[Fiber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fiber] (val x: Self) extends AnyVal {
    
    inline def setActualDuration(value: Double): Self = StObject.set(x, "actualDuration", value.asInstanceOf[js.Any])
    
    inline def setActualDurationUndefined: Self = StObject.set(x, "actualDuration", js.undefined)
    
    inline def setActualStartTime(value: Double): Self = StObject.set(x, "actualStartTime", value.asInstanceOf[js.Any])
    
    inline def setActualStartTimeUndefined: Self = StObject.set(x, "actualStartTime", js.undefined)
    
    inline def setAlternate(value: Fiber): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateNull: Self = StObject.set(x, "alternate", null)
    
    inline def setChild(value: Fiber): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
    
    inline def setChildLanes(value: Lanes): Self = StObject.set(x, "childLanes", value.asInstanceOf[js.Any])
    
    inline def setChildNull: Self = StObject.set(x, "child", null)
    
    inline def setDeletions(value: js.Array[Fiber]): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    inline def setDeletionsNull: Self = StObject.set(x, "deletions", null)
    
    inline def setDeletionsVarargs(value: Fiber*): Self = StObject.set(x, "deletions", js.Array(value*))
    
    inline def setDependencies(value: Dependencies): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesNull: Self = StObject.set(x, "dependencies", null)
    
    inline def setElementType(value: Any): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setFirstEffect(value: Fiber): Self = StObject.set(x, "firstEffect", value.asInstanceOf[js.Any])
    
    inline def setFirstEffectNull: Self = StObject.set(x, "firstEffect", null)
    
    inline def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setLanes(value: Lanes): Self = StObject.set(x, "lanes", value.asInstanceOf[js.Any])
    
    inline def setLastEffect(value: Fiber): Self = StObject.set(x, "lastEffect", value.asInstanceOf[js.Any])
    
    inline def setLastEffectNull: Self = StObject.set(x, "lastEffect", null)
    
    inline def setMemoizedProps(value: Any): Self = StObject.set(x, "memoizedProps", value.asInstanceOf[js.Any])
    
    inline def setMemoizedState(value: Any): Self = StObject.set(x, "memoizedState", value.asInstanceOf[js.Any])
    
    inline def setMode(value: TypeOfMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNextEffect(value: Fiber): Self = StObject.set(x, "nextEffect", value.asInstanceOf[js.Any])
    
    inline def setNextEffectNull: Self = StObject.set(x, "nextEffect", null)
    
    inline def setPendingProps(value: Any): Self = StObject.set(x, "pendingProps", value.asInstanceOf[js.Any])
    
    inline def setRef(value: ((js.Function1[/* handle */ Any, Unit]) & StringRef) | RefObject): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setReturn(value: Fiber): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
    
    inline def setReturnNull: Self = StObject.set(x, "return", null)
    
    inline def setSelfBaseDuration(value: Double): Self = StObject.set(x, "selfBaseDuration", value.asInstanceOf[js.Any])
    
    inline def setSelfBaseDurationUndefined: Self = StObject.set(x, "selfBaseDuration", js.undefined)
    
    inline def setSibling(value: Fiber): Self = StObject.set(x, "sibling", value.asInstanceOf[js.Any])
    
    inline def setSiblingNull: Self = StObject.set(x, "sibling", null)
    
    inline def setStateNode(value: Any): Self = StObject.set(x, "stateNode", value.asInstanceOf[js.Any])
    
    inline def setSubtreeFlags(value: Flags): Self = StObject.set(x, "subtreeFlags", value.asInstanceOf[js.Any])
    
    inline def setTag(value: WorkTag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTreeBaseDuration(value: Double): Self = StObject.set(x, "treeBaseDuration", value.asInstanceOf[js.Any])
    
    inline def setTreeBaseDurationUndefined: Self = StObject.set(x, "treeBaseDuration", js.undefined)
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateQueue(value: Any): Self = StObject.set(x, "updateQueue", value.asInstanceOf[js.Any])
    
    inline def set_debugHookTypes(value: js.Array[HookType]): Self = StObject.set(x, "_debugHookTypes", value.asInstanceOf[js.Any])
    
    inline def set_debugHookTypesNull: Self = StObject.set(x, "_debugHookTypes", null)
    
    inline def set_debugHookTypesUndefined: Self = StObject.set(x, "_debugHookTypes", js.undefined)
    
    inline def set_debugHookTypesVarargs(value: HookType*): Self = StObject.set(x, "_debugHookTypes", js.Array(value*))
    
    inline def set_debugID(value: Double): Self = StObject.set(x, "_debugID", value.asInstanceOf[js.Any])
    
    inline def set_debugIDUndefined: Self = StObject.set(x, "_debugID", js.undefined)
    
    inline def set_debugIsCurrentlyTiming(value: Boolean): Self = StObject.set(x, "_debugIsCurrentlyTiming", value.asInstanceOf[js.Any])
    
    inline def set_debugIsCurrentlyTimingUndefined: Self = StObject.set(x, "_debugIsCurrentlyTiming", js.undefined)
    
    inline def set_debugNeedsRemount(value: Boolean): Self = StObject.set(x, "_debugNeedsRemount", value.asInstanceOf[js.Any])
    
    inline def set_debugNeedsRemountUndefined: Self = StObject.set(x, "_debugNeedsRemount", js.undefined)
    
    inline def set_debugOwner(value: Fiber): Self = StObject.set(x, "_debugOwner", value.asInstanceOf[js.Any])
    
    inline def set_debugOwnerNull: Self = StObject.set(x, "_debugOwner", null)
    
    inline def set_debugOwnerUndefined: Self = StObject.set(x, "_debugOwner", js.undefined)
    
    inline def set_debugSource(value: Source): Self = StObject.set(x, "_debugSource", value.asInstanceOf[js.Any])
    
    inline def set_debugSourceNull: Self = StObject.set(x, "_debugSource", null)
    
    inline def set_debugSourceUndefined: Self = StObject.set(x, "_debugSource", js.undefined)
  }
}
