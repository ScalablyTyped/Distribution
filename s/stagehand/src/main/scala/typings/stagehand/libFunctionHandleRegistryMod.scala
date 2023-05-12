package typings.stagehand

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFunctionHandleRegistryMod {
  
  @JSImport("stagehand/lib/function-handle-registry", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with FunctionHandleRegistry {
    def this(hydrateRemoteFunction: js.Function1[/* handle */ Handle, js.Function1[/* repeated */ Any, Any]]) = this()
    
    /* CompleteClass */
    override def dehydrate[T](root: T): Dehydrated[T] = js.native
    
    /* private */ /* CompleteClass */
    var functionsByHandle: Any = js.native
    
    /* private */ /* CompleteClass */
    var generateHAndle: Any = js.native
    
    /* private */ /* CompleteClass */
    var handlesByFunction: Any = js.native
    
    /* private */ /* CompleteClass */
    var hydrateRemoteFunction: Any = js.native
    
    /* CompleteClass */
    override def lookupFunction(handle: Handle): js.UndefOr[js.Function] = js.native
    
    /* CompleteClass */
    override def lookupHandle(f: js.Function): js.UndefOr[Handle] = js.native
    
    /* private */ /* CompleteClass */
    var lookupOrGenerateHandle: Any = js.native
    
    /* private */ /* CompleteClass */
    var nextFunctionHandle: Any = js.native
    
    /* CompleteClass */
    override def rehydrate[T /* <: Dehydrated[Any] */](root: T): Hydrated[T] = js.native
    
    /* CompleteClass */
    override def releaseFunction(f: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  @js.native
  trait Dehydrated[T] extends StObject
  
  @js.native
  trait DehydratedHandle extends StObject
  
  trait FunctionHandleRegistry extends StObject {
    
    def dehydrate[T](root: T): Dehydrated[T]
    
    /* private */ var functionsByHandle: Any
    
    /* private */ var generateHAndle: Any
    
    /* private */ var handlesByFunction: Any
    
    /* private */ var hydrateRemoteFunction: Any
    
    def lookupFunction(handle: Handle): js.UndefOr[js.Function]
    
    def lookupHandle(f: js.Function): js.UndefOr[Handle]
    
    /* private */ var lookupOrGenerateHandle: Any
    
    /* private */ var nextFunctionHandle: Any
    
    def rehydrate[T /* <: Dehydrated[Any] */](root: T): Hydrated[T]
    
    def releaseFunction(f: js.Function): Unit
    
    def reset(): Unit
  }
  object FunctionHandleRegistry {
    
    inline def apply(
      dehydrate: Any => Dehydrated[Any],
      functionsByHandle: Any,
      generateHAndle: Any,
      handlesByFunction: Any,
      hydrateRemoteFunction: Any,
      lookupFunction: Handle => js.UndefOr[js.Function],
      lookupHandle: js.Function => js.UndefOr[Handle],
      lookupOrGenerateHandle: Any,
      nextFunctionHandle: Any,
      rehydrate: Any => Hydrated[Any],
      releaseFunction: js.Function => Unit,
      reset: () => Unit
    ): FunctionHandleRegistry = {
      val __obj = js.Dynamic.literal(dehydrate = js.Any.fromFunction1(dehydrate), functionsByHandle = functionsByHandle.asInstanceOf[js.Any], generateHAndle = generateHAndle.asInstanceOf[js.Any], handlesByFunction = handlesByFunction.asInstanceOf[js.Any], hydrateRemoteFunction = hydrateRemoteFunction.asInstanceOf[js.Any], lookupFunction = js.Any.fromFunction1(lookupFunction), lookupHandle = js.Any.fromFunction1(lookupHandle), lookupOrGenerateHandle = lookupOrGenerateHandle.asInstanceOf[js.Any], nextFunctionHandle = nextFunctionHandle.asInstanceOf[js.Any], rehydrate = js.Any.fromFunction1(rehydrate), releaseFunction = js.Any.fromFunction1(releaseFunction), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[FunctionHandleRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FunctionHandleRegistry] (val x: Self) extends AnyVal {
      
      inline def setDehydrate(value: Any => Dehydrated[Any]): Self = StObject.set(x, "dehydrate", js.Any.fromFunction1(value))
      
      inline def setFunctionsByHandle(value: Any): Self = StObject.set(x, "functionsByHandle", value.asInstanceOf[js.Any])
      
      inline def setGenerateHAndle(value: Any): Self = StObject.set(x, "generateHAndle", value.asInstanceOf[js.Any])
      
      inline def setHandlesByFunction(value: Any): Self = StObject.set(x, "handlesByFunction", value.asInstanceOf[js.Any])
      
      inline def setHydrateRemoteFunction(value: Any): Self = StObject.set(x, "hydrateRemoteFunction", value.asInstanceOf[js.Any])
      
      inline def setLookupFunction(value: Handle => js.UndefOr[js.Function]): Self = StObject.set(x, "lookupFunction", js.Any.fromFunction1(value))
      
      inline def setLookupHandle(value: js.Function => js.UndefOr[Handle]): Self = StObject.set(x, "lookupHandle", js.Any.fromFunction1(value))
      
      inline def setLookupOrGenerateHandle(value: Any): Self = StObject.set(x, "lookupOrGenerateHandle", value.asInstanceOf[js.Any])
      
      inline def setNextFunctionHandle(value: Any): Self = StObject.set(x, "nextFunctionHandle", value.asInstanceOf[js.Any])
      
      inline def setRehydrate(value: Any => Hydrated[Any]): Self = StObject.set(x, "rehydrate", js.Any.fromFunction1(value))
      
      inline def setReleaseFunction(value: js.Function => Unit): Self = StObject.set(x, "releaseFunction", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  type Handle = js.Symbol
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends stagehand.stagehand/lib/function-handle-registry.Dehydrated<infer U> ? U : never
    }}}
    */
  @js.native
  trait Hydrated[T /* <: Dehydrated[Any] */] extends StObject
}
