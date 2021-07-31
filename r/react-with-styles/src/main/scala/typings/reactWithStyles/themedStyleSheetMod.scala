package typings.reactWithStyles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themedStyleSheetMod {
  
  object default {
    
    @JSImport("react-with-styles/lib/ThemedStyleSheet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(makeFromTheme: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(makeFromTheme.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def createLTR(makeFromTheme: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createLTR")(makeFromTheme.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def createRTL(makeFromTheme: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRTL")(makeFromTheme.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    @scala.inline
    def get(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Any]
    
    @scala.inline
    def registerInterface(registerInterface: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInterface")(registerInterface.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def registerTheme(theme: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def resolve(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[js.Any]
    
    @scala.inline
    def resolveLTR(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLTR")().asInstanceOf[js.Any]
    
    @scala.inline
    def resolveRTL(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRTL")().asInstanceOf[js.Any]
  }
  
  trait ThemedStyleSheet extends StObject {
    
    def create(makeFromTheme: js.Any): js.Any
    
    def createLTR(makeFromTheme: js.Any): js.Any
    
    def createRTL(makeFromTheme: js.Any): js.Any
    
    def flush(): Unit
    
    def get(): js.Any
    
    def registerInterface(registerInterface: js.Any): Unit
    
    def registerTheme(theme: js.Any): Unit
    
    def resolve(): js.Any
    
    def resolveLTR(): js.Any
    
    def resolveRTL(): js.Any
  }
  object ThemedStyleSheet {
    
    @scala.inline
    def apply(
      create: js.Any => js.Any,
      createLTR: js.Any => js.Any,
      createRTL: js.Any => js.Any,
      flush: () => Unit,
      get: () => js.Any,
      registerInterface: js.Any => Unit,
      registerTheme: js.Any => Unit,
      resolve: () => js.Any,
      resolveLTR: () => js.Any,
      resolveRTL: () => js.Any
    ): ThemedStyleSheet = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createLTR = js.Any.fromFunction1(createLTR), createRTL = js.Any.fromFunction1(createRTL), flush = js.Any.fromFunction0(flush), get = js.Any.fromFunction0(get), registerInterface = js.Any.fromFunction1(registerInterface), registerTheme = js.Any.fromFunction1(registerTheme), resolve = js.Any.fromFunction0(resolve), resolveLTR = js.Any.fromFunction0(resolveLTR), resolveRTL = js.Any.fromFunction0(resolveRTL))
      __obj.asInstanceOf[ThemedStyleSheet]
    }
    
    @scala.inline
    implicit class ThemedStyleSheetMutableBuilder[Self <: ThemedStyleSheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: js.Any => js.Any): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateLTR(value: js.Any => js.Any): Self = StObject.set(x, "createLTR", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateRTL(value: js.Any => js.Any): Self = StObject.set(x, "createRTL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterInterface(value: js.Any => Unit): Self = StObject.set(x, "registerInterface", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterTheme(value: js.Any => Unit): Self = StObject.set(x, "registerTheme", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolve(value: () => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResolveLTR(value: () => js.Any): Self = StObject.set(x, "resolveLTR", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResolveRTL(value: () => js.Any): Self = StObject.set(x, "resolveRTL", js.Any.fromFunction0(value))
    }
  }
}
