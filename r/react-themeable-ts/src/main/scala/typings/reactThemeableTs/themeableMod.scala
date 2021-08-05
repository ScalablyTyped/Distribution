package typings.reactThemeableTs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeableMod {
  
  @JSImport("react-themeable-ts/build-es5/themeable", "themeable")
  @js.native
  val themeable: IStaticFn = js.native
  
  type IClassNameDecoratorFn = js.Function1[/* repeated */ js.Any, js.Array[js.Any]]
  
  @js.native
  trait IStaticFn extends StObject {
    
    def apply(): IStaticFnReturn = js.native
    def apply(payload: js.Any): IStaticFnReturn = js.native
    def apply(payload: js.Tuple2[js.Any, IClassNameDecoratorFn]): IStaticFnReturn = js.native
  }
  
  trait IStaticFnOptionalReturn extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object IStaticFnOptionalReturn {
    
    inline def apply(): IStaticFnOptionalReturn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStaticFnOptionalReturn]
    }
    
    extension [Self <: IStaticFnOptionalReturn](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait IStaticFnReturn extends StObject {
    
    def apply(): js.Object = js.native
    def apply(payload: js.Any*): IStaticFnOptionalReturn = js.native
    def apply(payload: js.Any): js.Object = js.native
  }
}
