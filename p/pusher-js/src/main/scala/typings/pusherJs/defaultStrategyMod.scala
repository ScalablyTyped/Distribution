package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultStrategyMod {
  
  @JSImport("pusher-js/types/src/runtimes/isomorphic/default_strategy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pusher-js/types/src/runtimes/isomorphic/default_strategy", JSImport.Default)
  @js.native
  def default: js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Config */ /* config */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrategyOptions */ /* baseOptions */ Any, 
    /* defineTransport */ js.Function, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Strategy */ Any
  ] = js.native
  inline def default_=(
    x: js.Function3[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Config */ /* config */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StrategyOptions */ /* baseOptions */ Any, 
      /* defineTransport */ js.Function, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Strategy */ Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
