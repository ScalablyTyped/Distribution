package typings.socketioJwtAuth

import typings.socketIo.mod.Socket
import typings.socketIo.typedEventsMod.DefaultEventsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socketio-jwt-auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authenticate(options: authOptions, verify: verifyFunc): js.Function2[
    /* socket */ Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], 
    /* fn */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(options.asInstanceOf[js.Any], verify.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* socket */ Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], 
    /* fn */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Unit
  ]]
  
  trait authOptions extends StObject {
    
    var algorithm: js.UndefOr[String] = js.undefined
    
    var secret: String
    
    var succeedWithoutToken: js.UndefOr[Boolean] = js.undefined
  }
  object authOptions {
    
    inline def apply(secret: String): authOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[authOptions]
    }
    
    extension [Self <: authOptions](x: Self) {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setSucceedWithoutToken(value: Boolean): Self = StObject.set(x, "succeedWithoutToken", value.asInstanceOf[js.Any])
      
      inline def setSucceedWithoutTokenUndefined: Self = StObject.set(x, "succeedWithoutToken", js.undefined)
    }
  }
  
  type verifyFunc = js.Function2[
    /* payload */ Any, 
    /* done */ js.Function3[
      /* err */ js.UndefOr[js.Error | Null], 
      /* user */ js.UndefOr[Any], 
      /* message */ js.UndefOr[String], 
      Unit
    ], 
    Unit
  ]
}
