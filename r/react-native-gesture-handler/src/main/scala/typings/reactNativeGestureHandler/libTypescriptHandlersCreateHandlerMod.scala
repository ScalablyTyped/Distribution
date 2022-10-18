package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.reactNativeGestureHandler.anon.ReadonlyArraystring
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.BaseGestureHandlerProps_
import typings.std.Extract
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersCreateHandlerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/createHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: BaseGestureHandlerProps_[U] */, U /* <: Record[String, Any] */](hasNameAllowedPropsConfigTransformPropsCustomNativeProps: CreateHandlerArgs[T]): ComponentType[T & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasNameAllowedPropsConfigTransformPropsCustomNativeProps.asInstanceOf[js.Any]).asInstanceOf[ComponentType[T & RefAttributes[Any]]]
  
  /* Inlined std.Readonly<{  name :string,   allowedProps :std.Readonly<std.Array<std.Extract<keyof HandlerPropsT, string>>>,   config :std.Readonly<std.Record<string, unknown>>,   transformProps :(props : HandlerPropsT): HandlerPropsT | undefined,   customNativeProps :std.Readonly<std.Array<string>> | undefined}> */
  trait CreateHandlerArgs[HandlerPropsT /* <: Record[String, Any] */] extends StObject {
    
    val allowedProps: js.Array[Extract[/* keyof HandlerPropsT */ String, String]]
    
    val config: Record[String, Any]
    
    val customNativeProps: js.UndefOr[ReadonlyArraystring] = js.undefined
    
    val name: String
    
    val transformProps: js.UndefOr[js.Function1[/* props */ HandlerPropsT, HandlerPropsT]] = js.undefined
  }
  object CreateHandlerArgs {
    
    inline def apply[HandlerPropsT /* <: Record[String, Any] */](
      allowedProps: js.Array[Extract[/* keyof HandlerPropsT */ String, String]],
      config: Record[String, Any],
      name: String
    ): CreateHandlerArgs[HandlerPropsT] = {
      val __obj = js.Dynamic.literal(allowedProps = allowedProps.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateHandlerArgs[HandlerPropsT]]
    }
    
    extension [Self <: CreateHandlerArgs[?], HandlerPropsT /* <: Record[String, Any] */](x: Self & CreateHandlerArgs[HandlerPropsT]) {
      
      inline def setAllowedProps(value: js.Array[Extract[/* keyof HandlerPropsT */ String, String]]): Self = StObject.set(x, "allowedProps", value.asInstanceOf[js.Any])
      
      inline def setAllowedPropsVarargs(value: (Extract[/* keyof HandlerPropsT */ String, String])*): Self = StObject.set(x, "allowedProps", js.Array(value*))
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCustomNativeProps(value: ReadonlyArraystring): Self = StObject.set(x, "customNativeProps", value.asInstanceOf[js.Any])
      
      inline def setCustomNativePropsUndefined: Self = StObject.set(x, "customNativeProps", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTransformProps(value: /* props */ HandlerPropsT => HandlerPropsT): Self = StObject.set(x, "transformProps", js.Any.fromFunction1(value))
      
      inline def setTransformPropsUndefined: Self = StObject.set(x, "transformProps", js.undefined)
    }
  }
}
