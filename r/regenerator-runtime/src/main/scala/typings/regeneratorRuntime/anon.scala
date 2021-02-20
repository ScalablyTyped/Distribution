package typings.regeneratorRuntime

import typings.regeneratorRuntime.mod.CompletionRecord
import typings.regeneratorRuntime.mod.CompletionType
import typings.regeneratorRuntime.mod.ContextLocation
import typings.regeneratorRuntime.regeneratorRuntimeStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[TYield] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[typings.std.Iterator[TYield, _, _]] = js.native
  }
  
  @js.native
  trait Iterator[I /* <: typings.std.Iterator[_, _, _] */] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[I] = js.native
  }
  
  /* Inlined std.Readonly<regenerator-runtime.regenerator-runtime.CompletionRecord> */
  @js.native
  trait ReadonlyCompletionRecord extends StObject {
    
    val arg: js.Any = js.native
    
    val `type`: CompletionType = js.native
  }
  object ReadonlyCompletionRecord {
    
    @scala.inline
    def apply(arg: js.Any, `type`: CompletionType): ReadonlyCompletionRecord = {
      val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyCompletionRecord]
    }
    
    @scala.inline
    implicit class ReadonlyCompletionRecordMutableBuilder[Self <: ReadonlyCompletionRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArg(value: js.Any): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CompletionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined { readonly tryLoc :'root'} & std.Omit<regenerator-runtime.regenerator-runtime.TryEntry, 'tryLoc'> */
  @js.native
  trait readonlytryLocrootOmitTry extends StObject {
    
    var afterLoc: js.UndefOr[ContextLocation] = js.native
    
    var catchLoc: js.UndefOr[Double] = js.native
    
    var completion: js.UndefOr[CompletionRecord] = js.native
    
    var finallyLoc: js.UndefOr[Double] = js.native
    
    val tryLoc: root = js.native
  }
  object readonlytryLocrootOmitTry {
    
    @scala.inline
    def apply(tryLoc: root): readonlytryLocrootOmitTry = {
      val __obj = js.Dynamic.literal(tryLoc = tryLoc.asInstanceOf[js.Any])
      __obj.asInstanceOf[readonlytryLocrootOmitTry]
    }
    
    @scala.inline
    implicit class readonlytryLocrootOmitTryMutableBuilder[Self <: readonlytryLocrootOmitTry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterLoc(value: ContextLocation): Self = StObject.set(x, "afterLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterLocUndefined: Self = StObject.set(x, "afterLoc", js.undefined)
      
      @scala.inline
      def setCatchLoc(value: Double): Self = StObject.set(x, "catchLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatchLocUndefined: Self = StObject.set(x, "catchLoc", js.undefined)
      
      @scala.inline
      def setCompletion(value: CompletionRecord): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompletionUndefined: Self = StObject.set(x, "completion", js.undefined)
      
      @scala.inline
      def setFinallyLoc(value: Double): Self = StObject.set(x, "finallyLoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinallyLocUndefined: Self = StObject.set(x, "finallyLoc", js.undefined)
      
      @scala.inline
      def setTryLoc(value: root): Self = StObject.set(x, "tryLoc", value.asInstanceOf[js.Any])
    }
  }
}
