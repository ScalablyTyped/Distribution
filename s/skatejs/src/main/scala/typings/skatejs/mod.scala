package typings.skatejs

import typings.skatejs.anon.TypeofWithComponent
import typings.skatejs.typesMod.ComposedCustomEvent
import typings.skatejs.typesMod.Constructor
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("skatejs", "CustomElement")
  @js.native
  class CustomElement ()
    extends typings.skatejs.typesMod.CustomElement
  /* static members */
  object CustomElement {
    
    @JSImport("skatejs", "CustomElement.observedAttributes")
    @js.native
    val observedAttributes: js.Array[String] = js.native
  }
  
  @JSImport("skatejs", "WithChildren")
  @js.native
  class WithChildren_ () extends WithChildren
  
  @JSImport("skatejs", "WithComponent")
  @js.native
  class WithComponent_[P, S, C] () extends WithComponent[P, S, C]
  /* static members */
  object WithComponent_ {
    
    @JSImport("skatejs", "WithComponent.observedAttributes")
    @js.native
    val observedAttributes: js.Array[String] = js.native
  }
  
  @JSImport("skatejs", "WithContext")
  @js.native
  class WithContext_[C] () extends WithContext[C]
  
  @JSImport("skatejs", "WithLifecycle")
  @js.native
  class WithLifecycle_ () extends WithLifecycle
  
  @JSImport("skatejs", "WithRenderer")
  @js.native
  class WithRenderer_[O] () extends WithRenderer[O]
  
  @JSImport("skatejs", "WithUpdate")
  @js.native
  class WithUpdate_[P, S] () extends WithUpdate[P, S]
  
  @JSImport("skatejs", "define")
  @js.native
  def define[T /* <: HTMLElementClass */](ctor: T): T = js.native
  
  @JSImport("skatejs", "emit")
  @js.native
  def emit(elem: HTMLElementClass, eventName: String): Boolean = js.native
  @JSImport("skatejs", "emit")
  @js.native
  def emit(elem: HTMLElementClass, eventName: String, eventOptions: EventOptions): Boolean = js.native
  @JSImport("skatejs", "emit")
  @js.native
  def emit(elem: EventTarget, eventName: String): Boolean = js.native
  @JSImport("skatejs", "emit")
  @js.native
  def emit(elem: EventTarget, eventName: String, eventOptions: EventOptions): Boolean = js.native
  
  @JSImport("skatejs", "link")
  @js.native
  def link(elem: typings.skatejs.typesMod.CustomElement): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  @JSImport("skatejs", "link")
  @js.native
  def link(elem: typings.skatejs.typesMod.CustomElement, target: String): js.Function1[/* e */ ComposedCustomEvent, Unit] = js.native
  
  @JSImport("skatejs", "name")
  @js.native
  def name(): String = js.native
  @JSImport("skatejs", "name")
  @js.native
  def name(componentName: String): String = js.native
  
  @JSImport("skatejs", "prop")
  @js.native
  def prop(): PropertyDecorator with PropOptions[_] = js.native
  @JSImport("skatejs", "prop")
  @js.native
  def prop(ops: PropOptions[_]): PropertyDecorator with PropOptions[_] = js.native
  
  /* Inlined std.Readonly<{  any :skatejs.skatejs/types.PropOptions<any> & std.PropertyDecorator,   array :skatejs.skatejs/types.PropOptions<std.Array<any>> & std.PropertyDecorator,   boolean :skatejs.skatejs/types.PropOptions<boolean> & std.PropertyDecorator,   number :skatejs.skatejs/types.PropOptions<number> & std.PropertyDecorator,   object :skatejs.skatejs/types.PropOptions<object> & std.PropertyDecorator,   string :skatejs.skatejs/types.PropOptions<string> & std.PropertyDecorator}> */
  object props {
    
    @JSImport("skatejs", "props.any")
    @js.native
    def any(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs", "props.any")
    @js.native
    def any(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs", "props.array")
    @js.native
    def array(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs", "props.array")
    @js.native
    def array(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs", "props.boolean")
    @js.native
    def boolean(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs", "props.boolean")
    @js.native
    def boolean(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs", "props.number")
    @js.native
    def number(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs", "props.number")
    @js.native
    def number(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs", "props.string")
    @js.native
    def string(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs", "props.string")
    @js.native
    def string(target: js.Object, propertyKey: js.Symbol): Unit = js.native
    
    @JSImport("skatejs", "props.object")
    @js.native
    def `object`(target: js.Object, propertyKey: String): Unit = js.native
    @JSImport("skatejs", "props.object")
    @js.native
    def `object`(target: js.Object, propertyKey: js.Symbol): Unit = js.native
  }
  
  @JSImport("skatejs", "shadow")
  @js.native
  def shadow(elem: typings.skatejs.typesMod.CustomElement): ShadowRoot = js.native
  @JSImport("skatejs", "shadow")
  @js.native
  def shadow(elem: HTMLElement): ShadowRoot = js.native
  
  @JSImport("skatejs", "withChildren")
  @js.native
  def withChildren[T /* <: Constructor[HTMLElement] */](): Constructor[WithChildren] with T = js.native
  @JSImport("skatejs", "withChildren")
  @js.native
  def withChildren[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithChildren] with T = js.native
  
  @JSImport("skatejs", "withComponent")
  @js.native
  def withComponent[T /* <: Constructor[HTMLElement] */](): TypeofWithComponent = js.native
  @JSImport("skatejs", "withComponent")
  @js.native
  def withComponent[T /* <: Constructor[HTMLElement] */](Base: T): TypeofWithComponent = js.native
  @JSImport("skatejs", "withComponent")
  @js.native
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](): (Constructor[WithComponent[P, S, C]]) with T = js.native
  @JSImport("skatejs", "withComponent")
  @js.native
  def withComponent_PSCT_ConstructorHTMLElement_Intersection[P, S, C, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[WithComponent[P, S, C]]) with T = js.native
  
  @JSImport("skatejs", "withContext")
  @js.native
  def withContext[C, T /* <: Constructor[HTMLElement] */](): Constructor[WithContext[C]] with T = js.native
  @JSImport("skatejs", "withContext")
  @js.native
  def withContext[C, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithContext[C]] with T = js.native
  
  @JSImport("skatejs", "withLifecycle")
  @js.native
  def withLifecycle[T /* <: Constructor[HTMLElement] */](): Constructor[WithLifecycle] with T = js.native
  @JSImport("skatejs", "withLifecycle")
  @js.native
  def withLifecycle[T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithLifecycle] with T = js.native
  
  @JSImport("skatejs", "withRenderer")
  @js.native
  def withRenderer[O, T /* <: Constructor[HTMLElement] */](): Constructor[WithRenderer[O]] with T = js.native
  @JSImport("skatejs", "withRenderer")
  @js.native
  def withRenderer[O, T /* <: Constructor[HTMLElement] */](Base: T): Constructor[WithRenderer[O]] with T = js.native
  
  @JSImport("skatejs", "withUpdate")
  @js.native
  def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](): (Constructor[WithUpdate[P, S]]) with T = js.native
  @JSImport("skatejs", "withUpdate")
  @js.native
  def withUpdate[P, S, T /* <: Constructor[HTMLElement] */](Base: T): (Constructor[WithUpdate[P, S]]) with T = js.native
}
