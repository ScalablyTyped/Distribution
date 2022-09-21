package typings.skatejs

import typings.skatejs.anon.TypeofWithComponent
import typings.skatejs.typesMod.ComposedCustomEvent
import typings.skatejs.typesMod.Constructor
import typings.skatejs.typesMod.CustomElement
import typings.skatejs.typesMod.EventOptions
import typings.skatejs.typesMod.HTMLElementClass
import typings.skatejs.typesMod.PropOptions
import typings.skatejs.typesMod.WithChildren
import typings.skatejs.typesMod.WithComponent
import typings.skatejs.typesMod.WithContext
import typings.skatejs.typesMod.WithLifecycle
import typings.skatejs.typesMod.WithRenderer
import typings.skatejs.typesMod.WithUpdate
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.PropertyDecorator
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("skatejs/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def define[T /* <: HTMLElementClass */](ctor: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(ctor.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def emit(elem: HTMLElementClass, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def emit(elem: HTMLElementClass, eventName: String, eventOptions: EventOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def emit(elem: EventTarget, eventName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def emit(elem: EventTarget, eventName: String, eventOptions: EventOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(elem.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventOptions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def link(elem: CustomElement): js.Function1[/* e */ ComposedCustomEvent, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(elem.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* e */ ComposedCustomEvent, Unit]]
  inline def link(elem: CustomElement, target: String): js.Function1[/* e */ ComposedCustomEvent, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(elem.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* e */ ComposedCustomEvent, Unit]]
  
  inline def name(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("name")().asInstanceOf[String]
  inline def name(componentName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(componentName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def prop(): PropertyDecorator & PropOptions[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")().asInstanceOf[PropertyDecorator & PropOptions[Any]]
  inline def prop(ops: PropOptions[Any]): PropertyDecorator & PropOptions[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(ops.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator & PropOptions[Any]]
  
  /* Inlined std.Readonly<{  any :skatejs.skatejs/types.PropOptions<any> & std.PropertyDecorator,   array :skatejs.skatejs/types.PropOptions<std.Array<any>> & std.PropertyDecorator,   boolean :skatejs.skatejs/types.PropOptions<boolean> & std.PropertyDecorator,   number :skatejs.skatejs/types.PropOptions<number> & std.PropertyDecorator,   object :skatejs.skatejs/types.PropOptions<object> & std.PropertyDecorator,   string :skatejs.skatejs/types.PropOptions<string> & std.PropertyDecorator}> */
  object props {
    
    @JSImport("skatejs/api", "props")
    @js.native
    val ^ : js.Any = js.native
    
    inline def any(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def any(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def array(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def array(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def boolean(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def boolean(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def number(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def number(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def `object`(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def `object`(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def string(target: js.Object, propertyKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("string")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def string(target: js.Object, propertyKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("string")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def shadow(elem: CustomElement): ShadowRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("shadow")(elem.asInstanceOf[js.Any]).asInstanceOf[ShadowRoot]
  inline def shadow(elem: HTMLElement): ShadowRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("shadow")(elem.asInstanceOf[js.Any]).asInstanceOf[ShadowRoot]
  
  inline def withChildren[T /* <: Constructor[HTMLElement] */](): Constructor[WithChildren] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withChildren")().asInstanceOf[Constructor[WithChildren] & T]
  inline def withChildren[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithChildren] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withChildren")(Base.asInstanceOf[js.Any]).asInstanceOf[Constructor[WithChildren] & T]
  
  inline def withComponent[T /* <: Constructor[HTMLElement] */](): TypeofWithComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")().asInstanceOf[TypeofWithComponent]
  inline def withComponent[T /* <: Constructor[HTMLElement] */](Base: T): TypeofWithComponent = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(Base.asInstanceOf[js.Any]).asInstanceOf[TypeofWithComponent]
  
  inline def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](): (Constructor[WithComponent[P, S, C]]) & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")().asInstanceOf[(Constructor[WithComponent[P, S, C]]) & T]
  inline def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[WithComponent[P, S, C]]) & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withComponent")(Base.asInstanceOf[js.Any]).asInstanceOf[(Constructor[WithComponent[P, S, C]]) & T]
  
  inline def withContext[C, T /* <: Constructor[HTMLElement] */](): Constructor[WithContext[C]] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withContext")().asInstanceOf[Constructor[WithContext[C]] & T]
  inline def withContext[C, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithContext[C]] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withContext")(Base.asInstanceOf[js.Any]).asInstanceOf[Constructor[WithContext[C]] & T]
  
  inline def withLifecycle[T /* <: Constructor[HTMLElement] */](): Constructor[WithLifecycle] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withLifecycle")().asInstanceOf[Constructor[WithLifecycle] & T]
  inline def withLifecycle[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithLifecycle] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withLifecycle")(Base.asInstanceOf[js.Any]).asInstanceOf[Constructor[WithLifecycle] & T]
  
  inline def withRenderer[O, T /* <: Constructor[HTMLElement] */](): Constructor[WithRenderer[O]] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withRenderer")().asInstanceOf[Constructor[WithRenderer[O]] & T]
  inline def withRenderer[O, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithRenderer[O]] & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withRenderer")(Base.asInstanceOf[js.Any]).asInstanceOf[Constructor[WithRenderer[O]] & T]
  
  inline def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](): (Constructor[WithUpdate[P, S]]) & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withUpdate")().asInstanceOf[(Constructor[WithUpdate[P, S]]) & T]
  inline def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[WithUpdate[P, S]]) & T = ^.asInstanceOf[js.Dynamic].applyDynamic("withUpdate")(Base.asInstanceOf[js.Any]).asInstanceOf[(Constructor[WithUpdate[P, S]]) & T]
}
