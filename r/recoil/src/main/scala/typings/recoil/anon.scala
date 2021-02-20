package typings.recoil

import typings.recoil.mod.DefaultValue
import typings.recoil.mod.GetRecoilValue
import typings.recoil.mod.Loadable
import typings.recoil.mod.LoadablePromise
import typings.recoil.mod.RecoilState
import typings.recoil.mod.RecoilValue
import typings.recoil.mod.ResetRecoilState
import typings.recoil.mod.SetRecoilState
import typings.recoil.recoilStrings.hasError
import typings.recoil.recoilStrings.hasValue
import typings.recoil.recoilStrings.loading
import typings.std.Error
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Contents[T] extends Loadable[T] {
    
    var contents: T = js.native
    
    var state: hasValue = js.native
  }
  object Contents {
    
    @scala.inline
    def apply[T](contents: T, state: hasValue): Contents[T] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents[T]]
    }
    
    @scala.inline
    implicit class ContentsMutableBuilder[Self <: Contents[_], T] (val x: Self with Contents[T]) extends AnyVal {
      
      @scala.inline
      def setContents(value: T): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: hasValue): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Get extends StObject {
    
    var get: GetRecoilValue = js.native
  }
  object Get {
    
    @scala.inline
    def apply(get: /* recoilVal */ RecoilValue[js.Any] => js.Any): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: /* recoilVal */ RecoilValue[js.Any] => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<{  state :'hasError',   contents :std.Error}> */
  @js.native
  trait ReadonlystatehasErrorcont
    extends Loadable[js.Any] {
    
    val contents: Error = js.native
    
    val state: hasError = js.native
  }
  object ReadonlystatehasErrorcont {
    
    @scala.inline
    def apply(contents: Error, state: hasError): ReadonlystatehasErrorcont = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlystatehasErrorcont]
    }
    
    @scala.inline
    implicit class ReadonlystatehasErrorcontMutableBuilder[Self <: ReadonlystatehasErrorcont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: Error): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: hasError): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Reset extends StObject {
    
    var get: GetRecoilValue = js.native
    
    var reset: ResetRecoilState = js.native
    
    var set: SetRecoilState = js.native
  }
  object Reset {
    
    @scala.inline
    def apply(
      get: /* recoilVal */ RecoilValue[js.Any] => js.Any,
      reset: /* recoilVal */ RecoilState[js.Any] => Unit,
      set: (/* recoilVal */ RecoilState[js.Any], /* newVal */ js.Any | DefaultValue | (js.Function1[/* prevValue */ js.Any, js.Any | DefaultValue])) => Unit
    ): Reset = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Reset]
    }
    
    @scala.inline
    implicit class ResetMutableBuilder[Self <: Reset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: /* recoilVal */ RecoilValue[js.Any] => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: /* recoilVal */ RecoilState[js.Any] => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(
        value: (/* recoilVal */ RecoilState[js.Any], /* newVal */ js.Any | DefaultValue | (js.Function1[/* prevValue */ js.Any, js.Any | DefaultValue])) => Unit
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Set extends StObject {
    
    def set[T](recoilVal: RecoilState[T], newVal: T): Unit = js.native
    
    def setUnvalidatedAtomValues(atomMap: Map[String, _]): Unit = js.native
  }
  object Set {
    
    @scala.inline
    def apply(set: (RecoilState[js.Any], js.Any) => Unit, setUnvalidatedAtomValues: Map[String, _] => Unit): Set = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set), setUnvalidatedAtomValues = js.Any.fromFunction1(setUnvalidatedAtomValues))
      __obj.asInstanceOf[Set]
    }
    
    @scala.inline
    implicit class SetMutableBuilder[Self <: Set] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSet(value: (RecoilState[js.Any], js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetUnvalidatedAtomValues(value: Map[String, _] => Unit): Self = StObject.set(x, "setUnvalidatedAtomValues", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait State[T] extends Loadable[T] {
    
    var contents: LoadablePromise[T] = js.native
    
    var state: loading = js.native
  }
  object State {
    
    @scala.inline
    def apply[T](contents: LoadablePromise[T], state: loading): State[T] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[T]]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State[_], T] (val x: Self with State[T]) extends AnyVal {
      
      @scala.inline
      def setContents(value: LoadablePromise[T]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: loading): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
