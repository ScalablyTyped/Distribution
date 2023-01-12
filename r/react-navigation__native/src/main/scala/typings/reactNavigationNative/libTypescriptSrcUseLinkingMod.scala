package typings.reactNavigationNative

import typings.react.mod.RefObject
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRef
import typings.reactNavigationNative.anon.GetInitialState
import typings.reactNavigationNative.libTypescriptSrcTypesMod.LinkingOptions
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseLinkingMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useLinking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefObject[NavigationContainerRef[ParamListBase]], param1: Options): GetInitialState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[GetInitialState]
  
  trait Options
    extends StObject
       with LinkingOptions[ParamListBase] {
    
    var independent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(prefixes: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
      
      inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    }
  }
}
