package typings.reactWithStyles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themedStyleSheetMod {
  
  object default {
    
    @JSImport("react-with-styles/lib/ThemedStyleSheet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(makeFromTheme: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(makeFromTheme.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def createLTR(makeFromTheme: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createLTR")(makeFromTheme.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def createRTL(makeFromTheme: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRTL")(makeFromTheme.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    inline def get(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Any]
    
    inline def registerInterface(registerInterface: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInterface")(registerInterface.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerTheme(theme: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def resolve(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[Any]
    
    inline def resolveLTR(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLTR")().asInstanceOf[Any]
    
    inline def resolveRTL(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRTL")().asInstanceOf[Any]
  }
  
  trait ThemedStyleSheet extends StObject {
    
    def create(makeFromTheme: Any): Any
    
    def createLTR(makeFromTheme: Any): Any
    
    def createRTL(makeFromTheme: Any): Any
    
    def flush(): Unit
    
    def get(): Any
    
    def registerInterface(registerInterface: Any): Unit
    
    def registerTheme(theme: Any): Unit
    
    def resolve(): Any
    
    def resolveLTR(): Any
    
    def resolveRTL(): Any
  }
  object ThemedStyleSheet {
    
    inline def apply(
      create: Any => Any,
      createLTR: Any => Any,
      createRTL: Any => Any,
      flush: () => Unit,
      get: () => Any,
      registerInterface: Any => Unit,
      registerTheme: Any => Unit,
      resolve: () => Any,
      resolveLTR: () => Any,
      resolveRTL: () => Any
    ): ThemedStyleSheet = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createLTR = js.Any.fromFunction1(createLTR), createRTL = js.Any.fromFunction1(createRTL), flush = js.Any.fromFunction0(flush), get = js.Any.fromFunction0(get), registerInterface = js.Any.fromFunction1(registerInterface), registerTheme = js.Any.fromFunction1(registerTheme), resolve = js.Any.fromFunction0(resolve), resolveLTR = js.Any.fromFunction0(resolveLTR), resolveRTL = js.Any.fromFunction0(resolveRTL))
      __obj.asInstanceOf[ThemedStyleSheet]
    }
    
    extension [Self <: ThemedStyleSheet](x: Self) {
      
      inline def setCreate(value: Any => Any): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateLTR(value: Any => Any): Self = StObject.set(x, "createLTR", js.Any.fromFunction1(value))
      
      inline def setCreateRTL(value: Any => Any): Self = StObject.set(x, "createRTL", js.Any.fromFunction1(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setGet(value: () => Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setRegisterInterface(value: Any => Unit): Self = StObject.set(x, "registerInterface", js.Any.fromFunction1(value))
      
      inline def setRegisterTheme(value: Any => Unit): Self = StObject.set(x, "registerTheme", js.Any.fromFunction1(value))
      
      inline def setResolve(value: () => Any): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
      
      inline def setResolveLTR(value: () => Any): Self = StObject.set(x, "resolveLTR", js.Any.fromFunction0(value))
      
      inline def setResolveRTL(value: () => Any): Self = StObject.set(x, "resolveRTL", js.Any.fromFunction0(value))
    }
  }
}
