package typings.regeneratorRuntime

import typings.regeneratorRuntime.mod.CompletionRecord
import typings.regeneratorRuntime.mod.CompletionType
import typings.regeneratorRuntime.mod.ContextLocation
import typings.regeneratorRuntime.regeneratorRuntimeStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[TYield] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[TYield]] = js.native
  }
  
  @js.native
  trait Iterator[I /* <: js.Iterator[Any] */] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[I] = js.native
  }
  
  /* Inlined std.Readonly<regenerator-runtime.regenerator-runtime.CompletionRecord> */
  trait ReadonlyCompletionRecord extends StObject {
    
    val arg: Any
    
    val `type`: CompletionType
  }
  object ReadonlyCompletionRecord {
    
    inline def apply(arg: Any, `type`: CompletionType): ReadonlyCompletionRecord = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyCompletionRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyCompletionRecord] (val x: Self) extends AnyVal {
      
      inline def setArg(value: Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      inline def setType(value: CompletionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined { readonly tryLoc :'root'} & std.Omit<regenerator-runtime.regenerator-runtime.TryEntry, 'tryLoc'> */
  trait readonlytryLocrootOmitTry extends StObject {
    
    var afterLoc: js.UndefOr[ContextLocation] = js.undefined
    
    var catchLoc: js.UndefOr[Double] = js.undefined
    
    var completion: js.UndefOr[CompletionRecord] = js.undefined
    
    var finallyLoc: js.UndefOr[Double] = js.undefined
    
    val tryLoc: root
  }
  object readonlytryLocrootOmitTry {
    
    inline def apply(): readonlytryLocrootOmitTry = {
      val __obj = js.Dynamic.literal(tryLoc = "root")
      __obj.asInstanceOf[readonlytryLocrootOmitTry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: readonlytryLocrootOmitTry] (val x: Self) extends AnyVal {
      
      inline def setAfterLoc(value: ContextLocation): Self = StObject.set(x, "afterLoc", value.asInstanceOf[js.Any])
      
      inline def setAfterLocUndefined: Self = StObject.set(x, "afterLoc", js.undefined)
      
      inline def setCatchLoc(value: Double): Self = StObject.set(x, "catchLoc", value.asInstanceOf[js.Any])
      
      inline def setCatchLocUndefined: Self = StObject.set(x, "catchLoc", js.undefined)
      
      inline def setCompletion(value: CompletionRecord): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      inline def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      inline def setFinallyLoc(value: Double): Self = StObject.set(x, "finallyLoc", value.asInstanceOf[js.Any])
      
      inline def setFinallyLocUndefined: Self = StObject.set(x, "finallyLoc", js.undefined)
      
      inline def setTryLoc(value: root): Self = StObject.set(x, "tryLoc", value.asInstanceOf[js.Any])
    }
  }
}
